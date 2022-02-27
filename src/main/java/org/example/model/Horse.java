package org.example.model;

public class Horse implements Animal{
    private String colour;


    @Override
    public void animalPlus() {
        System.out.println("Ит боз тусто");
    }

    @Override
    public void animalMinus() {
        System.out.println("At курон тусто");
    }

    public Horse() {
    }

    public Horse(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
