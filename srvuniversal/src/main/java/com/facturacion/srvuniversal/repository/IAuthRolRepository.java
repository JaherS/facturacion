package com.facturacion.srvuniversal.repository;

import com.facturacion.modelcore.entities.authRol.AuthRolDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthRolRepository extends JpaRepository<AuthRolDAO, Long> {

    //@Query("select authRolDAO from AuthRolDAO authRolDAO where authRolDAO.authRolNombre = 'nombre'")
    public AuthRolDAO findByAuthRolNombre(String authRolnombre);

}
