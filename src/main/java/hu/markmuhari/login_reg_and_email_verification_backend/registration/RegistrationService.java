package hu.markmuhari.login_reg_and_email_verification_backend.registration;

import hu.markmuhari.login_reg_and_email_verification_backend.appuser.AppUser;
import hu.markmuhari.login_reg_and_email_verification_backend.appuser.AppUserRole;
import hu.markmuhari.login_reg_and_email_verification_backend.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;

    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        return appUserService.singUpUser(new AppUser(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                AppUserRole.USER
        ));
    }
}
