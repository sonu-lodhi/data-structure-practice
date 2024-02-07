package collectionframework.wrapperclass;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Employee> empSet = new HashSet<Employee>();
        empSet.add(new Employee(101,"Sonu",90000));
        empSet.add(new Employee(102,"Monu",92000));
        empSet.add(new Employee(103,"Pradeep",93000));
        empSet.add(new Employee(104,"Sumesh",94000));
        empSet.add(new Employee(104,"Sahil",95000));
        empSet.add(new Employee(104,"Sahil",95000));

        System.out.println("Total Employees: "+empSet.size());
        System.out.println("ID\tName\tSalary");
        for (Employee emp:empSet) {
            System.out.println(emp.getId()+ "\t"+ emp.getName()+"\t"+emp.getSalary());

        }

    }
}
