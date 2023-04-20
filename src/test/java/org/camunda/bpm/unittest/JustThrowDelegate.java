package org.camunda.bpm.unittest;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.decisionService;;

public class JustThrowDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		 try {
			 decisionService().evaluateDecisionByKey("Decision_1agxkgk")
					   .variables(execution.getVariables())
					   .evaluate();
		} catch (Exception e) {
			 throw new BpmnError("ErrorInEvaluation");
		} 
		
	}
	
	

}
