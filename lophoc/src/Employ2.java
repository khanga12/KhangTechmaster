/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki Thuat 88
 */
public class Employ2 {
    private String name;
    private int age;
    private double salary;
     public void setName(String name)
{
    
this.name=name;
}
public void setAge(int age)
{
this.age=age;
}
    public void setSalary(double salary )
    {this.salary=salary;}
public String getName()
{
return name;
}    
public int getAge()
{ return age;}
public double getSalary()
{return salary;}


public Employ2(String name, int age,double salary)
{
this.name=name;
this.age=age;
this.salary=salary;


}
public static void main(String []args){
Employ2 employee= new Employ2("khang",25,9000);
Employ2 employee1= new Employ2("khang2",25,90200);
Employ2 employee2= new Employ2("khang3",22,90100);

System.out.println(employee);
}   
}

 