package controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;

public class StackPaneController {

	@FXML
	private Button btn2;
	
	@FXML
	private Button id_btnLeft;
	@FXML
	private CheckBox chkBox;

	@FXML
	void initialize() {

		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				wypisz_wymaluj();

			}

		};
		EventHandler<ActionEvent> act_btnLeft = new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				btn2_event();
				
			}
		};

		btn2.addEventHandler(ActionEvent.ACTION, handler);
		id_btnLeft.addEventHandler(ActionEvent.ACTION, act_btnLeft);

	}

	protected void btn2_event() {
		System.out.println("btn2 handler activated");

	}

	protected void wypisz_wymaluj() {
		System.out.println("Wypisz wymaluj");

	}

}
