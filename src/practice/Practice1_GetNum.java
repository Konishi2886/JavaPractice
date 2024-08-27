package practice;

import java.util.Scanner;

public class Practice1_GetNum {
    private Scanner scanner;

    public Practice1_GetNum(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("無効な入力です。数値を入力してください。");
            System.out.print(prompt);
            scanner.next(); // 無効な入力をクリア
        }
        return scanner.nextDouble();
    }

    public char getOperatorInput(String prompt) {
        System.out.print(prompt);
        char operator = scanner.next().charAt(0);
        while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("無効な演算子です。+、-、*、/ のいずれかを入力してください。");
            System.out.print(prompt);
            operator = scanner.next().charAt(0);
        }
        return operator;
    }
}