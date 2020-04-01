

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ManagerLogin extends MainLogin {
    private String name, pass;
    
    
    
    @Override
    public void start(Stage primaryStage) {
    	
    	Text usernamtxt = new Text("User name");
        TextField txtfield1 = new TextField();
        Text passtxt = new Text("Password");
        PasswordField txtfield2 = new PasswordField();
        Button submit = new Button("Submit");
        submit.setMaxSize(100, 50);
        Button back = new Button("Back");
        
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.setPadding(new Insets(10, 10, 10, 10));
        gridpane.add(back, 0, 0);
        gridpane.add(usernamtxt, 1, 1);        
        gridpane.add(txtfield1, 2, 1);
        gridpane.add(passtxt, 1, 2);  
        gridpane.add(txtfield2, 2, 2);  
        gridpane.add(submit, 2, 3);
        
        Scene scene = new Scene(gridpane, 300, 200);
        primaryStage.setTitle("Manager Login");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	try{
              name = txtfield1.getText();
              pass = txtfield2.getText();
              if(name.equals("admin") && pass.equals("admin123"))
              {
              Alert alert = new Alert(AlertType.INFORMATION);
              alert.setTitle("Login status");
              alert.setHeaderText(null);
              alert.setContentText("Login successfull!");
              alert.showAndWait();
              Manager manage = new Manager();
              manage.start(primaryStage);
              }
              
              else {
            	  Alert alert = new Alert(AlertType.INFORMATION);
                  alert.setTitle("Login status");
                  alert.setHeaderText(null);
                  alert.setContentText("Invalid username or password!");
                  alert.showAndWait();
              }
              
            	   }
             	catch(Exception ex)
            	{
             	
             		ex.printStackTrace();
             	
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

        
    }
    
}