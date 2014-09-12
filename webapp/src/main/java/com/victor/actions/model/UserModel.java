
package com.victor.actions.model;

import com.victor.persistence.DBUser;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author intvmca
 */
public class UserModel {
    
    
    private List<DBUser> itsList = new ArrayList<DBUser>();

    public List<DBUser> getList() {
        return itsList;
    }

    public void setList(List<DBUser> aList) {
        this.itsList = aList;
    }
    
    
}
