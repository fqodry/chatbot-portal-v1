package id.mbingweb.chatbotportalv1.mapper;

import id.mbingweb.chatbotportalv1.model.AppRole;
import java.util.List;

/**
 *
 * @author Firman Qodry
 */
public interface AppRoleMapper {
    public List<String> findAllRoles();
    public List<AppRole> findUserRoles(String userName);
}
