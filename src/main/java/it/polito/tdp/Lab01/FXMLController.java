package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	@FXML
    private TextArea txtTempiProcesso;
	 @FXML
	    private Button bottonDelete;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
   
  

    @FXML
    void doInsert(ActionEvent event) {
    	
    	 elenco.addParola(txtParola.getText());
    	 txtResult.setText("");
    	 for(String s: elenco.getElenco()) {
    	 
    		 txtResult.appendText(s+"\n");
    	 
    	 }
    	 
txtTempiProcesso.appendText("Tempo di inserimento: "+System.nanoTime()+" nanosecondi \n");

    }

    @FXML
    void doReset(ActionEvent event) {
      elenco.reset();
      txtResult.setText("");
 	 
txtTempiProcesso.appendText("Tempo di reset: "+System.nanoTime()+" nanosecondi \n");

    }

    @FXML
    void actionDelete(ActionEvent event) {
         elenco.deleteParola(txtParola.getText());
         txtResult.setText("");
    	 for(String s: elenco.getElenco()) {
    	 
    		 txtResult.appendText(s+"\n");
    	 
    	 }
    	 
txtTempiProcesso.appendText("Tempo di cancellazione: "+System.nanoTime()+" nanosecondi \n");

    }
    
    
    @FXML
    void initialize() {
        assert bottonDelete != null : "fx:id=\"bottonDelete\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempiProcesso != null : "fx:id=\"txtTempiProcesso\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }

}
