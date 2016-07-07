package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class TelaOpcoes extends ActionBarActivity {

    private Button cadastro;


    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.tela_opcoes);

        cadastro = (Button) findViewById(R.id.btcadastro);
        cadastro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent trocatela = new
                Intent(TelaOpcoes.this, Cadastro.class);
                TelaOpcoes.this.startActivity(trocatela);
                TelaOpcoes.this.finish();


            }
        });



    }

}
