package aula_02.atividade;

import aula_02.modelo.HelloFromThread;

public class HelloMaster{
    public static void letsGetSomeHellos(){
        for (int i = 0; i < 4; i++) {
            Thread t1 = new Thread(new HelloFromThread(i)); 
            t1.start();
        }
        
    }
}