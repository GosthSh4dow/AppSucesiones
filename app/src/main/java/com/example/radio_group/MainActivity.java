package com.example.radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
 private EditText t1;
 private TextView res,res2,res3;
 private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.txt);
        res=(TextView)findViewById(R.id.text3);

        rb1=(RadioButton)findViewById(R.id.rb_fibo);
        rb2=(RadioButton)findViewById(R.id.rb_sec);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        //res3=(TextView)findViewById(R.id.jalar);
        res.setVisibility(View.GONE);


    }Intent g = new Intent  (this,MainActivity2.class);
    public void Calcular (View view){
     String va = (t1.getText().toString());
     String ds = "";
        if(va.equals("")){
            res.setText("Ingrese un Valor ");
            res.setVisibility(View.VISIBLE);
        }else{
        res.setVisibility(View.GONE);
       if(rb1.isChecked()==true){
            fibonacci();
           // startActivity(g);
            ds="Serie Fibonacci";
           

        }else if (rb2.isChecked()==true){
            secuelcial();
          //  startActivity(g);
            ds="Serie Secuencial";
        }else if (rb3.isChecked()==true){
            Bin();
          // startActivity(g);
           ds="Serie Binaria";
        }else if(rb4.isChecked()==true) {
           SecuencialP();
           //startActivity(g);
            ds="Serie Secuecial Pares";

       }Intent g = new Intent  (this,MainActivity2.class);
            g.putExtra("dato",res.getText().toString());
            g.putExtra("dato2",ds.toString());
            startActivity(g);

        }




    } public void Bin(){


        res.setText("");
        Stack <Integer> pila = new Stack<Integer>();
        String val = t1.getText().toString() ;
        int valor =Integer.parseInt(val);
        int a = 0;
        int b=1;
        String ab="";
        String ab2="";
        String v[]=new String [valor];
        for (int i = 1; i <= valor; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                if (i%2==0){

                    pila.push(a);
                    res.append(""+a+",");


                }else{
                   pila.push(b);
                   res.append(""+b+",");
                    //g.putExtra("dato", pila.push(b));
                }
            }
        }
    } public void fibonacci(){
        res.setText("");
        Stack<Integer>pila=new Stack<Integer>();
    String val = t1.getText().toString() ;
    String ab="";
    int valor =Integer.parseInt(val);

    int n, num1 = 0, num2 = 1, suma = 1, i;
    for (i = 1; i <= valor; i++) {
        pila.push(suma);
        res.append(""+suma+",");

        suma = num1 + num2;
        //Despues, cambiamos la segunda variable por la primera
        num1 = num2;
        //Por ultimo, cambiamos la suma por la segunda variable
        num2 = suma;

    }

} public void secuelcial(){
        res.setText("");
        Stack<Integer>pila=new Stack<Integer>();
        String ab="";
        String val = t1.getText().toString() ;

        int valor =Integer.parseInt(val);
        for (int i = 1; i <= valor; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                pila.push(i);
                res.append(""+i+",");

            }
        }

    }
    public void SecuencialP(){
        res.setText("");
        Stack<Integer>pila=new Stack<Integer>();
        String val = t1.getText().toString();
        String ab="";
        int valor =Integer.parseInt(val);
        for (int i = 0; i <= valor; i+=2) {

            for (int j = 1; j <= i; j++) {
               pila.push(i);
               res.append(""+i+",");

            }
        }
    }
}