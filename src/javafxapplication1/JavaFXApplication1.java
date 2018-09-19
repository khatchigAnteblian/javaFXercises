/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 345983704
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        // Long way to do it
//        Circle circle1 = new Circle(100, 90, 50);
//        circle1.setFill(Color.TRANSPARENT);
//        circle1.setStroke(Color.BLUE);
//        Circle circle2 = new Circle(220, 90, 50);
//        circle2.setFill(Color.TRANSPARENT);
//        circle2.setStroke(Color.BLACK);
//        Circle circle3 = new Circle(340, 90, 50);
//        circle3.setFill(Color.TRANSPARENT);
//        circle3.setStroke(Color.RED);
//        Circle circle4 = new Circle(160, 130, 50);
//        circle4.setFill(Color.TRANSPARENT);
//        circle4.setStroke(Color.YELLOW);
//        Circle circle5 = new Circle(280, 130, 50);
//        circle5.setFill(Color.TRANSPARENT);
//        circle5.setStroke(Color.GREEN);
//        
//         Group root = new Group(circle1, circle2, circle3, circle4, circle5);
        
         
         // Fun way to do it
        Circle[] circles = new Circle[5];
        int initX = 100;
        Color[] colors = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};
        
        for (int i=0; i<5; i++) {
            if (i < 3) {
                circles[i] = new Circle(initX + (i * 120), 90, 50);
            } else {
                circles[i] = new Circle((1.6 * initX) + ((i - 3) * 120), 130, 50);
            }
            circles[i].setFill(Color.TRANSPARENT);
            circles[i].setStroke(colors[i]);
        }
        
        Group root = new Group(circles[0], circles[1], circles[2], circles[3], circles[4]);
        
        Scene sc = new Scene(root, 450, 250, Color.web("DDD"));
        
        primaryStage.setTitle("Olympics!");
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
