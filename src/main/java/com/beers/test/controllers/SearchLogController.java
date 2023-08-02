package com.beers.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beers.test.model.SearchLog;
import com.beers.test.services.SearchLogService;

@RestController
@RequestMapping("/searchLog")
@CrossOrigin
public class SearchLogController {
    @Autowired
    private SearchLogService searchLogService;

    @GetMapping
    public List<SearchLog> getAllSearchLogs() {
        return searchLogService.getAllSearchLogs();
    }

}
