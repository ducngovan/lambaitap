package com.codegym.repository;

import com.codegym.model.Nations;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NationRepository extends PagingAndSortingRepository<Nations, Long> {
}
