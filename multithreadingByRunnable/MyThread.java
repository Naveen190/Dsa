package multithreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        // Task for thread
        for(int i = 1;  i<=10;  i++){
            System.out.println("value of i " +i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();

    }
}
