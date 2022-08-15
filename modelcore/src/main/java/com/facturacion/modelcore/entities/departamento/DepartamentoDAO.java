package com.facturacion.modelcore.entities.departamento;


import com.facturacion.modelcore.entities.pais.PaisDAO;
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
@Table(name = "Departamento")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DepartamentoDAO implements Serializable {

    public static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ORIGINALMENTE DEBE IR GenerationType.IDENTITY PARA QUE LA BASE GENERE EL ID
    @Basic(optional = false)
    @Column(name = "DEPA_ID")
    private Long departamentoId;

    @Column(name = "DEPA_NOMBRE", nullable = false, length = 100, unique = true)
    private Long departamentoNombre;


    @JoinColumn(name = "PAIS_ID", referencedColumnName = "PAIS_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private PaisDAO pais;
}
