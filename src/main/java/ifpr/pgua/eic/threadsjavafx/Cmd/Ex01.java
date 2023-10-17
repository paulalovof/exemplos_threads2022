package ifpr.pgua.eic.threadsjavafx.Cmd;

public class Ex01 implements Runnable{
    
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(500); //coloca a thread no estado de espera
            }catch(InterruptedException e){}
            System.out.println("Sou a thread "+Thread.currentThread().getName());
        }
    }
}
