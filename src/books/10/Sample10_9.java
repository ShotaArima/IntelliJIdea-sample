class Car10_9 {
    private int num;
    private double gas;

    public Car10_9() {
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

class Sample10_9 {
    public static void main(String[] args) {
        Car10_9[] cars;
        cars = new Car10_9[3];

        for(int i = 0; i < cars.length; i++) {
            cars[i] = new Car10_9();
        }

        cars[0].setCar(1234, 20.5);
        cars[1].setCar(2345, 30.5);
        cars[2].setCar(3456, 40.5);

        for(int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
