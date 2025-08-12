import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        newThread.shutdown();
        //зачем вообще это volatile если и так вроде работает? всё для того чтобы решать данную ситуацию
//                +-----+     +-----+
//                | CPU |     | CPU |
//                +--+--+     +--+--+
//                |           |
//                +--v--+     +--v--+     +-------------+
//                |Cache|     |Cache|     | Main Memory |
//                +--+--+     +--+--+     +------+------+
//                |           |               |
//                +-----------+---------------+
//                |           Bus             |
//                +-----------+---------------+

//у нас есть кэш, это супер быстрая память, хранит в себе только недавнюю, так вот например у нас несколько потоков в двух разных ядрах:
//а получилось случайно так что нужное, например, нам поле класса записалось в кэш в другом ядре,
//а мы в другом потоке(следовательно другое ядро) уже изменили данный параметр,но т.к. у нас сохранён этот параметр в кэше другого ядра,
// мы не можем его поменять, и просто бы тогда наш метод шатдауна бы не сработал



    }
}

class NewThread extends Thread {
    //volatile - подверженный изменению тип
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello!");
            try{
                this.sleep(1000);
            }
            catch(InterruptedException e){

            }

        }
    }

    public void shutdown() {
        System.out.println("Stopped");
        running = false;
    }
}
