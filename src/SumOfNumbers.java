import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        String numbers = scanner.next();
        int sum = 0;
        // String 전용 메서드인 charAt() 를 활용한 제일 간단한 풀이방식.
//
//        for (int i = 0; i < numbers.length() ; i++) {
//
//            int number = numbers.charAt(i) - '0';
//
//            sum += number;
//        }

        // 배열 개념 적용해보기.
        char[] digits = numbers.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i] - '0';
        }

        System.out.println(sum);
    }
}
