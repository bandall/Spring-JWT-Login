package com.bandall.location_share.domain.member;


import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class UserPrinciple extends User {

    private static final String PASSWORD_ERASED_VALUE = "[PASSWORD_ERASED]";
    private final String email;
    private final String tokenId;

    // Access의 유저 정보를 컨트롤러에 유저 정보를 전달하기 위한 커스텀 객체, password는 jwt 토큰에 존재하지 않아 전달하지 않는다.
    // 토큰에 정보를 추가하기 위해서는 추가 필드를 만들어 준다.
    public UserPrinciple(String email, String username, String tokenId, Collection<? extends GrantedAuthority> authorities) {
        super(username, PASSWORD_ERASED_VALUE, authorities);
        this.email = email;
        this.tokenId = tokenId;
    }

    @Override
    public String toString() {
        return "UserPrinciple{" +
                "email='" + email + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", role='" + getAuthorities() + '\'' +
                '}';
    }
}
