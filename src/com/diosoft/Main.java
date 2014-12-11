package com.diosoft;

public class Main {

    public static void main(String[] args) {

        PersonImpl person1 = new PersonImpl("Adler","Makhsudov",31,JobTitle.DEVELOPER);
//        person1.setAge(32);
        PersonImpl person2 = new PersonImpl("Adler","Makhsudov",31,JobTitle.DEVELOPER);
        /*new PersonImpl("Super","Men",111,JobTitle.DIRECTOR);*/

        doEquals(person1, person2);

    }
    private static void doEquals(Person person1, Person person2){
        System.out.println("== " + (person1==(person2)));
        System.out.println("is equals " + person1.equals(person2));
        System.out.println(person1);
        System.out.println(person2);
    }
}
