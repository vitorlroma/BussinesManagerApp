package vr.app.bussinesmanager;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vr.app.view.LoginScreen;
import vr.app.model.Model;

import java.io.IOException;

public class HelloApplication extends Application {
    private Parent loginScreen;
    @Override
    public void start(Stage stage) throws IOException {
        Model model = new Model();
        LoginController loginController = new LoginController(model);
        this.loginScreen = new LoginScreen(loginController).asParent();
        // create scene with initial view:
        Scene scene = new Scene(viewFromModel(model.getCurrentView()), 400, 280);

        // change view when model property changes:
        model.currentViewProperty().addListener((obs, oldView, newView) ->
                scene.setRoot(viewFromModel(newView))
        );

        stage.setScene(scene);
        stage.show();
    }

    private Parent viewFromModel(Model.View view) {
        return switch(view) {
            default -> loginScreen;
        };
    }

    public static void main(String[] args) {
        launch();
    }
}