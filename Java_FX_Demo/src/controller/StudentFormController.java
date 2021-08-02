package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ParameterMetaData;
import java.sql.SQLOutput;

public class StudentFormController {
    public TextField TxtExampletest;
    public Button btnSubmit;
    public TextField lblBanner;
    public AnchorPane root;

    public void initialize(){
        TxtExampletest.setDisable(true);
        btnSubmit.setDisable(true);
    }

    public void btnSalonHisaCareOnAction(ActionEvent actionEvent) {
        System.out.println("Wel Come to Salon HisaCare");

        TxtExampletest.setDisable(false);
        btnSubmit.setDisable(false);

        TxtExampletest.requestFocus();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Well come to Salon Hisa care");
        alert.showAndWait();

        System.out.println("End Alert");
    }

    public void btnSubmitOnAction(ActionEvent actionEvent) {
        String text = TxtExampletest.getText();
        lblBanner.setText(text);

        TxtExampletest.clear();
        TxtExampletest.requestFocus();
    }

    public void btnHideOnAction(ActionEvent actionEvent) {
        lblBanner.setVisible(false);
    }

    public void btnShowOnAction(ActionEvent actionEvent) {
        lblBanner.setVisible(true);
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../View/DashBoardForm.fxml"));
        Scene scene = new Scene(parent);

        Stage primaryStage = (Stage) root.getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Dash Board");
        primaryStage.centerOnScreen();


    }
}
