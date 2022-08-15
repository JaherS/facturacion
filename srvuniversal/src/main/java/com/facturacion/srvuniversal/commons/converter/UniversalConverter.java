package com.facturacion.srvuniversal.commons.converter;


import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.entities.authUser.AuthUserDAO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UniversalConverter {

    public AuthUserDAO AuthUserDTOtoDAO(AuthUserDTO authUserDTO, ModelMapper modelMapper){
        AuthUserDAO authUserDAO = new AuthUserDAO();
        modelMapper.map(authUserDTO, authUserDAO);
        return authUserDAO;
    }

    public AuthUserDTO AuthUserDAOtoDTO(AuthUserDAO authUserDAO, ModelMapper modelMapper){
        AuthUserDTO authUserDTO = new AuthUserDTO();
        modelMapper.map(authUserDAO, authUserDTO);
        return authUserDTO;
    }


}
