package chalkboard.me.bulletinboard.application.usecase;

import chalkboard.me.bulletinboard.application.auth.UserAuthRepository;
import chalkboard.me.bulletinboard.application.form.UserForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Service
@RequiredArgsConstructor
public class UserAuthUseCase {
    private final UserAuthRepository authRepository;

    /**
     *
     * @param form
     * @param request
     * @throws ServletException
     */
    public void userCreate(UserForm form, HttpServletRequest request) throws ServletException {

        authRepository.createUser(
            form.getUsername(),
            form.getPassword()
        );

        request.login(form.getUsername(), form.getPassword());
    }
}
