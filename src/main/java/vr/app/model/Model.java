package vr.app.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Model {
    public enum View {LoginScreen};

    private final ObjectProperty<View> currentView = new SimpleObjectProperty<>(View.LoginScreen);

    public View getCurrentView() {
        return currentView.get();
    }

    public ObjectProperty<View> currentViewProperty() {
        return currentView;
    }

    public void setCurrentView(View currentView) {
        this.currentView.set(currentView);
    }
}
