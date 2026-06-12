package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/*
 * To-Do
 * 
 * Select Language
 * Enter PIN
 * Choose Transaction
 * Enter Amount
 * Enter Reason
 * Confirm Transaction
 * Receipt
 * 
 */

public class Main extends Application {
	
	private BorderPane root;
	
	private VBox sceneOne;
    private VBox sceneTwo;
    private VBox sceneThree;
	
	// private Controller controller = new Controller();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Controller controller = new Controller();

			root = new BorderPane();
			
			sceneOne = createScreen("Scene One");
	        sceneTwo = createScreen("Scene Two");
	        sceneThree = createScreen("Scene Three");
			
			root.setCenter(sceneThree);

			root.requestFocus();
			Scene scene = new Scene(root,1600,720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private VBox createScreen(String title) {

        Button withdrawButton = new Button("Withdraw");
        withdrawButton.setPrefWidth(150);
        withdrawButton.setPrefHeight(50);
        
        Button depositButton = new Button("Deposit");
        depositButton.setPrefWidth(150);
        depositButton.setPrefHeight(50);
        
        Button transactionHistoryButton = new Button("Transaction History");
        transactionHistoryButton.setPrefWidth(150);
        transactionHistoryButton.setPrefHeight(50);
        
        Label amountLabel = new Label("$20");

        HBox totalAmountBox = new HBox(amountLabel);
        totalAmountBox.setAlignment(Pos.CENTER);
        totalAmountBox.setPrefHeight(120);
        
        HBox mainBox = new HBox(new Label(title));
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setPrefHeight(480);
        
        HBox buttonHBox = new HBox(withdrawButton, depositButton, transactionHistoryButton);
        buttonHBox.setSpacing(10);
        buttonHBox.setAlignment(Pos.CENTER);
        buttonHBox.setPrefHeight(120);

        withdrawButton.setOnAction(e -> {
        	root.setCenter(sceneOne);
        	root.requestFocus();
        });
        depositButton.setOnAction(e -> {
        	root.setCenter(sceneTwo);
        	root.requestFocus();
        });
        transactionHistoryButton.setOnAction(e -> {
        	root.setCenter(sceneThree);
        	root.requestFocus();
        });

        VBox vbox = new VBox(totalAmountBox, mainBox, buttonHBox);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        return vbox;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
