package com.facturacion.modelcore.entities.ciudad;


import com.facturacion.modelcore.entities.departamento.DepartamentoDAO;
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
@Table(name = "Ciudad")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CiudadDAO {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CIUDAD_ID")
    private Long departamentoId;

    @Column(name = "CIUDAD_NOMBRE", nullable = false, length = 100, unique = true)
    private Long departamentoNombre;


    @JoinColumn(name = "DEPA_ID", referencedColumnName = "DEPA_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private DepartamentoDAO departamento;
}
