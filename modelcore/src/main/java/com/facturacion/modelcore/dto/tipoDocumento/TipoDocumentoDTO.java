package com.facturacion.modelcore.dto.tipoDocumento;

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
@JsonPropertyOrder({"TIPODOC_ID", "TIPODOC_NOMBRE", "TIPODOC_CODIGO"})
public class TipoDocumentoDTO {

    private Long tipoDocumentoId;

    @NotNull(message = "El nombre del tipo de documento es requerido")
    private String tipoDocumentoNombre;

    @NotNull(message = "El codigo del tipo de documento es requerido")
    private String tipoDocumentoCodigo;


}
