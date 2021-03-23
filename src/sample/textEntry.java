package sample;

public class textEntry {
    private String enteredText = null;
    //private String timestamp = null;

    public textEntry() {
    }

    public textEntry(String enteredText) {
        this.enteredText = enteredText;
        //this.timestamp = timestamp;
    }


    public void setEnteredText(String enteredText) {
        this.enteredText = enteredText;
    }

    public String getEnteredText() {
        return enteredText;
    }
    /*
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }
     */
}
