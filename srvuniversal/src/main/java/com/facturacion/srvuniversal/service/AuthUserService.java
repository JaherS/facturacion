package com.facturacion.srvuniversal.service;

import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.dto.generic.GenericResponseDTO;
import com.facturacion.modelcore.entities.authUser.AuthUserDAO;
import com.facturacion.srvuniversal.commons.converter.UniversalConverter;
import com.facturacion.srvuniversal.repository.IAuthUserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AuthUserService implements IAuthUserService {

    private final IAuthUserRepository iAuthUserRepository;

    private final ModelMapper modelMapper;

    private final UniversalConverter universalConverter;

    private static final Logger logger = LoggerFactory.getLogger(AuthUserService.class);

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    public AuthUserService(IAuthUserRepository iAuthUserRepository, ModelMapper modelMapper, UniversalConverter universalConverter) {
        this.iAuthUserRepository = iAuthUserRepository;
        this.modelMapper = modelMapper;
        this.universalConverter = universalConverter;
    }


    @Override
    public GenericResponseDTO crearUsuario(AuthUserDTO authUserDTO) throws Exception {
        try{
            AuthUserDAO authUserDAO = universalConverter.AuthUserDTOtoDAO(authUserDTO, modelMapper);
            logger.info(mapper.writeValueAsString(authUserDAO));
            iAuthUserRepository.save(authUserDAO);
            AuthUserDTO authUserRespuesta = universalConverter.AuthUserDAOtoDTO(authUserDAO, modelMapper);
            logger.info(mapper.writeValueAsString(authUserDTO));
            return GenericResponseDTO.builder().message("Se creo el Usuario").objectResponse(authUserRespuesta).statusCode(HttpStatus.OK.value()).build();
        }catch(Exception e){
            logger.error(e.getMessage());
            return GenericResponseDTO.builder().message("Error al crear el usuario").objectResponse(null).statusCode(HttpStatus.BAD_REQUEST.value()).build();
        }
    }

    @Override
    public GenericResponseDTO editarUsuario (AuthUserDTO authUserDTO) throws Exception {
        try{
            if(authUserDTO.getAuthUserId() != null && iAuthUserRepository.existsById(authUserDTO.getAuthUserId())){
                AuthUserDAO authUserDAO = universalConverter.AuthUserDTOtoDAO(authUserDTO, modelMapper);
                logger.info(mapper.writeValueAsString(authUserDAO));
                iAuthUserRepository.save(authUserDAO);
                AuthUserDTO authUserRespuesta = universalConverter.AuthUserDAOtoDTO(authUserDAO, modelMapper);
                logger.info(mapper.writeValueAsString(authUserDTO));
                return GenericResponseDTO.builder().message("Se creo el Usuario").objectResponse(authUserRespuesta).statusCode(HttpStatus.OK.value()).build();
            }else{
                return GenericResponseDTO.builder().message("Error al editar el Usuario").objectResponse(null).statusCode(HttpStatus.BAD_REQUEST.value()).build();
            }
        }catch(Exception e){
            logger.error(e.getMessage());
            return GenericResponseDTO.builder().message("Error al editar el usuario").objectResponse(null).statusCode(HttpStatus.BAD_REQUEST.value()).build();
        }
    }

    @Override
    public GenericResponseDTO consultarUsuarioId(Long id) throws Exception{
        try {
            AuthUserDAO authUserDAO = iAuthUserRepository.getById(id);
            logger.info(mapper.writeValueAsString(authUserDAO));
            AuthUserDTO authUserDTO = universalConverter.AuthUserDAOtoDTO(authUserDAO, modelMapper);
            logger.info(mapper.writeValueAsString(authUserDTO));
            return GenericResponseDTO.builder().message("Usuario listado").objectResponse(authUserDTO).statusCode(HttpStatus.OK.value()).build();
        }catch(Exception e){
            logger.error(e.getMessage());
            return GenericResponseDTO.builder().message("Error no se encontro ningun usuario").objectResponse(null).statusCode(HttpStatus.BAD_REQUEST.value()).build();
        }
    }


}
