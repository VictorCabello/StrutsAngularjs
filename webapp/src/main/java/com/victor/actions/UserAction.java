

package com.victor.actions;

import com.victor.persistence.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.victor.actions.model.UserModel;
import com.victor.persistence.DBUser;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 *
 * @author intvmca
 */
@ParentPackage("json-default")
@Result(type = "json")
public class UserAction extends ActionSupport implements ModelDriven<UserModel>{
 
    private final UserModel itsModel;
    private final SessionFactory databaseAccess = HibernateUtil.getSessionFactory();
    
    public UserAction(){
        itsModel = new UserModel();
    }
    
    @Action(value = "/list-user")
    public String list(){
        Session mySession = databaseAccess.openSession();
        List myResult = mySession.createQuery("select u from " + DBUser.class.getName() + " u").list();
        itsModel.setList(myResult);
        
        return SUCCESS;
    }

    @Override
    public UserModel getModel() {
        return itsModel;
    }
}
