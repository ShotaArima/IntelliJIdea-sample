class Sample4_11 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        double div = num1/num2; // これでは小数点以下切り捨てになる
        double div2 = (double) num1/ num2;

        System.out.println("5/4は"+div+"です。");
        System.out.println("5/4は"+div2+"です。");
    }
}
