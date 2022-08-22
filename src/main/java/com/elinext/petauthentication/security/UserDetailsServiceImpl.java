package com.elinext.petauthentication.security;

import com.elinext.petauthentication.repository.UserRepository;
import com.elinext.petauthentication.security.model.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(SecurityUser::fromUserToUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException("User doesn't exist"));
    }
}
