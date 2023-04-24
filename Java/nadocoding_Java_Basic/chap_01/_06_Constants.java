package chap_01;

public class _06_Constants {
    public static void main(String[] args){
        // final : 상수 (변하지 않는 수)
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호
        // KR_COUNTRY_CODE = "+8282"; 오류 발생
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; // 원주율
        final String DATE_OF_BIRTH = "2001-12-31"; // 생년 월일
    }
}
