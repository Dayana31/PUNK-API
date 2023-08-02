package com.beers.test.services;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.beers.test.model.Beer;
import com.beers.test.model.SearchLog;
import com.beers.test.repository.SearchLogRepository;

@Service
public class BeerService {
    @Value("${punkapi.baseurl}")
    private String baseUrl;
    private RestTemplate restTemplate;
    private Long startTime;
    private Long endTime;

    @Autowired
    private SearchLogRepository searchLogRepository;
    
    
    public BeerService (){
        this.restTemplate = new RestTemplate();
    }

    public List<Beer> getAllBeers() {
        List<Beer> result = null;

        String url = baseUrl + "/beers";

        startTime = System.currentTimeMillis();
        Beer[] beers = restTemplate.getForObject(url, Beer[].class);
        endTime = System.currentTimeMillis();

        result = Arrays.asList(beers);
        saveSearchLog("getAllBeers", endTime-startTime);

        return result;
    }

    public List<Beer> getBeersByName(String name) {
        List<Beer> result = null;

        String url = baseUrl + "/beers?beer_name=" + name;

        startTime = System.currentTimeMillis();
        Beer[] beers = restTemplate.getForObject(url, Beer[].class);
        endTime = System.currentTimeMillis();

        result = Arrays.asList(beers);
        saveSearchLog("getBeersByName", endTime-startTime);

        return result;
    }

    public List<Beer> getRandomBeer() {
        List<Beer> result = null;

        String url = baseUrl + "/beers/random";

        startTime = System.currentTimeMillis();
        Beer[] beers = restTemplate.getForObject(url, Beer[].class);
        endTime = System.currentTimeMillis();
        
        result = Arrays.asList(beers);
        saveSearchLog("getRandomBeer", endTime-startTime);

        return result;
    }

    private void saveSearchLog(String serviceName, Long responseTime) {
        SearchLog searchLog = new SearchLog();
        searchLog.setServiceConsumed(serviceName);
        searchLog.setExecutionTime(new Date());
        searchLog.setResponseTime(responseTime);

        searchLogRepository.save(searchLog);
    }


}
