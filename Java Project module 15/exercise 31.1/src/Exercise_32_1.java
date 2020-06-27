						
// java SQL imports
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// java scene imports 
import javafx.scene.control.Label;				
import javafx.scene.control.TextField; 			
import javafx.scene.control.Button;
import javafx.scene.Scene;							
import javafx.scene.layout.BorderPane;				
import javafx.scene.layout.HBox; 				
import javafx.scene.layout.VBox;	

// java app / stage / geo imports 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;


public class Exercise_32_1 extends Application {

	// The buttons 
	private static Button View = new Button("View");  
	private static Button Insert = new Button("Insert");  
	private static Button Update  = new Button("Update");  
	private static Button Clear = new Button("Clear");  

	// The textFeilds 
	private TextField ID = new TextField(); 
	private TextField LastName = new TextField(); 
	private TextField FirstName = new TextField(); 
	private TextField Middle = new TextField(); 
	private TextField Address = new TextField(); 
	private TextField City = new TextField(); 
	private TextField State = new TextField(); 
	private TextField Phone = new TextField(); 
	private TextField Email = new TextField(); 
	
	// The labels 
	private Label lblstatus = new Label();
	private Label lblID = new Label("ID");
	private Label lblFirstName = new Label("First Name"); 
	private Label lblLastName = new Label(" Last Name"); 
	private Label lblMiddle = new Label("MI"); 
	private Label lblAddress = new Label("Address"); 
	private Label lblCity = new Label("City"); 
	private Label lblState = new Label("State"); 
	private Label lblPhone = new Label("Phone Number"); 
	private Label lblEmail = new Label("Email Address"); 

	// Connecting to databse 
	private Statement statement; 


	@Override
	public void start(Stage primaryStage) throws Exception {
		//Adding all the VBox's and HBox's 
		Middle.setPrefColumnCount(1); 
		VBox vBox = new VBox(5); 
		HBox hBox1 = new HBox(5); 
		hBox1.getChildren().addAll(lblID, ID); 
		HBox hBox2 = new HBox(5); 
		hBox2.getChildren().addAll(lblLastName, LastName, lblFirstName, FirstName, lblMiddle, Middle); 
		HBox hBox3 = new HBox(5); 
		hBox3.getChildren().addAll(lblAddress, Address); 
		HBox hBox4 = new HBox(5); 
		hBox4.getChildren().addAll(lblCity, City, lblState, State); 
		HBox hBox5 = new HBox(5); 
		hBox5.getChildren().addAll(lblPhone, Phone, lblEmail, Email); 
		HBox hBox6 = new HBox(5);
		hBox6.getChildren().addAll(View, Insert, Update, Clear);
		vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5);
		hBox6.setAlignment(Pos.CENTER);
		
		// Adding BorderPane
		BorderPane pane = new BorderPane(); 
		pane.setTop(lblstatus);
		pane.setCenter(vBox);
		pane.setBottom(hBox6);

		Scene scene = new Scene(pane); 
		primaryStage.setTitle("Exercise 32.1");
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
		initalizeDB(); 
		
		// Adding event Handlers 
		View.setOnAction(e -> view());
		Insert.setOnAction(e -> insert());
		Update.setOnAction(e -> update());
		Clear.setOnAction(e -> clear());
	}
	
	
	
	
	private void initalizeDB() { 
			
		// Where I connect to the database 
	}
	
	
	private void view() { 
		String query = "SELECT * FROM Staff WHERE ID = "  
						+ "'" + ID.getText().trim() + "'"; 
		try {
			ResultSet rs = statement.executeQuery(query);
			loadFields(rs); 
		
		}
		  catch(SQLException ex) { 
			  lblstatus.setText("Query Failed: " + ex);
		  }
	}
	
	private void loadFields(ResultSet rs) throws SQLException { 
		if (rs.next()) { 
			LastName.setText(rs.getString(2));
			FirstName.setText(rs.getString(3));
			Middle.setText(rs.getString(4));
			Address.setText(rs.getString(5));
			City.setText(rs.getString(6));
			State.setText(rs.getString(7));
			Phone.setText(rs.getString(8));
			Email.setText(rs.getString(9));
			lblstatus.setText(rs.getString("Record Found"));
		}
		else { 
			lblstatus.setText("Record not found");
		}
	}
	
	private void insert() {
		String insertQuery = 
				"INSERT INTO Staff (ID LastName, FirstName, mi, address, " + 
				 "city, state, telephone, email) VALUES ('" + ID.getText().trim() + 
				 "' , " + LastName.getText().trim() + 
				 "' , " + FirstName.getText().trim() + 
				 "' , " + Middle.getText().trim() + 
				 "' , " + Address.getText().trim() + 
				 "' , " + City.getText().trim() + 
				 "' , " + State.getText().trim() + 
				 "' , " + Phone.getText().trim() + 
				 "' , " + Email.getText().trim() + "');"; 
		
			try {
				statement.executeUpdate(insertQuery);
				 lblstatus.setText("Inserted Record");
			}
			  catch(SQLException ex) { 
				  lblstatus.setText("Insert Failed: " + ex);
			  }
	} 
	 
	
	private void update() { 
			String UpdateQuery = 
					"Update Staff SET " +
					 " LastName = '" + LastName.getText().trim() + 
					 " FirstName = '" + FirstName.getText().trim() + 
					 " Mi = '" + Middle.getText().trim() + 
					 " Address = '" + Address.getText().trim() + 
					 " City = '" + City.getText().trim() + 
					 " State = '" + State.getText().trim() + 
					 " Phone = '" + Phone.getText().trim() + 
					 " Email = '" + Email.getText().trim() + 
					 " WHERE id = '" + ID.getText().trim() + "';"; 
			
				try {
					statement.executeUpdate(UpdateQuery);
					 lblstatus.setText("Inserted Record");
				}
				  catch(SQLException ex) { 
					  lblstatus.setText("Update Failed: " + ex);
				  }
		} 	
	
	
	private void clear() { 
		ID.setText(null);
		LastName.setText(null);
		FirstName.setText(null);
		Middle.setText(null);
		Address.setText(null);
		City.setText(null);
		State.setText(null);
		Phone.setText(null);
		Email.setText(null);
	}
	
	public static void main (String [] args) { 
		launch(args); 
	}


	
}
