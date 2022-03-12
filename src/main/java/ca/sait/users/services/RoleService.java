package ca.sait.users.services;

import ca.sait.users.dataaccess.RoleDB;
import ca.sait.users.models.Role;
import java.util.List;

public class RoleService {

    private RoleDB roleDB = new RoleDB();

    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }
}
