import java.io.*;
import java.util.Optional;

class Sample5_6 {
    public static void main(String[] args) throws IOException {
        System.out.println("aかbを入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char res = str.charAt(0);

        switch (res) {
            case 'a':
                System.out.println("aが入力されました。");
                break;
            case 'b':
                System.out.println("bが入力されました。");
                break;
            default:
                System.out.println("aかbを入力してください");
                break;
        }
    }
}
