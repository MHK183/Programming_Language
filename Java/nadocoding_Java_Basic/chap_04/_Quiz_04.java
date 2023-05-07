package chap_04;

// 주차요금은 시간당 4000 원 (일일 최대 요금은 30000 원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20000 원
// 경차 5시간 주차 시 10000 원
// 장애인 차량 10시간 주차 시 15000 원

// 실행결과 : 주차 요금은 xx 원입니다.

public class _Quiz_04 {
    public static void main(String[] args) {
        int parkingFee = 4000; // 시간당 주차 요금
        int feeMax = 30000; // 일일 최대 요금
        int time = 10; // 주차시간
        int result = parkingFee * time;

         String carType = "compact"; // 경차
        // String carType = "handicap"; // 장애인

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (result > feeMax) {
            result = feeMax;
        }

        if (carType == "compact" || carType == "handicap") {
            result *= 0.5f;
        }

        System.out.println("주차 요금은 " + result + " 원입니다.");
    }
}
