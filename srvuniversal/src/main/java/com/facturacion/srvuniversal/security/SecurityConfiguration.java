package com.facturacion.srvuniversal.security;



import com.facturacion.srvuniversal.service.IAuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private IAuthUserService iAuthUserService;



}
