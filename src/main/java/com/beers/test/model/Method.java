package com.beers.test.model;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
                                                                     
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Method{
    private List<MashTemp> mash_temp;
    private Fermentation fermentation;
    private String twist;
}
