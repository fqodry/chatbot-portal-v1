package id.mbingweb.chatbotportalv1.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Firman Qodry
 */
public class AppUser {
    private Long userId;
    private String userName;
    private String encPassword;
    private String userFirstName;
    private String userLastName;
    private boolean isActive;
    
    private List<AppRole> userRoles = new ArrayList<>();

    public AppUser() {
    }

    public AppUser(Long userId, String userName, String encPassword, String userFirstName, String userLastName, boolean isActive) {
        this.userId = userId;
        this.userName = userName;
        this.encPassword = encPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.isActive = isActive;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncPassword() {
        return encPassword;
    }

    public void setEncPassword(String encPassword) {
        this.encPassword = encPassword;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<AppRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<AppRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return "AppUser{" + "userId=" + userId + ", userName=" + userName + ", encPassword=" + encPassword + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", isActive=" + isActive + ", userRoles=" + userRoles + '}';
    }
}
