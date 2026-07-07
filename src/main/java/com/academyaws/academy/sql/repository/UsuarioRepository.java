package com.academyaws.academy.sql.repository;

import com.academyaws.academy.sql.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}