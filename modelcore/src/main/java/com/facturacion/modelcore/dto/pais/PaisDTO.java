package com.facturacion.modelcore.dto.pais;

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
@JsonPropertyOrder({"PAIS_ID", "PAIS_NOMBRE", "PAIS_CODIGO"})
public class PaisDTO {

    private Long paisId;

    @NotNull(message = "El nombre del Pais es requerido")
    private String paisNombre;

    @NotNull(message = "El codigo del Pais es requerido")
    private String paisCodigo;


}
