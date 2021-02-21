/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JsonWebToken.service;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Denny
 */

@Service
public class JwtUserDetailService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       if("javainuse".equals(username)) //To change body of generated methods, choose Tools | Templates.
//       {
           return new User("javainuse","$2y$10$UTwsjQcB5Igcp/Bu1WtVrOwpt0vS6dwURW5DK0Aih2OGi7MBsql/W", new ArrayList<>());
//       } else {
//           throw new UsernameNotFoundException("invalid username and passord");
//       }
    }
    
}
