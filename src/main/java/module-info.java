module com.example.itsystemhausddgmbh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.itsystemhausddgmbh to javafx.fxml;
    exports com.example.itsystemhausddgmbh;
}