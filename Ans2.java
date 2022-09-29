import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    Double age;
    Double salary;
    String name;
    Employee(Double age,Double salary,String name){
        this.age= age;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public String toString(){
        return  " Name : " + this.name + ", Salary : " + this.salary + ", Age : " + this.age;
    }
    @Override
    public int compareTo(Employee o) {
        if(o.name == this.name ){
            return 0;
        }
        return -1 * o.name.compareTo(this.name);
    }
}

class SortBasedOnSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return -o1.salary.compareTo(o2.salary);
    }
}

public class Ans2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(27.0,57000.56,"Vineet Rathi"));
        list.add(new Employee(22.0,45000.87,"Lalit Kalpasi"));
        list.add(new Employee(25.0,34000.23,"Harsh Verma"));
        list.add(new Employee(45.0,39000.34,"Abhinav Singh"));
        list.add(new Employee(54.0,79000.67,"Harsh Kumar"));

        System.out.println("Sorting based on Name");
        Collections.sort(list);
        for(Employee e : list){
            System.out.println(e);
        }

        System.out.println("Sorting based on salary using Comparator");
        Collections.sort(list,new SortBasedOnSalary());
        for(Employee e : list){
            System.out.println(e);
        }
    }
}

