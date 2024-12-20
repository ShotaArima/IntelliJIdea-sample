class Car10_7 {
    private int num;
    private double gas;

    public Car10_7() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample10_7 {
    public static void main(String[] args) {
        Car10_7 car1;
        System.out.println("car1を宣言しました。");
        car1 = new Car10_7();
        car1.setCar(1234, 20.5);

        Car10_7 car2;
        System.out.println("car2を宣言しました。");

        car2 = car1;
        System.out.println("car2にcar1を代入しました。");

        System.out.println("car1が指す");
        car1.show();
        System.out.println("car2が指す");
        car2.show();

        System.out.println("car1がさす車に変更を加えます。");
        car1.setCar(2345, 30.5);

        System.out.println("car1がさす");
        car1.show();
        System.out.println("car2が指す");
        car2.show();
    }
}
