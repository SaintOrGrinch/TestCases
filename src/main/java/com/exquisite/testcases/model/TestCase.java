package com.exquisite.testcases.model;

import java.util.ArrayList;
import java.util.List;

public class TestCase {

    private String name;
    private String description;
    private String preRequisites;
    private List<TestStep> steps;
    private ResultStatus resultStatus;

    public TestCase(final String name, final String description, final String preRequisites) {
        this.name = name;
        this.description = description;
        this.preRequisites = preRequisites;
        steps = new ArrayList<>();

    }

    public void addTestStep(TestStep step){
        this.steps.add(step);
    }

    public void testSuccessful(){
        this.resultStatus = ResultStatus.SUCCESSFUL;
    }

    public void testUnsuccessful(){
        this.resultStatus = ResultStatus.UNSUCCESFUL;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPreRequisites() {
        return preRequisites;
    }

    public List<TestStep> getSteps() {
        return steps;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }
}
