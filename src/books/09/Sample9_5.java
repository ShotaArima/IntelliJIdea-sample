class Car9_5 {
    private int num;
    private double gas;

    public Car9_5() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public Car9_5(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"の車を作成しました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample9_5 {
    public static void main(String[] args) {
        Car9_5 car1 = new Car9_5();
        car1.show();

        Car9_5 car2 = new Car9_5(1234, 20.5);
        car2.show();
    }
}
