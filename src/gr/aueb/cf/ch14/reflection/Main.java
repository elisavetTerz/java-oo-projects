package gr.aueb.cf.ch14.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        // Use reflection to create an instance of Student with the default constructor

        try {
            //Get the class object
            Class<?> studentClass = Class.forName("gr.aueb.cf.exercises.ch14.reflection.Student");

            // Get the default constructor
            Constructor<?> defaultCtr = studentClass.getDeclaredConstructor();

            defaultCtr.setAccessible(true);
            Student student1 = (Student) defaultCtr.newInstance();

            // Print the created instance
            System.out.println("Student instance created with default constructor:");
            System.out.println("ID: " + student1.getId());
            System.out.println("Firstname: " + student1.getFirstname());
            System.out.println("Lastname: " + student1.getLastname());


        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
