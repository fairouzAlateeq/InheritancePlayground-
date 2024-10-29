package com.ps;

public class Golemn extends Monster {
    String material;
    double size;

    public Golemn() {
        super();
                // super calls on the parent class
    }

    public Golemn(int limbs, int age, String habitat, String material, double size) {
        super(limbs, age, habitat);
        this.material = material;
        this.size = size;
    }
}


