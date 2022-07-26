package com.facturacion.modelcore.dto.authRol;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"AUTHROL_ID", "AUTHROL_NOMBRE", "AUTHROL_DESCRIPCION"})
public class AuthRolDTO {

    private Long authRolId;

    @NotNull(message = "El nombre es requerido")
    private String authRolNombre;

    @NotNull(message = "La descripcion es requerida")
    private String authRolDescripcion;
}
