/*******************************************************************************
 * COPYRIGHT (c) 2018 BY DXC TECHNOLOGY COMPANY.
 * ALL RIGHTS RESERVED WORLDWIDE. THIS SOFTWARE PRODUCT HAS BEEN
 * PROVIDED PURSUANT TO AN AGREEMENT CONTAINING RESTRICTIONS ON
 * ITS USE. IT MAY NOT BE COPIED, DUPLICATED, SOLD OR OTHERWISE
 * DISTRIBUTED IN ANY FORM OR BY ANY THIRD PARTIES WITHOUT THE
 * PRIOR WRITTEN PERMISSION OF DXC TECHNOLOGY COMPANY.
 *******************************************************************************/
package com.example.football.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -8038498568206119942L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    private String forename;
    private String surname;
    private boolean enabled;
    private String password;
    private boolean admin;

    protected User(){

    }

    public User(String username, String forename, String surname,
            boolean enabled, String password, boolean admin){
        this.username = username;
        this.forename = forename;
        this.surname = surname;
        this.enabled = enabled;
        this.password = password;
        this.admin = admin;
    }

}
