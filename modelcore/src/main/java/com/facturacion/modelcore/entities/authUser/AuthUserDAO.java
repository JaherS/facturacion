package com.facturacion.modelcore.entities.authUser;

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
@Table(name = "Auth_User")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AuthUserDAO {

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
}
