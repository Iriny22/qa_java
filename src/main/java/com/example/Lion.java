package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;
    private IFeline iFeline;
    private Lion lion;

    public Lion(Feline feline) {
        this.iFeline = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

  // Feline feline2 = new Feline();


    public int getKittens() {
        return iFeline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        return lion.getFood("Хищник");
    }
}
