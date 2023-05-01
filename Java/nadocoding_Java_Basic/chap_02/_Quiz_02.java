package chap_02;
// 키가 115cm 이므로 탑승 불가능합니다
// 키가 121cm 이므로 탑승 가능합니다
public class _Quiz_02 {
    public static void main(String[] args) {
        int height_01 = 115;
        int height_02 = 121;

        String result_01 = (height_01 >= 120) ? "가능" : "불가능";
        String result_02 = (height_02 >= 120) ? "가능" : "불가능";

        System.out.println("키가 " + height_01 + "cm 이므로 탑승 " + result_01 + "합니다");
        System.out.println("키가 " + height_02 + "cm 이므로 탑승 " + result_02 + "합니다");
    }
}
