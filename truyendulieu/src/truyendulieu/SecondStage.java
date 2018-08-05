/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truyendulieu;

import java.util.Hashtable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ki Thuat 88
 */
public class SecondStage extends Stage{
    private Hashtable<String, String> parameters;
    private Scene scene;
    private TextField txtSecond=new TextField();
    private Label lblSecond=new Label();
    
    SecondStage(Double width,Double height, Hashtable<String, String> parameters){
        super();
        this.parameters= parameters;
        txtSecond.setText(parameters.get("fullName"));
        lblSecond.setText(parameters.get("fullName"));
        VBox vbox = new VBox(10.0);
        vbox.getChildren().addAll(txtSecond, lblSecond);
        scene = new Scene(vbox, width, height);
        this.setScene(scene);
    }
    
    
    
}
