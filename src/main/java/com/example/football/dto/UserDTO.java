/*******************************************************************************
 * COPYRIGHT (c) 2018 BY DXC TECHNOLOGY COMPANY.
 * ALL RIGHTS RESERVED WORLDWIDE. THIS SOFTWARE PRODUCT HAS BEEN
 * PROVIDED PURSUANT TO AN AGREEMENT CONTAINING RESTRICTIONS ON
 * ITS USE. IT MAY NOT BE COPIED, DUPLICATED, SOLD OR OTHERWISE
 * DISTRIBUTED IN ANY FORM OR BY ANY THIRD PARTIES WITHOUT THE
 * PRIOR WRITTEN PERMISSION OF DXC TECHNOLOGY COMPANY.
 *******************************************************************************/
package com.example.football.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDTO implements Serializable{

    private static final long serialVersionUID = 2740900188494040948L;

    private Integer id;
    private String username;
    private String forename;
    private String surname;
    private boolean enabled;
    private String password;
    private boolean admin;

    public UserDTO() {

    }

    public UserDTO(String username, String forename, String surname,
            boolean enabled, String password, boolean admin){
        this.username = username;
        this.forename = forename;
        this.surname = surname;
        this.enabled = enabled;
        this.password = password;
        this.admin = admin;
    }
}
