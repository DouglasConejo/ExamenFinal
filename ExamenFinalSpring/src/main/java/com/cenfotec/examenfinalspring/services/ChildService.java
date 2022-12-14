package com.cenfotec.examenfinalspring.services;

import com.cenfotec.examenfinalspring.entities.Child;

import java.util.List;
import java.util.Optional;

public interface ChildService {

    public List<Child> getAll();
    public Optional<Child> findById(long id);
    public  Optional<Child> save(Child child);
    public  Optional<Child> update(Child child);
    public boolean delete(Long id);
}
