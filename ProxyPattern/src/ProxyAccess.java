/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saket
 */
public class ProxyAccess implements AtmAccess{
    public int atmpin;
    private RealAccess real;
    
    public ProxyAccess(int pin){
        atmpin=pin;
    }
    @Override
    public void grantAccess()
    {
        if(getpin(atmpin)==9216)
        {
            real =new RealAccess(atmpin);
            real.grantAccess();
        }
        else{
            System.out.println("Incorrect pin Access not granted");
        }
    }
    
    public int getpin(int atmpin)
    {
        return atmpin;
    }
}
