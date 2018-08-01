/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapkethua;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ki Thuat 88
 */
public class Vehicle {
    private String color;
    private double price;
    private int maxspeed;
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return price;
    }
    public int getMaxspeed()
    {
        return maxspeed;
    }
    public void setColor()
    {
        this.color=color;
    }
    public void setPrice()
    {
        this.price=price;
    }
   Vehicle(String color, double price, int maxspeed)
    {
        this.color=color;
        this.maxspeed=maxspeed;
        this.price=price;
        System.out.println("color is: "+ color + "price is:" + price + "maxspeed:"+ maxspeed);
    }
class Bus extends Vehicle
{
    Bus(String color, double price, int maxspeed) {
     super(color, price, maxspeed);
        }
}
class Car extends Vehicle
{
Car(String color, double price, int maxspeed) {
     super(color, price, maxspeed);
}
class Bicycle extends Vehicle
{
    Bicycle(String color, double price, int maxspeed) {
     super(color, price, maxspeed);
}
    // tao doi tuong cho lop con
}
}
//public static void main(String[] args) {
Bus bus1=new Bus("red",10000,120);
Bus bus2=new Bus("blue",12000,132);
Bus bus3=new Bus("grey",10000,110);
Car car1=new Car("orange",18000,300);
Car car2=new Car("white",21000,310);
Car car3=new Car("black",22000,310);
 Bicycle bicycle1=new  Bicycle("blue",2000,30);

}
