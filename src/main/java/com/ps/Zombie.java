package com.ps;

public class Zombie extends Monster {
    int dateOfBecoming;
    String skinColor;
    boolean isDistraced;

    public Zombie() {
        super();
    }

    public Zombie(int limbs, int age, String habitat, int dateOfBecoming, String skinColor, boolean isDistraced) {
        super(limbs, age, habitat);
        this.dateOfBecoming = dateOfBecoming;
        this.skinColor = skinColor;
        this.isDistraced = isDistraced;
    }
}
