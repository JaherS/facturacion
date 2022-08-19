package com.facturacion.modelcore.entities.authUser;

import com.facturacion.modelcore.entities.authRol.AuthRolDAO;
import com.facturacion.modelcore.entities.persona.PersonaDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Auth_User")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AuthUserDAO implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AUTHUSER_ID")
    private Long authUserId;

    @Column(name = "AUTHUSER_USUARIO", nullable = false, length = 100, unique = true)
    private String authUserUsuario;

    @Column(name = "AUTHUSER_PASSWORD", nullable = false, length = 250, unique = true)
    private String authUserPassword;

    @JoinColumn(name = "AUTHROL_ID", referencedColumnName = "AUTHROL_ID", nullable = false)
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<AuthRolDAO> authRol;

    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "PERSONA_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonaDAO persona;
}
