package aula_02.atividade;

import aula_02.modelo.HelloFromThread;

public class HelloMaster{
    public static void letsGetSomeHellos(int n){
        Thread[] vet_t = new Thread[n];
        for (int i = 0; i < 4; i++) {
            vet_t[i] = new Thread(new HelloFromThread(i)); 
            vet_t[i].start();
        }
        
    }
}