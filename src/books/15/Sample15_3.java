class Car15_3 extends Thread {
    private String name;

    public Car15_3(String nm) {
        name = nm;
    }
    public void run() {
        for(int i=0; i<5; i++) {
            try {
                sleep(1000); // 1秒一時停止している
                System.out.println(name + "の処理をしています。");
            } catch (InterruptedException e) {

            }
        }
    }
}

class Sample15_3 {
    public static void main(String[] args) {
        Car15_3 car1 = new Car15_3("1号車");
        car1.start();

        for(int i=0; i<5; i++) {
            System.out.println("main()の処理をしています。");
        }
    }
}
