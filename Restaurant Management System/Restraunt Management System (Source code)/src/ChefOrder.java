import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChefOrder extends Chef {

	private Scene old_scene2;
	private Stage old_stage;
	private Stage stage;
	ChefOrder()
	{
		
	}

	ChefOrder(Scene scene2,Stage stage)
	{
		this.old_scene2=scene2;
		this.setOld_stage(stage);
		
		this.stage = new Stage();
		start(this.stage);
	}
	
	
	

	public void start(Stage stage){
	
				stage.setScene(old_scene2);
				stage.setTitle("Chef Order");
				stage.show();
				
			
		
	}
	public Stage getOld_stage() {
		return old_stage;
	}
	public void setOld_stage(Stage old_stage) {
		this.old_stage = old_stage;
	}
	public Scene getOld_scene2() {
		return old_scene2;
	}
	public void setOld_scene2(Scene old_scene2) {
		this.old_scene2 = old_scene2;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}

