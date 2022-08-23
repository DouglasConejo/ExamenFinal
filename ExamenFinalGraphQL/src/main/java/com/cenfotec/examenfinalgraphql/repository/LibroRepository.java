package com.cenfotec.examenfinalgraphql.repository;

import com.cenfotec.examenfinalgraphql.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository  extends JpaRepository<Libro, Integer> {

}
