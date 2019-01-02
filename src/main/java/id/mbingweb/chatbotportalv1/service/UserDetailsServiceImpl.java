package id.mbingweb.chatbotportalv1.service;

import id.mbingweb.chatbotportalv1.mapper.AppRoleMapper;
import id.mbingweb.chatbotportalv1.mapper.AppUserMapper;
import id.mbingweb.chatbotportalv1.model.AppRole;
import id.mbingweb.chatbotportalv1.model.AppUser;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Firman Qodry
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private AppUserMapper appUserMapper;
    
    @Autowired
    private AppRoleMapper appRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUser appUser = appUserMapper.findUserByUsername(userName);
        
        if(appUser == null) {
            System.out.println("Cannot find user with username: " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
        
        System.out.println("Found user: " + userName);
        
        List<AppRole> userRoles = appRoleMapper.findUserRoles(userName);
        
        List<GrantedAuthority> grantList = new ArrayList<>();
        if(userRoles != null) {
            for(AppRole role : userRoles) {
                GrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
                grantList.add(authority);
            }
        }
        
        UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), appUser.getEncPassword(), grantList);
        
        return userDetails;
    }
    
}
