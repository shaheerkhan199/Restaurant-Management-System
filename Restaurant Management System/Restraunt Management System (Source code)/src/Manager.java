
import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Manager extends ManagerLogin {
	

	public static ArrayList<String> customerId = new ArrayList<String>();
	public static ArrayList<Long> customerPhoneNo = new ArrayList<Long>();
	public static ArrayList<String> customerFullName = new ArrayList<String>();
	public static ArrayList<String> customerPassword = new ArrayList<String>();
	
	public static ArrayList<String> chefName = new ArrayList<String>();
	public static ArrayList<String> chefPass = new ArrayList<String>();
	
	public static ArrayList<String> waiterName = new ArrayList<String>();
	public static ArrayList<String> waiterPass = new ArrayList<String>();
	
	private String address;
	
	Manager()
	{
		
	}
	Manager(String add)
	{
		this.address = add;
		System.out.println("address");
	}
	Manager(ArrayList<String> customerId,ArrayList<Long> customerPhoneNO,ArrayList<String> customerFullName,ArrayList<String> customerPassword)
	{
		this.customerId=customerId;
		this.customerPhoneNo=customerPhoneNO;
		this.customerFullName=customerFullName;
		this.customerPassword=customerPassword;
		
	}
	
	Manager(ArrayList<String> chefName ,ArrayList<String> chefPass)
	{
		this.chefName=chefName;
		this.chefPass=chefPass;
	}
	

	
	Button customerRecord,waiterList,chefList,back;
	Text name,price;
	TextField txtName,txtPrice;

	public void start(Stage PrimaryStage){
		 
		 name = new Text("Menu Name");
		 txtName = new TextField();
		 price = new Text("Menu Price");
		 txtPrice=new TextField();
		 
		customerRecord = new Button("Customer Records");
		customerRecord.setMaxSize(120, 80);
		waiterList = new Button("Waiter List");
		waiterList.setMaxSize(120, 80);
		chefList = new Button("Chef List");
		chefList.setMaxSize(120, 80);
		back = new Button("Back");
		

		
		customerRecord.setOnAction(x->{
			System.out.println(customerId);
			System.out.println(customerFullName);
			System.out.println(customerPhoneNo);
			System.out.println(customerPassword);
			
		});
		
		chefList.setOnAction(x->{
			System.out.println("Chef Name : " + chefName);
			System.out.println("Chef Pass : " + chefPass);
			
		});
	waiterList.setOnAction(x->{
			WaiterLogin obj1 = new WaiterLogin();
			System.out.println("Waiter Name : " + obj1.waiterName);
			System.out.println("Waiter Pass : " + obj1.waiterPass);
			
			
		});
		
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(10);
		vBox.getChildren().addAll(back,customerRecord,waiterList,chefList);
		
		
		Scene scene = new Scene(vBox, 300, 300);
		PrimaryStage.setTitle("Manager");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
		back.setOnAction(x->{
			ManagerLogin ml = new ManagerLogin();
			ml.start(PrimaryStage);
		});
	}
	
}
