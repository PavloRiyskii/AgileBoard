package com.practice.agileboard.security;

import com.practice.agileboard.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Павло on 13.12.2017.
 */
public class CustomUserDetail implements UserDetails {

    private User user;

    public CustomUserDetail(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(user != null) {
            List<GrantedAuthority> authoritis = new ArrayList<GrantedAuthority>(1);
            authoritis.add(new SimpleGrantedAuthority("ROLE_USER"));
            return authoritis;
        }
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassHash() + "";
    }

    @Override
    public String getUsername() {
        return this.user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}