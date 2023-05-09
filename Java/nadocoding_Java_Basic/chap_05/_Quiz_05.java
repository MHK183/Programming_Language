package chap_05;

// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// ...

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes_size = new int[10];
        int a = 250;
        for (int i = 0; i < shoes_size.length; i++) {
            shoes_size[i] = a;
            a += 5;
        }
        for (int i = 0; i < shoes_size.length; i++) {
            System.out.println("사이즈 " + shoes_size[i] + " (재고 있음)");
        }
    }

}
