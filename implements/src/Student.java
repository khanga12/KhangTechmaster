/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki Thuat 88
 */
public abstract class Student extends Human implements IPlayable, Comparable {
    String fieldOfStudy;
    Student(String name,int age, String fieldOfStudy) {
        super(name, age);
        this.fieldOfStudy = fieldOfStudy;
        
    }
    @Override
    public void playFootball() {
        System.out.println("I am playing Football");
    }
     @Override
    public void Moving ()
    {
    System.out.println("student moving!");
    }
     @Override
    public int compareTo(0bject o)
     {
         
    Student student1= (Student)o
      if(this.age)>(student.getAge())
    return this.getName().compareTo(student.getName());
     }
    
}
