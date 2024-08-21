package books;

class Car{
    private int num;
    private double gas;

    // コンストラクタの作成
    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public void setNumGas(int n, double g) {
        if (g > 0 && g < 1000) {
            num = n;
            gas = g;
            System.out.println("ナンバーを"+num+"に、ガソリン量を"+gas+"にしました");
        } else {
            System.out.println(g + "は正しいガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }
    public void show() {
        System.out.println("車のナンバーは"+this.num+"です。");
        System.out.println("ガソリンの量は"+this.gas+"です。");
    }
    public void  setCar(int n){
        num = n;
        System.out.println("ナンバーを"+num+"にしました");
    }
//    void showCar(){
//        System.out.println("これから車の情報を表示します");
//        this.show();
//    }
//    void setBum(int n){
//        this.num = n;
//        System.out.println("車のナンバーを"+this.num+"にしました");
//    }
//    int getNum(){
//        System.out.println("ナンバーを調べました");
//        return this.num;
//    }
}

public class Sample17 {
    public static void main(String[] args) {
        Car car1 = new Car();
//        このようなアクセスは不可能
//        car1.num = 1234;
//        car1.gas = 20.5;
        car1.setNumGas(1234, 20.5);
        car1.show();
        car1.setNumGas(1234, -10.0);
        car1.show();
//        System.out.println("車のナンバーは"+car1.num+"です。");
//        System.out.println("ガソリンの量は"+car1.gas+"です。");
//        car1.showCar(); // メソッドを使用することで簡単に出力することができる
//        car1.setBum(5);
//        car1.showCar();
//        System.out.println("ナンバーは"+car1.getNum()+"です。");
    }
}
