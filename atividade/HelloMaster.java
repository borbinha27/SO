package atividade;

import modelo.HelloFromThread;

public class HelloMaster{
    public static void letsGetSomeHellos(){
        Thread t1 = new Thread(new HelloFromThread()); 
        t1.start();

        Thread t2 = new Thread(new HelloFromThread()); 
        t2.start();

        Thread t3 = new Thread(new HelloFromThread()); 
        t3.start();

        Thread d4 = new Thread(new HelloFromThread()); 
        d4.start();
        
    }
}