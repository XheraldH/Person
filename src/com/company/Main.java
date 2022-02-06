package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) {


        Person Ali = new Person("Ali", "Man", 30000);
        Person Jack = new Person("Jack", "Man", 32342);
        Person Alice = new Person("Alice", "Kvinna",  32451);
        Person Mahmoud = new Person("Mahmoud", "Man",  26345);
        Person Elna = new Person("Elna", "Man", 36223);
        Person Lina = new Person("Lina", "Kvinna",  23566);
        Person Bea = new Person("Bea", "Kvinna", 65432);
        Person Alex = new Person("Alex", "Man",  523567);
        Person Per = new Person("Per", "Man",  352346);
        Person Teodora = new Person("Teodora", "Kvinna",  36743);
        Person Kalle = new Person("Kalle", "Man",  30033);


        List<Person> personList = new ArrayList<>();
        personList.add(Ali);
        personList.add(Alice);
        personList.add(Alex);
        personList.add(Jack);
        personList.add(Mahmoud);
        personList.add(Elna);
        personList.add(Lina);
        personList.add(Kalle);
        personList.add(Bea);
        personList.add(Per);
        personList.add(Teodora);

        Map<String, Double> averegeSalary = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.averagingDouble(Person::getSalary)));
        System.out.println(averegeSalary);

        Person maxSalary = personList.stream()
                .max(Comparator.comparing(Person::getSalary))
                .get();
        Person minSalary = personList.stream()
                .min(Comparator.comparing(Person::getSalary))
                .get();

        System.out.println("Highest Salary");
        System.out.println(maxSalary.getName() + "\n" + maxSalary.getGender());
        System.out.println("||||||||||||||||||||");
        System.out.println("Lowest Salary ");
        System.out.println(minSalary.getName() + "\n " + minSalary.getSalary());


    }
}





