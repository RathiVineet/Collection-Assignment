import java.util.HashMap;
import java.util.Map;

public class Employees {
    String name;
    String designation;
    int age;

    Employees(String name, String designation, int age){
        this.name=name;
        this.designation=designation;
        this.age=age;

    }

    @Override
    public String toString(){
        return "Name : " + this.name + ", Designation : " + designation + ", Age : " + age;
    }
    public static void main(String[] args) {
        HashMap<Employees,String> hash = new HashMap<>();
        Employees obj1 = new Employees("Vineet ","SDE",22);
        Employees obj2 = new Employees("Lalit","SDE",24);
        Employees obj3 = new Employees("Gourav","SDE",24);
        Employees obj4 = new Employees("Arjun","SDE",23);
        Employees obj5 = new Employees("Akash","SDE",22);

        hash.put(obj1,obj1.designation);
        hash.put(obj2,obj2.designation);
        hash.put(obj3,obj3.designation);
        hash.put(obj4,obj4.designation);
        hash.put(obj5,obj5.designation);

        for(Map.Entry<Employees,String> entry : hash.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}

