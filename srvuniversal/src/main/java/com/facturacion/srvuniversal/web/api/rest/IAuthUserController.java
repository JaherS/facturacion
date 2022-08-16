package com.facturacion.srvuniversal.web.api.rest;

import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.dto.generic.GenericResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface IAuthUserController {

    ResponseEntity<GenericResponseDTO> crearUsuario(@Valid @RequestBody AuthUserDTO authUserDTO) throws Exception;

    ResponseEntity<GenericResponseDTO> editarUsuario(@Valid @RequestBody AuthUserDTO authUserDTO) throws Exception;

    ResponseEntity<GenericResponseDTO> consultarUsuarioId(Long id) throws Exception;
}
