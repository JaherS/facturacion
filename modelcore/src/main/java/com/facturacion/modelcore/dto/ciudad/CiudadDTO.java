package com.facturacion.modelcore.dto.ciudad;


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
@JsonPropertyOrder({"CIUDAD_ID", "CIUDAD_NOMBRE", "DEPA_ID"})
public class CiudadDTO {


    private Long ciudadId;

    @NotNull(message = "El nombre de la ciudad es requerido")
    private String departamentoNombre;

    @NotNull(message = "Seleccione un departamento")
    private PaisDTO pais;
}
