package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Cadastro extends AppCompatActivity{

    private Spinner spinnerEquipe;
    private EditText equipe;
    //private ImageView bt_voltar;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        mToolbar.setTitle("Cadastrar Participante");
        mToolbar.setLogo(R.drawable.app_icon);

        spinnerEquipe = (Spinner) findViewById(R.id.spinequipe);
        equipe = (EditText) findViewById(R.id.nomeEquipe);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Vermelha");
        stringArrayList.add("Azul");
        stringArrayList.add("Verde");
        stringArrayList.add("Amarelo");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stringArrayList);
        stringArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerEquipe.setAdapter(stringArrayAdapter);
        spinnerEquipe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });}

    public void enviar(View view){
        String snome = equipe.getText().toString();

        boolean validacao = true;

        if (snome == null || snome.equals("")){
            validacao = false;
            equipe.setError(getString(R.string.error));
        }
        if (validacao){
            startActivity(new Intent(this, TelaOpcoes2.class));
            finish();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
