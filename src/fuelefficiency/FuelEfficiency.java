/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;
import java.util.Scanner;

/**
 *
 * @author nohin6777
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //prompts the user for an amount of fuel in litres
        System.out.print("How much fuel do you have?(litres):");
        
        //gets the user's amount of fuel for calculations
        Scanner input = new Scanner(System.in);
        double fuelAmount = input.nextDouble();
        
        //declares vehicles to print the distance each one can go
        Vehicle car1 = new Car();
        Vehicle truck1 = new Truck();
        Vehicle hCar1 = new HybridCar();
        Vehicle mCycle1 = new Motorcycle();
        
        //prints how far each vehicle can go
        System.out.println("On " + fuelAmount + " litres of gas the vehicles can drive:\n\n"
                + "Truck: " + truck1.getDistance(fuelAmount) + " KM"
                + "\nCar: " + car1.getDistance(fuelAmount) + " KM"
                + "\nHybrid Car: " + hCar1.getDistance(fuelAmount) + " KM"
                + "\nMotorcycle: " + mCycle1.getDistance(fuelAmount) + " KM");
        
    }
    
}
