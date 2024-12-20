// 乗り物インテーフェイス
interface iVehicle12_3 {
    void show();
}

// 車クラス
class Car12_3 implements iVehicle12_3 {
    private int num;
    private double gas;

    public Car12_3(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

// 飛行機クラス
class Plane12_3 implements iVehicle12_3 {
    private int flight;

    public Plane12_3(int f) {
        flight = f;
        System.out.println("便"+flight+"の飛行機を作成しました。");
    }
    public void show() {
        System.out.println("飛行機の便は"+flight+"です。");
    }
}

class Sample12_3 {
    public static void main(String[] args) {
        iVehicle12_3[] ivc;
        ivc = new iVehicle12_3[2];

        ivc[0] = new Car12_3(1234, 20.5);
        ivc[1] = new Plane12_3(232);
        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();
        }
    }
}
