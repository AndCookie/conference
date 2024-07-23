package com.ssafy.globalcc.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private String id;
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private String language;
    private boolean idCheck;
}
