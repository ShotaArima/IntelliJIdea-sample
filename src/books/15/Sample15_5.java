class Car15_5 extends Thread {
    private String name;

    public Car15_5(String nm) {
        name = nm;
    }
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}

class Sample15_5 {
    public static void main(String[] args) {
        Car15_5 car1 = new Car15_5("1号車");
        car1.start();

        for(int i=0; i<5; i++) {
            try {
                car1.join();
            }catch (InterruptedException e) {}
            System.out.println("main()の処理を終わります。");
        }
    }
}
