package books;

class Car{
    int num;
    double gas;

    void show() {
        System.out.println("車のナンバーは"+this.num+"です。");
        System.out.println("ガソリンの量は"+this.gas+"です。");
    }
    void showCar(){
        System.out.println("これから車の情報を表示します");
        this.show();
    }
    void setBum(int n){
        this.num = n;
        System.out.println("車のナンバーを"+this.num+"にしました");
    }
    int getNum(){
        System.out.println("ナンバーを調べました");
        return this.num;
    }
}

public class Sample17 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;

//        System.out.println("車のナンバーは"+car1.num+"です。");
//        System.out.println("ガソリンの量は"+car1.gas+"です。");
        car1.showCar(); // メソッドを使用することで簡単に出力することができる
        car1.setBum(5);
        car1.showCar();
        System.out.println("ナンバーは"+car1.getNum()+"です。");
    }
}
