package hu.markmuhari.login_reg_and_email_verification_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginMain {

    public static void main(String[] args) {
        SpringApplication.run(LoginMain.class, args);
        System.out.println("Elindult");
    }

}
