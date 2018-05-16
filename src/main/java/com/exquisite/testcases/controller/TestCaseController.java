package com.exquisite.testcases.controller;

import com.exquisite.testcases.model.TestCase;
import com.exquisite.testcases.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/TestCases")
public class TestCaseController {

    @Autowired
    TestCaseService testCaseService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TestCase> getTestCases(){

        return this.testCaseService.getTestCases();
    }
}
