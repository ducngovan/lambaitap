package com.codegym.repository;


import com.codegym.model.Citys;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository extends PagingAndSortingRepository<Citys, Long> {
    Page<Citys> findAll(Pageable pageable);
}
