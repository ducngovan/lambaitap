package com.codegym.service.impl;


import com.codegym.model.Citys;
import com.codegym.repository.CityRepository;
import com.codegym.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;

//    @Override
//    public Iterable<KindOfBook> showAll() {
//        return kindOfBookRepository.findAll();
//    }

    @Override
    public Citys findById(Long id) {
        return cityRepository.findOne(id);
    }

    @Override
    public void save(Citys kindOfBook) {
        cityRepository.save(kindOfBook);
    }

    @Override
    public void drop(Long id) {
        cityRepository.delete(id);
    }

    @Override
    public Page<Citys> findAll(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }
}
