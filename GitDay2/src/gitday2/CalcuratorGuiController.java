/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitday2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author manal
 */
public class CalcuratorGuiController implements Initializable {

     @FXML
    private TextField screen;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btnpls;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmul;
    @FXML
    private Button btndiv;
    @FXML
    private Button btneql;
    @FXML
    private Button crear;
       

       boolean num1,num2;
       private String numm1,numm2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        num1 =true;
        num2=false;
        numm1="";
        numm2="";
    }    

    @FXML
    private void display1(ActionEvent event) {
        
        if(num1)
        {
            numm1.concat("1");
            screen.setText(numm1);
        
        }
        else
        {
           numm2.concat("1"); 
        }
    }

    @FXML
    private void display2(ActionEvent event) {
         screen.setText("2");
        if(num1)
        {
            numm1.concat("2");
        }
        else
        {
           numm2.concat("2"); 
        }
    }

    @FXML
    private void display3(ActionEvent event) {
         screen.setText("3");
        if(num1)
        {
            numm1.concat("3");
        }
        else
        {
           numm2.concat("3"); 
        }
    }

    @FXML
    private void display4(ActionEvent event) {
         screen.setText("4");
        if(num1)
        {
            numm1.concat("4");
        }
        else
        {
           numm2.concat("4"); 
        }
    }

    @FXML
    private void display5(ActionEvent event) {
         screen.setText("5");
        if(num1)
        {
            numm1.concat("5");
        }
        else
        {
           numm2.concat("5"); 
        }
    }

    @FXML
    private void display6(ActionEvent event) {
         screen.setText("6");
        if(num1)
        {
            numm1.concat("6");
        }
        else
        {
           numm2.concat("6"); 
        }
    }

    @FXML
    private void display7(ActionEvent event) {
         screen.setText("7");
        if(num1)
        {
            numm1.concat("7");
        }
        else
        {
           numm2.concat("7"); 
        }
    }

    @FXML
    private void display8(ActionEvent event) {
         screen.setText("8");
        if(num1)
        {
            numm1.concat("8");
        }
        else
        {
           numm2.concat("8"); 
        }
    }

    @FXML
    private void display9(ActionEvent event) {
         screen.setText("9");
        if(num1)
        {
            numm1.concat("9");
        }
        else
        {
           numm2.concat("9"); 
        }
    }

    @FXML
    private void display0(ActionEvent event) {
         screen.setText("0");
        if(num1)
        {
            numm1.concat("0");
        }
        else
        {
           numm2.concat("0"); 
        }
    }

    @FXML
    private void displaypls(ActionEvent event) {
        
    }

    @FXML
    private void displaysub(ActionEvent event) {
    }

    @FXML
    private void displaymul(ActionEvent event) {
    }

    @FXML
    private void displaydiv(ActionEvent event) {
    }

    @FXML
    private void displayresult(ActionEvent event) {
    }

    @FXML
    private void crear(ActionEvent event) {
    }
    
}
