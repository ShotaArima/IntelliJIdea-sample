class Car9_6 {
    private int num;
    private double gas;

    public Car9_6() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public Car9_6(int n, double g) {
        this();
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"の車を作成しました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample9_6 {
    public static void main(String[] args) {
        Car9_6 car1 = new Car9_6();
        car1.show();

        Car9_5 car2 = new Car9_5(1234, 20.5);
        car2.show();
    }
}
