package com.facturacion.modelcore.entities.tipoDocumento;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TipoDocumento")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoDocumentoDAO {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ORIGINALMENTE DEBE IR GenerationType.IDENTITY PARA QUE LA BASE GENERE EL ID
    @Basic(optional = false)
    @Column(name = "TIPODOC_ID")
    private Long tipoDocumentoId;

    @Column(name = "TIPODOC_NOMBRE", nullable = false, length = 250, unique = true)
    private String tipoDocumentoNombre;

    @Column(name = "TIPODOC_COD", nullable = false, length = 10, unique = true)
    private String tipoDocumentoCodigo;
}
