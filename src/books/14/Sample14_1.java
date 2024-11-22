class Sample14_1 {
    public static void main(String[] args) {
        int[] test;
        test = new int[5];

        System.out.println("test[10]に値を代入します。");

//        test[10] = 80;
        System.out.println("test[10]に80を代入しました。");
        System.out.println("無事終了しました。");
    }
}

// このソースコードでは、以下のようなエラーが発生する
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
//     at Sample14_1.main(Sample14_1.java:8)
