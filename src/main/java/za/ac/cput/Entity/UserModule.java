package za.ac.cput.Entity;/*za.ac.cput.entity.UserModule.java
  Entity for za.ac.cput.entity.UserModule
  Author: Sisipho Mvimvi (217070671)
  Due Date: 11 June 2021
 */

public class UserModule {
    private int userId;
    private String moduleCode;

    private UserModule(Builder builder) {
        this.userId = builder.userId;
        this.moduleCode = builder.moduleCode;
    }
    public static class Builder{
        private int userId;
        private String moduleCode;

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public UserModule build(){
            return new UserModule(this);
        }
        public Builder copy(UserModule userModule){
            this.userId = userModule.userId;
            this.moduleCode = userModule.moduleCode;
            return this;
        }

    }


    @Override
    public String toString() {
        return "Builder{" +
                "userId=" + userId +
                ", moduleCode='" + moduleCode + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public String getModuleCode() {
        return moduleCode;
    }
}

