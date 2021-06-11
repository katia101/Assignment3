package za.ac.cput.Factory;

import za.ac.cput.Entity.Module;

public class ModuleFactory {

    public static Module createModule(String moduleCode,String moduleName, int expertiseLevel){
        return new Module.ModuleBuilder().setModuleName(moduleName).setModuleCode(moduleCode).setExpertiseLevel(expertiseLevel).build();

    }
}
