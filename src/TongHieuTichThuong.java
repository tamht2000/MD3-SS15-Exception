import java.util.InputMismatchException;
import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
//        Cho người dùng nhạp vào 2 số nguyên, tính công trừ nhân chia 2 số nguyên ,
// *    kiểm tra có phải là số nguyên hay không, nếu không phải thì bắt ngoại lệ và cho nhập lại.
// *    Ở phương thức chia thì xem 1 trong 2 số có phải =0 hay không.
// *    nếu bằng 0 thì bắt ngoại lệ và cho nhập lại

        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        while (true) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                num1 = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập số nguyên thứ hai: ");
                num2 = scanner.nextInt();
                scanner.nextLine();

                // Tính tổng, hiệu, tích và thương
                int sum = num1 + num2;
                int difference = num1 - num2;
                int product = num1 * num2;
                double quotient = (double) num1 / num2;

                System.out.println("Tổng: " + sum);
                System.out.println("Hiệu: " + difference);
                System.out.println("Tích: " + product);
                System.out.println("Thương: " + quotient);

                break; // Nếu nhập thành công và tính toán kết quả, thoát khỏi vòng lặp
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
                scanner.nextLine(); // Đọc bỏ dòng thừa nếu có lỗi
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
