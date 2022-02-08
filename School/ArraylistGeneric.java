package School;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/*
    Author: Jake Stevenson

    Use ArrayList) Write a class ArraylistGeneric that creates an
    ArrayList and adds a Person object, a Date object, a string, and
    a Employee object to the list, and use a loop 
    to display all the elements in the list by invoking the object’s
    toString() method.

**/

public class ArraylistGeneric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /* return ArraylistGeneric **/
        createArraylistGeneric();

        /* prompt for input **/
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> list = new ArrayList<>();

        /** read input */
        for (int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }

        System.out.println("Removing duplicates...");
        removeDuplicate(list);

        System.out.println("Displaying list...");
        System.out.println(list);

        /** return unique list */
        removeDuplicate(list);

        input.close();
    }


    /** Removes the duplicate elements from an array list of integers */
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (!temp.contains(list.get(i))) {
                temp.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(temp);
    }

    private static void createArraylistGeneric() {
        Person person4 = new Person("Tim", "12 Bell street",
                "3473339999", "john12@aol.com");
        Employee employee2 = new Employee("Jim", "14 East street", "6189259244",
                "Jim945@aol.com", 910, 32423423);
        Employee employee = new Employee("Mike", "13 West street", "23899995559",
                "mike80@aol.com", 910, 32423234);
        Person person2 = new Person("Mike", "12 Bell street",
                "3473339999", "mike80@aol.com");
        Employee employee3 = new Employee("Bob", "34 North street", "618999999",
                "Bob213@aol.com", 910, 142412412);
        Person person = new Person("Bob", "12 Bell street",
                "3473339999", "ace@aol.com");
        Employee employee4 = new Employee("Ace", "34 North street", "618999999",
                "ace@aol.com", 910, 334232);
        Person person3 = new Person("Ace", "12 Bell street",
                "3473339999", "john12@aol.com");

        // Create an array list of objects
        ArrayList<Object> o = new ArrayList<Object>();

        // Add each object
        o.add("\r\n" + "\nEmployees:\n");
        o.add(employee);
        o.add(employee2);
        o.add(employee3);
        o.add(employee4);
        o.add("\nPeople:\n");
        o.add(person);
        o.add(new Date());
        o.add(person2);
        o.add(new Date());
        o.add(person3);
        o.add(new Date());
        o.add(person4);
        o.add(new Date());

        // Display all the elements in the list by
        // invoking the object’s toString() method
        for (int i = 0; i < o.size(); i++) {
            System.out.println((o.get(i)).toString());
        }

    }
}