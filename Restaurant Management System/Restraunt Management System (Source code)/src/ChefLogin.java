

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class ChefLogin extends MainLogin {

	ArrayList<String> chefName = new ArrayList<String>();
	ArrayList<String> chefPass = new ArrayList<String>();
	
	private String uname, pass;
	
	public void start(Stage primaryStage) {
		
		 Text nameLabel = new Text("User name");
		 TextField userNameField = new TextField();
		 Text passLabel = new Text("Password");
		 PasswordField passwordField = new PasswordField();
		 Button login = new Button("Login");
		 Button back = new Button("Back");
		 
		
		 chefName.add("chef1");			chefPass.add("login1");
		 chefName.add("chef2");			chefPass.add("login2");
		 chefName.add("chef3");			chefPass.add("login3");
		 
   	  Manager manage = new Manager(chefName,chefPass);

		
		login.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event){
			 	try{

		              uname = userNameField.getText();
		              pass = passwordField.getText();
		              for(int i= 0; i<chefName.size();i++){
		              if(uname == null || pass == null){
		            	  Alert alert = new Alert(AlertType.INFORMATION);
			              alert.setTitle("Login status");
			              alert.setHeaderText(null);
			              alert.setContentText("Please Enter Name and Password!!");
			              alert.showAndWait();
		              }
		              else
		            if(uname.equals(chefName.get(i)) && pass.equals(chefPass.get(i)))
		              {
		            	  Chef obj1 = new Chef();
		            	  obj1.start(primaryStage);
		              }
		             
		              
		              else {
		            	  {Alert alert = new Alert(AlertType.INFORMATION);
			              alert.setTitle("Login status");
			              alert.setHeaderText(null);
			              alert.setContentText("Please Enter valid Name and Password!!");
			              alert.showAndWait();}
		              }
		              }
		            	   }
		             	catch(Exception ex)
		            	{
		             	
		                    Alert alert = new Alert(AlertType.INFORMATION);
		                    alert.setTitle("Login status");
		                    alert.setHeaderText(null);
		                    alert.setContentText("Please Enter Correct Name and Password");
		                    alert.showAndWait();
		             	
		            	}
		            }
		        });
		
		back.setOnAction(x->{
	    	   MainLogin lg = new MainLogin();
				try {
				lg.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
	       });
		
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.add(back, 0, 0);
        gridPane.add(nameLabel, 1, 1);
        gridPane.add(userNameField, 2, 1);
		gridPane.add(passLabel, 1, 2);
		gridPane.add(passwordField, 2, 2);
		gridPane.add(login, 2, 3);
		
        
        Scene scene = new Scene(gridPane,300,200);
        primaryStage.setTitle("Chef Login");
        primaryStage.setScene(scene);
        primaryStage.show();
	}


	
}