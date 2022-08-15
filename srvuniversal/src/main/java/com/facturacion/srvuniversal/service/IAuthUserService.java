package com.facturacion.srvuniversal.service;

import com.facturacion.modelcore.dto.authUser.AuthUserDTO;
import com.facturacion.modelcore.dto.generic.GenericResponseDTO;

public interface IAuthUserService {

    GenericResponseDTO crearUsuario(AuthUserDTO authUserDTO) throws Exception;
    
}
