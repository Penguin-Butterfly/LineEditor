package sample;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    public TextField text1;
    public TextField text2;
    public Button saveBtn;
    //public TextArea textbox;
    public TableView textboxes;
    public TableColumn textColumn;
    //public String allText = "";

    public void textinput() {
        String savedText = text1.getText();
        System.out.println(savedText);

        TableColumn<textEntry, String> textColumn = new TableColumn<>("Entry");
        textColumn.setCellValueFactory(new PropertyValueFactory<>("enteredText"));

        textboxes.getItems().add(new textEntry(savedText));
        //allText = allText + " " + savedText;
        //textbox.setText(allText);
        text1.setText("");
        //textbox.setDisable(false);
        saveBtn.setText("Saved!");
        //saveBtn.setDisable(true);
    }
}
