package com.cenfotec.examenfinalspring.services;

import com.cenfotec.examenfinalspring.entities.RegistLibros;
import com.cenfotec.examenfinalspring.repository.RegistLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegLibroServiceImpl implements RegLibroService{

    @Autowired
    RegistLibroRepository libroRepository;

    @Override
    public List<RegistLibros> getAll() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<RegistLibros> findById(long id) {
        return libroRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<RegistLibros> save(RegistLibros regLibros) {
        return Optional.of(libroRepository.save(regLibros));
    }

    @Override
    public Optional<RegistLibros> update(RegistLibros regLibros) {
        Optional<RegistLibros> record = libroRepository.findById(regLibros.getId());
        if (record.isPresent()) {
            RegistLibros data = record.get();
            data.setNameChild(regLibros.getNameChild());
            data.setLibrosLeidos(regLibros.getLibrosLeidos());
            data.setCantLibrosLeidos(regLibros.getCantLibrosLeidos());
            return Optional.of(libroRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<RegistLibros> result = libroRepository.findById(id);
        if (result.isPresent()){
            libroRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

