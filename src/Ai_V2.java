import java.util.Scanner;

public class Ai_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 인공지능 예측에 필요한 변수를 정의합니다.
         * a,b    : 예측에 필요한 요소
         * x_list : 예측에 필요한 광고비 배열
         * y      : 예측한 결과값(웹 페이지 방문자 수)
         * y_list :
         */
        float a,b;
        float[] x_list;
        float y;

        // 시스템 시작 안내 문구
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("=".repeat(30));

        System.out.print("[System] a 값을 입력하여 주세요 : ");
        a = sc.nextFloat();

        System.out.print("[System] b 값을 입력하여 주세요 : ");
        b = sc.nextFloat();

        System.out.println("=".repeat(30));

        // 이전 버전과 달리 다수의 '광고비'를 '배열'로 정의합니다.
        x_list = new float[]{580, 700, 810, 840};
        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");

        // 반복문을 활용하여 광고비 배열을 출력합니다.
        for(int i = 0; i < x_list.length; i++) {
            System.out.printf("%s 번째) %4.1f원\t",i+1, x_list[i]);
        }

        // 한 줄 띄기 및 예측 결과 안내 문구 출력
        System.out.println();
        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");

        // 반복문을 활용해 다수의 광고비(x_list)를 호출하여 방문자 수 예측값을 연산합니다.
        for(int i = 0; i < x_list.length; i++) {
            // 예측 수식 정의
            // y = ax + b
            y = (a * x_list[i]) + b;
            System.out.printf("%s 번째 예측) %s회 방문\n", i+1, y);
        }
        sc.close();
    }
}
