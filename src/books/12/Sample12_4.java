// 乗り物インターフェイス
interface iVehicle {
    void vShow();
}

// 材料インタフェース
interface iMaterial {
    void mShow();
}

// 車クラス
class Car12_4 implements iVehicle, iMaterial {
    private int num;
    private double gas;

    public Car12_4(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
    }
    public void vShow() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
    public void mShow() {
        System.out.println("車の材料は鉄です。");
    }
}

class Sample12_4 {
    public static void main(String[] args) {
        Car12_4 car1 = new Car12_4(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}
