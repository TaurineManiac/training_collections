import java.time.LocalDateTime;

public class TestMultithreading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();//почему старт а не ран?т.к. ран полностью выполнит поставленное, а уже после пойдёт дальше в текущем потоке

        System.out.println("Hello World");
        //пример что будет с ран
//        myThread.run(); //но нужно ещё закоментировать тогда старт

        System.out.println("Hello World");

        MyThread myThread2 = new MyThread();

        myThread2.start();
        //получается своеобразная синхронизация,но это только потому что мы хзаставляем поток спать,и тогда работу уже начинает второй поток
        //а т.к. это всё происходит очень быстро нам из-за этого так и кажется
        //если же убрать ожидание.то порядок вызывания потока будет случайным, крайне заметно на дистанции





        Thread myThread3 = new Thread(new Runner() {});
        myThread3.start();
        //итог, мэин тоже поток, и программа завершится тогда, когда завершат работу все потоки, мэин может завершится и на самом старте,
        // когда у нас идёт принт пирве тмир дважды в началае программы,то у нас завершается работа потока мэйна



    }
}

//вообще есть несколько вариантов создания потока

//1
class MyThread extends Thread {

    public void run() {//нам нужн о переопределить данный метод,чтобы всё стартовалось

        for (int i = 0; i < 1000; i++) {
//            try {
//                this.sleep(300);//спит какое-то время
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("отладка" + LocalDateTime.now() + " // " + i );
        }


    }
}

//2
class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("привет из раннера" + LocalDateTime.now() + " // " + i );
        }
    }
}

