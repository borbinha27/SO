package aula_02;
import aula_02.atividade.HelloMaster;

public class Main{
    public static void main(String[] args) {
        HelloMaster hm = new HelloMaster();
        int n = Runtime.getRuntime().availableProcessors();
        hm.letsGetSomeHellos(n); 
    }
}
