/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki Thuat 88
 */
public  class Human {
    
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
   public Human(String name,int age)
   {
   this.age=age;
   this.name=name;
   }
   
   public void show()
   {
   System.out.println("name: "+name+" "+"age:"+age);
   }

}
