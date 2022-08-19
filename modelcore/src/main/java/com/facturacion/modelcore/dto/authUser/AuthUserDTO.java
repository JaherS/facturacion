package com.facturacion.modelcore.dto.authUser;


import com.facturacion.modelcore.entities.authRol.AuthRolDAO;
import com.facturacion.modelcore.entities.persona.PersonaDAO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Collection;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"AUTHUSER_ID", "AUTHUSER_USUARIO", "AUTHUSER_PASSWORD", "AUTHROL_ID", "PERSONA_ID"})
public class AuthUserDTO {


    private Long authUserId;

    @NotNull(message = "El usuario es requerido")
    private String authUserUsuario;

    @NotNull(message = "La contraseña es requerida")
    private String authUserPassword;

    @NotNull(message = "Seleccione un ROL")
    private Collection<AuthRolDAO> authRol;

    @NotNull(message = "Selecciona la persona")
    private PersonaDAO persona;
}
