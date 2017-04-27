package com.github.chendexiaqu.component.autowire;

import com.github.chendexiaqu.component.TestOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestParent {

    @Autowired
    private TestOne testOne;

//    public TestParent(TestOne testOne) {
//        this.testOne = testOne;
//    }


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
