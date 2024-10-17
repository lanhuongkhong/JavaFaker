package lan.dev.util;

import java.util.Random;

public class Faker {
    
    // Khai báo Faker từ thư viện com.github.javafaker.Faker
    private static final com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Random());

    // 1. Email ngẫu nhiên
    public static String taoEmail() {
        return faker.internet().emailAddress();
    }

    // 2. Họ và tên ngẫu nhiên
    public static String taoTen() {
        return faker.name().firstName();
    }

    public static String taoHo() {
        return faker.name().lastName();
    }

    // 3. Chuỗi ngẫu nhiên có độ dài nhất định
    public static String taoChuoi(int doDai) {
        return faker.lorem().characters(doDai);
    }

    // 4. Địa chỉ nhà ngẫu nhiên
    public static String taoDiaChi() {
        return faker.address().streetAddress() + ", " + faker.address().city();
    }

    // 5. Số nguyên và số thực ngẫu nhiên
    public static int soNguyen(int min, int max) {
        return faker.number().numberBetween(min, max);
    }

    public static double soThuc(double min, double max) {
        return min + (max - min) * faker.random().nextDouble();
    }

    // 6. Số điện thoại ngẫu nhiên
    public static String taoSoDienThoai() {
        return faker.phoneNumber().phoneNumber();
    }
}
