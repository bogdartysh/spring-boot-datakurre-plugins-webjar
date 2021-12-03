package ba.camunda.euler.q421.process;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SendResults implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.printf("надсилаю імайл до %s з відповддю %s на завдання %s \n"
                , delegateExecution.getVariable("nomer_zavdannia")
                , delegateExecution.getVariable("email")
                , delegateExecution.getVariable("answer")
        );
    }
}
