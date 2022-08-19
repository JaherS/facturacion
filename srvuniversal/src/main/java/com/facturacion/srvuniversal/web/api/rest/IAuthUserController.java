package com.facturacion.srvuniversal.web.api.rest;

import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.dto.generic.GenericResponseDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.math.BigDecimal;

public interface IAuthUserController {

    ResponseEntity<GenericResponseDTO> crearUsuario(@Valid @RequestBody AuthUserDTO authUserDTO) throws Exception;

    ResponseEntity<GenericResponseDTO> editarUsuario(@Valid @RequestBody AuthUserDTO authUserDTO) throws Exception;

    ResponseEntity<GenericResponseDTO> consultarUsuarioId(@PathVariable(value = "id", required = true) Long id) throws Exception;

    ResponseEntity<GenericResponseDTO> consultarUsuarioNombre(@PathVariable(value = "nombre", required = true) String nombre) throws Exception;

    ResponseEntity<GenericResponseDTO> consultarUsuarioCorreo(@PathVariable(value = "correo", required = true) String correo) throws Exception;
}
