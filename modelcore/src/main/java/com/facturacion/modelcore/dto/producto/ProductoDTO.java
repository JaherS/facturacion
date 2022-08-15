package com.facturacion.modelcore.dto.producto;


import com.facturacion.modelcore.entities.categoriaProducto.CategoriaDAO;
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
@JsonPropertyOrder({"AUTHUSER_ID", "AUTHUSER_USUARIO", "AUTHUSER_PASSWORD", "AUTHROL_ID", "PERSONA_ID"})
public class ProductoDTO {

    private Long productoId;

    @NotNull(message = "El nombre del producto es requerido")
    private String productoNombre;

    @NotNull(message = "La descripcion es requerida")
    private String productoDesc;

    @NotNull(message = "Escriba las unidades existentes")
    private Long productoUnidades;

    @NotNull(message = "Seleccione una Categoria")
    private CategoriaDAO categoria;

}
