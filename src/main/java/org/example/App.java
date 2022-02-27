package org.example;

import org.example.model.Animal;
import org.example.model.Dog;
import org.example.model.Horse;
import org.example.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
        Animal animal = context.getBean("myDog", Dog.class);
        System.out.println(animal);
        animal.animalMinus();
        animal.animalPlus();
        Horse horse = context.getBean("horse", Horse.class);
        System.out.println(horse);



    }
}
