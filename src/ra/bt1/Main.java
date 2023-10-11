package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       handleAddInterger(sc);

    }

    private static void handleAddInterger(Scanner sc) {
        try {
            System.out.println("nhập số thứ nhất:");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("nhập số thứ hai:");
            int b = Integer.parseInt(sc.nextLine());
            System.out.printf("Tổng 2 số vừa nhập là: " +( a + b));
        } catch (NumberFormatException e ) {
            System.out.println("Đâu vào không đúng định dạng . Vui long nhập lại");
            handleAddInterger(sc);
        }
    }
}
