package collectionframework.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByFirstName {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sonu", "Lodhi"));
        employeeList.add(new Employee("Monu", "Lodhi"));
        employeeList.add(new Employee("Ramraja","Lodhi"));
        employeeList.add(new Employee("Hariom", "Lodhi"));
        employeeList.add(new Employee("Abhishek","Lodhi"));

        Collections.sort(employeeList, Comparator.comparing(Employee::getFirstName));

        for (Employee list:employeeList) {
            System.out.println(list);
        }

    }
}
