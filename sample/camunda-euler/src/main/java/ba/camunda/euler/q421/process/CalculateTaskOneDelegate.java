package ba.camunda.euler.q421.process;


import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("CalculateTaskOneDelegate")
public class CalculateTaskOneDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        if (1L == (Long) delegateExecution.getVariable("nomer_zavdannia"))
            delegateExecution.setVariable("answer", 42);
        throw new BpmnError("треба вирішити завдання");
    }
}
