package com.exquisite.testcases.service;

import com.exquisite.testcases.model.ResultStatus;
import com.exquisite.testcases.model.TestCase;
import com.exquisite.testcases.model.TestResult;
import com.exquisite.testcases.model.TestStep;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestCaseService {

    public List<TestCase> getTestCases(){
        List<TestCase> testCases = new ArrayList<>();
        TestCase testCase = new TestCase("Mock TestCase 1", "This is a mocked testcase", "No prerequisites");
        testCase.addTestStep(new TestStep("Mocked TestStep 1","Have Fun 1"));
        TestStep step = new TestStep("Mocked TestStep 2","Have Fun 2");
        TestResult result = new TestResult(ResultStatus.SUCCESSFUL, "Development", "", "User 1");
        step.setResult(result);
        testCase.addTestStep(step);
        testCases.add(testCase);

        return testCases;
    }

}
