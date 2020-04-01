import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DeliveryBoy extends MainLogin{

	private String address;

	DeliveryBoy()
	{
		
	}
	
	DeliveryBoy(String add)
	{
		this.address = add;
		System.out.println(address);
	}
	public void start(Stage stage){
		
		VBox vb = new VBox();
		Button back = new Button("Back");
		TextField txadd = new TextField();
		String a = this.address;
		txadd.setText(a);
		txadd.setText(address);
		txadd.getText();
		txadd.setEditable(false);
		txadd.setMaxSize(250,250);
		vb.getChildren().addAll(back,txadd);
		
		back.setOnAction(x->{
			MainLogin ml = new MainLogin();
			try {
				ml.start(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		Scene scene = new Scene(vb, 300,300);
		vb.setAlignment(Pos.CENTER);
		stage.setScene(scene);
		stage.show();
	}

}
