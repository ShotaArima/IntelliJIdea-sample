class Car9_4 {
    private int num;
    private double gas;

    public Car9_4() {
        num = 0;
        gas = 0;
        System.out.println("車を作成しました。");
    }

    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample9_4 {
    public static void main(String[] args) {
        Car9_4 car1 = new Car9_4();
        car1.show();
    }
}
