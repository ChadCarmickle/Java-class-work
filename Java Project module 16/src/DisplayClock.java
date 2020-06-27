import java.awt.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

public class DisplayClock extends Application {
 
    // Creating the text boxes 
    protected TextField tfHour = new TextField();
	protected TextField tfMinute = new TextField();
	protected TextField tfSecond = new TextField();
	protected ClockPane clock = new ClockPane();
	protected Button btn = new Button(); 
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Setting the text field properties
		tfHour.setPrefColumnCount(3); 		// Text field for hours 
		tfMinute.setPrefColumnCount(3);		// Text field for min
		tfSecond.setPrefColumnCount(3);		// Text Field for sec
		
		
		//Seeting the Alignment
		tfHour.setAlignment(Pos.CENTER_RIGHT);
		tfMinute.setAlignment(Pos.CENTER_RIGHT);
		tfSecond.setAlignment(Pos.CENTER_RIGHT);
		
		//Setting the text 
		tfHour.setText(String.valueOf(clock.getHour()));
		tfMinute.setText(String.valueOf(clock.getMinute()));
		tfSecond.setText(String.valueOf(clock.getSecond()));    
    

		// Create a hbox for the Hour, Minute and seconds
		HBox paneForTimeFields = new HBox(5);
		paneForTimeFields.setAlignment(Pos.CENTER);
		paneForTimeFields.getChildren().addAll(new Label("Hour"), tfHour, 
			new Label("Minute"), tfMinute, new Label("Second"), tfSecond);

		// Create a vbox for the clock and HBox
		VBox pane = new VBox(20);
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(clock, paneForTimeFields);

		// Create and register the handler
		tfHour.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				setClock();
			}
		});

		tfMinute.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				setClock();
			}
		});

		tfSecond.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				setClock();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Display Clock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		// Center clock
		clock.setW(pane.getWidth());
		clock.setH(pane.getHeight() - 30);

		// Create a listener to set a new width for clock 
		pane.widthProperty().addListener(ov ->
			clock.setW(pane.getWidth())
		);

		// Create a listener to set a new height for clock 
		pane.heightProperty().addListener(ov ->
			clock.setH(pane.getHeight() - 30)
		);
	}

	// Set the clock to specified time
	private void setClock() {
		clock.setHour(Integer.parseInt(tfHour.getText()));
		clock.setMinute(Integer.parseInt(tfMinute.getText())); 
		clock.setSecond(Integer.parseInt(tfSecond.getText()));
	}
} 	