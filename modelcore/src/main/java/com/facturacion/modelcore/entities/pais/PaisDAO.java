package com.facturacion.modelcore.entities.pais;


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
@Table(name = "Pais")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PaisDAO {


    public static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ORIGINALMENTE DEBE IR GenerationType.IDENTITY PARA QUE LA BASE GENERE EL ID
    @Basic(optional = false)
    @Column(name = "PAIS_ID")
    private Long paisId;

    @Column(name = "PAIS_NOMBRE", nullable = false, length = 250, unique = true)
    private Long paisNombre;

    @Column(name = "PAIS_CODIGO", nullable = false, length = 10, unique = true)
    private Long paisCodigo;

}
