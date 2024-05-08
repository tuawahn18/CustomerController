package day5;

import java.util.ArrayList;
import java.util.Scanner;

//Làm nhệm vụ điều hướng khách hàng nập và hiê thị thông tin
public class CustomerController {

//    Tạo ra nơi lưu trữ danh sách khách hàng
//    Biến này nằm ngoài phạm vi của hàng create để được sử dụng
//    các hàm khác của lớp CustomerController
//    Việc khai báo ở đây giúp dữ liệu nhập vào được giữ lại kho gọi các hàm khác
    ArrayList<Customer> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
//    1. Cho phép tạo mới thông tin khách hàng
    public void create() {
//      Yêu cầu nhập vào
        System.out.println("Vui lòng nhập thông tin khách hàng");
        System.out.println("Nhập id");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String firstName = scanner.nextLine();
        System.out.println("Nhập họ");
        String lastName = scanner.nextLine();
        System.out.println("Nhập email");
        String mail = scanner.nextLine();
        System.out.println("Nhập phone");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();

//        Tạo ra một đối tượng customer từ thông tin nhập vào
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setMail(mail);
        customer.setPhone(phone);
        customer.setAddress(address);
        customer.setAge(age);
//        Đưa customer vào list
        customers.add(customer);
    }
//    2. Cho phép hiển thị
    public void showListCustomer() {
        System.out.println("Hiển thị danh sách khách hàng");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s || %-30s || %-30s\n", "Id", "Last Name", "First Name");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            System.out.printf("%-10s || %-30s || %-30s\n", c.getId(), c.getLastName(), c.getFirstName());

            System.out.println("Enter để tiếp tục");
            scanner.nextLine();
        }
    }
//    3. Cho phép thay đổi
    public void editCustomer (ArrayList<Customer> customers, int i ){
        for (int j = 0; j < customers.size(); j++){
            if(j==i){
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập lại họ: ");
                String firstName = sc.nextLine();
                System.out.print("Nhập lại tên: ");
                String lastName = sc.nextLine();
                System.out.print("Nhập lại tuổi: ");
                int age = Integer.parseInt(sc.nextLine());

                customers.get(i).setFirstName(firstName);
                customers.get(i).setLastName(lastName);
                customers.get(i).setAge(age);
            }
        }
    }
//    4. Cho phép xoá
    public void deleteCustomer (ArrayList<Customer> customers, int i ){
        for (int j = 0; j < customers.size(); j++){
            if(j==i){
                customers.remove(j);
                break;
            }
        }
    }

}
