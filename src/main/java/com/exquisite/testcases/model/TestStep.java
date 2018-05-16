package com.exquisite.testcases.model;

public class TestStep {
    private String description;
    private String expectedResult;
    private TestResult result;

    public TestStep(final String description, final String expectedResult){
        this.description = description;
        this.expectedResult = expectedResult;
        this.setResult(new TestResult());
    }

    public String getDescription() {
        return description;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public TestResult getResult() {
        return result;
    }

    public void setResult(TestResult result) {
        this.result = result;
    }
}
