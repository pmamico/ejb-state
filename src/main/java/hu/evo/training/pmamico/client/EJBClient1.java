package hu.evo.training.pmamico.client;

import hu.evo.training.pmamico.ejb.ILocalExample;

import javax.ejb.EJB;

public class EJBClient1 {

    @EJB(beanName = ILocalExample.SB_STATEFUL)
    private ILocalExample stateful;

    @EJB(beanName = ILocalExample.SB_STATELESS)
    private ILocalExample stateless;

    public ILocalExample getStateful() {
        return stateful;
    }

    public void setStateful(ILocalExample stateful) {
        this.stateful = stateful;
    }

    public ILocalExample getStateless() {
        return stateless;
    }

    public void setStateless(ILocalExample stateless) {
        this.stateless = stateless;
    }
}
