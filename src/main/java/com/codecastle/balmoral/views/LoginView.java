package com.codecastle.balmoral.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = LoginView.VIEW_NAME)
public class LoginView extends VerticalLayout implements View {

    public static final String VIEW_NAME = "login";

    private TextField usernameTf = new TextField("Username: ");
    private TextField passwordTf = new TextField("Password: ");
    private Button loginBtn = new Button("Login");

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

        addComponent(usernameTf);
        addComponent(passwordTf);
        addComponent(loginBtn);
    }
}