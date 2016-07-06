package alexandre.gabriel.ifcana;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class SplashScreen extends ActionBarActivity {


    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //metodo para trocar de tela automaticamente após o tempo do SPLASH_TIME_OUT
                Intent i = new Intent(SplashScreen.this, Cadastro.class);
                startActivity(i);

                finish();

            }
        },SPLASH_TIME_OUT);
    }

}
