public class TestSynchronized {
    public static void main(String[] args) throws InterruptedException {
        //С этого момента буду пробовать писать себе объяснения на английском
        //First of all synchronized is a keyword for methods, and how is it work?
        //If this keyword is using on method, that mean what this method cannot call more than 1 thead
        //(If someone thead, what using this method, is already opened, other threads are sleeping)

        //For understanding this we need to know two concepts: visibility & atomicity
        //Visibility - means that changes done by one thread are visible into next thread
        //Atomicity - means that only one thread can work with current method

        class CounterSynchronized {
            private int count = 0;

            public synchronized void increment() {
                count++;
            }
        }

        class CounterNonSynchronized {
            private  int count = 0;
            public void increment() {
                count++;
            }
        }

        //now wee look at the differences between Sync and NoSync
        CounterSynchronized counter = new CounterSynchronized();
        CounterNonSynchronized counterNon = new CounterNonSynchronized();

        Thread threadCounter1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000000; i++) {
                    counter.increment();
                }
            }
        });
        Thread threadCounterNon1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 1000000; i++) {
                    counter.increment();
                }
            }
        });
        Thread threadCounter2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    counterNon.increment();
                }
            }
        });
        Thread threadCounterNon2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    counterNon.increment();
                }
            }
        });

        threadCounter1.start();
        threadCounterNon1.start();
        threadCounter2.start();
        threadCounterNon2.start();

        threadCounter1.join();//What is join do ? Calling this methods means program wait until this thread will be finished
        //In my program without join counter displayed 0, because my computer decided complete main thead the first
        threadCounterNon1.join();
        threadCounter2.join();
        threadCounterNon2.join();


        System.out.println("Count: " + counter.count);
        System.out.println("CounterNon: " + counterNon.count);
        //I took more iterations, because current processors more strong and this is a reason why they cannot avoid race condition
    }
}
