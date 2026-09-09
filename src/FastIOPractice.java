import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastIOPractice {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in)); // 빠르게 입력
        String line = br.readLine(); // 한 줄 읽기

        StringTokenizer st = new StringTokenizer(line); // 한 줄의 여러 값을 분리

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder(); // 출력할 내용을 모음

        sb.append("첫번째 숫자: ").append(a).append('\n');
        sb.append("두번째 숫자: ").append(b).append('\n');
        sb.append("합계: ").append(a + b);

        System.out.print(sb);
    }
}
