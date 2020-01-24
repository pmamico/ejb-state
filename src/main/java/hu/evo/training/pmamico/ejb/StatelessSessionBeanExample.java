package hu.evo.training.pmamico.ejb;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless(name = ILocalExample.SB_STATELESS)
public class StatelessSessionBeanExample implements ILocalExample{
    private String name;

    @PostConstruct
    private void constructor(){
        System.out.println("StatelessSessionBeanExample init() called");
    }


    @Override
    public String sayHello() {
        return "stateless: Hello ".concat(name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    private void destructor(){
        System.out.println("StatelessSessionBeanExample destructor() called");
    }




}
