import java.io.*;

class Sample5_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 0){
            System.out.println("1が入力されました。");
        }else {
            System.out.println(("1以外が入力されました。"));
        }
    }
}
