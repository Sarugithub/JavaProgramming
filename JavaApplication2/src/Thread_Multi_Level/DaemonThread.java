/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahesh
 */
public class DaemonThread extends Thread{
     
 //   public DaemonThread(){
    //    setDaemon(true);
   // }
    public void run(){
        System.out.println("Is this thread Daemon? - "+isDaemon());
    }
    public static void main(String a[]){
        DaemonThread dt = new DaemonThread();
        // even you can set daemon constrain here also
     //  dt.setDeamon(true);
       dt.setDaemon(true);
     
        dt.start();
    }
}
