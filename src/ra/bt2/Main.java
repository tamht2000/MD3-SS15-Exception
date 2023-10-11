package ra.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static <student> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxArrNumber(sc);

    }

    private static void maxArrNumber(Scanner sc) {
        System.out.printf("Nhập vào số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n == 0) {
            try {
                throw new RuntimeException("Mảng k được rỗng");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                maxArrNumber(sc);
            }
        } else {
            int[] student = new int[n];

            for (int i = 0; i < student.length; i++) {
                System.out.printf("Nhập phần tử thứ" + (i + 1));
                student[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println(Arrays.toString(student));
            int max = student[0];
            for (int i = 1; i < student.length; i++) {
                if (student[i] > max) {
                    max = student[i];
                }
            }
            System.out.println("Phần tử lớn nhất trong mảng có giá trị là: " + max);
        }


    }
}
