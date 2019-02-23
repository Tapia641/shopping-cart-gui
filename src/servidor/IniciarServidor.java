package servidor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IniciarServidor extends  Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/servidor/servidorInterfaz.fxml"));
        primaryStage.setTitle("Servidor");
        primaryStage.setScene(new Scene(root, 900, 900));
        Controlador C = new Controlador();
        C.CargarDatos();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}