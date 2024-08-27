package practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Practice1_GetNum inputHandler = new Practice1_GetNum(scanner);

        // ユーザーに数値を入力させる
        double num1 = inputHandler.getDoubleInput("最初の数値を入力してください: ");
        double num2 = inputHandler.getDoubleInput("2番目の数値を入力してください: ");

        // ユーザーに演算子を入力させる
        char operator = inputHandler.getOperatorInput("演算子を入力してください（+、-、*、/）: ");

        double result;

        // 演算の種類に応じて処理を分岐
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("エラー: 0で割ることはできません。");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("エラー: 無効な演算子です。");
                scanner.close();
                return;
        }

        // 結果を表示
        System.out.println("結果: " + result);

        // Scannerを閉じる
        scanner.close();
    }
}