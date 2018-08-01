package lophoc;

class Circle {
    private double radius;//Trường = "thuộc tính" = field
    float x, y; //Toạ độ tâm x, y
    //Hàm khởi tạo = constructor = trùng với tên class
    Circle() {
        //Gọi sau khi khởi tạo đối tượng(object)
        System.out.println("This is a constructor");
    }
    //Hàm khởi tạo tuỳ biến = "custom constructor"
    Circle(double newRadius) {
        System.out.println("This is a custom constructor");
        this.radius = newRadius;
    }
    //Phương thức = method
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getRadius() {
        //Getter
        return radius;
    }
    //Setter, Giả sử muốn set giá trị của trường radius nhưng radius lại là "private" ?
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

