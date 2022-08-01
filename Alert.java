package OnlineCourseProj;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.stage.*;
import javafx.geometry.*;

public class Alert {
    public static void alert(){
        Stage alrt=new Stage();
        
        alrt.initModality(Modality.APPLICATION_MODAL);
        alrt.setTitle("CONFIRMATION");
        
        Label l =new Label("Course added successfully !!");
        Button cls=new Button("close");
        cls.setOnAction(e-> alrt.close());
        
        VBox lay=new VBox(5);
        lay.getChildren().addAll(l,cls);
        lay.setAlignment(Pos.CENTER);
        
        Scene sc =new Scene(lay,250,100);
        alrt.setScene(sc);
        alrt.show();
    }
    public static void alert(String n){
        Stage alrt=new Stage();
        
        alrt.initModality(Modality.APPLICATION_MODAL);
        alrt.setTitle("Signed In");
        
        Label l1 =new Label("WELCOME TO LEARNER "+n.toUpperCase());
        Label l =new Label("Signed in successfully !!");
        Button cls=new Button("close");
        cls.setOnAction(e-> alrt.close());
        
        VBox lay=new VBox(5);
        lay.getChildren().addAll(l1,l,cls);
        lay.setAlignment(Pos.CENTER);
        
        Scene sc =new Scene(lay,250,100);
        alrt.setScene(sc);
        alrt.show();
    }
}
