/**
 * Created by Colin on 15/11/2016.
 * Student ID: R00115734
 * Email: coln.c.dunne@mycit.ie
 */
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.util.Callback;
import java.time.LocalDate;
import java.time.Month;


public class FlightPlanner extends Application {

    private final ComboBox comboBoxFrom = new ComboBox();
    private final ComboBox comboBoxTo = new ComboBox();
    private final ComboBox comboBoxAdult = new ComboBox();
    private final ComboBox comboBoxChild = new ComboBox();
    private final ComboBox comboBoxTimes = new ComboBox();
    Text dpassenger1 = new Text();
    Text dfname1 = new Text();
    Text dsName1 = new Text();
    Text ddob1 = new Text();
    Text dpassenger1SC = new Text();
    Text dp1checkedBag = new Text();
    Text dpassenger2 = new Text();
    Text dfname2 = new Text();
    Text dsName2 = new Text();
    Text ddob2 = new Text();
    Text dpassenger2SC = new Text();
    Text dp2checkedBag = new Text();
    Text dpassenger3 = new Text();
    Text dfname3 = new Text();
    Text dsName3 = new Text();
    Text ddob3 = new Text();
    Text dpassenger3SC = new Text();
    Text dp3checkedBag = new Text();
    Text dpassenger4 = new Text();
    Text dfname4 = new Text();
    Text dsName4 = new Text();
    Text ddob4 = new Text();
    Text dpassenger4SC = new Text();
    Text dp4checkedBag = new Text();
    Text dpassenger5 = new Text();
    Text dfname5 = new Text();
    Text dsName5 = new Text();
    Text ddob5 = new Text();
    Text dpassenger5SC = new Text();
    Text dp5checkedBag = new Text();
    Text dpassenger6 = new Text();
    Text dfname6 = new Text();
    Text dsName6 = new Text();
    Text ddob6 = new Text();
    Text dpassenger6SC = new Text();
    Text dp6checkedBag = new Text();
    Text dpassenger7 = new Text();
    Text dfname7 = new Text();
    Text dsName7 = new Text();
    Text ddob7 = new Text();
    Text dpassenger7SC = new Text();
    Text dp7checkedBag = new Text();
    Text dpassenger8 = new Text();
    Text dfname8 = new Text();
    Text dsName8 = new Text();
    Text ddob8 = new Text();
    Text dpassenger8SC = new Text();
    Text dp8checkedBag = new Text();
    Text totalEndPayment = new Text();
    Text payee = new Text();
    Text address = new Text();
    Text endEmail = new Text();
    Text phone = new Text();
    Text cardNumberVal = new Text();
    Text dateOut = new Text();
    Text dateArr = new Text();
    Text routes = new Text();
    Text timesEnd = new Text();

    DatePicker expiry = new DatePicker();
    RadioButton p1Yes = new RadioButton("Yes");
    RadioButton p2Yes = new RadioButton("Yes");
    RadioButton p3Yes = new RadioButton("Yes");
    RadioButton p4Yes = new RadioButton("Yes");
    RadioButton p5Yes = new RadioButton("Yes");
    RadioButton p6Yes = new RadioButton("Yes");
    RadioButton p7Yes = new RadioButton("Yes");
    RadioButton p8Yes = new RadioButton("Yes");

    int numPeople = 0;
    int numChildren = 0;
    int numBabies = 0;
    int adultCost = 0;
    int childCost = 0;
    int totalCost = 0;
    int totalPeople = 0;
    int discount = 0;

    public static void main(String[] args) {
        launch(args);
    }

