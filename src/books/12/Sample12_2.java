// 乗り物クラス
abstract class Vehicle12_2 {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("速度を"+speed+"にしました。");
    }
    abstract void show(); // 抽象メソッド
}

// 車クラス
class Car12_2 extends Vehicle12_2 {
    private int num;
    private double gas;

    public Car12_2(int n, double g) {
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
class Plane12_2 extends Vehicle12_2 {
    private int flight;

    public Plane12_2(int f) {
        flight = f;
        System.out.println("便"+flight+"の飛行機を作成しました。");
    }
    public void show() {
        System.out.println("飛行機の便は"+flight+"です。");
        System.out.println("速度は"+speed+"です。");
    }
}

class Sample12_2 {
    public static void main(String[] args) {
        Vehicle12_2[] vc;
        vc = new Vehicle12_2[2];

        vc[0] = new Car12_2(1234, 20.5);
        vc[1] = new Plane12_2(232);

        for (int i = 0; i < vc.length; i++) {
            if (vc[i] instanceof Car12_2) {
                System.out.println((i+1)+"番目のオブジェクトはCarクラスです。");
            }else {
                System.out.println((i+1)+"番目のオブジェクトはCarクラスではありません。");
            }
        }
    }
}
