package com.codegym.service;


import com.codegym.model.Citys;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService {
//    Iterable<KindOfBook> showAll();

    Citys findById(Long id);

    void save(Citys kindOfBook);

    void drop(Long id);
    Page<Citys> findAll(Pageable pageable);
}
