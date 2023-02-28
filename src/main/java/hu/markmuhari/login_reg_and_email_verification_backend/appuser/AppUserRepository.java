package hu.markmuhari.login_reg_and_email_verification_backend.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository  extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByEmail(String email);
}
