package vr.app.bussinesmanager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vr.app.view.LoginScreen;
import vr.app.model.Model;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // create scene with initial view:
        Scene scene = new Scene(viewFromModel(model.getCurrentView()), 320, 200);

        // change view when model property changes:
        vManager.currentViewProperty().addListener((obs, oldView, newView) ->
                scene.setRoot(viewFromModel(newView))
        );

        stage.setScene(scene);
        stage.show();
    }

    private Parent viewFromModel(Model.View view) {
        return switch(view) {
        };
    }

    public static void main(String[] args) {
        launch();
    }
}