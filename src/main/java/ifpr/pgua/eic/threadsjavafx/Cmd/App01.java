package ifpr.pgua.eic.threadsjavafx.Cmd;

public class App01 {
    public static void main(String[] args) throws Exception{
        
        Ex01 ex01 = new Ex01();

        Thread t = new Thread(ex01);

        t.start(); //inicia a thread
        t.join(); //aguarda a finalização

        System.out.println("Terminei "+Thread.currentThread().getName());
    }
}
