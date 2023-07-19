package Java001;

public class Counter extends Thread{
    String name;

    Counter(String name) {
        this.name = name;

    }
    public void run(){
        for(int i=1; i<15; i++)
        {
            System.out.println(name+ "=="+i);
        }
    }
}
