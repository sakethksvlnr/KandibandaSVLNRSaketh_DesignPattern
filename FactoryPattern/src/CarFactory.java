/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saket
 */
public class CarFactory {
    public Car getCar(String name)
    {
        if(name==null)
        {
            return null;
        }
        if(name.equalsIgnoreCase("Santro"))
        {
            return new Santro();
         }
        else if(name.equalsIgnoreCase("Fortuner"))
        {
            return new Fortuner();
        }
        else if(name.equalsIgnoreCase("Innova"))
        {
            return new Innova();
        }
        else{
        return null;}
        
    }
}
