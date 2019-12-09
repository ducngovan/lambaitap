package com.codegym.service;

import com.codegym.model.Nations;

public interface NationService {
    Iterable<Nations> showAll();

    Nations findById(Long id);

    void save(Nations author);

    void drop(Long id);
}
