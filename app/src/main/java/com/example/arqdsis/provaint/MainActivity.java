package com.example.arqdsis.provaint;



        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText nome;
    public static final String MainActivity = "com.usjt.nicolas.projetoaula15.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText)findViewById(R.id.busca_produto);
    }

    public void buscar(View view){
        Intent intent = new Intent(this,ListaProdutoActivity.class);
        String chave = nome.getText().toString();
        intent.putExtra(MainActivity, chave);
        starActivity(intent);
    }


    }

}