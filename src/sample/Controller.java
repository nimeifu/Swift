package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;

import java.awt.*;

public class Controller {

    // Manual Input
    @FXML
    TextField question;
    TextField choice1;
    TextField choice2;
    TextField choice3;
    TextField path;
    Button manualSubmit;
    Tab Alg1;
    Tab Alg2;
    String questionInput;
    String choiceInput1;
    String choiceInput2;
    String choiceInput3;
    ProgressBar progressone;
    ProgressBar progresstwo;
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
        

    }
    public void resetAll() {
        progressone.setProgress(0);
        progresstwo.setProgress(0);
        progressthree.setProgress(0);
    }

    public String getImagePath() {
        return (path.getText());
    }
}



