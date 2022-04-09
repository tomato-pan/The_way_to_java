package java_015;

public class firstThread extends Thread{
    private int i;
    public void run(){
        for (; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"_"+i);
            if (i==20){
                new firstThread().start();
                new firstThread().start();
            }
        }
    }
}
