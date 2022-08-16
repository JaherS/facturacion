package com.facturacion.srvuniversal.service;

import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.dto.generic.GenericResponseDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAuthUserService extends UserDetailsService {

    GenericResponseDTO crearUsuario(AuthUserDTO authUserDTO) throws Exception;

    GenericResponseDTO editarUsuario(AuthUserDTO authUserDTO) throws Exception;

    GenericResponseDTO consultarUsuarioId(Long id) throws Exception;
}
