/*
 * per adesso sono file sul mio pc, voglio trasformarlo in un progetto collegato a GIT
 * per creare un repository remoto vado su gitHub e lo creo, diventerà un repository nel mio spazio di lavoro
 * tasto dx sul progetto - team - share project
 * ho bisogno di un repository locale
 * sono comparte delle icone: il bidone è simbolo di repository
 * il maggiore e il minore indicano la versione più aggiornata
 * 
 * unstaged changes: tutti i file che sono stati modificati
 * staged changes: quelli che voglio modificare
 * sono cambiate tutte le iconcine
 * 
 * commit --> salva le modifiche solamente localmente
 * push --> lo salva anche nel repository sul web
 */

package it.polito.tdp.prova;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Prova.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
