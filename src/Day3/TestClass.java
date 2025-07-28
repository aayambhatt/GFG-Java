package Day3;

// defining the class Car
class Car {
    String model;
    int year;

    // constructor to initialize the Car object
     Car(String model, int year){
         this.model = model;
         this.year = year;
     }

     // display method
     void display(){
         System.out.println("Model: " + model + " || " + "Year: " + year);
     }
}

// Main class to show object creation
public class TestClass{
    public static void main(String[] args){
        //created an object of Car class
        Car Slavia = new Car("Skoda", 2010);
        Slavia.display();

        // accessing and printing objects properties
        System.out.println("Car's model: " + Slavia.model);
        System.out.println("Car's buying year: " + Slavia.year);
    }
}

