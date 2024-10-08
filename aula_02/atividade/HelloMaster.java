package aula_02.atividade;

import aula_02.modelo.HelloFromThread;

public class HelloMaster{
    public static void letsGetSomeHellos(){
        Thread t1 = new Thread(new HelloFromThread(1)); 
        t1.start();

        Thread t2 = new Thread(new HelloFromThread(2)); 
        t2.start();

        Thread t3 = new Thread(new HelloFromThread(3)); 
        t3.start();

        Thread d4 = new Thread(new HelloFromThread(4)); 
        d4.start();
        
    }
}