package dialog.giovanivani.com.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // CRIANDO O ALERT DIALOG
                dialog = new AlertDialog.Builder(MainActivity.this);

                //CONFIGURANDO O TITULO
                dialog.setTitle("Titulo Dialog");

                //CONFIGURAR MSG
                dialog.setMessage("Mensagem Dialog");

                //CONFIGURANDO BOTAO NEGATIVO
                dialog.setNegativeButton("Não",
                    new DialogInterface.OnClickListener(){

                    }



            }
        });
    }
}
