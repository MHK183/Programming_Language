package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 소수점 버려짐
        System.out.println(5.0 / 2.0); // 2.5
        System.out.println(4 % 2); // 나머지 연산
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        // 변수를 이용한 연산
        int a = 40;
        int b = 26;
        int c;

        c = a + b;
        System.out.println(c); // 66

        c = a - b;
        System.out.println(c); // 14

        c = a * b;
        System.out.println(c); // 1040

        c = a / b;
        System.out.println(c); // 1

        c = a % b;
        System.out.println(c); // 14

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 문장 실행하고 증가
        // 위의 증감 연산으로 인해 val == 11
        System.out.println(++val); // 12 먼저 더하고 문장 실행
        System.out.println(--val); // 11
        System.out.println(val--); // 11
        // val == 10
        System.out.println(val);

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3

    }
}
