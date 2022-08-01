package OnlineCourseProj;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.stage.*;
import javafx.geometry.*;

public class InfoBox {
    public  static boolean result;
    public static void alert(Label info){
        Stage alrt=new Stage();
        
        alrt.initModality(Modality.APPLICATION_MODAL);
        alrt.setTitle("Course Details");
        
        Label l1=new Label(">> DETAILS  \n\n\n");
        
        Button cls=new Button("close");
        cls.setOnAction(e-> {
            result = false;
            alrt.close();
        });
        
        Button rol=new Button("Enroll");
        rol.setOnAction(e-> {
            result = true;
            Learner.check(result);
            Alert.alert();
            alrt.close();
        });
        
        HBox la1=new HBox(10);
        la1.getChildren().addAll(rol,cls);
        
        VBox lay2=new VBox(5);
        lay2.getChildren().addAll(l1,info);
        
        VBox lay=new VBox(5);
        lay.getChildren().addAll(lay2,la1);
        lay.setAlignment(Pos.CENTER);
        
        Scene sc =new Scene(lay,300,250);
        alrt.setScene(sc);
        alrt.show();
    }
}
