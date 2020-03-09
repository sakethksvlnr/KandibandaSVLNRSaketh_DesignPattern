/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saket
 */
public class CarDemo {
    public static void main(String args[])
    {
        CarFactory obj=new CarFactory();
        Car ob1= obj.getCar("Santro");
        ob1.carname();
        Car ob2=obj.getCar("Fortuner");
        ob2.carname();
        Car ob3=obj.getCar("Innova");
        ob3.carname();
    }
    
}
