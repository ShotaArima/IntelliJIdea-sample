package books;
import java.io.*;

public class Sample8 {
    public static void main(String[] args) throws IOException {
        System.out.print("整数を入力してください:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print("整数を入力してください:");
        String str2 = br.readLine();
        int num = Integer.parseInt(str);
        int num2 = Integer.parseInt(str2);
        System.out.println(num+"と"+num2);
    }
}
