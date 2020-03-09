/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saket
 */
import java.io.*;
import java.util.*;
public class Client {
    public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter atmpin");
    int k=ob.nextInt();
    AtmAccess atm= new ProxyAccess(k);
    atm.grantAccess();
    }
    
}