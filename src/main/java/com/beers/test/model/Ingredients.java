package com.beers.test.model;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
                                                                     
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Ingredients{
    private List<Malt> malt;
    private List<Hops> hops;
    private String yeast;
}
