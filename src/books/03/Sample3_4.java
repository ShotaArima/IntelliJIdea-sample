import java.io.*;

public class Sample3_4 {
    public static void main(String[] args) throws IOException {
        System.out.print("文字列を入力してください:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str + "が入力されました。");
    }
}
