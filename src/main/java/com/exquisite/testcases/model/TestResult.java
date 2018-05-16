package com.exquisite.testcases.model;

public class TestResult {
    private ResultStatus resultStatus;
    private String environment;
    private String comments;
    private String user;

    public TestResult(){
        this.resultStatus = ResultStatus.NOT_EXECUTED;
    }

    public TestResult(final ResultStatus resultStatus, final String environment, final String comments, final String user) {
        this.resultStatus = resultStatus;
        this.environment = environment;
        this.comments = comments;
        this.user = user;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getComments() {
        return comments;
    }

    public String getUser() {
        return user;
    }
}
