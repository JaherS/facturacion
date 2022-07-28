package com.facturacion.srvuniversal.commons.converter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.facturacion.srvuniversal")
@PropertySource("classpath:application.properties")
public class ConfiguradorSpring {
}