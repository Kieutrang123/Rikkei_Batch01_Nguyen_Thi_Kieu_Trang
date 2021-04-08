package login.com.demo.Service;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import login.com.demo.Entity.AccountEntity;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
@Service
public interface AccountService {
    AccountEntity findAccountByUserName(String username);

    Integer findIdUserByUserName(String username);

    String existsByUserName(String username);

    Boolean existsById(Integer bookId);

    void addNew(String username, String password, String email) throws MessagingException, UnsupportedEncodingException;
    Boolean findAccountByVerificationCode(String code);
    Boolean findAccountByVerificationCodeToResetPassword(String code);
    void saveNewPassword(String password,String code);
}
