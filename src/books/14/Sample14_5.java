class CarException extends Exception {
}
// 車クラス
class Car14_5 {
    private int num;
    private double gas;

    public void Car14_5() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
        }
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Smaple14_5 {
    public static void main(String[] args) {
        Car14_5 car1 = new Car14_5();
        try {
            car1.setCar(1234, -10.0);
        }catch (CarException e) {
            System.out.println(e+"が送出されました。");
        }
        car1.show();
    }
}
