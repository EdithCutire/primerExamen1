package com.example.primerapregunta;

import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public double valor1, valor2, valor3;
	public EditText mvalor1, mvalor2, mvalor3;
	public TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvalor1 = (EditText) findViewById(R.id.editText1);
        mvalor2 = (EditText) findViewById(R.id.editText2);
        mvalor3 = (EditText) findViewById(R.id.editText3);
        Resultado = (TextView) findViewById(R.id.textView2);
    }
    public void multiplicacion (View View){
    	valor1 = Double.parseDouble(mvalor1.getText().toString());
    	valor2 = Double.parseDouble(mvalor2.getText().toString());
    	valor3 = Double.parseDouble(mvalor3.getText().toString());
    	Resultado.setText(Double.toString(valor1*valor2*valor3));
    	
    	}
    public void cancelar(View View){
    	mvalor1.setText(" ");
    	mvalor2.setText(" ");
    	mvalor3.setText(" ");
    	Resultado.setText(" ");
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
