package hu.evo.training.pmamico.ejb;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateful(name = ILocalExample.SB_STATEFUL)
public class StatefulSessionBeanExample implements ILocalExample{

    private String name;

    @PostConstruct
    private void constructor(){
        System.out.println("StatefulSessionBeanExample init() called");
    }


    @Override
    public String sayHello() {
        return "Stateful: Hello ".concat(name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    private void destructor(){
        System.out.println("StatefulSessionBeanExample destructor() called");
    }



}
