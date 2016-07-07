package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Cadastro extends ActionBarActivity{

    private Spinner spinnerEquipe;
    private EditText nome, RA, curso, turma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        spinnerEquipe = (Spinner) findViewById(R.id.spinequipe);
        nome = (EditText) findViewById(R.id.ednome);
        RA = (EditText) findViewById(R.id.edRA);
        curso = (EditText) findViewById(R.id.edcurso);
        turma = (EditText) findViewById(R.id.edturma);

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
        String snome = nome.getText().toString();
        String sRA = RA.getText().toString();
        String sCurso = curso.getText().toString();
        String sTurma = turma.getText().toString();

        boolean validacao = true;

        if (snome == null || snome.equals("")){
            validacao = false;
            nome.setError(getString(R.string.error));
        }
        if (sRA == null || sRA.equals("")){
            validacao = false;
            RA.setError(getString(R.string.error));
        }
        if (sCurso == null || sCurso.equals("")){
            validacao = false;
            curso.setError(getString(R.string.error));
        }
        if (sTurma == null || sTurma.equals("")){
            validacao = false;
            turma.setError(getString(R.string.error));
        }
        if (validacao){
            startActivity(new Intent(this, TelaOpcoes2.class));
            finish();
        }
    }


}
