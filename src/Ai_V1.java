import java.util.Scanner;

public class Ai_V1 {
    public static void main(String[] args) {
        // 변수 정의
        double a, b, y; // 방문자수_y = a * 광고비_x + b

        // 출력 예시와 같이 출력하기
        System.out.println("[인공지능 프로그램 V1]");
//        System.out.println("==========================");
        System.out.println("=".repeat(30));
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");

        // 스캐너로 광고비 입력받기
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        a = 2; // 임의값 지정
        b = 1; // 임의값 지정
        y = (a * x) + b;

        // 출력 예시와 동일하게 결과값 출력
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.\n", x);
        System.out.printf("[안내] AI의 예측(클릭 수)은 %.0f회 입니다.", y);


    }
}
