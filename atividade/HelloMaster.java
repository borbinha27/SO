package atividade;

import modelo.HelloFromThread;

public class HelloMaster{
    public static void letsGetSomeHellos(){
        Thread t1 = new Thread(new HelloFromThread()); 
        t1.run();
        
    }
}