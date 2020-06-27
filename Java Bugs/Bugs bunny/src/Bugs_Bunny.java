
import javafx.application.Application;  //for application
import javafx.stage.Stage;				//for stage
import javafx.scene.Scene;				//for scene
import javafx.scene.layout.GridPane;	//for GridPane 
import javafx.scene.image.ImageView;	//for imageview
import javafx.scene.image.Image;		//for image
import javafx.scene.control.Label;		//for Labels
import javafx.geometry.Pos;				//for POS alignment

public class Bugs_Bunny extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) throws InterruptedException {
	    
// Create the GridPane, set its alignment, and set gaps
	    GridPane gpane = new GridPane();
	    gpane.setAlignment(Pos.CENTER);
	    gpane.setHgap(5);
	    gpane.setVgap(5);

// Labels / Text on program 
	    gpane.add(new Label("Hey what hunting season is it?"), 0,0 );
	    gpane.add(new Label("Its rabbit season"), 2,0 );
	    gpane.add(new Label("Careful doc hes trying to trick you \n its, duck season!"), 0, 4);
	    gpane.add(new Label("I would not its rabbit season!"), 2, 4);

	    
	    gpane.add(new Label("Oh its new Walking dead season!"), 0, 8);

// Create the images within the imageView
// (Make sure to place your images in the project folder)

	  // defineing the image 
	    Image image = new Image("file:uk.gif");
	    ImageView imageView1 = new ImageView(image);
	    ImageView imageview2 = new ImageView(image); 
	    
	   

	    
	    ImageView Fudd = new ImageView("file:Fudd.gif");
	    Fudd.setFitHeight(150);
	    Fudd.setFitWidth(150);
	    
	    
	    ImageView Duck = new ImageView("File:Duck.gif"); 
	    Duck.setFitHeight(150); 
	    Duck.setFitWidth(150); 
	    
	    ImageView Duck2 = new ImageView("File:Duck2.gif"); 
	    Duck2.setFitHeight(150); 
	    Duck2.setFitWidth(150);    
	    
	    ImageView Rabbit = new ImageView("File:Rabbit.gif"); 
	    Rabbit.setFitHeight(150); 
	    Rabbit.setFitWidth(150); 

	    ImageView Dead = new ImageView("File:Dead.gif"); 
	    Dead.setFitHeight(150); 
	    Dead.setFitWidth(150); 
// Add all four ImageViews to the GridPane

	    
	    gpane.add(Fudd, 0, 1);
	    gpane.add(Duck, 2, 1);
	    gpane.add(Rabbit, 0, 5);
	    gpane.add(Duck2, 2, 5);
	    
	    gpane.add(Dead, 0, 10);
	    
// Create the scene and make it large enough, give the stage a title, place the
// scene in the stage, and display it.
	    
	    Scene scene = new Scene(gpane, 700, 600);
	    primaryStage.setTitle("Chad's Program"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage

	    
	  }
	  

	 public static void main(String[] args)  {
		 launch(args);
		

	
	 }
}
