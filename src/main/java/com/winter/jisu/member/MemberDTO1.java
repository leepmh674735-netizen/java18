package com.winter.jisu.member;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

    private String username;
    private String name;
    private String password;
    private String phone;
    private String email;
    private LocalDate birth;
    
    private ProfileDTO ProfileDTO;
}