package org.example.model;

public class Dog implements Animal {
    private String bread;
    private int weight;


    public Dog(String bread, int weight) {
        this.bread = bread;
        this.weight = weight;
    }

    public Dog() {
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }
    @Override
    public void animalPlus() {
        System.out.println("Менин жакшы коргон жаныбарым ит");
    }

    @Override
    public void animalMinus() {

        System.out.println("Баламдын жакшы коргон жаныбары ат");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                ", weight=" + weight +
                '}';
    }
}
