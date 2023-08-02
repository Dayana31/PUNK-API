package com.beers.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beers.test.model.Beer;
import com.beers.test.services.BeerService;

@RestController
@RequestMapping("/beers")
@CrossOrigin
public class BeerController {
    @Autowired
    private BeerService beerService;

    @GetMapping
    public List<Beer> getAllBeers() {
        return beerService.getAllBeers();
    }

    @GetMapping("/search/{name}")
    public List<Beer> getBeersByName(@PathVariable String name) {
        return beerService.getBeersByName(name);
    }

    @GetMapping("/random")
    public List<Beer> getRandomBeer() {
        return beerService.getRandomBeer();
    }

}
