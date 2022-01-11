package org.andr7st.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class AppFxController implements Initializable {

    @FXML private Label lblDate;
    @FXML private Label lblTime;
    @FXML private Label lblOS;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        this.lblOS.setText(System.getProperty("os.name"));

        LocalDateTime datetime = LocalDateTime.now();

        this.lblDate.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        this.lblTime.setText(datetime.format(DateTimeFormatter.ofPattern("HH:mm a")));
    }

    @FXML
    void onBtnAction(ActionEvent event) {

        // Alert with icon.
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(Objects.requireNonNull(this.getClass().getResource("/org/andr7st/javafx/favicon.png")).toString()));
        alert.setTitle("Andr7st");
        alert.setHeaderText("Hello world!.");
        alert.setContentText("This is a JavaFx example by Andrés Segura.");
        alert.show();
    }
}
