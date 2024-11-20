class Car11_5 {
    protected int num;
    protected double gas;

    public Car11_5() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class RacingCar11_5 extends Car11_5 {
    private int course;

    public RacingCar11_5() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public void setCourse(int c) {
        course = c;
        System.out.println("コース番号を"+course+"にしました。");
    }
    public void show() {
        System.out.println("レーシングカーのナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
        System.out.println("コース番号は"+course+"です。");
    }
}

class Sample11_5 {
    public static void main(String[] args) {
        Car11_5 rccar1 = new RacingCar11_5();
        rccar1.setCar(1234, 20.5);

        rccar1.show();
    }
}
