package hu.markmuhari.login_reg_and_email_verification_backend.email;

public interface EmailSender {
    void send(String to, String email);
}
