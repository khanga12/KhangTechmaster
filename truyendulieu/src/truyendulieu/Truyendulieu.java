/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truyendulieu;

import java.util.Hashtable;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *
 * @author Ki Thuat 88
 */
public class Truyendulieu extends Application {
 Label labelFullName = new Label("text every thing here!: "); 
 TextField txtFullName = new TextField();
Button btnCalculate = new Button("truyền dữ liệu");

  @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 20, 20));
        flowPane.setHgap(9);
        flowPane.setVgap(9);
    Scene scene = new Scene(flowPane,300, 400);
        flowPane.getChildren().addAll(labelFullName, txtFullName,btnCalculate);
        txtFullName.setPromptText("text here!");
        primaryStage.setScene(scene);
        primaryStage.show(); 
        
        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {  
                Hashtable<String,String> parameters= new Hashtable <String,String>();
                parameters.put ("fullName",txtFullName.getText());
                SecondStage secondStage = new SecondStage(400.0, 300.0, parameters);
                secondStage.setTitle("This is second");
                secondStage.showAndWait();
                
            }
        });
                }
    public static void main(String args[]){
        launch(args);
    }
    
}

