/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu297;

/**
 *
 * @author Ki Thuat 88
 */
public class Student extends Human implements IstudyI {
    int exId;

    public Student(String name, int age, int exId) {
        super(name, age);
        this.exId=exId;
        
    }
    
  @Override
    public void studyIt()
    {
    System.out.println("im study");
    }
    
    
}
