package ra.bt4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] student = new String[10];

        for (int i = 0; i < student.length; i++) {
            System.out.printf("Nhập phần tử thứ " + (i + 1) + ": ");
            student[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(student));

    }
}
