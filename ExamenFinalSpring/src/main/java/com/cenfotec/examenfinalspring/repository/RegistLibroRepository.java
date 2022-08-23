package com.cenfotec.examenfinalspring.repository;

import com.cenfotec.examenfinalspring.entities.RegistLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistLibroRepository  extends JpaRepository<RegistLibros, Long> {
}
