package hu.evo.training.pmamico.ejb;


import javax.ejb.Local;

@Local
public interface ILocalExample {

    String SB_STATELESS = "stateless";
    String SB_STATEFUL =  "stateful";

    String sayHello();
    void setName(String name);
}
