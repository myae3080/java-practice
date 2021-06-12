package array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};

        // enhanced for loop
        for (int a : arr1) {
            System.out.println(a);
        }

        // 배열의 길이와 실제 요소의 개수는 다를 수 있음
        char[] arr2 = new char[10];

        arr2[0] = 65;
    }
}
