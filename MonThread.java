class MonThread extends Thread{
    private String message;
    public MonThread(String message){
        this.message=message;
    }
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(message);
            try{
                sleep(1000);
                Thread.sleep(1000);
                Thread.currentThread().sleep(1000);

            }catch(InterruptedException e){
    e.printStackTrace();
} 
        }
    }
}