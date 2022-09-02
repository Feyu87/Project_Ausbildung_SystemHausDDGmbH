package com.example.itsystemhausddgmbh;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Symbolcontroller {
    @FXML private Label welcomeText;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;

    public Symbolcontroller() {
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("IT SystemHaus GmbH v1.0.0");
    }
    protected void onButtonOneCLick() {

    }

}