class Car9_2 {
    private int num;
    private double gas;

    void setNumGas(int n, double g) {
        if(g > 0 && g < 100) {
            num = n;
            gas = g;
            System.out.println("車のナンバーを" + num + "にしました。");
            System.out.println("ガソリン量を"+gas+"にしました。");
        } else {
            System.out.println(g+"は正しいがガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }

    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample9_2 {
    public static void main(String[] args) {
        Car9_2 car1 = new Car9_2();

        // 以下のようなアクセスはできなくなる
//        car1.num = 1234;
//        car1.gas = 20.5;

        car1.setNumGas(1234, 20.5);
        car1.show();

        System.out.println("正しくないガソリン量(-10.0)を指定してみます。");

        car1.setNumGas(1234, -10.0);
        car1.show();
    }
}
