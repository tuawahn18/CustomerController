package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Chương trình quản lý khách hàng cho phép lưu trữ, hiển thị và tìm kiếm khách hàng
 */
public class MainDay5 {
    public static void main(String[] args) {
//        tạo đối tượng cụ thể của lớp CustomerController
        CustomerController customerController = new CustomerController();
//        Gọi phương thức cần thiết
//        Nhập thông tin khách hàng
        customerController.create();
        customerController.create();
        customerController.create();
//        Hiển thị ra
        customerController.showListCustomer();
    }

    public static void createMenu() {
        Scanner sc = new Scanner(System.in);
        CustomerController customerController = new CustomerController();
        while (true) {
            System.out.println("Thực hiện thêm mới khách hàng");
            System.out.println("-----------------------------------------");

            System.out.println("\n Chương trình quản lý khách hàng");
            System.out.println("1. Thêm mới khách hàng");
            System.out.println("2. Hiển thị danh sách khách hàng");
            System.out.println("3. Sửa thông tin khách hàng");
            System.out.println("4. Xoá khách hàng");
            System.out.println("5. Thoát chương trình");
            System.out.println("-----------------------------------------");
            System.out.println("Vui lòng nhập lựa chọn");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    customerController.create();
                    break;
                case 2:
                    customerController.showListCustomer();
                    break;
                case 3:
                    customerController.editCustomer();
                    break;
                case 4:
                    customerController.deleteCustomer();
                    break;
                case 5:
                    System.out.println("Tạm biệt, hẹn gặp lại");
                    break;
                default:
                    System.out.println("Vui lòng chọn lựa chọn từ 1 đến 5");
                    break;
            }
            if (choice == 5){
//                Kết thúc chương trình
                break;
            }
        }
    }
}
