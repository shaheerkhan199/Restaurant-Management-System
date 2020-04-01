

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Waiter extends WaiterLogin{

public void start(Stage primaryStage){
        

    Button order = new Button("Order");
    Button back = new Button("Back");
    
    
    VBox  vBox = new VBox();
    vBox.getChildren().addAll(back,order);
     
			
		
    order.setOnAction(x->{
		
 	   WaiterOrder wo = new WaiterOrder();
 	   wo.start(primaryStage);

 	   
    }); 
    back.setOnAction(x->{
 	   WaiterLogin wl = new WaiterLogin();
			try {
			wl.start(primaryStage);
			} catch (Exception e) {
				e.printStackTrace();
			}
    });
	
        Scene scene = new Scene(vBox,500, 500);
        primaryStage.setTitle("Resturant Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
	
}

}