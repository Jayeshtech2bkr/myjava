 class Car {
    String color;
    int speed;

    void drive() {
        System.out.println(color + "car is driving at" + speed + "" + "kmh");


    }
    
}

public class Class {
    public static void main(String[] args) {
         Car car1 = new Car();
         car1.color = "blue";
         car1.speed = 100;
         car1.drive();


         Car car2 = new Car();
         car2.color="RED";
         car2.speed = 200;
         car2.drive();

    }

    
}
