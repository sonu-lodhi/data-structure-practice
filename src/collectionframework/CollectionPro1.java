package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//User
//How to sort a list of students on the basis of their First name? write a program in java
public class CollectionPro1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sonu", "Lodhi"));
        studentList.add(new Student("Monu", "Lodhi"));
        studentList.add(new Student("Hariom","Lodhi"));
        studentList.add(new Student("Muskan", "Lodhi"));
        studentList.add(new Student("Rahul", "Sharma"));

        System.out.println("Unsorted List Of Student");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);

        System.out.println("\nSorted List of Student");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
