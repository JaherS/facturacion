package com.facturacion.modelcore.dto.categoriaProducto;


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
@JsonPropertyOrder({"CATEGORIA_ID", "CATEGORIA_NOMBRE"})
public class CategoriaDTO {

    private Long categoriaId;

    @NotNull(message = "El nombre es requerido")
    private String categoriaNombre;

}
