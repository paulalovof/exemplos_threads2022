package ifpr.pgua.eic.threadsjavafx.Cmd;

public class App01 {
    public static void main(String[] args) throws Exception{
        
        Ex01 ex01 = new Ex01();
        Ex01 ex02 = new Ex01();

        Thread t = new Thread(ex01);
        Thread t2 = new Thread(ex02);

        t.start(); //inicia a thread
        t2.start();

        t.join();//indica que a main tem que aguardar para terminar sua execucao
        t2.join();

        System.out.println("Terminei "+Thread.currentThread().getName());
    }
}
