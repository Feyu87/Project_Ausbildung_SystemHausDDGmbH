package com.example.itsystemhausddgmbh;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Symbolcontroller {
    @FXML
    private Label welcomeText;
    @FXML
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("IT SystemHaus GmbH v1.0.0");
    }

}