package id.mbingweb.chatbotportalv1.model;

/**
 *
 * @author Firman Qodry
 */
public class AppRole {
    private Long roleId;
    private String roleName;

    public AppRole() {
    }

    public AppRole(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "AppRole{" + "roleId=" + roleId + ", roleName=" + roleName + '}';
    }
}
