public class Ai_V3 {
    public static void main(String[] args) {
        /**
         * 프로그램에 필요한 변수 선언
         * xy_lists       : 데이터를 담을 2차원 배열
         * diff           : 편차
         * diff_pow       : 편차의 제곱(double)
         * diff_pow_float : 편차의 제곱(float)
         * sum_diff_pow   : 편차 제곱의 합
         * */
        float[][] xy_lists;
        float diff;
        double diff_pow;
        float diff_pow_float;
        float sum_diff_pow = 0;

        // 프로그램 안내 문구 출력
        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("-".repeat(30));

        // 1단계 2차원 배열 데이터 생성
        xy_lists = new float[][] {{374, 385, 375, 401},
                {1161, 1401, 1621, 1681}};

        // 데이터 출력 안내 문구 생성
        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
        for(int i = 0; i < xy_lists[0].length; i++){
            System.out.print(i+1 +"번 째 데이터) " + "[실제값] 웹 페이지 방문자 수 : " + xy_lists[0][i]);
            System.out.println("\t[인공지능 예측값] 웹 페이지 방문자 수 : " + xy_lists[1][i]);
        }
        System.out.println();
        // 2단계, 3단계
        // 배열 속 값을 호출하며 편차 -> 제곱 -> 합산 과정을 수행합니다.
        for(int i = 0; i < xy_lists[0].length; i++) {
            // 2차원 배열에서 값을 꺼내는 방식을 검색해 보세요.
            diff = (xy_lists[0][i] - xy_lists[1][i]);
            // 사용자 편의성을 위해 i+1 과 같은 방법을 사용합니다.
            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %4.1f\n", i+1, diff);

            // Math.pow의 경우 반환값이 double입니다.
            // float diff_diff = (diff * diff); 와 결과가 같습니다.
            diff_pow = Math.pow(diff, 2);

            // double -> float 타입 젼환
            diff_pow_float = (float)diff_pow;

            System.out.println("[안내] 오차의 제곱 : " + diff_pow_float);
            System.out.println();

            // 대입 연산자를 활용한 결과 합산
            sum_diff_pow += diff_pow_float;
        }
        System.out.println("-".repeat(30));
        System.out.println("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : " + sum_diff_pow);
    }
}
