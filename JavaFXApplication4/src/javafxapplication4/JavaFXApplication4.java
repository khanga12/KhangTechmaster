/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXApplication4 extends Application {
    Label labelFullName = new Label("Fullname: ");
    TextField txtFullName = new TextField();

    Label labelEmail = new Label("Email: ");
    TextField txtEmail = new TextField();

    Label labelPassword = new Label("Password: ");
    PasswordField txtPassword = new PasswordField();

    Button buttonOK = new Button("Login");
    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 20, 20));
        flowPane.setHgap(5);//Horizonal gap = Khoảng trống theo chiều ngang
        flowPane.setVgap(5);//Vertical gap = Khoảng trống theo chiều dọc
        //Tạo Scene và hiển thị Scene
        Scene scene = new Scene(flowPane, 230, 250);
        flowPane.getChildren().addAll(labelFullName, txtFullName);
        txtFullName.setPromptText("Enter fullname");

        flowPane.getChildren().addAll(labelEmail, txtEmail);
        txtEmail.setPromptText("Enter email");

        flowPane.setMargin(buttonOK, new Insets(20, 0, 0, 0));
        flowPane.getChildren().addAll(labelPassword, txtPassword, buttonOK);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
