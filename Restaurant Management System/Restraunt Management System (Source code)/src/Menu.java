import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Menu extends CustomerLogin {

	public static void main(String[] args){
		launch(args);
	}

	Text	 header, pFood, iFood, cFood, fFood,bFood, qnt, qnt1,qnt2, pFood1, 
			 pFood2,pFood3, pFood4,iFood1,iFood2,iFood3,iFood4,cFood1,
			 cFood2,cFood3,cFood4,fFood1,fFood2,fFood3,fFood4,
			 bFood1,bFood2,bFood3,bFood4,
			 price1,price2,price3 ;
	
	TextField   txtpFood1,txtpFood2,txtpFood3,txtpFood4,
				txtiFood1,txtiFood2,txtiFood3,txtiFood4,
				txtcFood1,txtcFood2,txtcFood3,txtcFood4,
				txtfFood1,txtfFood2,txtfFood3,txtfFood4,
				txtbFood1,txtbFood2,txtbFood3,txtbFood4,
				totalTxt,totalbTxt,pp1,pp2,pp3,pp4,pi1,pi2,pi3,pi4,
				pc1,pc2,pc3,pc4,pf1,pf2,pf3,pf4,pb1,pb2,pb3,pb4;
	


	Button order,vOrder, tBill, delivery, totalItems,logout; 
	
	private int p1,p2,p3,p4,
				i1,i2,i3,i4,
				c1,c2,c3,c4,
				f1,f2,f3,f4,
				b1,b2,b3,b4,
				t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
	
	
	

	public void start(Stage stage){
		
		 header = new Text("Menu");
		 header.setFont(Font.font(20.0));
		 pFood = new Text("Pakistani Food");
		 pFood.setFont(Font.font(15));
		 iFood = new Text("Italian Food");
		 iFood.setFont(Font.font(15));
		 cFood = new Text("Chinese Food");
		 cFood.setFont(Font.font(15));
		 fFood = new Text("Fast Food");
		 fFood.setFont(Font.font(15));
		 bFood = new Text("Beverage");
		 bFood.setFont(Font.font(15));
		 qnt = new Text("Quantity");
		 qnt.setFont(Font.font(10));
		 qnt1 = new Text("Quantity");
		 qnt1.setFont(Font.font(10));
		 qnt2 = new Text("Quantity");
		 qnt2.setFont(Font.font(10));
		 price1 = new Text("Price");
		 price1.setFont(Font.font(10));
		 price2 = new Text("Price");
		 price2.setFont(Font.font(10));
		 price3 = new Text("Price");
		 price3.setFont(Font.font(10));
		 
		 order = new Button("Order");
		 vOrder = new Button("View Order");
		 tBill = new Button("Total Bill");
		 delivery = new Button("Home Delivery");
		 logout = new Button("Logout");
		
		
		
		 pFood1 = new Text("Biryani");
		 txtpFood1 = new TextField();
		 txtpFood1.setMaxSize(40, 30);
		 txtpFood1.setText(0+"");
		 pFood2 = new Text("Nihari");
		 txtpFood2 = new TextField();
		 txtpFood2.setMaxSize(40, 30);
		 txtpFood2.setText(0+"");
		 pFood3 = new Text("Karahi");
		 txtpFood3 = new TextField();
		 txtpFood3.setMaxSize(40, 30);
		 txtpFood3.setText(0+"");
		 pFood4 = new Text("Qourma");
		 txtpFood4 = new TextField();
		 txtpFood4.setMaxSize(40, 30);
		 txtpFood4.setText(0+"");
		 
		 iFood1 = new Text("Panzenella");
		 txtiFood1 = new TextField();
		 txtiFood1.setMaxSize(40, 30);
		 txtiFood1.setText(0+"");
		 iFood2 = new Text("Bruschetta");
		 txtiFood2 = new TextField();
		 txtiFood2.setMaxSize(40, 30);
		 txtiFood2.setText(0+"");
		 iFood3 = new Text("Pasta Carbonara");
		 txtiFood3 = new TextField();
		 txtiFood3.setMaxSize(40, 30);
		 txtiFood3.setText(0+"");
		 iFood4 = new Text("Margherita Pizza");
		 txtiFood4 = new TextField();
		 txtiFood4.setMaxSize(40, 30);
		 txtiFood4.setText(0+"");
		 
		 cFood1 = new Text("Chow Mein ");
		 txtcFood1 = new TextField();
		 txtcFood1.setMaxSize(40, 30);
		 txtcFood1.setText(0+"");
		 cFood2 = new Text("Gong Bao Chicken");
		 txtcFood2 = new TextField();
		 txtcFood2.setMaxSize(40, 30);
		 txtcFood2.setText(0+"");
		 cFood3 = new Text("Wontons");
		 txtcFood3 = new TextField();
		 txtcFood3.setMaxSize(40, 30);
		 txtcFood3.setText(0+"");
		 cFood4 = new Text("Dumplings ");
		 txtcFood4 = new TextField();
		 txtcFood4.setMaxSize(40, 30);
		 txtcFood4.setText(0+"");
		 
		 fFood1 = new Text("Zinger Burger");
		 txtfFood1 = new TextField();
		 txtfFood1.setMaxSize(40, 30);
		 txtfFood1.setText(0+"");
		 fFood2 = new Text("Chicken Roll");
		 txtfFood2 = new TextField();
		 txtfFood2.setMaxSize(40, 30);
		 txtfFood2.setText(0+"");
		 fFood3 = new Text("Chiken Tikka");
		 txtfFood3 = new TextField();
		 txtfFood3.setMaxSize(40, 30);
		 txtfFood3.setText(0+"");
		 fFood4 = new Text("Broast");
		 txtfFood4 = new TextField();
		 txtfFood4.setMaxSize(40, 30);
		 txtfFood4.setText(0+"");
		 
		 bFood1 = new Text("Naan");
		 txtbFood1 = new TextField();
		 txtbFood1.setMaxSize(40, 30);
		 txtbFood1.setText(0+"");
		 bFood2 = new Text("Extra Rice");
		 txtbFood2 = new TextField();
		 txtbFood2.setMaxSize(40, 30);
		 txtbFood2.setText(0+"");
		 bFood3 = new Text("Pepsi");
		 txtbFood3 = new TextField();
		 txtbFood3.setMaxSize(40, 30);
		 txtbFood3.setText(0+"");
		 bFood4 = new Text("Dew");
		 txtbFood4 = new TextField();
		 txtbFood4.setMaxSize(40, 30);
		 txtbFood4.setText(0+"");
		 
		 totalItems = new Button("Total Items");
		 totalTxt = new TextField();
		 totalTxt.setEditable(false);
		 totalTxt.setMaxSize(50, 50);
		 totalbTxt = new TextField();
		 totalbTxt.setMaxSize(70, 50);
		 totalbTxt.setEditable(false);
		 totalbTxt.setText("Rs.");


		 
//		 //price TextField
		 pp1 = new TextField();
		 pp1.setMaxSize(50,30);
		 pp1.setEditable(false);
		 pp2 = new TextField();
		 pp2.setMaxSize(50,30);
		 pp2.setEditable(false);
		 pp3 = new TextField();
		 pp3.setMaxSize(50,30);
		 pp3.setEditable(false);
		 pp4 = new TextField();
		 pp4.setMaxSize(50,30);
		 pp4.setEditable(false);
		 pi1 = new TextField();
		 pi1.setMaxSize(50,30);
		 pi1.setEditable(false);
		 pi2 = new TextField();
		 pi2.setMaxSize(50,30);
		 pi2.setEditable(false);
		 pi3 = new TextField();
		 pi3.setMaxSize(50,30);
		 pi3.setEditable(false);
		 pi4 = new TextField();
		 pi4.setMaxSize(50,30);
		 pi4.setEditable(false);
		 pc1 = new TextField();
		 pc1.setMaxSize(50,30);
		 pc1.setEditable(false);
		 pc2 = new TextField();
		 pc2.setMaxSize(50,30);
		 pc2.setEditable(false);
		 pc3 = new TextField();
		 pc3.setMaxSize(50,30);
		 pc3.setEditable(false);
		 pc4 = new TextField();
		 pc4.setMaxSize(50,30);
		 pc4.setEditable(false);
		 pf1 = new TextField();
		 pf1.setMaxSize(50,30);
		 pf1.setEditable(false);
		 pf2 = new TextField();
		 pf2.setMaxSize(50,30);
		 pf2.setEditable(false);
		 pf3 = new TextField();
		 pf3.setMaxSize(50,30);
		 pf3.setEditable(false);
		 pf4 = new TextField();
		 pf4.setMaxSize(50,30);
		 pf4.setEditable(false);
		 pb1 = new TextField();
		 pb1.setMaxSize(50,30);
		 pb1.setEditable(false);
		 pb2 = new TextField();
		 pb2.setMaxSize(50,30);
		 pb2.setEditable(false);
		 pb3 = new TextField();
		 pb3.setMaxSize(50,30);
		 pb3.setEditable(false);
		 pb4 = new TextField();
		 pb4.setMaxSize(50,30);
		 pb4.setEditable(false);

		 
		 // Edit Price
		 pp1.setText(100+"");
		 pp2.setText(120+"");
		 pp3.setText(150+"");
		 pp4.setText(130+"");
		 pi1.setText(350+"");
		 pi2.setText(400+"");
		 pi3.setText(570+"");
		 pi4.setText(799+"");
		 pc1.setText(270+"");
		 pc2.setText(250+"");
		 pc3.setText(330+"");
		 pc4.setText(450+"");
		 pf1.setText(240+"");
		 pf2.setText(120+"");
		 pf3.setText(150+"");
		 pf4.setText(200+"");
		 pb1.setText(20+"");
		 pb2.setText(140+"");
		 pb3.setText(50+"");
		 pb4.setText(50+"");
		 
		 
		 
		 totalItems.setOnAction(new EventHandler<ActionEvent>()
				 {
			 
			 @Override
			 public void handle(ActionEvent event){
				try{
				
				 p1 = Integer.parseInt(txtpFood1.getText());
				 p2 = Integer.parseInt(txtpFood2.getText());
				 p3 = Integer.parseInt(txtpFood3.getText());
				 p4 = Integer.parseInt(txtpFood4.getText());
				 i1 = Integer.parseInt(txtiFood1.getText());
				 i2 = Integer.parseInt(txtiFood2.getText());
				 i3 = Integer.parseInt(txtiFood3.getText());
				 i4 = Integer.parseInt(txtiFood4.getText());
				 c1 = Integer.parseInt(txtcFood1.getText());
				 c2 = Integer.parseInt(txtcFood2.getText());
				 c3 = Integer.parseInt(txtcFood3.getText());
				 c4 = Integer.parseInt(txtcFood4.getText());
				 f1 = Integer.parseInt(txtfFood1.getText());
				 f2 = Integer.parseInt(txtfFood2.getText());
				 f3 = Integer.parseInt(txtfFood3.getText());
				 f4 = Integer.parseInt(txtfFood4.getText());
				 b1 = Integer.parseInt(txtbFood1.getText());
				 b2 = Integer.parseInt(txtbFood2.getText());
				 b3 = Integer.parseInt(txtbFood3.getText());
				 b4 = Integer.parseInt(txtbFood4.getText());
				 
				 Integer z = p1+p2+p3+p4+i1+i2+i3+i4+c1+c2+c3+c4+f1+f2+f3+f4+b1+b2+b3+b4;
				 totalTxt.setText(z.toString());
			 }
			 catch(Exception ex){
				 
			 }
				}
				 });
		 tBill.setOnAction(new EventHandler<ActionEvent>()
		 {
	 
			 @Override
			 public void handle(ActionEvent event){
				 try{
		
				 
				 t1 = Integer.parseInt(pp1.getText());
				 t2 = Integer.parseInt(pp2.getText());
				 t3 = Integer.parseInt(pp3.getText());
				 t4 = Integer.parseInt(pp4.getText());
				 t5 = Integer.parseInt(pi1.getText());
				 t6 = Integer.parseInt(pi2.getText());
				 t7 = Integer.parseInt(pi3.getText());
				 t8 = Integer.parseInt(pi4.getText());
				 t9 = Integer.parseInt(pc1.getText());
				 t10 = Integer.parseInt(pc2.getText());
				 t11 = Integer.parseInt(pc3.getText());
				 t12 = Integer.parseInt(pc4.getText());
				 t13 = Integer.parseInt(pf1.getText());
				 t14 = Integer.parseInt(pf2.getText());
				 t15 = Integer.parseInt(pf3.getText());
				 t16 = Integer.parseInt(pf4.getText());
				 t17 = Integer.parseInt(pb1.getText());
				 t18 = Integer.parseInt(pb2.getText());
				 t19 = Integer.parseInt(pb3.getText());
				 t20 = Integer.parseInt(pb4.getText());

				 
			Integer z = (p1*t1)+(p2*t2)+(p3*t3)+(p4*t4)+(i1*t5)+(i2*t6)+(i3*t7)+
						(i4*t8)+(c1*t9)+(c2*t10)+(c3*t11)+(c4*t12)+(f1*t13)+
						(f2*t14)+(f3*t15)+(f4*t16)+(b1*t17)+(b2*t18)+(b3*t19)+(b4*t20);
		
			totalbTxt.setText("Rs."+z.toString());
	 }
	 catch(Exception ex){
		 ex.printStackTrace();
	 }
		}
		 });
		 
		 logout.setOnAction(x->{
	    	   CustomerLogin cl = new CustomerLogin();
				try {
				cl.start(stage);
				} catch (Exception e) {
					e.printStackTrace();
				}
	       });
		 
		
		 
		 GridPane gp = new GridPane();
		 Label add = new Label("Please Enter Your Address");
			Button ok = new Button("OK");
			Button back2 = new Button("Back");
			TextArea txadd = new TextArea();
			txadd.setMaxSize(200, 70);
			
			gp.add(back2,0,0);
			gp.add(add,0,1);
			gp.add(txadd,1,1);
			gp.add(ok,1,2);
			
		 Scene scene3 = new Scene(gp,450,250);
			
			
		 delivery.setOnAction( new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
			
				
				if(p1>0 || p2>0 || p3>0 || p4>0 || i1>0 || i2>0 || i3>0 || i4>0 || c1>0 || c2>0
						|| c3>0|| c4>0|| f1>0|| f2>0|| f3>0|| f4>0|| b1>0|| b2>0|| b3>0|| b4>0){
					
					stage.setScene(scene3);
					stage.setTitle("Home Delivery");
					stage.show();
				}
			}
				});	
					
				ok.setOnAction(x->{
					String z = txadd.getText();
					if(z == null){
						  
			              Alert alert2 = new Alert(AlertType.INFORMATION);
			              alert2.setTitle("Information");
			              alert2.setHeaderText(null);
			              alert2.setContentText("Please Enter Address");
			              alert2.showAndWait();
							}
					else {
						if(z != null){
							
							DeliveryBoy db = new DeliveryBoy(z);

							Alert alert = new Alert(AlertType.INFORMATION);
			              alert.setTitle("Information");
			              alert.setHeaderText("Thank You");
			              alert.setContentText("Your order will be delivered within 60 minutes");
			              alert.showAndWait();	
						}
	
					}
					
				});	
					
				 	
		

		 VBox gPane = new VBox();
		 gPane.setSpacing(5);
		 Button back = new Button("back");
		 gPane.getChildren().add(back);
		 
		 Scene scene2 = new Scene(gPane, 950, 600);
			stage.setTitle("Order Menu");
			gPane.setAlignment(Pos.CENTER);
	        stage.setScene(scene2);
	        stage.show();
			
		 vOrder.setOnAction(new EventHandler<ActionEvent>(){

			 @Override
			public void handle(ActionEvent arg0) {

				 
				
				try{
					if(p1>0){
						gPane.getChildren().add(new Label("Biryani"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(p1+"");
						gPane.getChildren().add(ttp);
					}
					if(p2>0){
						gPane.getChildren().add(new Label("Nihari"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(p2+"");
						gPane.getChildren().add(ttp);
						}
					if(p3>0){
						gPane.getChildren().add(new Label("Karahi"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(p3+"");
						gPane.getChildren().add(ttp);
						}
					if(p4>0){
						gPane.getChildren().add(new Label("Qourma"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(p4+"");
						gPane.getChildren().add(ttp);
					}
					if(i1>0){
						gPane.getChildren().add(new Label("Panzenella"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(i1+"");
						gPane.getChildren().add(ttp);
					}
					if(i2>0){
						gPane.getChildren().add(new Label("Bruschetta"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(i2+"");
						gPane.getChildren().add(ttp);
						}
					if(i3>0){
						gPane.getChildren().add(new Label("Pasta Carbonara"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(i3+"");
						gPane.getChildren().add(ttp);
						}
					if(i4>0){
						gPane.getChildren().add(new Label("Margherita Pizza"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(i4+"");
						gPane.getChildren().add(ttp);
						}
					if(c1>0){
						gPane.getChildren().add(new Label("Chow Mein"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(c1+"");
						gPane.getChildren().add(ttp);
						}
					if(c2>0){
						gPane.getChildren().add(new Label("Gong Bao Chicken"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(c2+"");
						gPane.getChildren().add(ttp);
						}
					if(c3>0){
						gPane.getChildren().add(new Label("Wontons"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(c3+"");
						gPane.getChildren().add(ttp);
						}
					if(c4>0){
						gPane.getChildren().add(new Label("Dumplings"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(c4+"");
						gPane.getChildren().add(ttp);
						}
					if(f1>0){
						gPane.getChildren().add(new Label("Zinger Burger"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(f1+"");
						gPane.getChildren().add(ttp);
						}
					if(f2>0){
						gPane.getChildren().add(new Label("Chicken Roll"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(f2+"");
						gPane.getChildren().add(ttp);
						}
					if(f3>0){
						gPane.getChildren().add(new Label("Chicken Tikka"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(f3+"");
						gPane.getChildren().add(ttp);
						}
					if(f4>0){
						gPane.getChildren().add(new Label("Broast"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(f4+"");
						gPane.getChildren().add(ttp);
						}
					if(b1>0){
						gPane.getChildren().add(new Label("Naan"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(b1+"");
						gPane.getChildren().add(ttp);
						}
					if(b2>0){
						gPane.getChildren().add(new Label("Extra Rice"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(b2+"");
						gPane.getChildren().add(ttp);
						}
					if(b3>0){
						gPane.getChildren().add(new Label("Pepsi"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(b3+"");
						gPane.getChildren().add(ttp);
						}
					if(b4>0){
						gPane.getChildren().add(new Label("Dew"));
						TextField ttp = new TextField();
						ttp.setMaxSize(50,30);
						ttp.setEditable(false);
						ttp.setText(b4+"");
						gPane.getChildren().add(ttp);
						}
					stage.setScene(scene2);
			        stage.show();
				}
					catch (Exception ex){
						
					}
			}

			
		 });

		 
		 order.setOnAction(x->{
			 
			 ChefOrder cOrder = new ChefOrder(scene2,stage);
			 WaiterOrder wOrder = new WaiterOrder(scene2,stage);
		 
			 if(p1>0 || p2>0 || p3>0 || p4>0 || i1>0 || i2>0 || i3>0 || i4>0 || c1>0 || c2>0
				|| c3>0|| c4>0|| f1>0|| f2>0|| f3>0|| f4>0|| b1>0|| b2>0|| b3>0|| b4>0){
			// ChefMainPannel chef = new ChefMainPannel(scene2,stage);
			 Alert alert = new Alert(AlertType.INFORMATION);
             alert.setTitle("Order status");
             alert.setHeaderText(null);
             alert.setContentText("Your order successfully placed!!!");
             alert.showAndWait();
			 }
			 else{
				 Alert alert = new Alert(AlertType.INFORMATION);
	             alert.setTitle("Order status");
	             alert.setHeaderText(null);
	             alert.setContentText("Order is Empty!!");
	             alert.showAndWait();
			 }
			 
		 });
		 
		 
		
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.add(logout,0,0);
        gridPane.add(header, 3,0);
        gridPane.add(pFood, 0, 1);
        gridPane.add(qnt, 1,1);
        gridPane.add(price1, 2,1);
        gridPane.add(pFood1 , 0, 2);
        gridPane.add(txtpFood1, 1,2);
        gridPane.add(pFood2 , 0, 3);
        gridPane.add(txtpFood2, 1,3);
        gridPane.add(pFood3 , 0, 4);
        gridPane.add(txtpFood3, 1,4);
        gridPane.add(pFood4 , 0, 5);
        gridPane.add(txtpFood4, 1,5);
		gridPane.add(iFood, 0,6);
		gridPane.add(iFood1 , 0, 7);
        gridPane.add(txtiFood1, 1,7);
        gridPane.add(iFood2 , 0, 8);
        gridPane.add(txtiFood2, 1,8);
        gridPane.add(iFood3 , 0, 9);
        gridPane.add(txtiFood3, 1,9);
        gridPane.add(iFood4 , 0, 10);
        gridPane.add(txtiFood4, 1,10);
        
        gridPane.add(qnt1, 4,1);
        gridPane.add(price2, 5, 1);
        gridPane.add(cFood, 3,1);
		gridPane.add(cFood1 , 3, 2);
        gridPane.add(txtcFood1, 4,2);
        gridPane.add(cFood2 , 3, 3);
        gridPane.add(txtcFood2, 4,3);
        gridPane.add(cFood3 , 3, 4);
        gridPane.add(txtcFood3, 4,4);
        gridPane.add(cFood4 , 3, 5);
        gridPane.add(txtcFood4, 4,5);
        gridPane.add(fFood, 3,6);
		gridPane.add(fFood1 , 3, 7);
        gridPane.add(txtfFood1, 4,7);
        gridPane.add(fFood2 , 3, 8);
        gridPane.add(txtfFood2, 4,8);
        gridPane.add(fFood3 , 3, 9);
        gridPane.add(txtfFood3, 4,9);
        gridPane.add(fFood4 , 3, 10);
        gridPane.add(txtfFood4, 4,10);
        
        //Beverage
        gridPane.add(bFood,6,1);
        gridPane.add(qnt2,7,1);
        gridPane.add(price3,8,1);
        gridPane.add(bFood1,6,2);
        gridPane.add(txtbFood1,7,2);
        gridPane.add(pb1,8,2);
        gridPane.add(bFood2,6,3);
        gridPane.add(txtbFood2,7,3);
        gridPane.add(pb2,8,3);
        gridPane.add(bFood3,6,4);
        gridPane.add(txtbFood3,7,4);
        gridPane.add(pb3,8,4);
        gridPane.add(bFood4,6,5);
        gridPane.add(txtbFood4,7,5);
        gridPane.add(pb4,8,5);
        
        //Button
        gridPane.add(order, 3, 14);
        gridPane.add(vOrder, 1, 12);
        gridPane.add(tBill, 2, 12);
       
		gridPane.add(totalItems, 4,12);
        gridPane.add(totalTxt, 5,12);
        gridPane.add(totalbTxt,3, 12);
 
          
		gridPane.add(delivery, 9,1);
        
		
		//Price
		gridPane.add(pp1,2,2);
		gridPane.add(pp2,2,3);
		gridPane.add(pp3,2,4);
		gridPane.add(pp4,2,5);
		gridPane.add(pi1,2,7);
		gridPane.add(pi2,2,8);
		gridPane.add(pi3,2,9);
		gridPane.add(pi4,2,10);
		gridPane.add(pc1,5,2);
		gridPane.add(pc2,5,3);
		gridPane.add(pc3,5,4);
		gridPane.add(pc4,5,5);
		gridPane.add(pf1,5,7);
		gridPane.add(pf2,5,8);
		gridPane.add(pf3,5,9);
		gridPane.add(pf4,5,10);

        
		Scene scene = new Scene(gridPane,950,600);
        stage.setTitle("Customer");
        stage.setScene(scene);
        stage.show();
        
       
		 
		 
        
	        back.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					stage.setScene(scene);
					stage.show();
				}
				 
			 });
	        back2.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					stage.setScene(scene);
					stage.show();
				}
				 
				});	
	}
	
	
}

