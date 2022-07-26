package com.facturacion.modelcore.entities.persona;

import com.facturacion.modelcore.entities.ciudad.CiudadDAO;
import com.facturacion.modelcore.entities.pais.PaisDAO;
import com.facturacion.modelcore.entities.tipoDocumento.TipoDocumentoDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Persona")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonaDAO {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PERSONA_ID")
    private Long personaId;

    @Column(name = "PERSONA_DOCUMENTO", nullable = false, length = 30, unique = true)
    private Long personaDocumento;

    @Column(name = "PERSONA_NOMBRES", nullable = false, length = 250)
    private String personaNombres;

    @Column(name = "PERSONA_APELLIDOS", nullable = false, length = 250)
    private String personaApellidos;

    @Column(name = "PERSONA_TELEFONO", nullable = false, length = 250)
    private String personaTelefono;

    @Column(name = "PERSONA_CORREO", nullable = false, length = 250)
    private String personaCorreo;

    @Column(name = "PERSONA_DIRECCION", nullable = false, length = 250)
    private String personaDireccion;

    @Temporal(TemporalType.DATE)
    @Column(name = "PERSONA_FECHANACIMIENTO", nullable=false)
    private Date fechaNacimiento;

    @JoinColumn(name = "CIUDAD_ID", referencedColumnName = "CIUDAD_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CiudadDAO ciudad;

    @JoinColumn(name = "TIPODOC_ID", referencedColumnName = "TIPODOC_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoDocumentoDAO tipoDocumento;


}
