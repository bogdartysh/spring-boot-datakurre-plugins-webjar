package ba.camunda.euler.q421.process;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("SendMoneyNeeded")
public class SendMoneyNeeded implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.printf("надсилаю імайл до %s з проханням про поповнення рахунку \n"
                ,delegateExecution.getVariable("email")
        );
    }
}
