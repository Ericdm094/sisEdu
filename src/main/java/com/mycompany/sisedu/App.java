package com.mycompany.sisedu;

import com.mycompany.sisedu.controller.TeacherController;
import com.mycompany.sisedu.model.Teacher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 1280, 720);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
//        launch();

        Teacher teacher = new Teacher();
//        TeacherController teacherController = new TeacherController();
        
        teacher.setName("Helton tem down");
        teacher.setEmail("Helton tem down");
        teacher.setPassword("Helton tem down");
        
//        teacherController.save(teacher);
        System.out.println(teacher.getName());
    }

}