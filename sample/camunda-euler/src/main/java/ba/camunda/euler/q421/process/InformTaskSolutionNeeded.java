package ba.camunda.euler.q421.process;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("informTaskSolutionNeeded")
public class InformTaskSolutionNeeded implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.printf("треба вирішити завдання %s process-instance %s\n", delegateExecution.getVariable("nomer_zavdannia").toString(),
                delegateExecution.getProcessInstanceId()

        );
    }
}
