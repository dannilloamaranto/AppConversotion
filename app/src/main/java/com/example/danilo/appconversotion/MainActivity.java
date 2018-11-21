package com.example.danilo.appconversotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActionBar().setDisplayShowTitleEnabled(false);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        getActionBar().setIcon(R.mipmap.ic_launcher_round);

        this.mViewHolder.editText = findViewById(R.id.edit_value);
        this.mViewHolder.textEuro = findViewById(R.id.text_Euro);
        this.mViewHolder.textDolar = findViewById(R.id.text_Dolar);
        this.mViewHolder.botao = findViewById(R.id.buttom);

        this.mViewHolder.botao.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      int id = view.getId();
      if ( id == R.id.buttom) {
         if (this.mViewHolder.editText.getText().toString().equals("")){
             Toast alerta = Toast.makeText(this,getString(R.string.digite_um_valor), Toast.LENGTH_LONG);
             alerta.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
             alerta.show();
             this.mViewHolder.textDolar.setText("");
             this.mViewHolder.textEuro.setText("");
             }
          else{
             Double valor = Double.valueOf(this.mViewHolder.editText.getText().toString());
             this.mViewHolder.textDolar.setText(String.format("%.2f Dólar", valor / 3,37));
             this.mViewHolder.textEuro.setText(String.format("%.2f Euro", valor / 4,15));
         }

     }

      }



    private static class ViewHolder {
        TextView textDolar;
        TextView textEuro;
        EditText editText;
        Button botao;

    }
}

