package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaOpcoes2 extends AppCompatActivity {

    private Button pontuacao, participante;



    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.tela_opcoes2);

        pontuacao = (Button) findViewById(R.id.btpontuacao);
        pontuacao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent trocatela = new
                Intent(TelaOpcoes2.this, Pontuacao.class);
                TelaOpcoes2.this.startActivity(trocatela);
                TelaOpcoes2.this.finish();


            }
        });

        participante = (Button) findViewById(R.id.btparticipante);
        participante.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent trocatela = new
                Intent(TelaOpcoes2.this, Prova1.class);
                TelaOpcoes2.this.startActivity(trocatela);
                TelaOpcoes2.this.finish();


            }
        });


    }

}
