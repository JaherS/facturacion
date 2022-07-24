package com.facturacion.modelcore.dto.departamento;

import com.facturacion.modelcore.dto.pais.PaisDTO;
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
@JsonPropertyOrder({"DEPA_ID", "DEPA_NOMBRE", "PAIS_ID"})
public class DepartamentoDTO {

    private Long departamentoId;

    @NotNull(message = "El nombre del Pais es requerido")
    private String departamentoNombre;

    @NotNull(message = "Seleccione un pais")
    private PaisDTO pais;


}
