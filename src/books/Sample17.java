package books;

class Car {
    private int num;
    private double gas;
    private String name;

    public Car() {
        num = 0;
        gas = 0.0;
        name = "名無し";
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました");
    }
    public void setName(String nm) {
        name = nm;
        System.out.println("名前を"+name+"にしました。");
    }
    public void show() {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリン量は"+gas+"です");
        System.out.println("名前は"+name+"です。");
    }
}

class Sample17 {
    public static void main(String[] args) {
        Car car1;
        System.out.println("car1を宣言しました");
        car1 = new Car(); // 1つのオブジェクトを作成してcar1に代入しました
        car1.setCar(1234, 20.5);
        car1.setName("1号車");
        car1.show();

        Car car2;
        System.out.println("car2を宣言しました");

        car2 = car1;
        System.out.println("car2にcar1を代入しました");

        System.out.println("car1がさす");
        car1.show();
        System.out.println("car2がさす");
        car2.show();

        System.out.println("car1がさす車に変更を加えます。");
        car1.setCar(2345, 20.5);

        System.out.println("car1がさす");
        car1.show();
        System.out.println("car2がさす");
        car2.show();
    }
}