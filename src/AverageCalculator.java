import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        // 상현이는 자기 점수 중 최댓값을 M이라고 하면, 모든 점수를:
        // (점수 / M * 100) 으로 바꿔서 평균을 구하려고함. (시험을 망쳤다고 하심.)

        Scanner scanner = new Scanner(System.in);

        // 1. 시험을 본 과목의 개수 (N <= 1000)
        int numOfSubject = scanner.nextInt();

        // 2. 상현이의 시험 성적 입력받기 Ex. 50 40 60 (X <= 100, 양의 정수, 적어도 하나는 0보다 큼.)
        int[] scores = new int[numOfSubject];

        for (int i = 0; i < scores.length; i++) {

            scores[i] = scanner.nextInt(); // Scanner의 nextInt()는 공백, 탭, 줄바꿈 같은 구분자(delimiter) 를 기준으로 값을 나눠 읽음.
        }

        // 최고 점수 찾기
        double maxScore = scores[0];

        for (int score : scores) {

            if (score > maxScore) {
                maxScore = score;
            }
        }

        // 점수 조작 들어갑니다잉.
        double [] newScores = new double[numOfSubject];

        for (int i = 0; i < scores.length; i++) {

            newScores[i] = scores[i] / maxScore * 100;
        }

        // 조작한 점수의 평균 구하기
        double totalNewScore = 0;

        for (double newScore : newScores) {
            totalNewScore += newScore;
        }

        // 평균 계산 및 출력
        double averageOfNewScore = totalNewScore / scores.length;

        System.out.println(averageOfNewScore);

    }
}
