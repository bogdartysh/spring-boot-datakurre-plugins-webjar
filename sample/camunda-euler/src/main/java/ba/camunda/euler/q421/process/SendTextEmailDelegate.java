package ba.camunda.euler.q421.process;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("SendTextEmailDelegate")
public class SendTextEmailDelegate implements JavaDelegate {

    public Expression text;

    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.printf("відправити імайл %s :  %s \n"
                , delegateExecution.getVariable("email")
                , text.getValue(delegateExecution));
    }
}
