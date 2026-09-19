class Foo {
    boolean wakeOne;
    boolean wakeTwo;

    public Foo() {
        wakeOne = false;
        wakeTwo = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        wakeOne = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(!wakeOne) wait();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        wakeTwo = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(!wakeTwo) wait();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}