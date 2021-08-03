package com.codegym.serivce.user;


import com.codegym.model.User;
import com.codegym.serivce.IGeneralService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUserName(String username);
}
