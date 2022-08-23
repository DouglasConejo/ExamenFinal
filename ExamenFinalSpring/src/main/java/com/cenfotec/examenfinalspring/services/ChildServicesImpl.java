package com.cenfotec.examenfinalspring.services;

import com.cenfotec.examenfinalspring.entities.Child;
import com.cenfotec.examenfinalspring.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildServicesImpl implements ChildService{

    @Autowired
    ChildRepository childRepository;

    @Override
    public List<Child> getAll() {
        return childRepository.findAll();
    }

    @Override
    public Optional<Child> findById(long id) {
        return childRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<Child> save(Child child) {
        return Optional.of(childRepository.save(child));
    }

    @Override
    public Optional<Child> update(Child child) {
        Optional<Child> record = childRepository.findById(child.getId());
        if (record.isPresent()) {
            Child data = record.get();
            data.setName(child.getName());
            data.setTypeUser(child.getTypeUser());
            data.setAlergias(child.getAlergias());
            data.setEncargado(child.getEncargado());
            return Optional.of(childRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<Child> result = childRepository.findById(id);
        if (result.isPresent()){
            childRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
