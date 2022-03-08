package ifpr.pgua.eic.threadsjavafx.Cmd;

public class AppFibo {
    

    public static void main(String[] args) throws Exception{
        Fibo f = new Fibo(50);
        Thread thread = new Thread(f);

        thread.start();

        while(!f.isTerminou()){
            try{
                System.out.print(". ");
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Interrompido...");
            }
            
        }
        
    }
}
