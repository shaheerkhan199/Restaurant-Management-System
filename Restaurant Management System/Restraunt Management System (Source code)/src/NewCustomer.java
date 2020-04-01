
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NewCustomer extends CustomerLogin {



	Label userName, cellNo, fName, pass;
	
	TextField txtName, txtCell, txtAdd;
	
	PasswordField txtPass;
	
	private String s1,s2,s3;
	private long l1;
	
	public static ArrayList<String> id = new ArrayList<String>();
	public static ArrayList<Long> phoneNo = new ArrayList<Long>();
	public static ArrayList<String> fullName = new ArrayList<String>();
	public static ArrayList<String> password = new ArrayList<String>();

	
	
	
	@Override
	public void start(Stage stage) {

		userName = new Label("username");
		fName = new Label("Full Name");
		cellNo = new Label("Cell no");
		pass = new Label("Password");
		
		txtName = new TextField();
		txtCell = new TextField();
		txtAdd = new TextField();
		
		txtPass = new PasswordField();
		
		Button submit = new Button("Submit");
		Button back = new Button("Back");
		
		GridPane gPane = new GridPane();
		
		gPane.setAlignment(Pos.CENTER);
        gPane.setVgap(10);
        gPane.setHgap(10);
		gPane.add(back , 0,0);
		gPane.add(userName, 1,1);
		gPane.add(txtName, 2,1);
		gPane.add(fName, 1,2);
		gPane.add(txtAdd, 2,2);
		gPane.add(cellNo, 1,3);
		gPane.add(txtCell, 2,3);
		gPane.add(pass, 1,4);
		gPane.add(txtPass, 2,4);
		gPane.add(submit, 2,5);
		
		
		submit.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				try{
					s1 = txtName.getText();
					s2 = txtAdd.getText();
					l1 = Integer.parseInt(txtCell.getText());
					s3 = txtPass.getText();
					
					if(s1 == null ||  s2 == null || l1 == '\0' || s3 == null){
						Alert alert = new Alert(AlertType.INFORMATION);
			              alert.setTitle("Information");
			              alert.setHeaderText(null);
			              alert.setContentText("Something is empty!!");
			              alert.showAndWait();
					}
					else{
						if(s1 != null &&  s2 != null && l1 != '\0' && s3 != null){

							
							id.add(s1);
							fullName.add(s2);
							phoneNo.add(l1);
							password.add(s3);
							
							Manager manage = new Manager(id,phoneNo,fullName,password);
							
							System.out.println(s1+" "+s2+" "+l1+" "+s3);
					
							txtName.setText(null);
							txtCell.setText(null);
							txtAdd.setText(null);
							txtPass.setText(null);

							CustomerLogin cg = new CustomerLogin();
							cg.start(stage);
						}
					}
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
			
		});
		
		back.setOnAction(x->{
	    	   CustomerLogin cg = new CustomerLogin();
				try {
				cg.start(stage);
				} catch (Exception e) {
					e.printStackTrace();
				}
	       });
	

		Scene scene = new Scene(gPane, 500,500);
		stage.setScene(scene);
		stage.setTitle("New Customer");
		stage.show();
		
	}
	}

	

