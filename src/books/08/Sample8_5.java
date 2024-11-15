class Car5 {
    int num;
    double gas;

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("車のナンバーを" + num + "にしました。");
        System.out.println("ガソリン量を"+gas+"にしました。");
    }

    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}

class Sample8_5 {
    public static void main(String[] args) {
        Car5 car1 = new Car5();

        int number = 1234;
        double gas = 20.5;

        car1.setNumGas(number, gas);
    }
}
