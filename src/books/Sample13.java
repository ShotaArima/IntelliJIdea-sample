import java.io.*;

public class Sample13 {
    public static void main(String[] args)throws IOException {
        System.out.println("何番目のコースにしますか。");
        System.out.println("整数を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int res = Integer.parseInt(str);

//        char ans;
//        if (res == 1) {
//            ans = 'A';
//        } else {
//            ans = 'B';
//        }
        char ans = (res == 1) ? 'A' : 'B';
        System.out.println(ans);
    }
;}
