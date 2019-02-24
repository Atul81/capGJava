package hackerearth;

public class MCQ {
    final int num = 10;
    public void display(){
        int num = 12;
        Runnable r = new Runnable() {
            final int num = 15;
            @Override
            public void run() {
                int num = 20;
                System.out.println(this.num);
            }
        };
        r.run();
    }

    public static void main(String ...a){
        MCQ mcq = new MCQ();
        mcq.display();
    }
}
