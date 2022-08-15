package com.facturacion.modelcore.entities.authRol;

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
@Table(name = "Auth_Rol")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AuthRolDAO implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AUTHROL_ID")
    private Long authRolId;

    @Column(name = "AUTHUROL_NOMBRE", nullable = false, length = 50, unique = true)
    private String authRolNombre;

    @Column(name = "AUTHROL_DESCRIPCION", nullable = false, length = 250, unique = true)
    private String authRolDescripcion;
}

