package com.victor.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = Action.SUCCESS, location = "${redirectName}", type = "redirect")
})
public class Index extends ActionSupport {

    private String redirectName;

    @Override
    public String execute() {
        redirectName = "/index.html";
        return Action.SUCCESS;
    }

    public String getRedirectName() {
        return redirectName;
    }

}
