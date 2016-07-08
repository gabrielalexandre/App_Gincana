package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Gabriel on 08/07/2016.
 */
public class Prova4 extends ActionBarActivity {

    private Button proxima_prova4;


    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.tela_prova4);

        proxima_prova4 = (Button) findViewById(R.id.btprova4);
        proxima_prova4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent trocatela = new
                Intent(Prova4.this, Prova5.class);
                Prova4.this.startActivity(trocatela);
                Prova4.this.finish();

            }
        });

    }
    
}
