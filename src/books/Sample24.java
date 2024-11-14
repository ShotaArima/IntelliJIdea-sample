class Car24 {
    protected int num;
    protected double gas;

    public Car24() {
        num = 0;
        gas = 0;
        System.out.println("車を作成しました。");
    }
}

class Sample24 {
    public static void main(String[] args) {
        Car24 car1 = new Car24();
        Car24 car2 = new Car24();

        Car24 car3;
        car3 = car1;

        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);

        System.out.println("car1とcar2が同じかどうか調べたところ"+bl1+"でした。");
        System.out.println("car1とcar3が同じかどうか調べたところ"+bl2+"でした。");
    }
}
