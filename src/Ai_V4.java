import java.util.Scanner;

public class Ai_V4 {
    public static float smallest_gap = -1;
    public static int a = -1;
    public static int b = -1;
    public static void main(String[] args) {
        // 광고비를 입력받아서
        // 특정 오차 범위 미만에 도달하게 하는 a와 b의 값을 도출하는 프로그램
        /**
         * 프로그램에 필요한 변수 선언
         * x              : 가용한 광고비
         * real           :실제 방문자 수
         * xy_lists       : 데이터를 담을 2차원 배열
         * diff           : 편차
         * diff_pow       : 편차의 제곱(double)
         * diff_pow_float : 편차의 제곱(float)
         * sum_diff_pow   : 편차 제곱의 합
         * a_max          : 상수 a의 최대값
         * b_max          : 상수 b의 최대값
         * */
        // 사용자의 입력을 받기 위한 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("[인공지능 프로그램 V1]");
        System.out.println("=".repeat(30));
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");

        // 수식에 필요한 변수를 먼저 정의하여 줍니다. (※ 수식과 똑같은 변수명으로 정의 )
        int y = 0;
        int x = sc.nextInt();
        System.out.print("[System] 실제 방문한 방문자 수를 알려주세요 (단위 명) : ");
        int real = sc.nextInt();
        System.out.print("오차 범위를 지정하세요.: ");
        int gap = sc.nextInt();
        System.out.print("[System] a의 최대 값을 지정하세요. (1~5): ");
        int a_max = sc.nextInt();
        System.out.print("[System] b의 최대 값을 지정하세요. (1~100): ");
        int b_max = sc.nextInt();

        for(int i = 1; i <= a_max; i++) {
            for(int j = 1; j <= b_max; j++) {
                y = (i * x) + j;
                checkAllowableRange(y, i, j, real, gap); //오차 범위 내의 값인지 체크
            }
        }
        if(smallest_gap < 0)
            System.out.println("오차 범위 내 적합한 a, b값을 찾지 못했습니다.");
        else
            System.out.println("오차 범위 내 적합한 인자 값은 a = " + a + ", b = " + b + "입니다.");
    }
    public static void checkAllowableRange(int y, int i_for_a, int j_for_b, int real, int gap) {
        int diff = (real - y);
        double diff_pow = Math.pow(diff, 2);

        float diff_pow_float = (float)diff_pow;
        if(diff_pow_float <= (float)(gap * gap)) {
            //오차 범위 내 값들 중에서 가장 최소 값이면 업데이트
            if(smallest_gap < 0 || diff_pow_float <= smallest_gap) {
                smallest_gap = diff_pow_float;
                a = i_for_a;
                b = j_for_b;
            }
        }
    }
}
