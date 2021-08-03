package com.codegym.serivce.role;

import com.codegym.model.Role;
import com.codegym.serivce.IGeneralService;


public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}