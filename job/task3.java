package job;

import java.util.Scanner;
import java.util.Stack;


// 3*. Напишите постфиксный калькулятор. 
// Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, 
// что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6

public class task3 {


    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        String input = scaner.next();
        Stack<Integer> calc = new Stack<Integer>();
        while (scaner.hasNext()) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int x = 0;
                int y = 0;
                int r = 0;
                if (Character.isDigit(c)) {
                    int t = Character.getNumericValue(c);
                    calc.push(t);
                } else if (c == '+') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x + y;
                    calc.push(r);
                } else if (c == '-') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x - y;
                    calc.push(r);
                } else if (c == '*') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x * y;
                    calc.push(r);
                } else if (c == '/') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x / y;
                    calc.push(r);
                }
            }
        }
        int a = calc.pop();
        System.out.println(a);
     }     
}