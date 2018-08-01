
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ki Thuat 88
 */
public class Employ {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employ(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
    void show()
    {
        System.out.println(name+","+age+","+salary);
    }

    public static void main(String[] args) {
        Employ employee1 = new Employ("Khang", 25, 1000);
        Employ employee2 = new Employ("Khangx1", 26, 11000);
        Employ employee3 = new Employ("Khangx2", 27, 12000);
        Employ employee4 = new Employ("Khangx3", 24, 13000);
        List<Employ> employList = new ArrayList<Employ>();

        employList.add(employee4);
        employList.add(employee3);
        employList.add(employee2);
        employList.add(employee1);
        for(int i=0;i<employList.size();i++)
        {
        employList.get(i).show();
        }}}
        
    


