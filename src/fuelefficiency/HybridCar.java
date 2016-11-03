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
public class HybridCar extends Vehicle {
    
    /**
     * sets the distance that the hybrid car could go on the amount 
     * of gas provided by the user
     * pre: none
     * post: returns distance
     * @param litres
     * @return 
     */
    public double getDistance(double litres){
        double dist = litres*(100/3.8);
        return dist;
    }
        
}
