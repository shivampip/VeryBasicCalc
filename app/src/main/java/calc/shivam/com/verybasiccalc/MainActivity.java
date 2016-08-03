package calc.shivam.com.verybasiccalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    TextView screen,sscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen= (TextView) findViewById(R.id.screen);
        sscreen= (TextView) findViewById(R.id.sscreen);


    }


    int a=0,b=0;
    boolean hasSymbol=false,hasSecNo=false;
    String symbol=null;
    String display="";
    String ans="";
    char sym='.';



    private void write ( int newA){try{
        display+=newA;
        sscreen.setText(display);

        if(!hasSymbol){
            a=a*10+newA;
        }
        else{
            b=b*10+newA;
            hasSecNo=true;
        }
    }catch (Exception e){}}

    private void writeSy( String newSy){try{

        if(hasSymbol&&hasSecNo){
            doOperation();
        }

        hasSymbol=true;
        display+=sym;
        sscreen.setText(display);
        symbol=newSy;
    }catch (Exception e){}}

    private void doOperation(){try{
        switch (symbol){
            case "add":
                a=a+b;
                break;
            case "sub":
                a=a-b;
                break;
            case "mul":
                a=a*b;
                break;
            case "div":
                a=a/b;
                break;
            default:
                a=a;
                break;
        }
        b=0;
        hasSymbol=false;
        hasSecNo=false;

        screen.setText(a+"");
    }catch (Exception e){}}


    public void one (View v){
        write(1);
    }
    public void two (View v){
        write(2);
    }
    public void three (View v){
        write(3);
    }
    public void four (View v){
        write(4);
    }
    public void five (View v){
        write(5);
    }
    public void six (View v){
        write(6);
    }
    public void seven (View v){
        write(7);
    }
    public void eight (View v){
        write(8);
    }
    public void nine (View v){
        write(9);
    }
    public void zero (View v){
        write(0);
    }



    public void add (View v){
        sym='+';
        writeSy("add");
    }
    public void sub (View v){
        sym='-';
        writeSy("sub");
    }
    public void mul (View v){
        sym='*';
        writeSy("mul");
    }
    public void div (View v){
        sym='/';
        writeSy("div");
    }
    public void equ (View v){
        doOperation();
        hasSymbol=false;
        hasSecNo=false;

    }
    public void clear (View v){
        a=0;
        b=0;
        symbol=null;
        hasSymbol=false;
        hasSecNo=false;
        sym='.';
        display="";
        sscreen.setText(display);
        screen.setText(display);
    }









}//class END
