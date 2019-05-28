package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
//import javafx.scene.layout.Hbox;
//import javafx.scene.layout.Vbox;

import entity.Carrier;
import entity.Cruiser;
import entity.Destroyer;
import entity.Ship;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField your_name = new TextField();

        ComboBox<String> userBox = new ComboBox<>();
        HBox buttonBox = new HBox();
        HBox hbox1 = new HBox();
        VBox vbox1 = new VBox();
        VBox strings = new VBox();
        Group root = new Group();

        Button buttonGetInfo = new Button("Выбрать");
        Text textInfo = new Text();

        List<String> names = new ArrayList<>();
        //names.add("Корабль");
        names.add("Крейсер");
        names.add("Авиaносец");
        names.add("Эсминец");

        userBox.getItems().addAll(names);
        root.getChildren().add(strings);

        strings.setPadding(new Insets(10, 30, 10, 30));
        strings.setSpacing(20);

        strings.getChildren().add(new Text("Выберите тип вашего корабля"));
        strings.getChildren().add(buttonBox);

        buttonBox.getChildren().add(userBox);

        buttonBox.setSpacing(10);
        buttonBox.getChildren().add(buttonGetInfo);
        buttonBox.getChildren().add(vbox1);

        buttonGetInfo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String u = (String) userBox.getSelectionModel().getSelectedItem();
                /*if (u == "Корабль") {
                    //textInfo.setText("you choose entity");
                    Button buttonToSail = new Button("плыть");
                    Text shipText = new Text();
                    vbox1.getChildren().add(buttonToSail);
                    vbox1.getChildren().add(shipText);
                    buttonToSail.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Ship ship = new Ship();
                            shipText.setText(u + " " + ship.sail());
                        }
                    });

                }*/
                if (u.equals("Авиaносец")) {
                    Button buttonToSail = new Button("плыть");
                    Button buttonToLaunchPlane = new Button("запустить самолет");
                    Button buttonToUseAntiAircraftGun = new Button("выстрелить из зенитной пушки");
                    Text destroyerText = new Text();
                    vbox1.getChildren().add(buttonToSail);
                    vbox1.getChildren().add(buttonToLaunchPlane);
                    vbox1.getChildren().add(buttonToUseAntiAircraftGun);
                    vbox1.getChildren().add(destroyerText);
                    buttonToSail.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Destroyer destroyer = new Destroyer();
                            destroyerText.setText(u + " " + destroyer.sail());
                        }
                    });
                    buttonToLaunchPlane.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Destroyer destroyer = new Destroyer();
                            destroyerText.setText(u + " " + destroyer.launchPlane());
                        }
                    });
                    buttonToUseAntiAircraftGun.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Destroyer destroyer = new Destroyer();
                            destroyerText.setText(u + " выстрелил из зенитной пушки - " + destroyer.toUseAntiAircraftGun());
                        }
                    });
                }
                if (u.equals("Эсминец")) {
                    //textInfo.setText("you choose entity");
                    Button buttonToSail = new Button("плыть");
                    Button buttonToLaunchTorpedo = new Button("Запустить торпеду");
                    Button buttonToUseAntiAircraftGun = new Button("выстрелить из зенитной пушки");
                    Button buttonToUseMainGun = new Button("выстрелить из пушки главного калибра");
                    Text carrierText = new Text();
                    vbox1.getChildren().add(buttonToSail);
                    vbox1.getChildren().add(buttonToLaunchTorpedo);
                    vbox1.getChildren().add(buttonToUseAntiAircraftGun);
                    vbox1.getChildren().add(buttonToUseMainGun);
                    vbox1.getChildren().add(carrierText);
                    buttonToSail.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Carrier carrier = new Carrier();
                            carrierText.setText(u + " " + carrier.sail());
                        }
                    });
                    buttonToLaunchTorpedo.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Carrier carrier = new Carrier();
                            carrierText.setText(u + " " + carrier.launchTorpedo());
                        }
                    });
                    buttonToUseAntiAircraftGun.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Carrier carrier = new Carrier();
                            carrierText.setText(u + " выстрелил из зенитной пушки - " + carrier.toUseAntiAircraftGun());
                        }
                    });
                    buttonToUseMainGun.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Carrier carrier = new Carrier();
                            carrierText.setText(u + " выстрелил из главной пушки - " + carrier.toUseMainGun());
                        }
                    });
                }
                if (u.equals("Крейсер")) {
                    //textInfo.setText("you choose entity");
                    Button buttonToSail = new Button("плыть");
                    Button buttonToUseAntiAircraftGun = new Button("выстрелить из зенитной пушки");
                    Button buttonToUseMainGun = new Button("выстрелить из пушки главного калибра");
                    Text cruiserText = new Text();
                    vbox1.getChildren().add(buttonToSail);
                    vbox1.getChildren().add(buttonToUseAntiAircraftGun);
                    vbox1.getChildren().add(buttonToUseMainGun);
                    vbox1.getChildren().add(cruiserText);
                    buttonToSail.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Cruiser cruiser = new Cruiser();
                            cruiserText.setText(u + " " + cruiser.sail());
                        }
                    });
                    buttonToUseAntiAircraftGun.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Cruiser cruiser = new Cruiser();
                            cruiserText.setText(u + " выстрелил из зенитной пушки - " + cruiser.toUseAntiAircraftGun());
                        }
                    });
                    buttonToUseMainGun.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                            Cruiser cruiser = new Cruiser();
                            cruiserText.setText(u + " выстрелил из главной пушки - " + cruiser.toUseMainGun());
                        }
                    });
                }
            }
        });

        Scene scene = new Scene(root, 850, 650);

        primaryStage.setTitle("Лаба 3_19");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
