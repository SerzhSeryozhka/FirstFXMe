package com.example.firstfxme;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label area;
    @FXML
    TextField H;
    @FXML
    TextField L;
    @FXML
    protected void area() {
        double h= Double.parseDouble(H.getText()),
                l= Double.parseDouble(L.getText());
        Rectangle r=new Rectangle(h,l);
        double s= r.area();
        area.setText("Площадь: "+s);
    }
}