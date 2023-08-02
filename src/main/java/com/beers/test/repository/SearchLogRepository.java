package com.beers.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beers.test.model.SearchLog;


public interface SearchLogRepository extends JpaRepository<SearchLog, Long>  {
    
}
