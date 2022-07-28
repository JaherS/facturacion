package com.facturacion.srvuniversal.repository;

import com.facturacion.modelcore.entities.authUser.AuthUserDAO;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IAuthUserRepository extends JpaRepository<AuthUserDAO, Long>{
}
