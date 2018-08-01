/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki Thuat 88
 */
public class Main {
  public static void main(String []args){
  Rectangle rectangle = new Rectangle(99, 100, "red");
  rectangle.show();
   Rectangle rectangle1= new Rectangle( 99,100,"red");
  System.out.println("perimeter:"+rectangle.getPerimeter());
  System.out.println("area:"+rectangle.getArea());
 System.out.println("perimeter2:"+ rectangle1.getPerimeter());
  System.out.println("area2:"+ rectangle1.getArea());
  
  System.out.println("two rectangle equalto:" +rectangle1.compareWidth(rectangle));
  System.out.println("two rectangle equalto: "+rectangle1.isequalto(rectangle));
 
  }
    
}
