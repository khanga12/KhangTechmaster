/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki Thuat 88
 */
public class Rectangle {
    private double height;
    private double width;
    private String colour;
    Rectangle(double width,double height, String colour ){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }
    
  public double getHeight(){
      return height;
  }
  public double getWidth(){
    return width;
  }
  public double getArea(){
    return width*height;
  }
  public double getPerimeter(){
    return 2*(width + height);
  }
void show()
{
System.out.println(width);
System.out.println(height);
}
public boolean compareWidth (Rectangle recx)
{
return (this.width> recx.width);

}
public boolean isequalto(Rectangle equalto )
{
return (this.width== equalto.width && this.height==equalto.height);
} 
}



      
        
  
          
    

