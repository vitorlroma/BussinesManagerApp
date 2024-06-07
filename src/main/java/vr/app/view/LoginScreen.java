package vr.app.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import vr.app.bussinesmanager.LoginController;
import vr.app.model.Model;
import static vr.app.common.Constants.*;

public final class LoginScreen {
    private final LoginController loginController;
    private Model model;
    private VBox view;
    private final Label userLabel = new Label("Username: ");
    private TextField usernameField;
    private final Label passwordLabel = new Label("Password: ");
    private PasswordField passwordField;
    private Button loginButton;

    public LoginScreen(LoginController loginController) {
        this.loginController = loginController;

        build();

        updateController();
    }

    public Parent asParent() {
        return view;
    }

    private void build() {
        this.usernameField = new TextField();
        this.usernameField.setPromptText("username");
        this.usernameField.setMaxSize(textFieldWidth*2, textFieldHeight*2);
        this.usernameField.setPrefSize(textFieldWidth, textFieldHeight);

        this.passwordField = new PasswordField();
        this.passwordField.setPromptText("password");
        this.passwordField.setMaxSize(textFieldWidth*2,textFieldHeight*2);
        this.passwordField.setPrefSize(textFieldWidth, textFieldHeight);

        VBox userVBox = new VBox( 5.0, userLabel, usernameField);
        VBox passwordVBox = new VBox(5.0, passwordLabel, passwordField);

        this.loginButton = new Button("Login");
        loginButton.setMaxSize(buttonWidth, buttonHeight);
        loginButton.setDefaultButton(true);
        loginButton.setOnAction(event -> loginController.Login());

        this.view = new VBox(15.00, userVBox, passwordVBox, loginButton);
        this.view.setAlignment(Pos.CENTER);
        VBox.setMargin(userVBox, new Insets(marginTopAndBottom, marginLeftAndRight, marginTopAndBottom, marginLeftAndRight));
        VBox.setMargin(passwordVBox, new Insets(marginTopAndBottom, marginLeftAndRight, marginTopAndBottom, marginLeftAndRight));
    }

    private void updateController(){
        this.usernameField.textProperty().addListener((observable, oldValue, newValue) -> loginController.setUsername(newValue));
        this.passwordField.textProperty().addListener((observable, oldValue, newValue) -> loginController.setPassword(newValue));
    }
}
