
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chef extends ChefLogin{

public void start(Stage stage){
        
       Button order = new Button("order");
       Button back = new Button("Back");
       
       VBox  vBox = new VBox();
       vBox.getChildren().addAll(back,order);
        
			
		
       order.setOnAction(x->{
		
    	   ChefOrder chefOrder = new ChefOrder();
    	   chefOrder.start(stage);

    	   
 
    	   
       });
       
       back.setOnAction(x->{
    	   ChefLogin cl = new ChefLogin();
			try {
			cl.start(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
       });
       
       Scene scene = new Scene(vBox,800,500);
       stage.setScene(scene);
       stage.show();
       


       
	
	}



}