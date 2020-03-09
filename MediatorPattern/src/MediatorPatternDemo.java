/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saket
 */
public class MediatorPatternDemo {
     public static void main(String[] args) {
      User robert = new User("Saketh");
      User john = new User("Kusal");

      robert.sendMessage("Hi! Saketh!");
      john.sendMessage("Hello! Kusal!");
   }
}
