class Car15_6 implements Runnable {
    private String name;

    public Car15_6(String nm) {
        name = nm;
    }
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(name+"の処理をしています。");
        }
    }
}

class Sample15_6 {
    public static void main(String[] args) {
        Car15_6 car1 = new Car15_6("1号車");
        Thread th1 = new Thread(car1);
        th1.start();

        for(int i=0; i<5; i+=1) {
            System.out.println("main()の処理をしています。");
        }
    }
}
