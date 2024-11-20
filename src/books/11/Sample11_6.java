class Car11_6 {
    protected int num;
    protected double gas;

    public Car11_6() {
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

class RacingCar11_6 extends Car11_6 {
    private int course;

    public RacingCar11_6() {
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

class Sample11_6 {
    public static void main(String[] args) {
        Car11_6[] cars;
        cars = new Car11_6[2];

        cars[0] = new Car11_6();
        cars[0].setCar(1234, 20.5);

        cars[1] = new Car11_6();
        cars[1].setCar(4567, 30.5);

        for(int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
