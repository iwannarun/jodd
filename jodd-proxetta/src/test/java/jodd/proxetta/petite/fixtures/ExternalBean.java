package jodd.proxetta.petite.fixtures;

import jodd.petite.meta.PetiteInject;

public class ExternalBean {

    @PetiteInject ("___Bean1___")
    private IBean1 aBean;

    public Object execute() {
        return aBean.doInBean_1();
    }

}
