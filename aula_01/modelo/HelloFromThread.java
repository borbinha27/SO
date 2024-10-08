package aula_01.modelo;

public class HelloFromThread implements Runnable {
    private int threadId;

    public HelloFromThread(int threadId) {
        this.threadId = threadId;
    }



    @Override
    public void run() {
        System.out.println("Hello from thread "+threadId);
    }
}