package com.beers.test.model;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
                                                                     
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Beer{
    private Long id;
    private String name;
    private String tagline;
    private String first_brewed;
    private String description;
    private String image_url;
    private Double abv;
    private Double ibu;
    private Double target_fg;
    private Double target_og;
    private Double ebc;
    private Double srm;
    private Double ph;
    private Double attenuation_level;
    private Volume volume;
    private Volume boil_volume;
    private Method method;
    private Ingredients ingredients;
    private List<String> food_pairing;
    private String brewers_tips;
    private String contributed_by;

}
