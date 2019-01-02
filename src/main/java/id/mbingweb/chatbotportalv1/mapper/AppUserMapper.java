package id.mbingweb.chatbotportalv1.mapper;

import id.mbingweb.chatbotportalv1.model.AppRole;
import id.mbingweb.chatbotportalv1.model.AppUser;
import java.util.List;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Firman Qodry
 */

public interface AppUserMapper {
    public List<AppUser> findAllUsers();
    public AppUser findUserByUsername(String userName);
}
