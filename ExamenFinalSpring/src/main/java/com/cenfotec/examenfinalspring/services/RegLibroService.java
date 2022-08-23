package com.cenfotec.examenfinalspring.services;

import com.cenfotec.examenfinalspring.entities.RegistLibros;

import java.util.List;
import java.util.Optional;

public interface RegLibroService {
    public List<RegistLibros> getAll();
    public Optional<RegistLibros> findById(long id);
    public  Optional<RegistLibros> save(RegistLibros regLibros);
    public  Optional<RegistLibros> update(RegistLibros regLibros);
    public boolean delete(Long id);
}
