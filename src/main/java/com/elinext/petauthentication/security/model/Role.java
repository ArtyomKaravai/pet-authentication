package com.elinext.petauthentication.security.model;

import com.elinext.petauthentication.security.model.Authority;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum Role {

    ADMIN(Set.of(Authority.READ, Authority.WRITE)),
    USER(Set.of(Authority.READ));

    private final Set<Authority> authorities;

    public Set<SimpleGrantedAuthority> getSimpleGrantedAuthorities() {
        return authorities.stream()
                .map(x -> new SimpleGrantedAuthority(x.getAuthorityName()))
                .collect(Collectors.toSet());
    }
}
