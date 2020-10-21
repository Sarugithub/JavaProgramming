/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeExam;

/**
 *
 * @author SACHIN AGRAWAL
 */
   enum Directions
                    {
                         EAST,
                         WEST,
                         NORTH,
                         SOUTH
                    }



public class EnumExmple {
    
                  
                    public static void main(String args[])
                    {
                     /*   Directions dir = Directions.NORTH;  
                        if(dir == Directions.EAST) {
                        System.out.println("Direction: East");
                         } else if(dir == Directions.WEST) {
                         System.out.println("Direction: West");
                            } else if(dir == Directions.NORTH) {
                           System.out.println("Direction: North");
                  	    } else {
                            System.out.println("Direction: South");
                             }
                    }
*/
                       
                        for (Directions d : Directions.values())
                        {
                            System.out.println(d);
                        }}
    
}
