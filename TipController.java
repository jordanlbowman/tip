package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TipController {
	@FXML
	private TextField amountTextField;
	
	@FXML
	private TextField totalTextField;
	
	@FXML
	private TextField tipField;
	
	@FXML
	private void calculateButtonPressed(ActionEvent event){
		Float mealamount = Float.parseFloat(amountTextField.getText());
		double tipPercentage = 0.20;
		tipField.setText(String.valueOf(mealamount * tipPercentage));
		totalTextField.setText(String.valueOf(mealamount * (1 + tipPercentage)));
	}
}
