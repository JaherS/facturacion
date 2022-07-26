package com.facturacion.modelcore.entities.tipoDocumento;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TipoDocumento")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoDocumentoDAO implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TIPODOC_ID")
    private Long tipoDocumentoId;

    @Column(name = "TIPODOC_NOMBRE", nullable = false, length = 250, unique = true)
    private String tipoDocumentoNombre;

    @Column(name = "TIPODOC_CODIGO", nullable = false, length = 10, unique = true)
    private String tipoDocumentoCodigo;
}
