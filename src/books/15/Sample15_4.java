class Car15_4 extends Thread {
    private String name;

    public Car15_4(String nm) {
        name = nm;
    }
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}

class Sample15_4 {
    public static void main(String[] args) {
        Car15_4 car1 = new Car15_4("1号車");
        car1.start();

        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("main()の処理をしています。");
            }catch (InterruptedException e) {}
        }
    }
}
