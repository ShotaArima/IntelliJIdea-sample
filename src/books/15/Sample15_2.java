class Car15_2 extends Thread {
    private String name;

    public Car15_2(String nm) {
        name = nm;
    }
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(name + "の処理をしています。[" + i + "]");
            try {
                Thread.sleep(500); // 500ミリ秒待機を入れることで処理を遅くする
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Sample15_2 {
    public static void main(String[] args) {
        Car15_2 car1 = new Car15_2("1号車");
        car1.start();

        Car15_2 car2 = new Car15_2("2号車");
        car2.start();

        for(int i=0; i<5; i++) {
            System.out.println("main()の処理をしています。[" + i + "]");
            try {
                Thread.sleep(500); // 500ミリ秒待機を入れることで処理を遅くする
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

