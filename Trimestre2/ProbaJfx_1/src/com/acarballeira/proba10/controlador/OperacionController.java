package com.acarballeira.proba10.controlador;

import com.acarballeira.proba10.modelo.Operacion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class OperacionController {

    @FXML
    private Button btnOperacion;
    @FXML
    private TextField txtOp1;
    @FXML
    private TextField txtOp2;
    @FXML
    private TextField txtResultado;
    @FXML
    private RadioButton rdbSuma;
    @FXML
    private RadioButton rdbResta;
    @FXML
    private RadioButton rdbMult;
    @FXML
    private RadioButton rdbDivision;

    @FXML
    private void hacerOperacion(ActionEvent event) {

        try {
            int op1 = Integer.parseInt(this.txtOp1.getText());
            int op2 = Integer.parseInt(this.txtOp2.getText());
            
            Operacion op = new Operacion(op1,op2);
            
            if (rdbSuma.isSelected()) {
                this.txtResultado.setText(String.valueOf(op.sumar()));
            } else if (rdbResta.isSelected()) {
                this.txtResultado.setText(String.valueOf(op.restar()));
            } else if (rdbMult.isSelected()) {
                this.txtResultado.setText(String.valueOf(op.multi()));
            } else if (rdbDivision.isSelected()) {
                this.txtResultado.setText(String.valueOf(op.div()));
            }

        } catch (NumberFormatException e) {
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato incorrecto");
            alerta.showAndWait();
        } finally {
            this.txtOp1.setText("");
            this.txtOp2.setText("");
        }

    }

}