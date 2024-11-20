// 乗り物クラス
abstract class Vehicle12_1 {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("速度を"+speed+"にしました。");
    }
    abstract void show(); // 抽象メソッド
}

// 車クラス
class Car12_1 extends Vehicle12_1 {
    private int num;
    private double gas;

    public Car12_1(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
        System.out.println("速度は"+speed+"です。");
    }
}

// 飛行機クラス
class Plane12_1 extends Vehicle12_1 {
    private int flight;

    public Plane12_1(int f) {
        flight = f;
        System.out.println("便"+flight+"の飛行機を作成しました。");
    }
    public void show() {
        System.out.println("飛行機の便は"+flight+"です。");
        System.out.println("速度は"+speed+"です。");
    }
}

class Sample12_1 {
    public static void main(String[] args) {
        Vehicle12_1[] vc;
        vc = new Vehicle12_1[2];

        vc[0] = new Car12_1(1234, 20.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane12_1(232);
        vc[1].setSpeed(500);

        for (int i = 0; i < vc.length; i++) {
            vc[i].show();
        }
    }
}
