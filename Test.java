public class Test {
    public static void main(String[] args) {
        MonThread t1=new MonThread("Hello world!");
        MonThread t2=new MonThread("Sa7a baba");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Fin");

    }
}
