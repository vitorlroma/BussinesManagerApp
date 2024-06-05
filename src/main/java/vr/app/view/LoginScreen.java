package vr.app.view;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import vr.app.bussinesmanager.LoginController;
import vr.app.model.Model;

public class LoginScreen {
    private LoginController loginController;
    private Model model;
    private VBox view;
    private VBox userVBox;
    private VBox passwordVBox;
    private final Label userLabel = new Label("Username: ");
    private TextField usernameField;
    private final Label passwordLabel = new Label("Password: ");
    private PasswordField passwordField;
    private Button loginButton;

    public LoginScreen(LoginController loginController, Model model) {
        this.loginController = loginController;
        this.model = model;

        build();
    }

    public Parent asParent() {
        return view;
    }
    private void build() {
        this.usernameField = new TextField();
        this.usernameField.setPromptText("username");
        this.usernameField.setMaxSize(100.00,50.00);
        this.usernameField.setPrefSize(100.00, 50.00);

        this.passwordField = new PasswordField();
        this.passwordField.setPromptText("password");
        this.passwordField.setMaxSize(100.00,50.00);
        this.passwordField.setPrefSize(100.00, 50.00);

        this.userVBox = new VBox(userLabel, usernameField);
        this.passwordVBox = new VBox(passwordLabel, passwordField);

        this.loginButton = new Button("Login");
        this.loginButton.setMaxSize(50.00, 50.00);
        this.loginButton.setDefaultButton(true);

        this.view = new VBox(15.00, userVBox,passwordVBox,loginButton);
    }
}
