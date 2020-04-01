import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainLogin extends Application {

	public static void main(String[] args)
	{
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		Rectangle rect=new Rectangle();
		rect.setWidth(60);
		rect.setHeight(70);
		rect.setRotate(45);
		rect.setFill(Color.BLACK);
		rect.setLayoutX(50);
		rect.setLayoutY(300);
		
		TranslateTransition tran=new TranslateTransition();
		tran.setDuration(Duration.seconds(2));
		tran.setAutoReverse(true);
		tran.setCycleCount(1000);;
		tran.setToX(-180);
		tran.setNode(rect);
		tran.play();
		
		Rectangle rect1=new Rectangle();
		rect1.setWidth(70);
		rect1.setHeight(70);
		rect1.setRotate(45);
		rect1.setFill(Color.BLACK);
		rect1.setLayoutX(1250);
		rect1.setLayoutY(320);
		
		TranslateTransition tran1=new TranslateTransition();
		tran1.setDuration(Duration.seconds(2));
		tran1.setAutoReverse(true);
		tran1.setCycleCount(1000);;
		tran1.setToX(180);
		tran1.setNode(rect1);
		tran1.play();
		
		Rectangle rect2=new Rectangle();
		rect2.setWidth(70);
		rect2.setHeight(70);
		rect2.setRotate(45);
		rect2.setFill(Color.WHITE);
		rect2.setLayoutX(50);
		rect2.setLayoutY(300);
		
		TranslateTransition tran2=new TranslateTransition();
		tran2.setDuration(Duration.seconds(2));
		tran2.setAutoReverse(true);
		tran2.setCycleCount(1000);;
		tran2.setToY(180);
		tran2.setNode(rect2);
		tran2.play();
		
		Rectangle rect3=new Rectangle();
		rect3.setWidth(70);
		rect3.setHeight(70);
		rect3.setRotate(45);
		rect3.setFill(Color.WHITE);
		rect3.setLayoutX(50);
		rect3.setLayoutY(300);
		
		TranslateTransition tran3=new TranslateTransition();
		tran3.setDuration(Duration.seconds(2));
		tran3.setAutoReverse(true);
		tran3.setCycleCount(1000);;
		tran3.setToY(-180);
		tran3.setNode(rect3);
		tran3.play();
		
		Button manager = new Button("Manager Login");
		manager.setMinSize(100, 100);
		Button customer = new Button("Customer Login");
		customer.setMinSize(100, 100);
		Button chef = new Button("Chef Login");
		chef.setMinSize(100, 100);
		Button waiter = new Button("Waiter Login");
		waiter.setMinSize(100, 100);
		Button db = new Button("Delivery Boy");
		db.setMinSize(100, 100);
		
		
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5);
		gridPane.setHgap(5);;
		gridPane.add(rect,0,0,1,2);
		gridPane.add(rect1,0,0,1,2);
		gridPane.add(rect2,0,0,1,2);
		gridPane.add(rect3,0,0,1,2);
		gridPane.add(manager, 0, 0);
		gridPane.add(customer, 1, 0);
		gridPane.add(chef, 0, 1);
		gridPane.add(waiter, 1, 1);
		gridPane.add(db,0,2);
		
		manager.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				ManagerLogin admin = new ManagerLogin();
				try {
				admin.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		customer.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				CustomerLogin obj2 = new CustomerLogin();
				try {
					obj2.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		chef.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				ChefLogin obj2 = new ChefLogin();
				try {
					obj2.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		waiter.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				WaiterLogin obj2 = new WaiterLogin();
				try {
					obj2.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		db.setOnAction(x->{
			DeliveryBoy db1 = new DeliveryBoy();
			db1.start(primaryStage);
		});
		
		Scene scene = new Scene(gridPane,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Pannel");
		primaryStage.show();
		
	}
	
	
	

}
