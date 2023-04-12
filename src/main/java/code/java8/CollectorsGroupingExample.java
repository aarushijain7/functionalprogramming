package code.java8;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsGroupingExample {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(101, "Aarushi", 32),
                new Employee(102, "Deepanshu", 31),
                new Employee(103, "Ankit", 30),
                new Employee(103, "Ankit", 30), new Employee(103, "Yashu", 30)
        );
        //grouping based on age
        Map<Integer, List<Employee>> resultantMap = empList.stream().
                collect(Collectors.groupingBy(emp -> emp.getAge()));

        //removing redundant values by using toSet
        Map<Object, Set<Employee>> resultantMapWithoutRedundant = empList.stream().
                collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.toSet()));

        // sorting the resultant Map by using TreeMap
        Map<Integer, Set<Employee>> sortedMap = empList.stream().
                collect(Collectors.groupingBy(emp -> emp.getAge(), TreeMap::new, Collectors.toSet()));

    }
}

class Employee {
    private int empId;
    private String eName;
    private int age;

    public Employee(int empId, String eName, int age) {
        this.empId = empId;
        this.eName = eName;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(eName, employee.eName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, eName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", eName='" + eName + '\'' +
                ", age=" + age +
                '}';
    }
}

