public class DiamondProblem {
    public static void main(String[] args){
        //SportsCar  spc1 = new SportsCar();

    }
}

class Vehicle{
    String name;
    double speed;

    public Vehicle(){
        System.out.println("Vehicle is creating");
    }

    void start(){

    }

    void stop(){

    }
}

class Car extends Vehicle{
    String color;

    public Car(){
        System.out.println("Car is Creating");
    }
    @Override
    void start(){
        System.out.println("Vehicle start");
    }

    void stop(){
        System.out.println("Vehicle stop");
    }

}
//this will give an error
// class SportsCar extends Car, Vehicle{      
//     boolean isFourwheelDrive;

//     public SportsCar(){
//         System.out.println("Sport Car is creating ");
//     }
// }