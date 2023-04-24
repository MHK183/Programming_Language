package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "민혁";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "민혁";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f; // f 붙여줘야 float으로 인식
        System.out.println(d);
        System.out.println(f);

//        int i = 1000000000000; // 너무 큰 범위
        long l = 1000000000000L; // L 붙여줘야 long으로 인식
        l = 1_000_000_000_000L; // 구분자 _
        System.out.println(l);

        // 정수 : int, long
        // 실수 : float, double
        // 문자 : char
        // 문자열 : String
        // 논리형 : boolean
    }
}