    public void priceCalc(int numPeople, int numChildren) {
        if(comboBoxFrom.getValue()!= null && comboBoxTo.getValue()!= null) {
            if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Madrid (MAD)") || comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                adultCost = numPeople * 200;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("St Brieuc (SBK)") || comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                adultCost = numPeople * 200;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Jersey (JER)") || comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                adultCost = numPeople * 240;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Paris (CDG)") || comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                adultCost = numPeople * 160;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Stansted (STN)") || comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                adultCost = numPeople * 80;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Malaga (AGP)") || comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                adultCost = numPeople * 480;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("St Brieuc (SBK)") || comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                adultCost = numPeople * 400;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Jersey (JER)") || comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                adultCost = numPeople * 400;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Paris (CDG)") || comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                adultCost = numPeople * 120;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Stansted (STN)") || comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                adultCost = numPeople * 120;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Malaga (AGP)") || comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                adultCost = numPeople * 120;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Paris (CDG)") || comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                adultCost = numPeople * 300;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Stansted (STN)") || comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                adultCost = numPeople * 160;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Malaga (AGP)") || comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                adultCost = numPeople * 280;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Paris (CDG)") || comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                adultCost = numPeople * 500;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Stansted (STN)") || comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                adultCost = numPeople * 500;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Malaga (AGP)") || comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                adultCost = numPeople * 560;childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Stansted (STN)") || comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                adultCost = numPeople * 120;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Malaga (AGP)") || comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                adultCost = numPeople * 200;
                childCost = numChildren * 120;
            }
            else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Malaga (AGP)") || comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                adultCost = numPeople * 140;
                childCost = numChildren * 120;
            }
        }
    }

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("JavaAir - Booking");

        //Create new Anchor Panes here
        AnchorPane home = new AnchorPane();
        final AnchorPane info = new AnchorPane();
        AnchorPane details = new AnchorPane();
        AnchorPane details2 = new AnchorPane();
        AnchorPane details3 = new AnchorPane();
        AnchorPane details4 = new AnchorPane();
        AnchorPane details5 = new AnchorPane();
        AnchorPane details6 = new AnchorPane();
        AnchorPane details7 = new AnchorPane();
        AnchorPane details8 = new AnchorPane();
        AnchorPane payement = new AnchorPane();
        AnchorPane finalPage = new AnchorPane();

        //Creates new window called stage, sets it's size and title.
        final Stage stage = new Stage();
        stage.setScene(new Scene(info, 1100, 844));
        stage.setTitle("JavaAir - Booking | Flight Details");

        //Creates new window called detailsView, sets it's size and title.
        final Stage detailsView = new Stage();
        detailsView.setTitle("JavaAir - Booking | Passenger Details");
        detailsView.setScene(new Scene(details, 1100, 844));

        final Stage detailsView2 = new Stage();
        detailsView2.setTitle("JavaAir - Booking | Passenger Details");
        detailsView2.setScene(new Scene(details2, 1100, 844));

        final Stage detailsView3 = new Stage();
        detailsView3.setTitle("JavaAir - Booking | Passenger Details");
        detailsView3.setScene(new Scene(details3, 1100, 844));

        final Stage detailsView4 = new Stage();
        detailsView4.setTitle("JavaAir - Booking | Passenger Details");
        detailsView4.setScene(new Scene(details4, 1100, 844));

        final Stage detailsView5 = new Stage();
        detailsView5.setTitle("JavaAir - Booking | Passenger Details");
        detailsView5.setScene(new Scene(details5, 1100, 844));

        final Stage detailsView6 = new Stage();
        detailsView6.setTitle("JavaAir - Booking | Passenger Details");
        detailsView6.setScene(new Scene(details6, 1100, 844));

        final Stage detailsView7 = new Stage();
        detailsView7.setTitle("JavaAir - Booking | Passenger Details");
        detailsView7.setScene(new Scene(details7, 1100, 844));

        final Stage detailsView8 = new Stage();
        detailsView8.setTitle("JavaAir - Booking | Passenger Details");
        detailsView8.setScene(new Scene(details8, 1100, 844));

        final Stage payementView = new Stage();
        payementView.setTitle("JavaAir - Booking | Payement Details");
        payementView.setScene(new Scene(payement, 1100, 844));

        final Stage finalDetails = new Stage();
        finalDetails.setTitle("JavaAir - Booking | Success!");
        finalDetails.setScene(new Scene(finalPage, 1100, 844));

        //All content that is displayed on the home AnchorPane
        Text pageTitle = new Text("JavaAir - Cheap & Cheerful...");
        pageTitle.setFont(Font.font("Verdana", 70));
        pageTitle.setLayoutX(50);
        pageTitle.setLayoutY(100);
        Text sceneTitle = new Text("Welcome to JavaAir Booking");
        sceneTitle.setFont(Font.font("Verdana", 40));
        sceneTitle.setLayoutX(250);
        sceneTitle.setLayoutY(400);

        Button start = new Button();
        start.setText("Start Booking");
        start.setFont(Font.font("Verdana", 20));
        start.setPrefHeight(70);
        start.setPrefWidth(200);
        start.setLayoutX(425);
        start.setLayoutY(450);

        //Creates an onClick event
        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.hide();
                stage.show();
            }
        });

        //All content that is displayed on the info AnchorPane
        Text infoPageTitle = new Text("Please Choose Flights and Dates");
        infoPageTitle.setFont(Font.font("Verdana", 50));
        infoPageTitle.setLayoutX(140);
        infoPageTitle.setLayoutY(100);

        Button infoNext = new Button();
        infoNext.setText("Next");
        infoNext.setFont(Font.font("Verdana", 20));
        infoNext.setPrefHeight(70);
        infoNext.setPrefWidth(160);
        infoNext.setLayoutX(820);
        infoNext.setLayoutY(600);
        infoNext.setDisable(true);

        Text textFrom = new Text("From: ");
        textFrom.setFont(Font.font("Verdana", 18));
        textFrom.setLayoutX(90);
        textFrom.setLayoutY(268);
        //Creates a list containing the specified Strings
        ObservableList<String> flyFrom = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "St Brieuc (SBK)", "Jersey (JER)", "Paris (CDG)", "Stansted (STN)", "Malaga (AGP)");
        //Adds the list flyFrom to the combo box so it can be displayed.
        comboBoxFrom.setItems(flyFrom);
        comboBoxFrom.setLayoutX(150);
        comboBoxFrom.setLayoutY(250);
        comboBoxFrom.setPrefWidth(200);

        Text textTo = new Text("To: ");
        textTo.setFont(Font.font("Verdana", 18));
        textTo.setLayoutX(420);
        textTo.setLayoutY(268);
        //Creates a list containing the specified Strings
        ObservableList<String> flyTo = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "St Brieuc (SBK)", "Jersey (JER)", "Paris (CDG)", "Stansted (STN)", "Malaga (AGP)");
        //Adds the list flyTo to the combo box so it can be displayed.
        //final ComboBox comboBoxTo = new ComboBox();
        comboBoxTo.setItems(flyTo);
        comboBoxTo.setLayoutX(460);
        comboBoxTo.setLayoutY(250);
        comboBoxTo.setPrefWidth(200);

        Text textTime = new Text("Time: ");
        textTime.setFont(Font.font("Verdana", 18));
        textTime.setLayoutX(740);
        textTime.setLayoutY(268);
        //Creates a list containing the specified Strings
        ObservableList<String> flightTimes = FXCollections.observableArrayList("18:30", "19:00", "19:30");
        //Adds the list flyFrom to the combo box so it can be displayed.
        //comboBoxTimes.setItems(flightTimes);
        comboBoxTimes.setLayoutX(800);
        comboBoxTimes.setLayoutY(250);
        comboBoxTimes.setPrefWidth(200);

        comboBoxTo.setOnAction((event) -> {
            if (comboBoxFrom.getValue() != null && comboBoxTo.getValue() != null) {
                if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("09:20-13:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("10:30-14:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("14:00-16:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("09:00-12:15", "18:20-21:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:20-09:50", "11:20-13:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Cork (ORK)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:00-11:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:00-20:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("12:00-13:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("06:20-08:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:00-10:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("14:00-15:20", "19:05-21:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Madrid (MAD)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:00-09:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("19:00-20:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:00-20:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("06:20-07:15");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:05-08:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("St Brieuc (SBK)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("12:00-15:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("10:00-12:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:00-21:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:00-10:15");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("17:00-18:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Jersey (JER)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:00-11:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("13:30-15:00", "22:00-23:50");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("19:20-21:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("19:00-20:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("20:00-20:15");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:00-18:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Paris (CDG)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("11:50-13:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("11:00-12:20", "18:00-19:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("10:20-14:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:00-20:00");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("09:00-10:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("09:00-10:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Stansted (STN)") && comboBoxTo.getValue().equals("Malaga (AGP)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("08:00-11:00", "13:30-16:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Cork (ORK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("13:00-14:20");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Madrid (MAD)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("20:00-21:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("St Brieuc (SBK)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("20:00-21:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Jersey (JER)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:00-19:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Paris (CDG)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("18:05-12:30");
                    comboBoxTimes.setItems(flightTimes1);
                }
                else if (comboBoxFrom.getValue().equals("Malaga (AGP)") && comboBoxTo.getValue().equals("Stansted (STN)")) {
                    ObservableList<String> flightTimes1 = FXCollections.observableArrayList("15:00-16:10", "20:35-21:05");
                    comboBoxTimes.setItems(flightTimes1);
                }
            }
        });

        comboBoxFrom.setOnAction((event) -> {
            Object location = comboBoxFrom.getSelectionModel().getSelectedItem();
            Object arrival = comboBoxTo.getSelectionModel().getSelectedItem();
            //Checks if the selected object is true
            if (location == "Cork (ORK)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromCork = FXCollections.observableArrayList("Madrid (MAD)", "St Brieuc (SBK)", "Jersey (JER)", "Paris (CDG)", "Stansted (STN)", "Malaga (AGP)");
                comboBoxTo.setItems(flyFromCork);
            }
            //Checks if the selected object is true
            else if (location == "Madrid (MAD)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromMadrid = FXCollections.observableArrayList("Cork (ORK)", "St Brieuc (SBK)", "Jersey (JER)", "Paris (CDG)", "Stansted (STN)", "Malaga (AGP)");
                comboBoxTo.setItems(flyFromMadrid);
            }
            //Checks if the selected object is true
            else if (location == "St Brieuc (SBK)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromMadrid = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "Jersey (JER)", "Paris (CDG)", "Stansted (STN)", "Malaga (AGP)");
                comboBoxTo.setItems(flyFromMadrid);
            }
            //Checks if the selected object is true
            else if (location == "Jersey (JER)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromMadrid = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "St Brieuc (SBK)", "Paris (CDG)", "Stansted (STN)", "Malaga (AGP)");
                comboBoxTo.setItems(flyFromMadrid);
            }
            //Checks if the selected object is true
            else if (location == "Paris (CDG)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromMadrid = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "St Brieuc (SBK)", "Jersey (JER)", "Stansted (STN)", "Malaga (AGP)");
                comboBoxTo.setItems(flyFromMadrid);
            }
            //Checks if the selected object is true
            else if (location == "Stansted (STN)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromMadrid = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "St Brieuc (SBK)", "Jersey (JER)", "Paris (CDG)", "Malaga (AGP)");
                comboBoxTo.setItems(flyFromMadrid);
            }
            //Checks if the selected object is true
            else if (location == "Malaga (AGP)") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> flyFromMadrid = FXCollections.observableArrayList("Cork (ORK)", "Madrid (MAD)", "St Brieuc (SBK)", "Jersey (JER)", "Paris (CDG)", "Stansted (STN)");
                comboBoxTo.setItems(flyFromMadrid);
            }
        });

        //Adds a text area where text is displayed.
        Text textOutgoingDate = new Text("Outgoing Date: ");
        //Sets the text area's fint and font size.
        textOutgoingDate.setFont(Font.font("Verdana", 18));
        //Sets the X & Y coords of the text area.
        textOutgoingDate.setLayoutX(90);
        textOutgoingDate.setLayoutY(368);
        //Create a DatePicker object.
        DatePicker datePickerOutgoing = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        datePickerOutgoing.setLayoutX(230);
        datePickerOutgoing.setLayoutY(350);
        datePickerOutgoing.setPrefWidth(180);
        //Gets the value that is selected by the user.
        datePickerOutgoing.setOnAction(event -> {
            LocalDate date = datePickerOutgoing.getValue();
            System.out.println("Selected date: " + date);
        });


        //Adds a text area where text is displayed.
        Text textReturnDate = new Text("Return Date: ");
        //Sets the text area's fint and font size.
        textReturnDate.setFont(Font.font("Verdana", 18));
        //Sets the X & Y coords of the text area.
        textReturnDate.setLayoutX(430);
        textReturnDate.setLayoutY(368);
        //Create a DatePicker object.
        DatePicker datePickerReturn = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        datePickerReturn.setLayoutX(550);
        datePickerReturn.setLayoutY(350);
        datePickerReturn.setPrefWidth(180);
        //Gets the value that is selected by the user.
        datePickerReturn.setOnAction(event -> {
            LocalDate date = datePickerReturn.getValue();
            //System.out.println("Selected date: " + date);
        });

        Text adultText = new Text("Adult:");
        adultText.setFont(Font.font("Verdana", 18));
        adultText.setLayoutX(750);
        adultText.setLayoutY(368);
        //Contains all the data that will be displayed in comboBoxAdult
        ObservableList<String> numAdult = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8");
        //Create a ComboBox  and sets its X & Y coords and width.
        comboBoxAdult.setItems(numAdult);
        comboBoxAdult.setLayoutX(810);
        comboBoxAdult.setLayoutY(350);
        comboBoxAdult.setPrefWidth(150);


        Text childText = new Text("Child:");
        childText.setFont(Font.font("Verdana", 18));
        childText.setLayoutX(750);
        childText.setLayoutY(408);
        //Contains all the data that will be displayed in comboBoxAdult
        ObservableList<String> numChild = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8");
        //Create a ComboBox  and sets its X & Y coords and width.
        comboBoxChild.setItems(numChild);
        comboBoxChild.setLayoutX(810);
        comboBoxChild.setLayoutY(390);
        comboBoxChild.setPrefWidth(150);
        comboBoxChild.setDisable(true);

        Text babyText = new Text("Baby:");
        babyText.setFont(Font.font("Verdana", 18));
        babyText.setLayoutX(750);
        babyText.setLayoutY(448);
        ObservableList<String> numBaby = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8");
        //Create a ComboBox  and sets its X & Y coords and width.
        final ComboBox comboBoxBaby = new ComboBox(numChild);
        comboBoxBaby.setLayoutX(810);
        comboBoxBaby.setLayoutY(430);
        comboBoxBaby.setPrefWidth(150);
        comboBoxBaby.setDisable(true);


        //When the comboBox "comboBoxAdult" is selected this event will be used.
        comboBoxAdult.setOnAction((event) -> {
            if(comboBoxFrom.getValue() != null && comboBoxTo.getValue() != null && comboBoxTimes.getValue() != null && datePickerOutgoing.getValue() != null && datePickerReturn.getValue() != null && comboBoxAdult.getValue() != null) {
                infoNext.setDisable(false);
            }
            //Creates the variable child and assigns it to whatever is selected in the comboBox.
            Object people = comboBoxAdult.getSelectionModel().getSelectedItem();
            //If 1 is selected it will execute the code below.
            if (people == "1") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1", "2");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1", "2");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople++;
                System.out.println(numPeople);
            }
            //If 2 is selected it will execute the code below.
            else if (people == "2") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1", "2", "3", "4");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1", "2", "3", "4");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople = numPeople + 2;
                System.out.println(numPeople);
            }
            //If 3 is selected it will execute the code below.
            else if (people == "3") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1", "2", "3", "4", "5");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1", "2", "3", "4", "5");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople = numPeople + 3;
                System.out.println(numPeople);
            }
            //If 4 is selected it will execute the code below.
            else if (people == "4") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1", "2", "3", "4");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1", "2", "3", "4");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople = numPeople + 4;
                System.out.println(numPeople);
            }
            //If 5 is selected it will execute the code below.
            else if (people == "5") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1", "2", "3");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1", "2", "3");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople = numPeople + 5;
                System.out.println(numPeople);
            }
            //If 6 is selected it will execute the code below.
            else if (people == "6") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1", "2");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1", "2");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople = numPeople + 6;
                System.out.println(numPeople);
            }
            //If 7 is selected it will execute the code below.
            else if (people == "7") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(false);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(false);

                numPeople = 0;
                numPeople = numPeople + 7;
                System.out.println(numPeople);
            }
            //If 8 is selected it will execute the code below.
            else if (people == "8") {
                //If it is then it loads the new ObservableList containing the destinations into the combo box.
                ObservableList<String> numChild1 = FXCollections.observableArrayList("1");
                comboBoxChild.setItems(numChild1);
                comboBoxChild.setDisable(true);
                ObservableList<String> numBaby1 = FXCollections.observableArrayList("1");
                comboBoxBaby.setItems(numBaby1);
                comboBoxBaby.setDisable(true);

                numPeople = 0;
                numPeople = numPeople + 8;
                System.out.println(numPeople);
            }
            //If anything else is chosen or error occurs, it will execute the below code..
            else {
                comboBoxChild.setDisable(false);
                comboBoxBaby.setDisable(false);
            }
            //adultCost = numPeople * 100;
            //System.out.println(adultCost);
            //Put this into seperate method.
        });


        //When the comboBox "comboBoxChild" is selected this event will be used.
        comboBoxChild.setOnAction((event) -> {
            //Creates the variable child and assigns it to whatever is selected in the comboBox.
            Object child = comboBoxChild.getSelectionModel().getSelectedItem();
            //Checks if the selected object is true.
            if (child == "1") {
                numChildren = 0;
                numChildren = numChildren + 1;
            } else if (child == "2") {
                numChildren = 0;
                numChildren = numChildren + 2;
            } else if (child == "3") {
                numChildren = 0;
                numChildren = numChildren + 3;
            } else if (child == "4") {
                numChildren = 0;
                numChildren = numChildren + 4;
            } else if (child == "5") {
                numChildren = 0;
                numChildren = numChildren + 5;
            } else if (child == "6") {
                numChildren = 0;
                numChildren = numChildren + 6;
            } else if (child == "7") {
                numChildren = 0;
                numChildren = numChildren + 7;
            } else if (child == "8") {
                numChildren = 0;
                numChildren = numChildren + 8;
            }
        });

        //When the comboBox "comboBoxChild" is selected this event will be used.
        comboBoxBaby.setOnAction((event) -> {
            //Creates the variable child and assigns it to whatever is selected in the comboBox.
            Object child = comboBoxBaby.getSelectionModel().getSelectedItem();
            //Checks if the selected object is true.
            if (child == "1") {
                numBabies = 0;
                numBabies = numBabies + 1;
            } else if (child == "2") {
                numBabies = 0;
                numBabies = numBabies + 2;
            } else if (child == "3") {
                numBabies = 0;
                numBabies = numBabies + 3;
            } else if (child == "4") {
                numBabies = 0;
                numBabies = numBabies + 4;
            } else if (child == "5") {
                numBabies = 0;
                numBabies = numBabies + 5;
            } else if (child == "6") {
                numBabies = 0;
                numBabies = numBabies + 6;
            } else if (child == "7") {
                numBabies = 0;
                numBabies = numBabies + 7;
            } else if (child == "8") {
                numBabies = 0;
                numBabies = numBabies + 8;
            }
        });

        //Sets a disable for the specified date, and adds a tooltip stating this fact.
        final Callback<DatePicker, DateCell> dayCellFactory = new Callback<DatePicker, DateCell>() {
            public DateCell call(final DatePicker datePicker) {
                return new DateCell() {
                    @Override
                    public void updateItem(LocalDate item, boolean empty) {
                        //Updates the DatePicker.
                        super.updateItem(item, empty);

                        if (item.isAfter(LocalDate.now().plusMonths(6)) || item.isBefore(LocalDate.now().plusDays(1))) {
                            //Creates a short message when hovering over disabled dates.
                            setTooltip(new Tooltip("Route does not operate during these dates."));
                            //Sets colour of disabled dates to red.
                            setStyle("-fx-background-color: #ff4444;");
                            //Disables the set dates from the DatePicker.
                            setDisable(true);
                        }

                        if(datePickerOutgoing.getValue()!= null && item.isBefore(datePickerOutgoing.getValue().plusDays(1))) {
                            //Creates a short message when hovering over disabled dates.
                            setTooltip(new Tooltip("Route does not operate during these dates."));
                            //Sets colour of disabled dates to red.
                            setStyle("-fx-background-color: #ff4444;");
                            //Disables the set dates from the DatePicker.
                            setDisable(true);
                        }

                        //If Stanstead and St Brieuc are chosen, the months of March and April are disabled.
                        if (comboBoxFrom.getValue() == "Stansted (STN)" && comboBoxTo.getValue() == "St Brieuc (SBK)" || comboBoxFrom.getValue() == "St Brieuc (SBK)" && comboBoxTo.getValue() == "Stansted (STN)") {
                            if (Month.from(item).equals(Month.of(3))) {
                                //Choosing the date needed to be disabled.
                                Month.from(item).equals(Month.of(3));
                                //Creates a short message when hovering over disabled dates.
                                setTooltip(new Tooltip("Route does not operate during these dates."));
                                //Sets colour of disabled dates to red.
                                setStyle("-fx-background-color: #ff4444;");
                                //Disables the set dates from the DatePicker.
                                setDisable(true);
                            } else if (Month.from(item).equals(Month.of(4))) {
                                //Choosing the date needed to be disabled.
                                Month.from(item).equals(Month.of(4));
                                //Creates a short message when hovering over disabled dates.
                                setTooltip(new Tooltip("Route does not operate during these dates."));
                                //Sets colour of disabled dates to red.
                                setStyle("-fx-background-color: #ff4444;");
                                //Disables the set dates from the DatePicker.
                                setDisable(true);
                            } else {
                                setDisable(false);
                            }
                        }

                        //If Stanstead and St Brieuc are chosen, the months of March and April are disabled.
                        if (comboBoxFrom.getValue() == "Stansted (STN)" && comboBoxTo.getValue() == "Paris (CDG)" || comboBoxFrom.getValue() == "Paris (CDG)" && comboBoxTo.getValue() == "Stansted (STN)") {
                            if (Month.from(item).equals(Month.of(4))) {
                                //Choosing the date needed to be disabled.
                                Month.from(item).equals(Month.of(4));
                                //Creates a short message when hovering over disabled dates.
                                setTooltip(new Tooltip("Route does not operate during these dates."));
                                //Sets colour of disabled dates to red.
                                setStyle("-fx-background-color: #ff4444;");
                                //Disables the set dates from the DatePicker.
                                setDisable(true);
                            } else {
                                //If other destinations are chosen in the combo boxes, then do not disable anything.
                                setDisable(false);
                            }
                        }
                    }
                };
            }
        };
        //Sets the cellFactory so that the DatePicker knows to disable chosen dates.
        datePickerOutgoing.setDayCellFactory(dayCellFactory);
        datePickerReturn.setDayCellFactory(dayCellFactory);
        expiry.setDayCellFactory(dayCellFactory);


        Text totalText = new Text("Running Total: ");
        totalText.setFont(Font.font("Verdana", 18));
        totalText.setLayoutX(750);
        totalText.setLayoutY(820);

        Text detailsTitle = new Text("Please Enter Passenger Details Below");
        detailsTitle.setFont(Font.font("Verdana", 40));
        detailsTitle.setLayoutX(200);
        detailsTitle.setLayoutY(100);

        //Passenger One Details View
        Text passenger1 = new Text();
        passenger1.setText("Passenger 1: ");
        passenger1.setFont(Font.font("Verdana", 25));
        passenger1.setLayoutX(10);
        passenger1.setLayoutY(150);

        Text fName1 = new Text();
        fName1.setText("First Name:");
        fName1.setLayoutX(10);
        fName1.setLayoutY(180);

        TextField passenger1fName = new TextField();
        passenger1fName.setLayoutX(75);
        passenger1fName.setLayoutY(165);

        Text sName1 = new Text();
        sName1.setText("Surname:");
        sName1.setLayoutX(230);
        sName1.setLayoutY(180);

        TextField passenger1sName = new TextField();
        passenger1sName.setLayoutX(285);
        passenger1sName.setLayoutY(165);

        Text dob1 = new Text();
        dob1.setText("DOB:");
        dob1.setLayoutX(440);
        dob1.setLayoutY(180);

        DatePicker passenger1DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger1DOB.setLayoutX(470);
        passenger1DOB.setLayoutY(165);
        passenger1DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger1DOB.setOnAction(event -> {
            LocalDate date = passenger1DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger1SC = new Text();
        passenger1SC.setText("Spanish Citizen: ");
        passenger1SC.setLayoutX(590);
        passenger1SC.setLayoutY(180);

        final ToggleGroup rbpassenger1 = new ToggleGroup();
        p1Yes.setToggleGroup(rbpassenger1);
        p1Yes.setLayoutX(680);
        p1Yes.setLayoutY(165);

        RadioButton p1No = new RadioButton("No");
        p1No.setToggleGroup(rbpassenger1);
        p1No.setLayoutX(730);
        p1No.setLayoutY(165);
        p1No.setSelected(true);

        Text p1DNIText = new Text();
        p1DNIText.setText("DNI:");
        p1DNIText.setLayoutX(780);
        p1DNIText.setLayoutY(180);

        TextField p1DNI = new TextField();
        p1DNI.setLayoutX(810);
        p1DNI.setLayoutY(165);
        p1DNI.setDisable(true);

        rbpassenger1.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p1No.isSelected() == true) {
                        p1DNI.setDisable(true);
                    }
                    else {
                        p1DNI.setDisable(false);
                    }
        });

        Text p1checkedBag = new Text();
        p1checkedBag.setText("Checked Bag?");
        p1checkedBag.setLayoutX(965);
        p1checkedBag.setLayoutY(180);

        ComboBox p1CheckedBags = new ComboBox();
        p1CheckedBags.getItems().addAll("Yes", "No");
        p1CheckedBags.setLayoutX(1040);
        p1CheckedBags.setLayoutY(165);
        p1CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Two Details View
        Text passenger2 = new Text();
        passenger2.setText("Passenger 2: ");
        passenger2.setFont(Font.font("Verdana", 25));
        passenger2.setLayoutX(10);
        passenger2.setLayoutY(230);

        Text fName2 = new Text();
        fName2.setText("First Name:");
        fName2.setLayoutX(10);
        fName2.setLayoutY(260);

        TextField passenger2fName = new TextField();
        passenger2fName.setLayoutX(75);
        passenger2fName.setLayoutY(245);

        Text sName2 = new Text();
        sName2.setText("Surname:");
        sName2.setLayoutX(230);
        sName2.setLayoutY(260);

        TextField passenger2sName = new TextField();
        passenger2sName.setLayoutX(285);
        passenger2sName.setLayoutY(245);

        Text dob2 = new Text();
        dob2.setText("DOB:");
        dob2.setLayoutX(440);
        dob2.setLayoutY(260);

        DatePicker passenger2DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger2DOB.setLayoutX(470);
        passenger2DOB.setLayoutY(245);
        passenger2DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger2DOB.setOnAction(event -> {
            LocalDate date = passenger2DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger2SC = new Text();
        passenger2SC.setText("Spanish Citizen: ");
        passenger2SC.setLayoutX(590);
        passenger2SC.setLayoutY(260);

        final ToggleGroup rbpassenger2 = new ToggleGroup();
        p2Yes.setToggleGroup(rbpassenger2);
        p2Yes.setLayoutX(680);
        p2Yes.setLayoutY(245);

        RadioButton p2No = new RadioButton("No");
        p2No.setToggleGroup(rbpassenger2);
        p2No.setLayoutX(730);
        p2No.setLayoutY(245);
        p2No.setSelected(true);

        Text p2DNIText = new Text();
        p2DNIText.setText("DNI:");
        p2DNIText.setLayoutX(780);
        p2DNIText.setLayoutY(260);

        TextField p2DNI = new TextField();
        p2DNI.setLayoutX(810);
        p2DNI.setLayoutY(245);
        p2DNI.setDisable(true);

        rbpassenger2.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p2No.isSelected() == true) {
                        p2DNI.setDisable(true);
                    }
                    else {
                        p2DNI.setDisable(false);
                    }
                });

        Text p2checkedBag = new Text();
        p2checkedBag.setText("Checked Bag?");
        p2checkedBag.setLayoutX(965);
        p2checkedBag.setLayoutY(260);

        ComboBox p2CheckedBags = new ComboBox();
        p2CheckedBags.getItems().addAll("Yes", "No");
        p2CheckedBags.setLayoutX(1040);
        p2CheckedBags.setLayoutY(245);
        p2CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Two Details View
        Text passenger3 = new Text();
        passenger3.setText("Passenger 3: ");
        passenger3.setFont(Font.font("Verdana", 25));
        passenger3.setLayoutX(10);
        passenger3.setLayoutY(310);

        Text fName3 = new Text();
        fName3.setText("First Name:");
        fName3.setLayoutX(10);
        fName3.setLayoutY(340);

        TextField passenger3fName = new TextField();
        passenger3fName.setLayoutX(75);
        passenger3fName.setLayoutY(325);

        Text sName3 = new Text();
        sName3.setText("Surname:");
        sName3.setLayoutX(230);
        sName3.setLayoutY(340);

        TextField passenger3sName = new TextField();
        passenger3sName.setLayoutX(285);
        passenger3sName.setLayoutY(325);

        Text dob3 = new Text();
        dob3.setText("DOB:");
        dob3.setLayoutX(440);
        dob3.setLayoutY(340);

        DatePicker passenger3DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger3DOB.setLayoutX(470);
        passenger3DOB.setLayoutY(325);
        passenger3DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger3DOB.setOnAction(event -> {
            LocalDate date = passenger3DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger3SC = new Text();
        passenger3SC.setText("Spanish Citizen: ");
        passenger3SC.setLayoutX(590);
        passenger3SC.setLayoutY(340);

        final ToggleGroup rbpassenger3 = new ToggleGroup();
        p3Yes.setToggleGroup(rbpassenger3);
        p3Yes.setLayoutX(680);
        p3Yes.setLayoutY(325);

        RadioButton p3No = new RadioButton("No");
        p3No.setToggleGroup(rbpassenger3);
        p3No.setLayoutX(730);
        p3No.setLayoutY(325);
        p3No.setSelected(true);

        Text p3DNIText = new Text();
        p3DNIText.setText("DNI:");
        p3DNIText.setLayoutX(780);
        p3DNIText.setLayoutY(340);

        TextField p3DNI = new TextField();
        p3DNI.setLayoutX(810);
        p3DNI.setLayoutY(325);
        p3DNI.setDisable(true);

        rbpassenger3.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p3No.isSelected() == true) {
                        p3DNI.setDisable(true);
                    }
                    else {
                        p3DNI.setDisable(false);
                    }
                });

        Text p3checkedBag = new Text();
        p3checkedBag.setText("Checked Bag?");
        p3checkedBag.setLayoutX(965);
        p3checkedBag.setLayoutY(340);

        ComboBox p3CheckedBags = new ComboBox();
        p3CheckedBags.getItems().addAll("Yes", "No");
        p3CheckedBags.setLayoutX(1040);
        p3CheckedBags.setLayoutY(325);
        p3CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Two Details View
        Text passenger4 = new Text();
        passenger4.setText("Passenger 4: ");
        passenger4.setFont(Font.font("Verdana", 25));
        passenger4.setLayoutX(10);
        passenger4.setLayoutY(390);

        Text fName4 = new Text();
        fName4.setText("First Name:");
        fName4.setLayoutX(10);
        fName4.setLayoutY(420);

        TextField passenger4fName = new TextField();
        passenger4fName.setLayoutX(75);
        passenger4fName.setLayoutY(405);

        Text sName4 = new Text();
        sName4.setText("Surname:");
        sName4.setLayoutX(230);
        sName4.setLayoutY(420);

        TextField passenger4sName = new TextField();
        passenger4sName.setLayoutX(285);
        passenger4sName.setLayoutY(405);

        Text dob4 = new Text();
        dob4.setText("DOB:");
        dob4.setLayoutX(440);
        dob4.setLayoutY(420);

        DatePicker passenger4DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger4DOB.setLayoutX(470);
        passenger4DOB.setLayoutY(405);
        passenger4DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger4DOB.setOnAction(event -> {
            LocalDate date = passenger4DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger4SC = new Text();
        passenger4SC.setText("Spanish Citizen: ");
        passenger4SC.setLayoutX(590);
        passenger4SC.setLayoutY(420);

        final ToggleGroup rbpassenger4 = new ToggleGroup();
        p4Yes.setToggleGroup(rbpassenger4);
        p4Yes.setLayoutX(680);
        p4Yes.setLayoutY(405);

        RadioButton p4No = new RadioButton("No");
        p4No.setToggleGroup(rbpassenger4);
        p4No.setLayoutX(730);
        p4No.setLayoutY(405);
        p4No.setSelected(true);

        Text p4DNIText = new Text();
        p4DNIText.setText("DNI:");
        p4DNIText.setLayoutX(780);
        p4DNIText.setLayoutY(420);

        TextField p4DNI = new TextField();
        p4DNI.setLayoutX(810);
        p4DNI.setLayoutY(405);
        p4DNI.setDisable(true);

        rbpassenger4.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p4No.isSelected() == true) {
                        p4DNI.setDisable(true);
                    }
                    else {
                        p4DNI.setDisable(false);
                    }
                });

        Text p4checkedBag = new Text();
        p4checkedBag.setText("Checked Bag?");
        p4checkedBag.setLayoutX(965);
        p4checkedBag.setLayoutY(420);

        ComboBox p4CheckedBags = new ComboBox();
        p4CheckedBags.getItems().addAll("Yes", "No");
        p4CheckedBags.setLayoutX(1040);
        p4CheckedBags.setLayoutY(405);
        p4CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Five Details View
        Text passenger5 = new Text();
        passenger5.setText("Passenger 5: ");
        passenger5.setFont(Font.font("Verdana", 25));
        passenger5.setLayoutX(10);
        passenger5.setLayoutY(470);

        Text fName5 = new Text();
        fName5.setText("First Name:");
        fName5.setLayoutX(10);
        fName5.setLayoutY(500);

        TextField passenger5fName = new TextField();
        passenger5fName.setLayoutX(75);
        passenger5fName.setLayoutY(485);

        Text sName5 = new Text();
        sName5.setText("Surname:");
        sName5.setLayoutX(230);
        sName5.setLayoutY(500);

        TextField passenger5sName = new TextField();
        passenger5sName.setLayoutX(285);
        passenger5sName.setLayoutY(485);

        Text dob5 = new Text();
        dob5.setText("DOB:");
        dob5.setLayoutX(440);
        dob5.setLayoutY(500);

        DatePicker passenger5DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger5DOB.setLayoutX(470);
        passenger5DOB.setLayoutY(485);
        passenger5DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger5DOB.setOnAction(event -> {
            LocalDate date = passenger5DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger5SC = new Text();
        passenger5SC.setText("Spanish Citizen: ");
        passenger5SC.setLayoutX(590);
        passenger5SC.setLayoutY(500);

        final ToggleGroup rbpassenger5 = new ToggleGroup();
        p5Yes.setToggleGroup(rbpassenger5);
        p5Yes.setLayoutX(680);
        p5Yes.setLayoutY(485);

        RadioButton p5No = new RadioButton("No");
        p5No.setToggleGroup(rbpassenger5);
        p5No.setLayoutX(730);
        p5No.setLayoutY(485);
        p5No.setSelected(true);

        Text p5DNIText = new Text();
        p5DNIText.setText("DNI:");
        p5DNIText.setLayoutX(780);
        p5DNIText.setLayoutY(500);

        TextField p5DNI = new TextField();
        p5DNI.setLayoutX(810);
        p5DNI.setLayoutY(485);
        p5DNI.setDisable(true);

        rbpassenger5.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p5No.isSelected() == true) {
                        p5DNI.setDisable(true);
                    }
                    else {
                        p5DNI.setDisable(false);
                    }
                });

        Text p5checkedBag = new Text();
        p5checkedBag.setText("Checked Bag?");
        p5checkedBag.setLayoutX(965);
        p5checkedBag.setLayoutY(500);

        ComboBox p5CheckedBags = new ComboBox();
        p5CheckedBags.getItems().addAll("Yes", "No");
        p5CheckedBags.setLayoutX(1040);
        p5CheckedBags.setLayoutY(485);
        p5CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Two Details View
        Text passenger6 = new Text();
        passenger6.setText("Passenger 6: ");
        passenger6.setFont(Font.font("Verdana", 26));
        passenger6.setLayoutX(10);
        passenger6.setLayoutY(550);

        Text fName6 = new Text();
        fName6.setText("First Name:");
        fName6.setLayoutX(10);
        fName6.setLayoutY(580);

        TextField passenger6fName = new TextField();
        passenger6fName.setLayoutX(76);
        passenger6fName.setLayoutY(565);

        Text sName6 = new Text();
        sName6.setText("Surname:");
        sName6.setLayoutX(230);
        sName6.setLayoutY(580);

        TextField passenger6sName = new TextField();
        passenger6sName.setLayoutX(286);
        passenger6sName.setLayoutY(565);

        Text dob6 = new Text();
        dob6.setText("DOB:");
        dob6.setLayoutX(440);
        dob6.setLayoutY(580);

        DatePicker passenger6DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger6DOB.setLayoutX(470);
        passenger6DOB.setLayoutY(565);
        passenger6DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger6DOB.setOnAction(event -> {
            LocalDate date = passenger6DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger6SC = new Text();
        passenger6SC.setText("Spanish Citizen: ");
        passenger6SC.setLayoutX(590);
        passenger6SC.setLayoutY(580);

        final ToggleGroup rbpassenger6 = new ToggleGroup();
        p6Yes.setToggleGroup(rbpassenger6);
        p6Yes.setLayoutX(680);
        p6Yes.setLayoutY(565);

        RadioButton p6No = new RadioButton("No");
        p6No.setToggleGroup(rbpassenger6);
        p6No.setLayoutX(730);
        p6No.setLayoutY(565);
        p6No.setSelected(true);

        Text p6DNIText = new Text();
        p6DNIText.setText("DNI:");
        p6DNIText.setLayoutX(780);
        p6DNIText.setLayoutY(580);

        TextField p6DNI = new TextField();
        p6DNI.setLayoutX(810);
        p6DNI.setLayoutY(565);
        p6DNI.setDisable(true);

        rbpassenger6.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p6No.isSelected() == true) {
                        p6DNI.setDisable(true);
                    }
                    else {
                        p6DNI.setDisable(false);
                    }
                });

        Text p6checkedBag = new Text();
        p6checkedBag.setText("Checked Bag?");
        p6checkedBag.setLayoutX(966);
        p6checkedBag.setLayoutY(580);

        ComboBox p6CheckedBags = new ComboBox();
        p6CheckedBags.getItems().addAll("Yes", "No");
        p6CheckedBags.setLayoutX(1040);
        p6CheckedBags.setLayoutY(565);
        p6CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Two Details View
        Text passenger7 = new Text();
        passenger7.setText("Passenger 7: ");
        passenger7.setFont(Font.font("Verdana", 27));
        passenger7.setLayoutX(10);
        passenger7.setLayoutY(630);

        Text fName7 = new Text();
        fName7.setText("First Name:");
        fName7.setLayoutX(10);
        fName7.setLayoutY(660);

        TextField passenger7fName = new TextField();
        passenger7fName.setLayoutX(76);
        passenger7fName.setLayoutY(645);

        Text sName7 = new Text();
        sName7.setText("Surname:");
        sName7.setLayoutX(230);
        sName7.setLayoutY(660);

        TextField passenger7sName = new TextField();
        passenger7sName.setLayoutX(286);
        passenger7sName.setLayoutY(645);

        Text dob7 = new Text();
        dob7.setText("DOB:");
        dob7.setLayoutX(440);
        dob7.setLayoutY(660);

        DatePicker passenger7DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger7DOB.setLayoutX(470);
        passenger7DOB.setLayoutY(645);
        passenger7DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger7DOB.setOnAction(event -> {
            LocalDate date = passenger7DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger7SC = new Text();
        passenger7SC.setText("Spanish Citizen: ");
        passenger7SC.setLayoutX(590);
        passenger7SC.setLayoutY(660);

        final ToggleGroup rbpassenger7 = new ToggleGroup();
        p7Yes.setToggleGroup(rbpassenger7);
        p7Yes.setLayoutX(680);
        p7Yes.setLayoutY(645);

        RadioButton p7No = new RadioButton("No");
        p7No.setToggleGroup(rbpassenger7);
        p7No.setLayoutX(730);
        p7No.setLayoutY(645);
        p7No.setSelected(true);

        Text p7DNIText = new Text();
        p7DNIText.setText("DNI:");
        p7DNIText.setLayoutX(780);
        p7DNIText.setLayoutY(660);

        TextField p7DNI = new TextField();
        p7DNI.setLayoutX(810);
        p7DNI.setLayoutY(645);
        p7DNI.setDisable(true);

        rbpassenger7.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p7No.isSelected() == true) {
                        p7DNI.setDisable(true);
                    }
                    else {
                        p7DNI.setDisable(false);
                    }
                });

        Text p7checkedBag = new Text();
        p7checkedBag.setText("Checked Bag?");
        p7checkedBag.setLayoutX(966);
        p7checkedBag.setLayoutY(660);

        ComboBox p7CheckedBags = new ComboBox();
        p7CheckedBags.getItems().addAll("Yes", "No");
        p7CheckedBags.setLayoutX(1040);
        p7CheckedBags.setLayoutY(645);
        p7CheckedBags.setPrefWidth(40);
        //////////

        //Passenger Two Details View
        Text passenger8 = new Text();
        passenger8.setText("Passenger 8: ");
        passenger8.setFont(Font.font("Verdana", 28));
        passenger8.setLayoutX(10);
        passenger8.setLayoutY(710);

        Text fName8 = new Text();
        fName8.setText("First Name:");
        fName8.setLayoutX(10);
        fName8.setLayoutY(740);

        TextField passenger8fName = new TextField();
        passenger8fName.setLayoutX(76);
        passenger8fName.setLayoutY(725);

        Text sName8 = new Text();
        sName8.setText("Surname:");
        sName8.setLayoutX(230);
        sName8.setLayoutY(740);

        TextField passenger8sName = new TextField();
        passenger8sName.setLayoutX(286);
        passenger8sName.setLayoutY(725);

        Text dob8 = new Text();
        dob8.setText("DOB:");
        dob8.setLayoutX(440);
        dob8.setLayoutY(740);

        DatePicker passenger8DOB = new DatePicker();
        //Sets the DatePickers X & Y coords and width.
        passenger8DOB.setLayoutX(470);
        passenger8DOB.setLayoutY(725);
        passenger8DOB.setPrefWidth(110);
        //Gets the value that is selected by the user.
        passenger8DOB.setOnAction(event -> {
            LocalDate date = passenger8DOB.getValue();
            System.out.println("Selected date: " + date);
        });

        Text passenger8SC = new Text();
        passenger8SC.setText("Spanish Citizen: ");
        passenger8SC.setLayoutX(590);
        passenger8SC.setLayoutY(740);

        final ToggleGroup rbpassenger8 = new ToggleGroup();
        p8Yes.setToggleGroup(rbpassenger8);
        p8Yes.setLayoutX(680);
        p8Yes.setLayoutY(725);

        RadioButton p8No = new RadioButton("No");
        p8No.setToggleGroup(rbpassenger8);
        p8No.setLayoutX(730);
        p8No.setLayoutY(725);
        p8No.setSelected(true);

        Text p8DNIText = new Text();
        p8DNIText.setText("DNI:");
        p8DNIText.setLayoutX(780);
        p8DNIText.setLayoutY(740);

        TextField p8DNI = new TextField();
        p8DNI.setLayoutX(810);
        p8DNI.setLayoutY(725);
        p8DNI.setDisable(true);

        rbpassenger8.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                    if(p8No.isSelected() == true) {
                        p8DNI.setDisable(true);
                    }
                    else {
                        p8DNI.setDisable(false);
                    }
                });

        Text p8checkedBag = new Text();
        p8checkedBag.setText("Checked Bag?");
        p8checkedBag.setLayoutX(966);
        p8checkedBag.setLayoutY(740);

        ComboBox p8CheckedBags = new ComboBox();
        p8CheckedBags.getItems().addAll("Yes", "No");
        p8CheckedBags.setLayoutX(1040);
        p8CheckedBags.setLayoutY(725);
        p8CheckedBags.setPrefWidth(40);
        //////////

        //All of the objects for the payments window/payment details stage.
        Text paymentsTitle = new Text("Please Enter Payment Info Below");
        paymentsTitle.setFont(Font.font("Verdana", 40));
        paymentsTitle.setLayoutX(200);
        paymentsTitle.setLayoutY(100);

        Text amountText = new Text("Total Amount: ");
        amountText.setFont(Font.font("Verdana", 15));
        amountText.setLayoutX(370);
        amountText.setLayoutY(150);

        Text amount = new Text("");
        amount.setFont(Font.font("Verdana", 15));
        amount.setLayoutX(480);
        amount.setLayoutY(150);

        Text namePay = new Text("Cardholders Name:");
        namePay.setFont(Font.font("Verdana", 15));
        namePay.setLayoutX(370);
        namePay.setLayoutY(180);

        TextField cardName = new TextField();
        cardName.setFont(Font.font("Verdana", 15));
        cardName.setLayoutX(520);
        cardName.setLayoutY(160);

        Text cardNum = new Text("Credit Card Number:");
        cardNum.setFont(Font.font("Verdana", 15));
        cardNum.setLayoutX(370);
        cardNum.setLayoutY(215);

        TextField cardNumber = new TextField();
        cardNumber.setFont(Font.font("Verdana", 15));
        cardNumber.setPrefWidth(185);
        cardNumber.setLayoutX(530);
        cardNumber.setLayoutY(195);

        Text expiryDate = new Text("Expiry Date(DD/MM/YYYY):");
        expiryDate.setFont(Font.font("Verdana", 15));
        expiryDate.setLayoutX(370);
        expiryDate.setLayoutY(245);

        expiry.setPrefWidth(135);
        expiry.setLayoutX(580);
        expiry.setLayoutY(228);

        Text billing1 = new Text("Billing Address:");
        billing1.setFont(Font.font("Verdana", 15));
        billing1.setLayoutX(370);
        billing1.setLayoutY(285);

        TextField billingA1 = new TextField();
        billingA1.setFont(Font.font("Verdana", 15));
        billingA1.setPrefWidth(225);
        billingA1.setLayoutX(490);
        billingA1.setLayoutY(265);


        Text city = new Text("City:");
        city.setFont(Font.font("Verdana", 15));
        city.setLayoutX(370);
        city.setLayoutY(325);

        TextField cityLoc = new TextField();
        cityLoc.setFont(Font.font("Verdana", 15));
        cityLoc.setPrefWidth(305);
        cityLoc.setLayoutX(410);
        cityLoc.setLayoutY(305);

        Text state = new Text("State/Provence:");
        state.setFont(Font.font("Verdana", 15));
        state.setLayoutX(370);
        state.setLayoutY(365);

        TextField stateLoc = new TextField();
        stateLoc.setFont(Font.font("Verdana", 15));
        stateLoc.setPrefWidth(220);
        stateLoc.setLayoutX(495);
        stateLoc.setLayoutY(345);

        Text email = new Text("Email:");
        email.setFont(Font.font("Verdana", 15));
        email.setLayoutX(370);
        email.setLayoutY(405);

        TextField email1 = new TextField();
        email1.setFont(Font.font("Verdana", 15));
        email1.setPrefWidth(295);
        email1.setLayoutX(420);
        email1.setLayoutY(385);

        Text phoneNum = new Text("Phone Number:");
        phoneNum.setFont(Font.font("Verdana", 15));
        phoneNum.setLayoutX(370);
        phoneNum.setLayoutY(445);

        TextField phoneNum1 = new TextField();
        phoneNum1.setFont(Font.font("Verdana", 15));
        phoneNum1.setPrefWidth(225);
        phoneNum1.setLayoutX(490);
        phoneNum1.setLayoutY(425);

        Button paymentNext = new Button();
        paymentNext.setText("Pay Now");
        paymentNext.setFont(Font.font("Verdana", 15));
        paymentNext.setPrefHeight(25);
        paymentNext.setPrefWidth(100);
        paymentNext.setLayoutX(430);
        paymentNext.setLayoutY(515);
        paymentNext.setDisable(true);

        Button verifyCard = new Button();
        verifyCard.setText("Verify Card");
        verifyCard.setFont(Font.font("Verdana", 15));
        verifyCard.setPrefHeight(25);
        verifyCard.setPrefWidth(210);
        verifyCard.setLayoutX(430);
        verifyCard.setLayoutY(470);

        Label lblResult = new Label("CREDIT CARD NUMBER INVALID!");
        lblResult.setLayoutX(725);
        lblResult.setLayoutY(200);
        lblResult.setVisible(false);

        verifyCard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (cardNumber != null) {
                    if (lblResult.getText().equals("CREDIT CARD NUMBER INVALID!") || lblResult.getText().equals("Invalid Input! Make Sure To Type Digits Only.")) {
                        CardChecker cc = new CardChecker(cardNumber.getText());
                        lblResult.setText(cc.numberCheck());
                        cardNum.setFill(Color.RED);
                        cardNumber.setStyle("-fx-background-color: #ff4444;");
                        lblResult.setVisible(true);
                        lblResult.setTextFill(Color.RED);
                    }
                    if (lblResult.getText().equals("CREDIT CARD NUMBER VALID!")) {
                        paymentNext.setDisable(false);
                        cardNumber.setDisable(true);
                        cardNum.setFill(Color.BLACK);
                        lblResult.setVisible(true);
                        lblResult.setTextFill(Color.GREEN);
                    }
                }
            }
        });

        paymentNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cardName.getText() == null) {
                    namePay.setFill(Color.RED);
                }
                else if(cardNumber.getText() == null) {
                    cardNum.setFill(Color.RED);
                }
                else if(expiry.getValue() == null) {
                    expiryDate.setFill(Color.RED);
                }
                else if(billingA1.getText() == null) {
                    billing1.setFill(Color.RED);
                }
                else if(cityLoc.getText() == null) {
                    city.setFill(Color.RED);
                }
                else if(stateLoc.getText() == null) {
                    state.setFill(Color.RED);
                }
                else if(email1.getText() == null) {
                    email.setFill(Color.RED);
                }
                else if(phoneNum1.getText() == null) {
                    phoneNum.setFill(Color.RED);
                }
                else {
                    payementView.hide();
                    finalDetails.show();
                }
                //Passenger One Details View for Final Page
                dpassenger1.setText("Passenger 1: ");
                dpassenger1.setFont(Font.font("Verdana", 25));
                dpassenger1.setLayoutX(10);
                dpassenger1.setLayoutY(150);

                //Creates a Text Object and adds the contents of passenger1fName to it.
                dfname1.setText("First Name: " + passenger1fName.getText());
                dfname1.setLayoutX(10);
                dfname1.setLayoutY(165);

                //Creates a Text Object and adds the contents of passenger1sName to it.
                dsName1.setText("Surname: " + passenger1sName.getText());
                dsName1.setLayoutX(140);
                dsName1.setLayoutY(165);

                //Creates a Text Object and adds the contents of passenger1DOB to it.
                ddob1.setText("DOB: " + passenger1DOB.getValue());
                ddob1.setLayoutX(285);
                ddob1.setLayoutY(165);

                //If no is selected on the details page, it will display no on the last page.
                if(p1No.isSelected() == true) {
                    dpassenger1SC.setText("Spanish Citizen: " + "No");
                    dpassenger1SC.setLayoutX(470);
                    dpassenger1SC.setLayoutY(165);
                }
                //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                else {
                    dpassenger1SC.setText("Spanish Citizen: " + "Yes - DNI:" + p1DNI.getText());
                    dpassenger1SC.setLayoutX(470);
                    dpassenger1SC.setLayoutY(165);
                }

                //Creates a Text Object and adds the contents of p1CheckedBags to it.
                dp1checkedBag.setText("Checked Bag? " + p1CheckedBags.getValue());
                dp1checkedBag.setLayoutX(965);
                dp1checkedBag.setLayoutY(180);

                if(passenger2fName.getText().equals("")) {
                    dpassenger2.setVisible(false);
                    dfname2.setVisible(false);
                    dsName2.setVisible(false);
                    ddob2.setVisible(false);
                    dpassenger2SC.setVisible(false);
                    dp2checkedBag.setVisible(false);
                }
                if(passenger2fName.getText() != null) {
                    //Passenger Two Details View for Final Page
                    dpassenger2.setText("Passenger 2: ");
                    dpassenger2.setFont(Font.font("Verdana", 25));
                    dpassenger2.setLayoutX(10);
                    dpassenger2.setLayoutY(200);

                    //Creates a Text Object and adds the contents of passenger2fName to it.
                    dfname2.setText("First Name: " + passenger2fName.getText());
                    dfname2.setLayoutX(10);
                    dfname2.setLayoutY(215);

                    //Creates a Text Object and adds the contents of passenger2sName to it.
                    dsName2.setText("Surname: " + passenger2sName.getText());
                    dsName2.setLayoutX(140);
                    dsName2.setLayoutY(215);

                    //Creates a Text Object and adds the contents of passenger2DOB to it.
                    ddob2.setText("DOB: " + passenger2DOB.getValue());
                    ddob2.setLayoutX(285);
                    ddob2.setLayoutY(215);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p2No.isSelected() == true) {
                        dpassenger2SC.setText("Spanish Citizen: " + "No");
                        dpassenger2SC.setLayoutX(470);
                        dpassenger2SC.setLayoutY(215);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger2SC.setText("Spanish Citizen: " + "Yes - DNI:" + p2DNI.getText());
                        dpassenger2SC.setLayoutX(470);
                        dpassenger2SC.setLayoutY(215);
                    }

                    //Creates a Text Object and adds the contents of p2CheckedBags to it.
                    dp2checkedBag.setText("Checked Bag? " + p2CheckedBags.getValue());
                    dp2checkedBag.setLayoutX(965);
                    dp2checkedBag.setLayoutY(215);
                }

                if(passenger3fName.getText().equals("")) {
                    dpassenger3.setVisible(false);
                    dfname3.setVisible(false);
                    dsName3.setVisible(false);
                    ddob3.setVisible(false);
                    dpassenger3SC.setVisible(false);
                    dp3checkedBag.setVisible(false);
                }
                if(passenger3fName.getText() != null) {
                    //Passenger Three Details View for Final Page
                    dpassenger3.setText("Passenger 3: ");
                    dpassenger3.setFont(Font.font("Verdana", 25));
                    dpassenger3.setLayoutX(10);
                    dpassenger3.setLayoutY(250);

                    //Creates a Text Object and adds the contents of passenger3fName to it.
                    dfname3.setText("First Name: " + passenger3fName.getText());
                    dfname3.setLayoutX(10);
                    dfname3.setLayoutY(265);

                    //Creates a Text Object and adds the contents of passenger3sName to it.
                    dsName3.setText("Surname: " + passenger3sName.getText());
                    dsName3.setLayoutX(140);
                    dsName3.setLayoutY(265);

                    //Creates a Text Object and adds the contents of passenger3DOB to it.
                    ddob3.setText("DOB: " + passenger3DOB.getValue());
                    ddob3.setLayoutX(285);
                    ddob3.setLayoutY(265);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p3No.isSelected() == true) {
                        dpassenger3SC.setText("Spanish Citizen: " + "No");
                        dpassenger3SC.setLayoutX(470);
                        dpassenger3SC.setLayoutY(265);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger3SC.setText("Spanish Citizen: " + "Yes - DNI:" + p3DNI.getText());
                        dpassenger3SC.setLayoutX(470);
                        dpassenger3SC.setLayoutY(265);
                    }

                    //Creates a Text Object and adds the contents of p3CheckedBags to it.
                    dp3checkedBag.setText("Checked Bag? " + p3CheckedBags.getValue());
                    dp3checkedBag.setLayoutX(965);
                    dp3checkedBag.setLayoutY(265);
                }

                if(passenger4fName.getText().equals("")) {
                    dpassenger4.setVisible(false);
                    dfname4.setVisible(false);
                    dsName4.setVisible(false);
                    ddob4.setVisible(false);
                    dpassenger4SC.setVisible(false);
                    dp4checkedBag.setVisible(false);
                }
                if(passenger4fName.getText() != null) {
                    //Passenger Four Details View for Final Page
                    dpassenger4.setText("Passenger 4: ");
                    dpassenger4.setFont(Font.font("Verdana", 25));
                    dpassenger4.setLayoutX(10);
                    dpassenger4.setLayoutY(300);

                    //Creates a Text Object and adds the contents of passenger4fName to it.
                    dfname4.setText("First Name: " + passenger4fName.getText());
                    dfname4.setLayoutX(10);
                    dfname4.setLayoutY(315);

                    //Creates a Text Object and adds the contents of passenger4sName to it.
                    dsName4.setText("Surname: " + passenger4sName.getText());
                    dsName4.setLayoutX(140);
                    dsName4.setLayoutY(315);

                    //Creates a Text Object and adds the contents of passenger4DOB to it.
                    ddob4.setText("DOB: " + passenger4DOB.getValue());
                    ddob4.setLayoutX(285);
                    ddob4.setLayoutY(315);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p4No.isSelected() == true) {
                        dpassenger4SC.setText("Spanish Citizen: " + "No");
                        dpassenger4SC.setLayoutX(470);
                        dpassenger4SC.setLayoutY(315);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger4SC.setText("Spanish Citizen: " + "Yes - DNI:" + p4DNI.getText());
                        dpassenger4SC.setLayoutX(470);
                        dpassenger4SC.setLayoutY(315);
                    }

                    //Creates a Text Object and adds the contents of p4CheckedBags to it.
                    dp4checkedBag.setText("Checked Bag? " + p4CheckedBags.getValue());
                    dp4checkedBag.setLayoutX(965);
                    dp4checkedBag.setLayoutY(315);
                }
                if(passenger5fName.getText().equals("")) {
                    dpassenger5.setVisible(false);
                    dfname5.setVisible(false);
                    dsName5.setVisible(false);
                    ddob5.setVisible(false);
                    dpassenger5SC.setVisible(false);
                    dp5checkedBag.setVisible(false);
                }
                if(passenger5fName.getText() != null) {
                    //Passenger Five Details View for Final Page
                    dpassenger5.setText("Passenger 5: ");
                    dpassenger5.setFont(Font.font("Verdana", 25));
                    dpassenger5.setLayoutX(10);
                    dpassenger5.setLayoutY(350);

                    //Creates a Text Object and adds the contents of passenger5fName to it.
                    dfname5.setText("First Name: " + passenger5fName.getText());
                    dfname5.setLayoutX(10);
                    dfname5.setLayoutY(365);

                    //Creates a Text Object and adds the contents of passenger5sName to it.
                    dsName5.setText("Surname: " + passenger5sName.getText());
                    dsName5.setLayoutX(140);
                    dsName5.setLayoutY(365);

                    //Creates a Text Object and adds the contents of passenger5DOB to it.
                    ddob5.setText("DOB: " + passenger5DOB.getValue());
                    ddob5.setLayoutX(285);
                    ddob5.setLayoutY(365);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p5No.isSelected() == true) {
                        dpassenger5SC.setText("Spanish Citizen: " + "No");
                        dpassenger5SC.setLayoutX(470);
                        dpassenger5SC.setLayoutY(365);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger5SC.setText("Spanish Citizen: " + "Yes - DNI:" + p5DNI.getText());
                        dpassenger5SC.setLayoutX(470);
                        dpassenger5SC.setLayoutY(365);
                    }

                    //Creates a Text Object and adds the contents of p5CheckedBags to it.
                    dp5checkedBag.setText("Checked Bag? " + p5CheckedBags.getValue());
                    dp5checkedBag.setLayoutX(965);
                    dp5checkedBag.setLayoutY(365);
                }

                if(passenger6fName.getText().equals("")) {
                    dpassenger6.setVisible(false);
                    dfname6.setVisible(false);
                    dsName6.setVisible(false);
                    ddob6.setVisible(false);
                    dpassenger6SC.setVisible(false);
                    dp6checkedBag.setVisible(false);
                }
                if(passenger6fName.getText() != null) {
                    //Passenger Six Details View for Final Page
                    dpassenger6.setText("Passenger 6: ");
                    dpassenger6.setFont(Font.font("Verdana", 25));
                    dpassenger6.setLayoutX(10);
                    dpassenger6.setLayoutY(400);

                    //Creates a Text Object and adds the contents of passenger6fName to it.
                    dfname6.setText("First Name: " + passenger6fName.getText());
                    dfname6.setLayoutX(10);
                    dfname6.setLayoutY(415);

                    //Creates a Text Object and adds the contents of passenger6sName to it.
                    dsName6.setText("Surname: " + passenger6sName.getText());
                    dsName6.setLayoutX(140);
                    dsName6.setLayoutY(415);

                    //Creates a Text Object and adds the contents of passenger6DOB to it.
                    ddob6.setText("DOB: " + passenger6DOB.getValue());
                    ddob6.setLayoutX(285);
                    ddob6.setLayoutY(415);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p6No.isSelected() == true) {
                        dpassenger6SC.setText("Spanish Citizen: " + "No");
                        dpassenger6SC.setLayoutX(470);
                        dpassenger6SC.setLayoutY(415);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger6SC.setText("Spanish Citizen: " + "Yes - DNI:" + p6DNI.getText());
                        dpassenger6SC.setLayoutX(470);
                        dpassenger6SC.setLayoutY(415);
                    }

                    //Creates a Text Object and adds the contents of p6CheckedBags to it.
                    dp6checkedBag.setText("Checked Bag? " + p6CheckedBags.getValue());
                    dp6checkedBag.setLayoutX(965);
                    dp6checkedBag.setLayoutY(415);
                }

                if(passenger7fName.getText().equals("")) {
                    dpassenger7.setVisible(false);
                    dfname7.setVisible(false);
                    dsName7.setVisible(false);
                    ddob7.setVisible(false);
                    dpassenger7SC.setVisible(false);
                    dp7checkedBag.setVisible(false);
                }
                if(passenger7fName.getText() != null) {
                    //Passenger Seven Details View for Final Page
                    dpassenger7.setText("Passenger 7: ");
                    dpassenger7.setFont(Font.font("Verdana", 25));
                    dpassenger7.setLayoutX(10);
                    dpassenger7.setLayoutY(450);

                    //Creates a Text Object and adds the contents of passenger7fName to it.
                    dfname7.setText("First Name: " + passenger7fName.getText());
                    dfname7.setLayoutX(10);
                    dfname7.setLayoutY(465);

                    //Creates a Text Object and adds the contents of passenger7sName to it.
                    dsName7.setText("Surname: " + passenger7sName.getText());
                    dsName7.setLayoutX(140);
                    dsName7.setLayoutY(465);

                    //Creates a Text Object and adds the contents of passenger7DOB to it.
                    ddob7.setText("DOB: " + passenger7DOB.getValue());
                    ddob7.setLayoutX(285);
                    ddob7.setLayoutY(465);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p7No.isSelected() == true) {
                        dpassenger7SC.setText("Spanish Citizen: " + "No");
                        dpassenger7SC.setLayoutX(470);
                        dpassenger7SC.setLayoutY(465);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger7SC.setText("Spanish Citizen: " + "Yes - DNI:" + p7DNI.getText());
                        dpassenger7SC.setLayoutX(470);
                        dpassenger7SC.setLayoutY(465);
                    }

                    //Creates a Text Object and adds the contents of p7CheckedBags to it.
                    dp7checkedBag.setText("Checked Bag? " + p7CheckedBags.getValue());
                    dp7checkedBag.setLayoutX(965);
                    dp7checkedBag.setLayoutY(465);
                }

                if(passenger8fName.getText().equals("")) {
                    dpassenger8.setVisible(false);
                    dfname8.setVisible(false);
                    dsName8.setVisible(false);
                    ddob8.setVisible(false);
                    dpassenger8SC.setVisible(false);
                    dp8checkedBag.setVisible(false);
                }
                if(passenger7fName.getText() != null) {
                    //Passenger Eight Details View for Final Page
                    dpassenger8.setText("Passenger 8: ");
                    dpassenger8.setFont(Font.font("Verdana", 25));
                    dpassenger8.setLayoutX(10);
                    dpassenger8.setLayoutY(500);

                    //Creates a Text Object and adds the contents of passenger8fName to it.
                    dfname8.setText("First Name: " + passenger8fName.getText());
                    dfname8.setLayoutX(10);
                    dfname8.setLayoutY(515);

                    //Creates a Text Object and adds the contents of passenger8sName to it.
                    dsName8.setText("Surname: " + passenger8sName.getText());
                    dsName8.setLayoutX(140);
                    dsName8.setLayoutY(515);

                    //Creates a Text Object and adds the contents of passenger8DOB to it.
                    ddob8.setText("DOB: " + passenger8DOB.getValue());
                    ddob8.setLayoutX(285);
                    ddob8.setLayoutY(515);

                    //If no is selected on the details page, it will display no on the last page.
                    if (p8No.isSelected() == true) {
                        dpassenger8SC.setText("Spanish Citizen: " + "No");
                        dpassenger8SC.setLayoutX(470);
                        dpassenger8SC.setLayoutY(515);
                    }
                    //If yes is selected on the details page, it will display yes and the DNI entered on the last page.
                    else {
                        dpassenger8SC.setText("Spanish Citizen: " + "Yes - DNI:" + p8DNI.getText());
                        dpassenger8SC.setLayoutX(470);
                        dpassenger8SC.setLayoutY(515);
                    }

                    //Creates a Text Object and adds the contents of p8CheckedBags to it.
                    dp8checkedBag.setText("Checked Bag? " + p8CheckedBags.getValue());
                    dp8checkedBag.setLayoutX(965);
                    dp8checkedBag.setLayoutY(515);
                }
                totalEndPayment.setLayoutX(20);
                totalEndPayment.setLayoutY(750);
                totalEndPayment.setText("Total Paid: €" + totalCost);

                payee.setLayoutX(140);
                payee.setLayoutY(750);
                payee.setText("Paid By: " + cardName.getText());

                address.setLayoutX(285);
                address.setLayoutY(750);
                address.setText("Address: " + billingA1.getText());

                endEmail.setLayoutX(470);
                endEmail.setLayoutY(750);
                endEmail.setText("Email: " + email1.getText());

                phone.setLayoutX(580);
                phone.setLayoutY(750);
                phone.setText("Phone: " + phoneNum1.getText());

                cardNumberVal.setLayoutX(620);
                cardNumberVal.setLayoutY(750);
                cardNumberVal.setText("Card #: " + cardNumber.getText());

                dateOut.setLayoutX(40);
                dateOut.setLayoutY(80);
                dateOut.setText("Departure: " + datePickerOutgoing.getValue());

                dateArr.setLayoutX(220);
                dateArr.setLayoutX(220);
                dateArr.setLayoutY(80);
                dateArr.setText("Arrival: " + datePickerReturn.getValue());

                routes.setLayoutX(400);
                routes.setLayoutY(80);
                routes.setText("Route: " + comboBoxTo.getValue() + " - " + comboBoxFrom.getValue());

                timesEnd.setLayoutX(600);
                timesEnd.setLayoutY(80);
                timesEnd.setText("Flight Time: " + comboBoxTimes.getValue());
            }
        });


        Button paymentPrev = new Button();
        paymentPrev.setText("Previous");
        paymentPrev.setFont(Font.font("Verdana", 15));
        paymentPrev.setPrefHeight(25);
        paymentPrev.setPrefWidth(100);
        paymentPrev.setLayoutX(540);
        paymentPrev.setLayoutY(515);

        paymentPrev.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                payementView.hide();
                detailsView.show();
            }
        });

        Button pPrev = new Button();
        pPrev.setText("Previous");
        pPrev.setFont(Font.font("Verdana", 15));
        pPrev.setPrefHeight(25);
        pPrev.setPrefWidth(100);
        pPrev.setLayoutX(840);
        pPrev.setLayoutY(800);

        pPrev.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                comboBoxAdult.setValue(null);
                comboBoxChild.setValue(null);
                comboBoxBaby.setValue(null);
                numPeople = 0;
                numChildren = 0;
                numBabies = 0;
                detailsView.hide();
                stage.show();
            }
        });

        Button verifyDNI = new Button();
        verifyDNI.setText("Verify DNI");
        verifyDNI.setFont(Font.font("Verdana", 15));
        verifyDNI.setPrefHeight(25);
        verifyDNI.setPrefWidth(210);
        verifyDNI.setLayoutX(840);
        verifyDNI.setLayoutY(760);

        Label lblDNIResult = new Label();
        lblDNIResult.setText("FALSE");
        lblDNIResult.setLayoutX(840);
        lblDNIResult.setLayoutY(730);

        //ducks
        verifyDNI.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (p1DNI != null) {
                    if (lblDNIResult.getText().equals("FALSE") || lblDNIResult.getText().equals("Invalid Input! Make sure DNI is 9 or 10 Characters Long!")) {
                        DniChecker dd = new DniChecker(p1DNI.getText());
                        lblDNIResult.setText(dd.dniNumCheck());
                        System.out.println(dd.dniNumCheck());
                        //lblDNIResult.setVisible(true);
                        lblDNIResult.setTextFill(Color.GREEN);
                    }
                    if (lblResult.getText().equals("TRUE")) {
                        //lblDNIResult.setVisible(true);
                        lblDNIResult.setTextFill(Color.GREEN);
                    }
                }
            }
        });

        Button pNext = new Button();
        pNext.setText("Next");
        pNext.setFont(Font.font("Verdana", 15));
        pNext.setPrefHeight(25);
        pNext.setPrefWidth(100);
        pNext.setLayoutX(950);
        pNext.setLayoutY(800);
        pNext.setDisable(true);

        pNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(totalPeople == 1) {
                    if(passenger1fName.getText() == null) {
                        fName1.setFill(Color.RED);
                    }
                    else if(passenger1sName.getText() == null) {
                        sName1.setFill(Color.RED);
                    }
                    else if(passenger1DOB.getValue() == null) {
                        dob1.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 2) {
                    if(passenger2fName.getText() == null) {
                        fName2.setFill(Color.RED);
                    }
                    else if(passenger2sName.getText() == null) {
                        sName2.setFill(Color.RED);
                    }
                    else if(passenger2DOB.getValue() == null) {
                        dob2.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 3) {
                    if(passenger3fName.getText() == null) {
                        fName3.setFill(Color.RED);
                    }
                    else if(passenger3sName.getText() == null) {
                        sName3.setFill(Color.RED);
                    }
                    else if(passenger3DOB.getValue() == null) {
                        dob3.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 4) {
                    if(passenger4fName.getText() == null) {
                        fName4.setFill(Color.RED);
                    }
                    else if(passenger4sName.getText() == null) {
                        sName4.setFill(Color.RED);
                    }
                    else if(passenger4DOB.getValue() == null) {
                        dob4.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 5) {
                    if(passenger5fName.getText() == null) {
                        fName5.setFill(Color.RED);
                    }
                    else if(passenger5sName.getText() == null) {
                        sName5.setFill(Color.RED);
                    }
                    else if(passenger5DOB.getValue() == null) {
                        dob5.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 6) {
                    if(passenger6fName.getText() == null) {
                        fName6.setFill(Color.RED);
                    }
                    else if(passenger6sName.getText() == null) {
                        sName6.setFill(Color.RED);
                    }
                    else if(passenger6DOB.getValue() == null) {
                        dob6.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 7) {
                    if(passenger7fName.getText() == null) {
                        fName7.setFill(Color.RED);
                    }
                    else if(passenger7sName.getText() == null) {
                        sName7.setFill(Color.RED);
                    }
                    else if(passenger7DOB.getValue() == null) {
                        dob7.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(totalPeople == 8) {
                    if(passenger8fName.getText() == null) {
                        fName8.setFill(Color.RED);
                    }
                    else if(passenger8sName.getText() == null) {
                        sName8.setFill(Color.RED);
                    }
                    else if(passenger8DOB.getValue() == null) {
                        dob8.setFill(Color.RED);
                    }
                    else {
                        detailsView.hide();
                        detailsView2.hide();
                        detailsView3.hide();
                        detailsView4.hide();
                        detailsView5.hide();
                        detailsView6.hide();
                        detailsView7.hide();
                        detailsView8.hide();
                        payementView.show();
                    }
                }
                if(p1Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true && p3Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true && p3Yes.isSelected() == true && p4Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true && p3Yes.isSelected() == true && p4Yes.isSelected() == true && p5Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true && p3Yes.isSelected() == true && p4Yes.isSelected() == true && p5Yes.isSelected() == true && p6Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true && p3Yes.isSelected() == true && p4Yes.isSelected() == true && p5Yes.isSelected() == true && p6Yes.isSelected() == true && p7Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1Yes.isSelected() == true && p2Yes.isSelected() == true && p3Yes.isSelected() == true && p4Yes.isSelected() == true && p5Yes.isSelected() == true && p6Yes.isSelected() == true && p7Yes.isSelected() == true && p8Yes.isSelected() == true) {
                    totalCost = totalCost - 5;
                }
                if(p1CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes") && p3CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes") && p3CheckedBags.getValue().equals("Yes") && p4CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes") && p3CheckedBags.getValue().equals("Yes") && p4CheckedBags.getValue().equals("Yes") && p5CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes") && p3CheckedBags.getValue().equals("Yes") && p4CheckedBags.getValue().equals("Yes") && p5CheckedBags.getValue().equals("Yes") && p6CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes") && p3CheckedBags.getValue().equals("Yes") && p4CheckedBags.getValue().equals("Yes") && p5CheckedBags.getValue().equals("Yes") && p6CheckedBags.getValue().equals("Yes") && p7CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
                if(p1CheckedBags.getValue().equals("Yes") && p2CheckedBags.getValue().equals("Yes") && p3CheckedBags.getValue().equals("Yes") && p4CheckedBags.getValue().equals("Yes") && p5CheckedBags.getValue().equals("Yes") && p6CheckedBags.getValue().equals("Yes") && p7CheckedBags.getValue().equals("Yes") && p8CheckedBags.getValue().equals("Yes")) {
                    totalCost = totalCost + 30;
                }
            }
        });

        Text runningTotal = new Text();

        infoNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                priceCalc(numPeople, numChildren);
                //Calculates the total number of passengers.
                totalPeople = numPeople + numChildren + numBabies;
                //Creates a Text Object and sets the X & Y of the Object.
                runningTotal.setFont(Font.font("Verdana", 18));
                runningTotal.setLayoutX(900);
                runningTotal.setLayoutY(820);
                //Calculates the total flight cost (Without discounts).
                totalCost = adultCost + childCost;
                //Adds the euro symbol and totalCost to the Text Object and displays it.
                amount.setText("€" + totalCost);
                totalEndPayment.setText("€" + totalCost);

                if(totalPeople == 1) {
                    stage.hide();
                    detailsView.show();
                    passenger2.setVisible(false);
                    fName2.setVisible(false);
                    passenger2fName.setVisible(false);
                    sName2.setVisible(false);
                    passenger2sName.setVisible(false);
                    dob2.setVisible(false);
                    passenger2DOB.setVisible(false);
                    passenger2SC.setVisible(false);
                    p2Yes.setVisible(false);
                    p2No.setVisible(false);
                    p2DNIText.setVisible(false);
                    p2checkedBag.setVisible(false);
                    p2CheckedBags.setVisible(false);
                    passenger3.setVisible(false);
                    fName3.setVisible(false);
                    passenger3fName.setVisible(false);
                    sName3.setVisible(false);
                    passenger3sName.setVisible(false);
                    dob3.setVisible(false);
                    passenger3DOB.setVisible(false);
                    passenger3SC.setVisible(false);
                    p3Yes.setVisible(false);
                    p3No.setVisible(false);
                    p3DNIText.setVisible(false);
                    p3checkedBag.setVisible(false);
                    p3CheckedBags.setVisible(false);
                    passenger4.setVisible(false);
                    fName4.setVisible(false);
                    passenger4fName.setVisible(false);
                    sName4.setVisible(false);
                    passenger4sName.setVisible(false);
                    dob4.setVisible(false);
                    passenger4DOB.setVisible(false);
                    passenger4SC.setVisible(false);
                    p4Yes.setVisible(false);
                    p4No.setVisible(false);
                    p4DNIText.setVisible(false);
                    p4checkedBag.setVisible(false);
                    p4CheckedBags.setVisible(false);
                    passenger5.setVisible(false);
                    fName5.setVisible(false);
                    passenger5fName.setVisible(false);
                    sName5.setVisible(false);
                    passenger5sName.setVisible(false);
                    dob5.setVisible(false);
                    passenger5DOB.setVisible(false);
                    passenger5SC.setVisible(false);
                    p5Yes.setVisible(false);
                    p5No.setVisible(false);
                    p5DNIText.setVisible(false);
                    p5checkedBag.setVisible(false);
                    p5CheckedBags.setVisible(false);
                    passenger6.setVisible(false);
                    fName6.setVisible(false);
                    passenger6fName.setVisible(false);
                    sName6.setVisible(false);
                    passenger6sName.setVisible(false);
                    dob6.setVisible(false);
                    passenger6DOB.setVisible(false);
                    passenger6SC.setVisible(false);
                    p6Yes.setVisible(false);
                    p6No.setVisible(false);
                    p6DNIText.setVisible(false);
                    p6checkedBag.setVisible(false);
                    p6CheckedBags.setVisible(false);
                    passenger7.setVisible(false);
                    fName7.setVisible(false);
                    passenger7fName.setVisible(false);
                    sName7.setVisible(false);
                    passenger7sName.setVisible(false);
                    dob7.setVisible(false);
                    passenger7DOB.setVisible(false);
                    passenger7SC.setVisible(false);
                    p7Yes.setVisible(false);
                    p7No.setVisible(false);
                    p7DNIText.setVisible(false);
                    p7checkedBag.setVisible(false);
                    p7CheckedBags.setVisible(false);
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p2DNI.setVisible(false);
                    p3DNI.setVisible(false);
                    p4DNI.setVisible(false);
                    p5DNI.setVisible(false);
                    p6DNI.setVisible(false);
                    p7DNI.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 2) {
                    stage.hide();
                    detailsView.show();
                    passenger3.setVisible(false);
                    fName3.setVisible(false);
                    passenger3fName.setVisible(false);
                    sName3.setVisible(false);
                    passenger3sName.setVisible(false);
                    dob3.setVisible(false);
                    passenger3DOB.setVisible(false);
                    passenger3SC.setVisible(false);
                    p3Yes.setVisible(false);
                    p3No.setVisible(false);
                    p3DNIText.setVisible(false);
                    p3checkedBag.setVisible(false);
                    p3CheckedBags.setVisible(false);
                    passenger4.setVisible(false);
                    fName4.setVisible(false);
                    passenger4fName.setVisible(false);
                    sName4.setVisible(false);
                    passenger4sName.setVisible(false);
                    dob4.setVisible(false);
                    passenger4DOB.setVisible(false);
                    passenger4SC.setVisible(false);
                    p4Yes.setVisible(false);
                    p4No.setVisible(false);
                    p4DNIText.setVisible(false);
                    p4checkedBag.setVisible(false);
                    p4CheckedBags.setVisible(false);
                    passenger5.setVisible(false);
                    fName5.setVisible(false);
                    passenger5fName.setVisible(false);
                    sName5.setVisible(false);
                    passenger5sName.setVisible(false);
                    dob5.setVisible(false);
                    passenger5DOB.setVisible(false);
                    passenger5SC.setVisible(false);
                    p5Yes.setVisible(false);
                    p5No.setVisible(false);
                    p5DNIText.setVisible(false);
                    p5checkedBag.setVisible(false);
                    p5CheckedBags.setVisible(false);
                    passenger6.setVisible(false);
                    fName6.setVisible(false);
                    passenger6fName.setVisible(false);
                    sName6.setVisible(false);
                    passenger6sName.setVisible(false);
                    dob6.setVisible(false);
                    passenger6DOB.setVisible(false);
                    passenger6SC.setVisible(false);
                    p6Yes.setVisible(false);
                    p6No.setVisible(false);
                    p6DNIText.setVisible(false);
                    p6checkedBag.setVisible(false);
                    p6CheckedBags.setVisible(false);
                    passenger7.setVisible(false);
                    fName7.setVisible(false);
                    passenger7fName.setVisible(false);
                    sName7.setVisible(false);
                    passenger7sName.setVisible(false);
                    dob7.setVisible(false);
                    passenger7DOB.setVisible(false);
                    passenger7SC.setVisible(false);
                    p7Yes.setVisible(false);
                    p7No.setVisible(false);
                    p7DNIText.setVisible(false);
                    p7checkedBag.setVisible(false);
                    p7CheckedBags.setVisible(false);
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p3DNI.setVisible(false);
                    p4DNI.setVisible(false);
                    p5DNI.setVisible(false);
                    p6DNI.setVisible(false);
                    p7DNI.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 3) {
                    stage.hide();
                    detailsView.show();
                    passenger4.setVisible(false);
                    fName4.setVisible(false);
                    passenger4fName.setVisible(false);
                    sName4.setVisible(false);
                    passenger4sName.setVisible(false);
                    dob4.setVisible(false);
                    passenger4DOB.setVisible(false);
                    passenger4SC.setVisible(false);
                    p4Yes.setVisible(false);
                    p4No.setVisible(false);
                    p4DNIText.setVisible(false);
                    p4checkedBag.setVisible(false);
                    p4CheckedBags.setVisible(false);
                    passenger5.setVisible(false);
                    fName5.setVisible(false);
                    passenger5fName.setVisible(false);
                    sName5.setVisible(false);
                    passenger5sName.setVisible(false);
                    dob5.setVisible(false);
                    passenger5DOB.setVisible(false);
                    passenger5SC.setVisible(false);
                    p5Yes.setVisible(false);
                    p5No.setVisible(false);
                    p5DNIText.setVisible(false);
                    p5checkedBag.setVisible(false);
                    p5CheckedBags.setVisible(false);
                    passenger6.setVisible(false);
                    fName6.setVisible(false);
                    passenger6fName.setVisible(false);
                    sName6.setVisible(false);
                    passenger6sName.setVisible(false);
                    dob6.setVisible(false);
                    passenger6DOB.setVisible(false);
                    passenger6SC.setVisible(false);
                    p6Yes.setVisible(false);
                    p6No.setVisible(false);
                    p6DNIText.setVisible(false);
                    p6checkedBag.setVisible(false);
                    p6CheckedBags.setVisible(false);
                    passenger7.setVisible(false);
                    fName7.setVisible(false);
                    passenger7fName.setVisible(false);
                    sName7.setVisible(false);
                    passenger7sName.setVisible(false);
                    dob7.setVisible(false);
                    passenger7DOB.setVisible(false);
                    passenger7SC.setVisible(false);
                    p7Yes.setVisible(false);
                    p7No.setVisible(false);
                    p7DNIText.setVisible(false);
                    p7checkedBag.setVisible(false);
                    p7CheckedBags.setVisible(false);
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p4DNI.setVisible(false);
                    p5DNI.setVisible(false);
                    p6DNI.setVisible(false);
                    p7DNI.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 4) {
                    stage.hide();
                    detailsView.show();
                    passenger5.setVisible(false);
                    fName5.setVisible(false);
                    passenger5fName.setVisible(false);
                    sName5.setVisible(false);
                    passenger5sName.setVisible(false);
                    dob5.setVisible(false);
                    passenger5DOB.setVisible(false);
                    passenger5SC.setVisible(false);
                    p5Yes.setVisible(false);
                    p5No.setVisible(false);
                    p5DNIText.setVisible(false);
                    p5checkedBag.setVisible(false);
                    p5CheckedBags.setVisible(false);
                    passenger6.setVisible(false);
                    fName6.setVisible(false);
                    passenger6fName.setVisible(false);
                    sName6.setVisible(false);
                    passenger6sName.setVisible(false);
                    dob6.setVisible(false);
                    passenger6DOB.setVisible(false);
                    passenger6SC.setVisible(false);
                    p6Yes.setVisible(false);
                    p6No.setVisible(false);
                    p6DNIText.setVisible(false);
                    p6checkedBag.setVisible(false);
                    p6CheckedBags.setVisible(false);
                    passenger7.setVisible(false);
                    fName7.setVisible(false);
                    passenger7fName.setVisible(false);
                    sName7.setVisible(false);
                    passenger7sName.setVisible(false);
                    dob7.setVisible(false);
                    passenger7DOB.setVisible(false);
                    passenger7SC.setVisible(false);
                    p7Yes.setVisible(false);
                    p7No.setVisible(false);
                    p7DNIText.setVisible(false);
                    p7checkedBag.setVisible(false);
                    p7CheckedBags.setVisible(false);
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p5DNI.setVisible(false);
                    p6DNI.setVisible(false);
                    p7DNI.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 5) {
                    stage.hide();
                    detailsView.show();
                    passenger6.setVisible(false);
                    fName6.setVisible(false);
                    passenger6fName.setVisible(false);
                    sName6.setVisible(false);
                    passenger6sName.setVisible(false);
                    dob6.setVisible(false);
                    passenger6DOB.setVisible(false);
                    passenger6SC.setVisible(false);
                    p6Yes.setVisible(false);
                    p6No.setVisible(false);
                    p6DNIText.setVisible(false);
                    p6checkedBag.setVisible(false);
                    p6CheckedBags.setVisible(false);
                    passenger7.setVisible(false);
                    fName7.setVisible(false);
                    passenger7fName.setVisible(false);
                    sName7.setVisible(false);
                    passenger7sName.setVisible(false);
                    dob7.setVisible(false);
                    passenger7DOB.setVisible(false);
                    passenger7SC.setVisible(false);
                    p7Yes.setVisible(false);
                    p7No.setVisible(false);
                    p7DNIText.setVisible(false);
                    p7checkedBag.setVisible(false);
                    p7CheckedBags.setVisible(false);
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p6DNI.setVisible(false);
                    p7DNI.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 6) {
                    stage.hide();
                    detailsView.show();
                    passenger7.setVisible(false);
                    fName7.setVisible(false);
                    passenger7fName.setVisible(false);
                    sName7.setVisible(false);
                    passenger7sName.setVisible(false);
                    dob7.setVisible(false);
                    passenger7DOB.setVisible(false);
                    passenger7SC.setVisible(false);
                    p7Yes.setVisible(false);
                    p7No.setVisible(false);
                    p7DNIText.setVisible(false);
                    p7checkedBag.setVisible(false);
                    p7CheckedBags.setVisible(false);
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p7DNI.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 7) {
                    stage.hide();
                    detailsView.show();
                    passenger8.setVisible(false);
                    fName8.setVisible(false);
                    passenger8fName.setVisible(false);
                    sName8.setVisible(false);
                    passenger8sName.setVisible(false);
                    dob8.setVisible(false);
                    passenger8DOB.setVisible(false);
                    passenger8SC.setVisible(false);
                    p8Yes.setVisible(false);
                    p8No.setVisible(false);
                    p8DNIText.setVisible(false);
                    p8checkedBag.setVisible(false);
                    p8CheckedBags.setVisible(false);
                    p8DNI.setVisible(false);
                }
                else if(totalPeople == 8) {
                    stage.hide();
                    detailsView.show();
                }
            }
        });

        p1CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(passenger1fName.getText() != null || passenger1DOB.getValue() != null || passenger1sName.getText() != null) {
                    pNext.setDisable(false);
                }
                else {
                    pNext.setDisable(true);
                }
            }
        });

        if(passenger2fName.isVisible() == true) {
            p2CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger2fName.getText() != null || passenger2DOB.getValue() != null || passenger2sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        if(passenger3fName.isVisible() == true) {
            p3CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger3fName.getText() != null || passenger3DOB.getValue() != null || passenger3sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        if(passenger4fName.isVisible() == true) {
            p4CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger4fName.getText() != null || passenger4DOB.getValue() != null || passenger4sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        if(passenger5fName.isVisible() == true) {
            p5CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger5fName.getText() != null || passenger5DOB.getValue() != null || passenger5sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        if(passenger6fName.isVisible() == true) {
            p6CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger6fName.getText() != null || passenger6DOB.getValue() != null || passenger6sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        if(passenger7fName.isVisible() == true) {
            p7CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger7fName.getText() != null || passenger7DOB.getValue() != null || passenger7sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        if(passenger8fName.isVisible() == true) {
            p8CheckedBags.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (passenger8fName.getText() != null || passenger8DOB.getValue() != null || passenger8sName.getText() != null) {
                        pNext.setDisable(false);
                    } else {
                        pNext.setDisable(true);
                    }
                }
            });
        }

        //Add the objects to the AnchorPanes.
        home.getChildren().addAll(pageTitle, sceneTitle, start);
        info.getChildren().addAll(infoPageTitle, infoNext, comboBoxFrom, comboBoxTo, comboBoxTimes, textTo, textFrom, textTime, datePickerOutgoing, datePickerReturn, textOutgoingDate, textReturnDate, adultText, comboBoxAdult, childText, comboBoxChild, babyText, comboBoxBaby, totalText, runningTotal);
        details.getChildren().addAll(lblDNIResult, verifyDNI, detailsTitle, passenger1, fName1 ,passenger1fName, sName1, passenger1sName, dob1, passenger1DOB, passenger1SC, p1Yes, p1No, p1DNIText, p1DNI, p1checkedBag, p1CheckedBags, passenger2, fName2 ,passenger2fName, sName2, passenger2sName, dob2, passenger2DOB, passenger2SC, p2Yes, p2No, p2DNIText, p2DNI, p2checkedBag, p2CheckedBags, passenger3, fName3 ,passenger3fName, sName3, passenger3sName, dob3, passenger3DOB, passenger3SC, p3Yes, p3No, p3DNIText, p3DNI, p3checkedBag, p3CheckedBags, passenger4, fName4 ,passenger4fName, sName4, passenger4sName, dob4, passenger4DOB, passenger4SC, p4Yes, p4No, p4DNIText, p4DNI, p4checkedBag, p4CheckedBags, passenger5, fName5 ,passenger5fName, sName5, passenger5sName, dob5, passenger5DOB, passenger5SC, p5Yes, p5No, p5DNIText, p5DNI, p5checkedBag, p5CheckedBags, passenger6, fName6 ,passenger6fName, sName6, passenger6sName, dob6, passenger6DOB, passenger6SC, p6Yes, p6No, p6DNIText, p6DNI, p6checkedBag, p6CheckedBags, passenger7, fName7 ,passenger7fName, sName7, passenger7sName, dob7, passenger7DOB, passenger7SC, p7Yes, p7No, p7DNIText, p7DNI, p7checkedBag, p7CheckedBags, passenger8, fName8 ,passenger8fName, sName8, passenger8sName, dob8, passenger8DOB, passenger8SC, p8Yes, p8No, p8DNIText, p8DNI, p8checkedBag, p8CheckedBags, pPrev, pNext);
        payement.getChildren().addAll(paymentsTitle, amountText, amount, namePay, cardName, cardNum, cardNumber, expiryDate, expiry, billing1, billingA1, city, cityLoc, state, stateLoc, email, email1, phoneNum, phoneNum1, paymentPrev, paymentNext, lblResult, verifyCard);
        finalPage.getChildren().addAll(dpassenger1, dfname1, dsName1, ddob1, dpassenger1SC, dp1checkedBag, dpassenger2, dfname2, dsName2, ddob2, dpassenger2SC, dp2checkedBag, dpassenger3, dfname3, dsName3, ddob3, dpassenger3SC, dp3checkedBag, dpassenger4, dfname4, dsName4, ddob4, dpassenger4SC, dp4checkedBag, dpassenger5, dfname5, dsName5, ddob5, dpassenger5SC, dp5checkedBag, dpassenger6, dfname6, dsName6, ddob6, dpassenger6SC, dp6checkedBag, dpassenger7, dfname7, dsName7, ddob7, dpassenger7SC, dp7checkedBag, dpassenger8, dfname8, dsName8, ddob8, dpassenger8SC, dp8checkedBag, totalEndPayment, payee, address ,endEmail ,phone, cardNumberVal, dateOut, dateArr, routes, timesEnd);
        //Sets the primaryStage content and dimensions of the displayed window.
        primaryStage.setScene(new Scene(home, 1100, 844));
        primaryStage.show();
    }
}