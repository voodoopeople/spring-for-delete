package com.template.springboottemplate.errors;

import java.net.URI;

public class EmailAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public EmailAlreadyUsedException() {
        super(URI.create("/EmailAlreadyUsedException"), "Email is already in use!", "userManagement", "emailexists");
    }
}
