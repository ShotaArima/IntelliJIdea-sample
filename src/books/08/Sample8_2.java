class Car8_2 {
    int num;
    double gas;

    void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

public class Sample8_2 {
    public static void main(String[] args) {
        Car8_2 car1;
        car1 = new Car8_2();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.show();
        car1.show();
    }
}
