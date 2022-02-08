package com.example.labs_2_geo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Camera;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateCricketViewController implements Initializable {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField runsTextField;

    @FXML
    private CheckBox boundariesCheckBox;

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private Label msgLabel;

    private final ToggleGroup group=new ToggleGroup();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maleRadioButton.setToggleGroup(group);
        femaleRadioButton.setToggleGroup(group);
        msgLabel.setVisible(false);
        categoryComboBox.getItems().addAll(Cricket.getAllCategory());
    }

    @FXML
    private void createCricket(){
        String name=nameTextField.getText();
        int runs= Integer.parseInt(runsTextField.getText());
        RadioButton temp= (RadioButton)group.getSelectedToggle();
        String gender=temp.getText();
        boolean boundaries=boundariesCheckBox.isSelected();
        String catgory=categoryComboBox.getSelectionModel().getSelectedItem();

        Cricket newCricket= new Cricket(runs,name,gender,catgory,boundaries);
        msgLabel.setVisible(true);
        msgLabel.setText(newCricket.toString());
    }
}
