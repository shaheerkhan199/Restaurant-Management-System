

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

public class CustomerLogin extends MainLogin {

	
	
	private String uname;
	private String pass;
	public void start(Stage primaryStage) {
		
		 Text nameLabel = new Text("username");
		 TextField userNameField = new TextField();
		 Text passLabel = new Text("Password");
		 PasswordField passwordField = new PasswordField();
		 Button login = new Button("Login");
		 Button newCustomer = new Button("New Customer");
		 Button back = new Button("Back");
		 NewCustomer nc = new NewCustomer();
		
		login.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event){
			 	try{
			 		  uname = userNameField.getText();
		              pass = passwordField.getText();
		              
			 		if(uname == null || pass == null){
			 			Alert alert = new Alert(AlertType.INFORMATION);
			              alert.setTitle("Login status");
			              alert.setHeaderText(null);
			              alert.setContentText("Please Enter Name and Password");
			              alert.showAndWait();
			 		}
			 		else{
			 		if(uname != null && pass != null){
		              for(int i=0;i<nc.id.size();i++){
		            	 
		              if(uname.equals(nc.id.get(i)) && pass.equals(nc.password.get(i)))
		              {
		            	  Menu menu = new Menu();
		            	  menu.start(primaryStage);
		            	  break;
		              } 
		              else {
		            	  Alert alert = new Alert(AlertType.INFORMATION);
			              alert.setTitle("Login status");
			              alert.setHeaderText(null);
			              alert.setContentText("Please Enter valid Name and Password");
			              alert.showAndWait();
		              }
		             
		              }
		              	}
			 		}
			 	}
		             	catch(Exception ex)
		            	{
		             	ex.printStackTrace();
		            	}
		            }
		        });
		
		newCustomer.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				NewCustomer obj1 = new NewCustomer();
				try{
					obj1.start(primaryStage);
					
				}catch (Exception e) {
					e.printStackTrace();
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
		gridPane.add(newCustomer, 2, 3);
        gridPane.add(login, 1, 3);
        
        Scene scene = new Scene(gridPane,300,200);
        primaryStage.setTitle("Customer Login");
        primaryStage.setScene(scene);
        primaryStage.show();
	}



	
}