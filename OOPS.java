// Missing class definition for Pen
class Pen {
    String color;  // Field for pen color
    String type;   // Field for pen type (ballpoint, gel)
    
    public void write() {
        System.out.println("writing something");
    }
    
    public void printColor() {
        System.out.println(this.color);  // Fixed: should be this.color
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        
        pen1.printColor();
        pen2.printColor();
    }  // Missing closing brace for main method
}  // Closing brace for OOPS class