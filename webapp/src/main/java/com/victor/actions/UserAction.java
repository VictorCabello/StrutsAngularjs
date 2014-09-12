

package com.victor.actions;

import com.bluecross.persistence.DBUser;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.victor.actions.model.UserModel;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author intvmca
 */
@ParentPackage("json-default")
@Result(type = "json")
public class UserAction extends ActionSupport implements ModelDriven<UserModel>{
 
    private final UserModel itsModel;
    
    public UserAction(){
        itsModel = new UserModel();
    }
    
    @Action(value = "/list-user")
    public String list(){
        final List<DBUser> myList = itsModel.getList();

        DBUser myUser = new DBUser();
        myUser.setUsername("Victor");
        myList.add(myUser);
        return SUCCESS;
    }

    @Override
    public UserModel getModel() {
        return itsModel;
    }
}
