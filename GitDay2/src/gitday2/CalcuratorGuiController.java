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
       int i;
       Calc res = new Calc();
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
            numm1 = numm1.concat("1");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("1");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display2(ActionEvent event) {
         
        if(num1)
        {
            numm1 = numm1.concat("2");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("2");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display3(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("3");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("3");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display4(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("4");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("4");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display5(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("5");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("5");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display6(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("6");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("6");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display7(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("7");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("7");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display8(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("8");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("8");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display9(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("9");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("9");
           screen.setText(numm2);
        }
    }

    @FXML
    private void display0(ActionEvent event) {
         if(num1)
        {
            numm1 = numm1.concat("0");
            screen.setText(numm1);
        }
        else
        {
           numm2 = numm2.concat("0");
           screen.setText(numm2);
        }
    }

    @FXML
    private void displaypls(ActionEvent event) {
        num1 = false;
        num2 = true;
        i = 1;
    }

    @FXML
    private void displaysub(ActionEvent event) {
        num1 = false;
        num2 = true;
        i = 2;
    }

    @FXML
    private void displaymul(ActionEvent event) {
        num1 = false;
        num2 = true;
        i = 3;
    }

    @FXML
    private void displaydiv(ActionEvent event) {
        num1 = false;
        num2 = true;
        i = 4;
    }

    @FXML
    private void displayresult(ActionEvent event) {
        double j;
        switch (i)
        {
            case 1:
                j = res.sum(Double.valueOf(numm1), Double.valueOf(numm2));
                screen.setText(""+j);
            case 2:
                j = res.sub(Double.valueOf(numm1), Double.valueOf(numm2));
                screen.setText(""+j);
            case 3:
                j = res.multi(Double.valueOf(numm1), Double.valueOf(numm2));
                screen.setText(""+j);
            case 4:
                j = res.div(Double.valueOf(numm1), Double.valueOf(numm2));
                screen.setText(""+j);
        }
                
    }

    @FXML
    private void crear(ActionEvent event) {
        screen.setText("");
    }
    
}
