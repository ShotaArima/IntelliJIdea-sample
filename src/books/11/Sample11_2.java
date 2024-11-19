class Car11_2 {
    private int num;
    private double gas;

    public Car11_2() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public Car11_2(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーが"+num+"ガソリン量が"+gas+"の車を作成しました。");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+num+"です。");
    }
}

class RacingCar11_2 extends Car11_2 {
    private int course;

    public RacingCar11_2() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public RacingCar11_2(int n, double g, int c) {
        super(n, g);
        course = c;
        System.out.println("コース番号"+course+"のレーシングカーを作成しました。");
    }
    public void setCourse(int c) {
        course = c;
        System.out.println("コース番号を"+course+"にしました。");
    }
}

class Sample11_2 {
    public static void main(String[] args) {
        RacingCar11_2 rccar1 = new RacingCar11_2(1234, 20.5, 5);
    }
}
