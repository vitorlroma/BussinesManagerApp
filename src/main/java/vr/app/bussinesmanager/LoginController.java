package vr.app.bussinesmanager;

import vr.app.model.Model;

public final class LoginController {
    private Model model;
    private String username;
    private String password;

    public LoginController(Model model) {
        this.model = model;
    }

    public void Login(){

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
