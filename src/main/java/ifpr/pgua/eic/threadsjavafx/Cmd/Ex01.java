package ifpr.pgua.eic.threadsjavafx.Cmd;

public class Ex01 implements Runnable{
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Sou a thread "+Thread.currentThread().getName());
        }
    }
}
