package lan.dev;

import com.github.javafaker.Faker;
import lan.dev.data.impl.UserImpl;
import lan.dev.data.model.User;
import lan.dev.data.dao.UserDao;

public class MainApp {

    public static void main(String[] args) {
    	 // Khởi tạo UserDao từ UserImpl để thao tác với cơ sở dữ liệu
        UserDao userDao = new UserImpl();
        // Tạo đối tượng Faker để tạo dữ liệu giả
        Faker faker = new Faker();

        // Chèn 10 người dùng với dữ liệu giả
        for (int i = 0; i < 10; i++) {
            // Tạo email, mật khẩu và vai trò giả
            String email = faker.internet().emailAddress();
            String password = faker.internet().password();
            String role = faker.options().option("ADMIN", "USER", "MANAGER");

            // Tạo đối tượng người dùng với dữ liệu giả
            User user = new User(0, email, password, role);
            // Gọi phương thức insert từ userDao để chèn người dùng vào cơ sở dữ liệu
            boolean isInserted = userDao.insert(user);
            
            // In kết quả của quá trình chèn
            if (isInserted) {
                System.out.println("User inserted: " + user);
            } else {
                System.out.println("Failed to insert: " + user);
            }
        }

        
    }
} 