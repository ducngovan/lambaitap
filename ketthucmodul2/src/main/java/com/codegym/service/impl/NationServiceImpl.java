package com.codegym.service.impl;

import com.codegym.model.Nations;
import com.codegym.repository.NationRepository;
import com.codegym.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;

public class NationServiceImpl implements NationService {
    @Autowired
    private NationRepository nationRepository;

    @Override
    public Iterable<Nations> showAll() {
        return nationRepository.findAll();
    }

    @Override
    public Nations findById(Long id) {
        return nationRepository.findOne(id);
    }

    @Override
    public void save(Nations author) {
        nationRepository.save(author);
    }

    @Override
    public void drop(Long id) {
        nationRepository.delete(id);
    }
}
