package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        /* Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); */
        Group root = new Group();
        primaryStage.setTitle("Xmas Time");
        primaryStage.setScene(new Scene(root, 800, 600,Color.DARKBLUE));

        Text text = new Text(150,50,"Xmas Tree" +
                " !!");
        text.setFont(new Font(30));
        text.setFill(Color.AQUA);
        /* triangle */
        Polygon coretr = new Polygon();
        coretr.getPoints().setAll(300.0,100.0,150.0,500.0,450.0,500.0);
        coretr.setFill(Color.GREEN);

        /* Core */
        Rectangle rectangle = new Rectangle();
        rectangle.setX(275);
        rectangle.setY(495);
        rectangle.setWidth(50);
        rectangle.setHeight(60);
        rectangle.setArcWidth(20);
        rectangle.setArcHeight(20);
        rectangle.setFill(Color.BROWN);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setX(285);
        rectangle1.setY(80);
        rectangle1.setWidth(30);
        rectangle1.setHeight(45);
        rectangle1.setArcWidth(20);
        rectangle1.setArcHeight(20);
        rectangle1.setFill(Color.WHITESMOKE);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setX(295.5);
        rectangle2.setY(150);
        rectangle2.setWidth(15);
        rectangle2.setHeight(15);
        rectangle2.setArcWidth(20);
        rectangle2.setArcHeight(20);
        rectangle2.setFill(Color.RED);

        /* Circle */
        Circle ball1 = new Circle();
        ball1.setCenterX(200);
        ball1.setCenterY(480);
        ball1.setRadius(20);
        ball1.setFill(Color.ROSYBROWN);

        Circle ball2 = new Circle();
        ball2.setCenterX(262.5);
        ball2.setCenterY(480);
        ball2.setRadius(20);
        ball2.setFill(Color.RED);

        Circle ball3 = new Circle();
        ball3.setCenterX(325);
        ball3.setCenterY(480);
        ball3.setRadius(20);
        ball3.setFill(Color.SKYBLUE);

        Circle ball4 = new Circle();
        ball4.setCenterX(387);
        ball4.setCenterY(480);
        ball4.setRadius(20);
        ball4.setFill(Color.LIMEGREEN);

        Circle ball5 = new Circle();
        ball5.setCenterX(205);
        ball5.setCenterY(420);
        ball5.setRadius(20);
        ball5.setFill(Color.ORANGE);

        Circle ball6 = new Circle();
        ball6.setCenterX(270);
        ball6.setCenterY(420);
        ball6.setRadius(20);
        ball6.setFill(Color.MEDIUMPURPLE);

        Circle ball7 = new Circle();
        ball7.setCenterX(330);
        ball7.setCenterY(420);
        ball7.setRadius(20);
        ball7.setFill(Color.YELLOW);

        Circle ball8 = new Circle();
        ball8.setCenterX(380);
        ball8.setCenterY(420);
        ball8.setRadius(18);
        ball8.setFill(Color.AQUA);

        Circle ball9 = new Circle();
        ball9.setCenterX(360);
        ball9.setCenterY(350);
        ball9.setRadius(23);
        ball9.setFill(Color.ROYALBLUE);

        Circle ball10 = new Circle();
        ball10.setCenterX(280);
        ball10.setCenterY(350);
        ball10.setRadius(24);
        ball10.setFill(Color.DARKGREY);

        Circle ball11 = new Circle();
        ball11.setCenterX(310);
        ball11.setCenterY(300);
        ball11.setRadius(20);
        ball11.setFill(Color.LIGHTCORAL);

        Circle ball12 = new Circle();
        ball12.setCenterX(280);
        ball12.setCenterY(270);
        ball12.setRadius(21);
        ball12.setFill(Color.CYAN);

        Circle ball13 = new Circle();
        ball11.setCenterX(340);
        ball11.setCenterY(270);
        ball11.setRadius(21);
        ball11.setFill(Color.SKYBLUE);

        Circle ball14 = new Circle();
        ball14.setCenterX(300);
        ball14.setCenterY(219);
        ball14.setRadius(20);
        ball14.setFill(Color.BLUE);

        /* Elipsa = snieg */

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(550);
        ellipse.setCenterY(600);
        ellipse.setRadiusX(800);
        ellipse.setRadiusY(320);
        ellipse.setFill(Color.SNOW);

        root.getChildren().add(ellipse);
        root.getChildren().add(rectangle);
        root.getChildren().add(coretr);
        root.getChildren().add(ball1);
        root.getChildren().add(ball2);
        root.getChildren().add(ball3);
        root.getChildren().add(ball4);
        root.getChildren().add(ball5);
        root.getChildren().add(ball6);
        root.getChildren().add(ball7);
        root.getChildren().add(ball8);
        root.getChildren().add(ball9);
        root.getChildren().add(ball10);
        root.getChildren().add(ball11);
        root.getChildren().add(ball12);
        root.getChildren().add(ball13);
        root.getChildren().add(ball14);
        root.getChildren().add(rectangle1);
        root.getChildren().add(rectangle2);
        root.getChildren().add(text);
        /* Show scene :D */
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
