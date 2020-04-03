package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class function {
	@FXML	
	private TextField t1;
	@FXML
	private TextField t2;
	@FXML
	private TextField t3;
	@FXML
	private TextField t4;
		
	public void addition(ActionEvent event)
	{
		int a,b,c;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a+b;
		t3.setText(Integer.toString(c));	
		
		
	}
	public void subtraction(ActionEvent event)
	{
		int a,b,c;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=a-b;
		t4.setText(Integer.toString(c));	
		
		
	}
	
	

}
