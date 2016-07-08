package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;

/**
 * Created by Gabriel on 08/07/2016.
 */
public class Prova1 extends ActionBarActivity {

    private Button proxima_prova1;


    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.tela_prova1);

        proxima_prova1 = (Button) findViewById(R.id.btprova1);
        proxima_prova1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent trocatela = new
                Intent(Prova1.this, Prova2.class);
                Prova1.this.startActivity(trocatela);
                Prova1.this.finish();

            }
        });

    }

}
