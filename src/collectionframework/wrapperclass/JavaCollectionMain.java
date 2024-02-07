package collectionframework.wrapperclass;

import com.sun.tools.javac.Main;
//tomorrow class time @1:30pm -> collection program
public class JavaCollectionMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Sonu",90000);
        Employee e2 = new Employee(102,"Monu",92000);
        Employee e3 = new Employee(103,"Pradeep",93000);
        Employee e4 = new Employee(104,"Sumesh",94000);
        Employee e5 = new Employee(105,"Sahil",95000);

        Employee[] empArr = new Employee[5];
      //  Object [] empArr = new Object[10];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;
        empArr[3] = e4;
        empArr[4] = e5;

//        empArr[0] = e1;//upcating
//        empArr[1] = 100;
//        empArr[2] = 166.2;
//        empArr[3] = "Sonu";
//        empArr[4] = new Object();

        System.out.println("Employee Details");
        System.out.println("--------------------");
        System.out.println("ID\tName\tSalary");
        System.out.println("-------------------");

          for (Employee emp:empArr) {
            System.out.println(emp.getId()+ "\t"+ emp.getName()+"\t"+emp.getSalary());

        }
        System.out.println(empArr[1] +" "+ empArr[2] +" " + empArr[3] +" "+empArr[4]);

        /*for (Object obj:empArr) {
            Employee emp = (Employee) obj; //Down casting
            System.out.println(emp.getId()+ "\t"+ emp.getName()+"\t"+emp.getSalary());

        }*/

//        for (Object obj:empArr) {
//            if(obj instanceof Employee){}
//            Employee emp = (Employee) obj; //Down casting
//            System.out.println(emp.getId() + "\t"+ emp.getName()+"\t"+emp.getSalary());
//
//        }


    }
}
