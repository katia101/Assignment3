package za.ac.cput.Entity;/*Module.java
  Entity for Module
  Author: Sisipho Mvimvi (217070671)
  Due Date: 11 June 2021
 */


public class Module {

    private String moduleCode, moduleName;
    private int expertiseLevel;

    private Module(ModuleBuilder builder) {
        this.moduleCode = builder.moduleCode;
        this.moduleName = builder.moduleName;
        this.expertiseLevel = builder.expertiseLevel;

    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getExpertiseLevel() {
        return expertiseLevel;
    }


    public static class ModuleBuilder {
        private String moduleCode;
        private String moduleName;
        private int expertiseLevel;

        public ModuleBuilder setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }

        public ModuleBuilder setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public ModuleBuilder setExpertiseLevel(int expertiseLevel) {
            this.expertiseLevel = expertiseLevel;
            return this;
        }


        public Module build() {
            return new Module((ModuleBuilder) this);
        }

    }

}
