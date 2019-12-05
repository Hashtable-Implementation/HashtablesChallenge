package academy.learnprogramming.hashtableschallenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));


        employees.forEach(e -> System.out.println(e));

        Map<Integer,Employee> hash = new HashMap<Integer,Employee>();

        ListIterator<Employee> iterator = employees.listIterator();

        List<Employee> removalList = new ArrayList<Employee>();

        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(hash.containsKey(employee.getId())){
                removalList.add(employee);
            } else {
                hash.put(employee.getId(),employee);
            }

        }

        for(Employee employee : removalList){
            employees.remove(employee);
        }

        System.out.println("--------------------------------------------");
        employees.forEach(employee -> System.out.println(employee));

    }

//    public static int hash(int value) {
//        return Math.abs(value % 10);
//    }
}
