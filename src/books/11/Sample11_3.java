class Car11_3 {
    protected int num;
    protected double gas;

    public Car11_3() {
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

class RacingCar11_3 extends Car11_3 {
    private int course;

    public RacingCar11_3() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public void setCourse(int c) {
        course = c;
        System.out.println("コース番号を"+course+"にしました。");
    }
    public void newShow() {
        System.out.println("レーシングカーのナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
        System.out.println("コース番号は"+course+"です。");
    }
}

class Sample11_3 {
    public static void main(String[] args) {
        RacingCar11_3 rccar1 = new RacingCar11_3();
        rccar1.newShow();
    }
}
