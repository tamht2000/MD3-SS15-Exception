package ra.bt3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static <Int> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] student = new int[10];

        for (int i = 0; i < student.length; i++) {
            System.out.printf("Nhập phần tử thứ " + (i + 1) + ": ");
            student[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(student));
        int sum = 0;
        for (int i = 0; i < student.length; i++) {
            try {
                int number = student[i];
                sum += number;
            } catch (ClassCastException e) {
                System.out.println("Lỗi: Phần tử không phải số nguyên - " + student[i]);
            }
        }
        System.out.println("Tổng của mảng là: " + sum);
    }
}
