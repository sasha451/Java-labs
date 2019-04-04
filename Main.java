package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label random_walk = new Label("Количество блужданий");
        Label result = new Label("Результат:");

        TextField quantity = new TextField();
        quantity.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    quantity.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        Button button = new Button("Получить");

        root.add(random_walk, 0, 0);
        root.add(quantity, 1, 0);
        root.add(result,0,1);
        root.add(button, 1, 1);

        Scene scene = new Scene(root, 350, 200);

        button.setOnAction(event -> {
            int a = Integer.parseInt(quantity.getText());
            Random random = new Random();
            int num = random.nextInt(a);
            result.setText("Результат: " + num);
        });

        stage.setTitle("Случайное блуждание");
        stage.setScene(scene);
        stage.show();
    }
}