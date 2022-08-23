package com.cenfotec.examenfinalspring.repository;

import com.cenfotec.examenfinalspring.entities.Encargado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncargadoRepository extends JpaRepository<Encargado, Long> {

}
