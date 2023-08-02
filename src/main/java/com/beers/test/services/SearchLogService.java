package com.beers.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beers.test.model.SearchLog;
import com.beers.test.repository.SearchLogRepository;

@Service
public class SearchLogService {

    @Autowired
    private SearchLogRepository searchLogRepository;

    public List<SearchLog> getAllSearchLogs() {
        List<SearchLog> result = null;

        result = searchLogRepository.findAll();

        return result;
    }

  
}
