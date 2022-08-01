package OnlineCourseProj;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.stage.Stage;

public class Learner extends Application{
    public static boolean result;
    String nm,rl,pn,em;
    @Override
    public void start(Stage window) throws Exception{
        window.setTitle("Learner");
        
        Button b1=new Button("Home");
        Button b2=new Button("Courses");
        Button b3=new Button("My Course");
        Button b4=new Button("Login");
        Button cl=new Button("Close");
        
        HBox menu=new HBox(20);
        menu.getChildren().addAll(b1,b2,b3,b4,cl);
        
        ///Menu 2 for next Scene..
        
        Button bt1=new Button("Home");
        Button bt2=new Button("Courses");
        Button bt3=new Button("My Course");
        Button bt4=new Button("Login");
        
        HBox menu1=new HBox(20);
        menu1.getChildren().addAll(bt1,bt2,bt3,bt4);
        
        ///Menu 3 for next Scene..
        
        Button btn1=new Button("Home");
        Button btn2=new Button("Courses");
        Button btn3=new Button("My Course");
        Button btn4=new Button("Login");
        
        HBox menu2=new HBox(20);
        menu2.getChildren().addAll(btn1,btn2,btn3,btn4);
                
        ///Menu 4 for next Scene..
        
        Button bton1=new Button("Home");
        Button bton2=new Button("Courses");
        Button bton3=new Button("My Course");
        Button bton4=new Button("Login");
        
        HBox menu3=new HBox(20);
        menu3.getChildren().addAll(bton1,bton2,bton3,bton4);
        
        //Adding image to home screen
        
        Image img = new Image("C:\\Users\\ranji\\OneDrive\\Documents\\NetBeansProjects\\JavaFX\\src\\OnlineCourseProj\\UI.jpg");
        ImageView iv=new ImageView(img);
        iv.setPreserveRatio(true);
        
        BorderPane im=new BorderPane();
        im.getChildren().add(iv);
        //im.setCenter(iv);
        
        VBox homes = new VBox(20);
        homes.getChildren().addAll(menu,im);
        
        Scene home = new Scene(homes,1800,850);
        
        //Scene 3 Mycourse...
        
        Label tit=new Label("\n>> The Courses you have Enrolled\n\n");
        
        VBox my = new VBox(10);
        my.getChildren().add(tit);
        
        VBox rt2=new VBox();
        rt2.getChildren().addAll(menu2,my);
        
        Scene mycr=new Scene(rt2,1800,850);
        
        
        //Scene 02-Course..
        
        Label l1=new Label(">> Core Courses\n\n");
        Button eh=new Button("1. Ethical Hacking");
        eh.setOnAction(e -> {
            Label info=new Label("Course Name: Ethical Hacking\n" +
                                "Course Duration: 12 Weeks\n" +
                                "Course Type: Core\n" +
                                "Credits: 3 credits\n" +
                                "Course Instructor: Dr. Chaundary\n" +
                                "Course Offered by: IISc Bangalore\n");
            InfoBox.alert(info);
            //System.out.println(result);
            if(result){
                my.getChildren().add(new Button("Ethical Hacking"));
                result=false;
            }
        });
        
        Button ml=new Button("2. Machine Learning");
        ml.setOnAction(e -> {
            Label info=new Label("Course Name: Machine Learning\n" +
                                "Course Duration: 8 Weeks\n" +
                                "Course Type: Core\n" +
                                "Credits: 2 credits\n" +
                                "Course Instructor: Dr. Shanthi\n" +
                                "Course Offered by: IIT Bangalore\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Machine Learning"));
                result=false;
            }
        });
        
        Button dl=new Button("3. Deep Learning");
        dl.setOnAction(e -> {
            Label info=new Label("Course Name: Deep Learning\n" +
                                "Course Duration: 12 Weeks\n" +
                                "Course Type: Core\n" +
                                "Credits: 3 credits\n" +
                                "Course Instructor: Dr. Kamal\n" +
                                "Course Offered by: IIT Kanpur\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Deep Learning"));
                result=false;
            }
        });
        
        Button iot=new Button("4. Basics of IOT");
        iot.setOnAction(e -> {
            
            Label info=new Label("Course Name: Basics of IOT\n" +
                                "Course Duration: 12 Weeks\n" +
                                "Course Type: Core\n" +
                                "Credits: 3 credits\n" +
                                "Course Instructor: Dr. Layla\n" +
                                "Course Offered by: NIT Delhi\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Basics of IOT"));
                result=false;
            }
        });
        
        
        Label l2=new Label(">> Elective Courses\n\n");
        
        Button mm=new Button("1. Marketing Management");
        mm.setOnAction(e -> {
            Label info=new Label("Course Name: Marketing Management\n" +
                                "Course Duration: 8 Weeks\n" +
                                "Course Type: Elective\n" +
                                "Credits: 2 credits\n" +
                                "Course Instructor: Dr. Gopal\n" +
                                "Course Offered by: IIT Bangalore\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Marketing Management"));
                result=false;
            }
        });
        
        Button ss=new Button("2. Introduction to Soft Skill Development");
        ss.setOnAction(e -> {
            Label info=new Label("Course Name: Introduction to Soft Skill Development\n" +
                                "Course Duration: 8 Weeks\n" +
                                "Course Type: Elective\n" +
                                "Credits: 2 credits\n" +
                                "Course Instructor: Dr. Geetha\n" +
                                "Course Offered by: IIT Kanpur\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Introduction to Soft Skill Development"));
                result=false;
            }
        });
        
        Button en=new Button("3. Innovation, Business Models & Entrepreneurship");
        en.setOnAction(e -> {
            Label info=new Label("Course Name: Innovation, Business Models & Entrepreneurship\n" +
                                "Course Duration: 12 Weeks\n" +
                                "Course Type: Elective\n" +
                                "Credits: 3 credits\n" +
                                "Course Instructor: Dr. Nithya\n" +
                                "Course Offered by: IIT Assam\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Innovation, Business Models & Entrepreneurship"));
                result=false;
            }
        });
        
        Button ud=new Button("4. Understanding Design");
        ud.setOnAction(e -> {
            Label info=new Label("Course Name: Understanding Design\n" +
                                "Course Duration: 8 Weeks\n" +
                                "Course Type: Elective\n" +
                                "Credits: 2 credits\n" +
                                "Course Instructor: Dr. Kandasamy\n" +
                                "Course Offered by: NIT Bangalore\n");
            InfoBox.alert(info);
            if(result){
                my.getChildren().add(new Button("Understanding Design"));
                result=false;
            }
        });
        
        
        VBox crse =new VBox(10);
        crse.getChildren().addAll(l1,eh,ml,dl,iot,l2,mm,ss,en,ud);                                                                                                                 
        
        VBox root1=new VBox(20);
        root1.getChildren().addAll(menu1,crse);
        Scene course =new Scene(root1,1800,850);
        
        //Scene 4 Login...
        
        Label st=new Label("LOGIN Details :\n\n\n");
        
        Label name=new Label("Name    : \t");
        TextField t1=new TextField();
        
        Label roll=new Label("Roll No : \t");
        TextField t2=new TextField();
        
        Label mail=new Label("Email ID: \t");
        TextField t3=new TextField();
        
        Label ph=new Label("PH NO   : \t");
        TextField t4=new TextField();
        
        Button sign=new Button("Sign in");
        sign.setOnAction(e -> {
            
            nm=t1.getText();
            rl=t2.getText();
            em=t3.getText();
            pn=t4.getText();
            System.out.println("Latest Course Enrolled Candidate Details -\n"+"Candidate Name: "+nm.toUpperCase()+"\n"+"Roll Number: "+rl+"\n"+"Email ID: "+em+"\n"+"Phone Number: "+pn);
            try {
                FileWriter file=new FileWriter("E:\\OTHERS\\File01.txt");
                file.write("Latest Course Enrolled Candidate Details -\n"+"Candidate Name: "+nm.toUpperCase()+"\n"+"Roll Number: "+rl+"\n"+"Email ID: "+em+"\n"+"Phone Number: "+pn);
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Learner.class.getName()).log(Level.SEVERE, null, ex);
            }
            Alert.alert(nm);
            window.setScene(home);
        });
        
        GridPane log=new GridPane();
        log.setHgap(5);
        log.setVgap(10);
        log.addRow(0,st);
        log.addRow(1,name,t1);
        log.addRow(2,roll,t2);
        log.addRow(3,mail,t3);
        log.addRow(4,ph,t4);
        log.add(sign,2,6);
        
        VBox rt=new VBox();
        rt.getChildren().addAll(menu3,log);
        
        Scene login=new Scene(rt,1800,850);
        
        
        //Giving Actions
        
        b1.setOnAction(e -> window.setScene(home));
        b2.setOnAction(e -> window.setScene(course));
        b3.setOnAction(e -> window.setScene(mycr));
        b4.setOnAction(e -> window.setScene(login));
        cl.setOnAction(e -> window.close());
        
        bt1.setOnAction(e -> window.setScene(home));
        bt2.setOnAction(e -> window.setScene(course));
        bt3.setOnAction(e -> window.setScene(mycr));
        bt4.setOnAction(e -> window.setScene(login));
                
        btn1.setOnAction(e -> window.setScene(home));
        btn2.setOnAction(e -> window.setScene(course));
        btn3.setOnAction(e -> window.setScene(mycr));
        btn4.setOnAction(e -> window.setScene(login));
                        
        bton1.setOnAction(e -> window.setScene(home));
        bton2.setOnAction(e -> window.setScene(course));
        bton3.setOnAction(e -> window.setScene(mycr));
        bton4.setOnAction(e -> window.setScene(login));
        
        
        
        window.setScene(home);
        window.setMaximized(true);
        window.show();
    }
    static int n=0;
    public static void check(boolean r){
        result=r;
        n++;
            if(result==true && n>1){
                System.out.println("Course Enrolled Successfully !!");
            }
            
    }
    
    public static void main(String args[]){
        launch(args);
    }
}
