class Car8_1 {
    int num;
    double gas;
}

class Sample8_1 {
    public static void main(String[] args) {
        Car8_1 car1;
        car1 = new Car8_1();

        car1.num = 1234;
        car1.gas = 20.5;

        System.out.println("車のナンバーは"+car1.num+"です。");
        System.out.println("ガソリン量は"+car1.gas+"です。");
    }
}
