import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //產生亂數數字
        Random rand = new Random();
        int random_num = rand.nextInt(5); //0-5

        //遊戲主回圈
        while (true) {
            try {

                //讀取數字 (用Buffered Reader的方法)
                System.out.print("Enter Integer:");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int input_int = Integer.parseInt(br.readLine());

                //檢查是否滿足遊戲結束條件(猜中數字)
                if (random_num == input_int) {
                    System.out.println("You WIN");
                    break;
                }

                //沒有猜中,離開
                System.out.println("Wrong number Please try again ...");

            } catch (NumberFormatException nfe) {
                System.err.println("Invalid Format!");
            } catch (IOException exp) {
                System.err.println("IOException Format!");
            }
        }
    }
}
