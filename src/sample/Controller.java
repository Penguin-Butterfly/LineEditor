package sample;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Controller {
    public TextField text1;
    public TextField text2;
    public Button saveBtn;
    //public TextArea textbox;
    public ListView textboxes;
    public TableColumn textColumn;
    //public String allText = "";

    public void textinput() {
        String savedText = text1.getText();
        System.out.println(savedText);

        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        String timeStamp = DateTime.format(formatter);

        /* broken Tableview code
        TableColumn<textEntry, String> textColumn = new TableColumn<>("Entry");
        textColumn.setCellValueFactory(new PropertyValueFactory<>("enteredText"));
         */

        String textToAdd = timeStamp +" :   " + savedText;
        System.out.println(textToAdd);

        textboxes.getItems().add(textToAdd);
        //allText = allText + " " + savedText;
        //textbox.setText(allText);
        text1.setText("");
        //textbox.setDisable(false);
        saveBtn.setText("Saved!");
        //saveBtn.setDisable(true);
    }
}
