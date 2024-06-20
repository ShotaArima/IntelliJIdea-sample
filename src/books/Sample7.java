package books;
import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;

public class Sample7 {
    public static void main(String[] args) throws IOException {
        System.out.print("文字列を入力してください:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str + "が入力されました。");
    }
}