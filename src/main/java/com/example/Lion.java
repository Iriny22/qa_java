package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;
    private IFeline iFeline;
    private Lion lion;



    public Lion(String sex,Feline feline) throws Exception {

        this.iFeline = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }




    public int getKittens() {
        return iFeline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        return iFeline.eatMeat();
    }
}
