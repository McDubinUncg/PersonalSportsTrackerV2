package com.login;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public interface UserDetails {

    Collection<? extends GrantedAuthority> getAuthorities();

    String getPassword();

    String getUsername();
}
