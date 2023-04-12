package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {

        List<Emp> empList  = Arrays.asList(new Emp(101,"Aarushi", Arrays.asList("Pune","Delhi")),
                new Emp(101,"jgajhg", Arrays.asList("Pune","Mumbai")),
                new Emp(101,"jain", Arrays.asList("Chennai","Delhi")));
        List<String> set = empList.stream().flatMap(emp -> emp.getList().stream()).collect(Collectors.toList());
        set.stream().forEach(System.out::println);
    }
}

class Emp{
    private int id;
    private String name;
    private List<String> list;

    public Emp(int id, String name, List<String> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}