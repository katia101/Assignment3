package za.ac.cput.Entity;

/* Role.java
   Entity for Role
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */

public class Role {
    private String roleId, roleName;


    public Role (Builder builder){
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;

    }

    public Role(String roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public static class Builder{
        private String roleId, roleName;

        public Builder setRoleId(String roleId){
            this.roleId = roleId;
            return this;
        }

        public Builder setRoleName(String roleName){
            this.roleName = roleName;
            return this;
        }

        public Role build(){
            return new Role(this);
        }
        private Builder copy (Role role){
            this.roleId = role.roleId;
            this.roleName = role.roleName;
            return this;
        }
    }

}
