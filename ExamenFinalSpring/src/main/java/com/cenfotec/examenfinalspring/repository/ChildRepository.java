package com.cenfotec.examenfinalspring.repository;

import com.cenfotec.examenfinalspring.entities.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
}
