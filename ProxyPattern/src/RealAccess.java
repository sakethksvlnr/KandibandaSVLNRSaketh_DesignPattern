/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saket
 */
public class RealAccess implements AtmAccess {
    public int atmpin;
    public RealAccess(int pin)
    {
        atmpin=pin;
    }
    @Override
    public void grantAccess()
    {
        System.out.println("Pin is correct and Access granted");
    }
}
