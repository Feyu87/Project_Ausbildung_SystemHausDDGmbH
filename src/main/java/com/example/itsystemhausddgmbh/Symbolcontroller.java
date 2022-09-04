package com.example.itsystemhausddgmbh;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class Symbolcontroller {
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;


    public Symbolcontroller() {

    }
    @FXML protected void closeProgramm() {
        Platform.exit();
    }





}