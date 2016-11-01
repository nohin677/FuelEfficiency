/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author nohin6777
 */

abstract class Vehicle{
    
    //generic constructor for client code
    public Vehicle(){
        
    }
    
    //sets the abstract method 'getDistance' for other classes
    abstract double getDistance(double litres);
    
}


