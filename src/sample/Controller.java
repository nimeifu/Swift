package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;

import java.awt.*;

public class Controller {

    // Manual Input
    @FXML
    TextField question;
    @FXML
    TextField choice1;
    @FXML
    TextField choice2;
    @FXML
    TextField choice3;
    @FXML
    TextField path;
    @FXML
    Button manualSubmit;
    @FXML
    Tab Alg1;
    @FXML
    Tab Alg2;
    String questionInput;
    String choiceInput1;
    String choiceInput2;
    String choiceInput3;
    @FXML
    ProgressBar progressone;
    @FXML
    ProgressBar progresstwo;
    @FXML
    ProgressBar progressthree;

    public void getManualInput() {
        questionInput = question.getText();
        choiceInput1 = choice1.getText();
        choiceInput2 = choice2.getSelectedText();
        choiceInput3 = choice3.getSelectedText();
        choice1.setText("lol");
        System.out.println(questionInput + ", " + choiceInput1 + ", " + choiceInput2 + ", " + choiceInput3);
    }

    public void setProgressBarOne(double percent) {
        progressone.setProgress(percent);
    }

    public void setProgressBarTwo(double percent) {
        progresstwo.setProgress(percent);
    }

    public void setProgressBarThree(double percent) {
        progressthree.setProgress(percent);
    }

    public void displayAlgorithmOne(Tab Alg1)
    {
        Alg1.setText(""+FullSearch+" .");
    }

    public void displayAlgorithmTwo(Tab Alg2)
    {
        Alg2.setText(""+QuickSearch+" .");
    }

    public String getImagePath() {
        return (path.getText());
    }

    public void resetAll() {
        progressone.setProgress(0);
        progresstwo.setProgress(0);
        progressthree.setProgress(0);
        Alg1.setText("");
        Alg2.setText("");
        path.setText(null);
    }


}



