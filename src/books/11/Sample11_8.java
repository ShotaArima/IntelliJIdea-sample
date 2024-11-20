class Car11_8 {
    protected int num;
    protected double gas;

    public Car11_8() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
}

class Sample11_8 {
    public static void main(String[] args) {
        Car11_8 car1 = new Car11_8();
        Car11_8 car2 = new Car11_8();

        Car11_8 car3;
        car3 = car1;

        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);

        System.out.println("car1とcar2が同じか調べたところ"+bl1+"でした。");
        System.out.println("car1とcar3が同じか調べたところ"+bl2+"でした。");
    }
}
