class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    private int now = 1;

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while(now <= n){
            while(now <= n && (now % 3 != 0 || now % 5 == 0)) wait();
            if(now > n) break;
            printFizz.run();
            now++;
            notifyAll();
        }
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while(now<=n){
            while(now <= n && (now % 3 == 0 || now % 5 != 0)) wait();
            if(now > n) break;
            printBuzz.run();
            now++;
            notifyAll();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(now<=n){
        while(now <= n && now % 15 != 0) wait();
        if(now > n) break;
        printFizzBuzz.run();
        now++;
        notifyAll();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while(now<=n){
        while(now <= n && (now %3 == 0 || now%5 == 0)) wait();
        if(now > n) break;
        printNumber.accept(now);
        now++;
        notifyAll();
        }
    }
}