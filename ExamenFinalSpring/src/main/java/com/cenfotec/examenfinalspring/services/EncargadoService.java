package com.cenfotec.examenfinalspring.services;

import com.cenfotec.examenfinalspring.entities.Encargado;

import java.util.List;
import java.util.Optional;

public interface EncargadoService {

    public List<Encargado> getAll();
    public Optional<Encargado> findById(long id);
    public  Optional<Encargado> save(Encargado encargado);
    public  Optional<Encargado> update(Encargado encargado);
    public boolean delete(Long id);
}
