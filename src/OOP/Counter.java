package OOP;

public class Counter {
    private int count;

    public Counter(int count){
        this.count = count;
    }
    public Counter(){
        this.count = 0;

    }

    public int getCount(){
        return  this.count;
    }

    public void decrement(){
        if (this.count <= 0){
            System.out.println("Cant decrement");
            return;
        }
        this.count--;
    }
    public void increment(){
        this.count++;
    }
    public void decrementBy(int n){
        if (this.count <= 0){
            System.out.println("Cant decrement");
            return;
        }
        this.count-=n;
    }
    public void incrementBy(int n){
        this.count+=n;
    }
    public void reset(){
        this.count = 0;
    }
}
