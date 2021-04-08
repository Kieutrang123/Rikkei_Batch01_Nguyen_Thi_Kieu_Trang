package login.com.demo.Service;


import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    void setDefaultRole(int accountId, Integer roleId);
}
