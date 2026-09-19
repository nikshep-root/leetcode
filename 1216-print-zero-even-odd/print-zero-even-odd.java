class ZeroEvenOdd {
    private int n;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }
    int state= 0;
    int curr = 1;
    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i =0;i<n;i++){
            while(state!=0) wait();
            printNumber.accept(0);
            if(curr%2 != 0){
                state = 1;
            }
            else{
                state = 2;
            }
            notifyAll();
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        for(int i = 2;i<=n;i+=2){
            while(state!=2) wait();
            printNumber.accept(i);
            curr++;
            state = 0;
            notifyAll();
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i =1;i<=n;i+=2){
            while(state!=1) wait();
            printNumber.accept(i);
            curr++;
            state = 0;
            notifyAll();
        }
    }
}