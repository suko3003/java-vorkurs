package Brueckenkurs_05;

public class Parallel {
    public static void main(String[] args) {
        Runnable Task = ()-> {
            System.out.println(Thread.currentThread());
        };

        Thread[] thread = new Thread[30];
        //threads im array erzeugen
        for(int i = 0; i < 30; i++){
            thread[i] = new Thread(Task);
        }
        
        //threads nacheinander starten
        for(int i = 0; i < 30; i++){
            thread[i].start();
        }

        //warten dass alle fertig sind
        for(int i = 0; i < 30; i++){
            try {
                thread[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
