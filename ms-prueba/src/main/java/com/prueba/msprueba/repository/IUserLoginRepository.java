package com.prueba.msprueba.repository;

import com.prueba.msprueba.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserLoginRepository extends JpaRepository<UserLogin, Long> {

    Optional<UserLogin> findByEmail(String username);
}
