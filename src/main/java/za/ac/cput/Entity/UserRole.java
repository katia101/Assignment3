package za.ac.cput.Entity;

/* UserRole.java
   this is userRole a bridging entity between user and role
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */
public class UserRole {

    private String userId, roleId;

    public UserRole(Builder builder){
        this.userId = builder.userId;
        this.roleId = builder.roleId;
    }

    public UserRole(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }

    public static class Builder{

        private String userId, roleId;


        public Builder setUserId(String userId){
            this.userId = userId;
            return this;
        }

        public Builder setRoleId(String roleId){
            this.roleId = roleId;
            return this;
        }
        public UserRole build(){

            return new UserRole(this);
        }

        public Builder copy(UserRole userRole){

            this.userId = userRole.userId;
            this.roleId = userRole.roleId;
            return this;

        }
    }

}

