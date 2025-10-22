package dk.easv.calculator2;

import dk.easv.calculator2.bll.CalculatorLogic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblResult;

    private String value1 = "";
    private String savedValue1 = "";
    private double savedValue2 = 0;
    private double savedValue3 = 0;
    private String operator = "";
    private double result;

    CalculatorLogic calculatorLogic = new CalculatorLogic();

    public void onBtnCClick(ActionEvent actionEvent) {
        value1 = "";
        operator = "";
        lblResult.setText("");
    }

    public void onBtnPlusMinusClick(ActionEvent actionEvent) {
        if (value1.charAt(0) != '-') {
            value1 = "-" + value1;
            lblResult.setText(value1);
        }

        else {
            value1 = value1.substring(1);
            lblResult.setText(value1);
        }

    }

    public void onBtnProcentClick(ActionEvent actionEvent) {
        if (savedValue1 == "") {

            savedValue2 = 0;
            savedValue1 = value1;
            value1 = value1 + "%";
            savedValue3 = Double.parseDouble(savedValue1);
            operator = "%";
            lblResult.setText(value1);
        }
        else {
            savedValue2 = Double.parseDouble(value1)/100;
            lblResult.setText(value1 + "%");
        }

    }

    public void onBtnDivideClick(ActionEvent actionEvent) {
        savedValue1 = value1;
        savedValue3 = Double.parseDouble(savedValue1);
        operator = "/";
        value1 = "";


    }

    public void onBtn7Click(ActionEvent actionEvent) {
        value1 = value1 + "7";
        lblResult.setText(value1);
    }

    public void onBtn8Click(ActionEvent actionEvent) {
        value1 = value1 + "8";
        lblResult.setText(value1);
    }

    public void onBtn9Click(ActionEvent actionEvent) {
        value1 = value1 + "9";
        lblResult.setText(value1);
    }

    public void onBtnMultiplyClick(ActionEvent actionEvent) {
        savedValue1 = value1;
        savedValue3 = Double.parseDouble(savedValue1);
        operator = "*";
        value1 = "";


    }

    public void onBtn4Click(ActionEvent actionEvent) {
        value1 = value1 + "4";
        lblResult.setText(value1);
    }

    public void onBtn5Click(ActionEvent actionEvent) {
        value1 = value1 + "5";
        lblResult.setText(value1);
    }

    public void onBtn6Click(ActionEvent actionEvent) {
        value1 = value1 + "6";
        lblResult.setText(value1);
    }

    public void onBtnMinusClick(ActionEvent actionEvent) {
        savedValue1 = value1;
        savedValue3 = Double.parseDouble(savedValue1);
        operator = "-";
        value1 = "";


    }

    public void onBtn1Click(ActionEvent actionEvent) {
        value1 = value1 + "1";
        lblResult.setText(value1);
    }

    public void onBtn2Click(ActionEvent actionEvent) {
        value1 = value1 + "2";
        lblResult.setText(value1);
    }

    public void onBtn3Click(ActionEvent actionEvent) {
        value1 = value1 + "3";
        lblResult.setText(value1);
    }

    public void onBtnPlusClick(ActionEvent actionEvent) {
        savedValue1 = value1;
        savedValue3 = Double.parseDouble(savedValue1);
        operator = "+";
        value1 = "";

    }

    public void onBtn0Click(ActionEvent actionEvent) {
        value1 = value1 + "0";
        lblResult.setText(value1);
    }

    public void onBtnCommaClick(ActionEvent actionEvent) {
        value1 = value1 + ".";
        lblResult.setText(value1);
    }

    public void onBtnEqualsClick(ActionEvent actionEvent) {
        if (value1.charAt(value1.length() - 1) != '%') {
            savedValue2 = Double.parseDouble(value1);
            lblResult.setText(String.valueOf(calculatorLogic.calculate(operator, savedValue2, savedValue3)));
        }
        else {
            lblResult.setText(String.valueOf(calculatorLogic.procentInEnd(operator, savedValue2, savedValue3)));
        }
    }
}

