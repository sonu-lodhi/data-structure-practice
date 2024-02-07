package basicprogram.java8features;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class JavaMain {
    public static void main(String[] args) {
        List<User> userList = Stream.of(
                            new User("Sonu Lodhi","8821873527", Arrays.asList("sonulodhi.scsit@gmail.com","sonulodhi843543@gmail.com")),
                            new User("Monu Lodhi","7987783566",Arrays.asList("monu@gmail.com","monsingh@gmail.com"))
                            ).collect(Collectors.toList());

        //List<List<String>> list= userList.stream().map(User::getEmail).collect(Collectors.toList());
        List<String> list= userList.stream().map(User::getName).collect(Collectors.toList());

        List<String> userList1 = userList.stream().flatMap(user -> user.getEmail().stream()).collect(Collectors.toList());

        System.out.println(userList1);


        String name = "my name is sonu lodhi. i am from chanderi district ashok nagar madhya pradesh";
        Map<String, Long>countMap = Arrays.stream(name.split("")).collect(
                        groupingBy(
                                Function.identity(), counting()
                        )
                );
        System.out.println(countMap);


        List<Employee> empList = Stream.of(
                new Employee(101, "Sonu Lodhi", "Information Technology", 390000),
                new Employee(102, "Sumesh Lodhi", "Account", 39000),
                new Employee(103, "Monu Lodhi", "Business Development",90000),
                new Employee(104, "Krishnapal Lodhi", "Health",120000)
        ).collect(Collectors.toList());

        //approach1
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> employeeMap = empList.stream()
                .collect(
                        groupingBy(Employee::getDept,
                                Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
        System.out.println(employeeMap);

        //Approach2
        Map<String, Employee> employeeMap1 =   empList.stream().collect(
                    Collectors.groupingBy(
                            Employee::getDept,
                            collectingAndThen(maxBy(Comparator.comparingLong(Employee::getSalary)), Optional::get)
                    ));
        System.out.println(employeeMap1);

        IntStream.rangeClosed(1,10).forEach(t-> System.out.println(Thread.currentThread().getName()+t));
        System.out.println("=======================================");
        IntStream.rangeClosed(1,10).parallel().forEach(t-> System.out.println(Thread.currentThread().getName()+t));

        JavaMain obj1 = new JavaMain();
        JavaMain obj2 = new JavaMain();
        JavaMain obj3 = new JavaMain();
        JavaMain obj4 = new JavaMain();
        System.out.println("Number of object created are : "+ctr);
    }
    private static int ctr = 0;
    public JavaMain(){
        ctr++;
    }

}
