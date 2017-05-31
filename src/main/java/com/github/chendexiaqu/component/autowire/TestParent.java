package com.github.chendexiaqu.component.autowire;

import com.github.chendexiaqu.component.TestOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Scope("prototype")
public class TestParent {

    @Autowired
    private TestOne testOne;



    @Autowired
    public TestParent(TestOne testOne) {
        this.testOne = testOne;
    }


    public void setTestOne(TestOne testOne) {
        this.testOne = testOne;
    }

    @Override
    public String toString() {
        return "TestParent{" +
                "testOne=" + testOne +
                '}';
    }
}
