package com.dand.start.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class UserRequestVO {

    private String userName;

    private String password;
}
