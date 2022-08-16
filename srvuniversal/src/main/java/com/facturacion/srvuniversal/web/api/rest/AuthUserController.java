package com.facturacion.srvuniversal.web.api.rest;

import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.dto.generic.GenericResponseDTO;
import com.facturacion.srvuniversal.service.IAuthUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
@CrossOrigin
public class AuthUserController implements IAuthUserController {

    @Autowired
    private IAuthUserService iAuthUserService;

    @Override
    @PostMapping(path = "/crearUsuario", produces = "application/json", consumes = "application/json")
    @ApiOperation(value = "Crea un Usuario en el sistema", notes = "notas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La creacion fue exitosa", response = GenericResponseDTO.class)
    })
    public ResponseEntity<GenericResponseDTO> crearUsuario(@Valid @RequestBody @ApiParam(type = "AuthUserDTO", value = "{\n" +
            "   \"authRol\": {\n" +
            "       \"authRolId \": 1\n" +
            "},\n" +
            "\"authUserPassword\": \"Ash%4256$\",\n" + //<---- crear un json de ejemplo y pegarlo aca
            "\"authUserUsuario\": \"ggnunezg\",\n" +
            "\"persona\": {\n"+
            "   \"personaId\": 1\n" +
            "   }\n" +
            "}", required = true) AuthUserDTO authUserDTO) throws Exception{

        GenericResponseDTO genericResponseDTO = iAuthUserService.crearUsuario(authUserDTO);
        return new ResponseEntity(
                genericResponseDTO, HttpStatus.valueOf(genericResponseDTO.getStatusCode())
        );

    }


    @Override
    @PostMapping(path = "/editarUsuario", produces = "application/json", consumes = "application/json")
    @ApiOperation(value = "Editar el Usuario en el sistema", notes = "notas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La actualizacion fue exitosa", response = GenericResponseDTO.class)
    })
    public ResponseEntity<GenericResponseDTO> editarUsuario(@Valid @RequestBody @ApiParam(type = "AuthUserDTO", value = "Ejemplo json\n{\n" +
            "\"authRol\": {\n" +
            "\"id\": \"15\",\n" +
            "\"nombreRol\": \"Auxiliar\",\n" +
            "\"descripcionRol\": \"Encargado de recoleccion de los datos\",\n" +
            "\"}\",\n" +
            "\"persona\": {\n" +
            "\"id\": \"15\",\n" +
            "\"nombres\": \"Jaher Steven\",\n" +
            "\"Apellidos\": \"Soriano Hernandez\",\n" +
            "\"...\",\n" +
            "\"}\",\n" +
            "\"Usuario\": \"Prueba123r\",\n" +
            "\"Contraseña\": \"asdsad555%4\",\n" +
            "\"idUsuarioRol\": \"1\",\n" +
            "\"idPersona\": \"33255\"\n" +
            "}", required = true) AuthUserDTO authUserDTO) throws Exception{

        GenericResponseDTO genericResponseDTO = iAuthUserService.editarUsuario(authUserDTO);
        return new ResponseEntity(
                genericResponseDTO, HttpStatus.valueOf(genericResponseDTO.getStatusCode())
        );

    }

    @Override
    @PostMapping(path = "/consultarUsuarioId", produces = "application/json")
    @ApiOperation(value = "Listar Usuario", notes = "notas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Se listo correctamente", response = GenericResponseDTO.class)
    })
    public ResponseEntity<GenericResponseDTO> consultarUsuarioId(Long id) throws Exception{

        GenericResponseDTO genericResponseDTO = iAuthUserService.consultarUsuarioId(id);
        return new ResponseEntity(
                genericResponseDTO, HttpStatus.valueOf(genericResponseDTO.getStatusCode())
        );

    }

}
