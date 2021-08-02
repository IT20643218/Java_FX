package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController extends Application {

    public AnchorPane root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void btnCustomerRegistrationFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../View/StudentForm.fxml"));
        Scene scene = new Scene(parent);

        Stage primaryStage = (Stage) root.getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Dash Board");
        primaryStage.centerOnScreen();
    }

    public void btnTableFormOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../View/TableForm.fxml"));
        Scene scene = new Scene(parent);

        Stage primaryStage = (Stage) root.getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Table Form");
        primaryStage.centerOnScreen();
    }
}
