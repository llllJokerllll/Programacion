package com.acarballeira.proba9.controlador;

import com.acarballeira.proba9.modelo.Suma;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumaController {

    @FXML
    private Button btnSumar;
    @FXML
    private TextField txtOp1;
    @FXML
    private TextField txtOp2;
    @FXML
    private TextField txtResultado;

    @FXML
    private void sumar(ActionEvent event) {

        try {
            int op1 = Integer.parseInt(this.txtOp1.getText());
            int op2 = Integer.parseInt(this.txtOp2.getText());
            Suma s = new Suma(op1, op2);
            int res = s.sumar();
            this.txtResultado.setText(String.valueOf(res));
        } catch (NumberFormatException e) {
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato incorrecto para la suma");
            alerta.showAndWait();
        } finally {
            this.txtOp1.setText("");
            this.txtOp2.setText("");
        }

    }
}
