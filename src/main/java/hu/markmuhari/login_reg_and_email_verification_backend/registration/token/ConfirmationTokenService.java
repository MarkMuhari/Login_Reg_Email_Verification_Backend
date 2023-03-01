package hu.markmuhari.login_reg_and_email_verification_backend.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void  saveConfirmationToken(ConfirmationToken token) {
        confirmationTokenRepository.save(token);
    }

}
