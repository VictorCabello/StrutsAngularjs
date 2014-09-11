package com.victor.actions;

import com.victor.actions.HelloAction;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;

public class HelloActionTest extends StrutsTestCase {

    public void testHelloAction() throws Exception {
        HelloAction hello = new HelloAction();
        String result = hello.execute();
        assertTrue("Expected a success result!",
                ActionSupport.SUCCESS.equals(result));
    }
}
