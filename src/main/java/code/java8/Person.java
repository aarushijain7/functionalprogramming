package code.java8;

public class Person {
    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

}
