class Car9_8 {
    public static int sum = 0;

    private int num;
    private double gas;

    public Car9_8() {
        num = 0;
        gas = 0.0;
        sum ++;
        System.out.println("車を作成しました。");
    }

    public void setCar9_8(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }
    public static void showSum() {
        System.out.println("車は全部で"+sum+"台あります。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample9_8 {
    public static void main(String[] args) {
        Car9_8.showSum();
        Car9_8 car1 = new Car9_8();
        car1.setCar9_8(1234, 20.5);
        Car9_8.showSum();
        Car9_8 car2 = new Car9_8();
        car2.setCar9_8(4567, 30.5);
        Car9_8.showSum();
    }
}
