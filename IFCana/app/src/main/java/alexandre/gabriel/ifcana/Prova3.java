package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Gabriel on 08/07/2016.
 */
public class Prova3 extends AppCompatActivity {

    private Button proxima_prova3;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.tela_prova3);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        mToolbar.setTitle("Cestinha");
        mToolbar.setLogo(R.drawable.app_icon);
        setSupportActionBar(mToolbar);

        proxima_prova3 = (Button) findViewById(R.id.btprova3);
        proxima_prova3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent trocatela = new
                Intent(Prova3.this, Prova4.class);
                Prova3.this.startActivity(trocatela);
                Prova3.this.finish();

            }
        });



    }
    
}
