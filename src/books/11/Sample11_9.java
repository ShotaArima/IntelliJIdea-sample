class Car11_9 {
    protected int num;
    protected double gas;

    public Car11_9() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
}

class RacingCar11_9 extends Car11_9 {
    private int course;

    public RacingCar11_9() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
}

class Sample11_9 {
    public static void main(String[] args) {
        Car11_9[] cars;
        cars = new Car11_9[2];

        cars[0] = new Car11_9();
        cars[1] = new RacingCar11_9();

        for (int i = 0; i < cars.length; i++) {
            Class cl = cars[i].getClass();
            System.out.println((i+1)+"番目のオブジェクトクラスは"+cl+"です。");
        }
    }
}
