class Car25 {
    protected int num;
    protected double gas;

    public Car25() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
}

class RacingCar25 extends Car25 {
    private int course;

    public RacingCar25() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
}

class Sample25 {
    public static void main(String[] args) {
        Car25[] cars;
        cars = new Car25[2];
        cars[0] = new Car25();
        cars[1] = new RacingCar25();

        for(int i=0; i<cars.length; i++) {
            Class cl = cars[i].getClass();
            System.out.println((i+1)+"番目のオブジェクトクラスは"+cl+"です。");
        }
    }
}
