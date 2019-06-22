Android程式開發設計入門班 第01期	
===
第一周練習

# 猜數字遊戲 
遊戲將隨機產生一個數字。使用者輸入一個數字。遊戲判定是否相等，如果相等則離開遊戲。否則繼續猜，一直到猜中為止。

# 範例說明
實現輸入變數的方式列舉下列兩種方法：
- Buffered Reader  
 ./src/Main.java
- Scanner  
 ./src/UsingScanner.java

# 解析


- 遊戲主回圈
```java=
while(true){
    //game over
    if(gameOver){
        break;    
    }    
}
```
- 產生亂數數字
```java=
//import java.util.Random;

//產生亂數數字
Random rand = new Random();
int random_num = rand.nextInt(5); //0-5
```
- 輸入變數
    - 採用BufferedReader的方式   
    ```java=
    //import java.io.BufferedReader;
    //import java.io.IOException;
    //import java.io.InputStreamReader;
    
    //採用BufferedReader的方式
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input_int = Integer.parseInt(br.readLine());
    ```
    - 採用Scanner的方式
    ```java=
    //import java.util.Scanner;
    
    //採用Scanner的方式
    Scanner scanner = new Scanner(System.in);
    int input_int = scanner.nextInt();
    ``` 

- 輸出
```java= 
System.out.print("不換行");
System.out.println("換行");
```      