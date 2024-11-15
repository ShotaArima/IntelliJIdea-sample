class Sample4_5 {
    public static void main(String[] args) {
        int a = 0;
        int b;
        int c;

        b = a++;
        a = 0;
        c = ++a;
        System.out.println("代入後にインクリメントしたのでbの値は"+b+"です。");
        System.out.println("よって、aの値は"+a+"です。");
        System.out.println("代入前にインクリメントしたのでcの値は"+c+"です。");
    }
}
