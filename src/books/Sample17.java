package books;

class Car{
    int num;
    double gas;

    void show() {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリンの量は"+gas+"です。");
    }
}

public class Sample17 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;

//        System.out.println("車のナンバーは"+car1.num+"です。");
//        System.out.println("ガソリンの量は"+car1.gas+"です。");
        car1.show(); // メソッドを使用することで簡単に出力することができる

    }
}
