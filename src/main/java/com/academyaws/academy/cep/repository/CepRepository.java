package com.academyaws.academy.cep.repository;

import com.academyaws.academy.cep.entity.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository  extends JpaRepository<Cep, Long> {
}

