package com.elinext.petauthentication.security.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Authority {

    READ("read"), WRITE("write");

    private final String authorityName;
}
