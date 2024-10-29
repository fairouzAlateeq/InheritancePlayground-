package com.ps;

public class Dragon extends Monster{
    int wingCount;
    double wingSpan;
    boolean breatheFire;

    public Dragon() {
        super();
    }

    public Dragon(int limbs, int age, String habitat, int wingCount, double wingSpan, boolean breatheFire) {
        super(limbs, age, habitat);
        this.wingCount = wingCount;
        this.wingSpan = wingSpan;
        this.breatheFire = breatheFire;

    }
}
