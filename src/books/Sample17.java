package books;

class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
    }

    public void show() {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリン量は"+gas+"です");
    }
}

// レーシングカークラス Carクラスを継承
class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public void setCourse(int c) {
        course = c;
        System.out.println("コース番号を"+course+"にしました");
    }
    public void show() {
        System.out.println("レーシングカーのナンバーは" +num + "です。");
        System.out.println("ガソリン量は" +gas+ "です。");
        System.out.println("コース番号は" +course+ "です。");
    }
}

class Sample17 {
    public static void main(String[] args) {
       Car[] cars = new Car[2];
       cars[0] = new Car();
       cars[0].setCar(1234, 20.5);

       cars[1] = new RacingCar();
       cars[1].setCar(4567, 30.5);

       for(int i=0; i<cars.length; i++) {
           cars[i].show();
       }
    }
}
