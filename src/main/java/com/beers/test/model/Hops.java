package com.beers.test.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
                                                                     
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Hops{
    private String name;
    private Amount amount;
    private String add;
    private String attribute;
}
