package com.template.springboottemplate.errors;

import java.net.URI;

public class LoginAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public LoginAlreadyUsedException() {
        super(URI.create("/LoginAlreadyUsedException"), "Login name already used!", "userManagement", "userexists");
    }
}
