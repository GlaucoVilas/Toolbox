package com.firebase.cursoandroid.toolbox_treinamento_boas_praticas;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Context context;

    private CheckBox cb_ios;
    private CheckBox cb_android;

    private RadioGroup rg;
    private RadioButton rb_m;
    private RadioButton rb_f;

    private ToggleButton tb_tomada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVars();
        initActions();
    }

    private void initVars() {
        context = getBaseContext();

        cb_ios = (CheckBox) findViewById(R.id.cb_ios);
        cb_android = (CheckBox) findViewById(R.id.cb_android);

        rg = (RadioGroup) findViewById(R.id.rg);
        rb_m = (RadioButton) findViewById(R.id.rb_m);
        rb_f = (RadioButton) findViewById(R.id.rb_f);

        tb_tomada = (ToggleButton) findViewById(R.id.tb_tomada);
    }

    private void initActions() {

        ScreenToBD();
        BDtoScreen();

    }

    private void ScreenToBD() {
        int s_ios;
        int s_android;

        String sexo;

        boolean sligado;

        s_ios = Toolbox.sConvInt(cb_ios.isChecked());
        s_android = Toolbox.sConvInt(cb_android.isChecked());

        sexo = rg.getCheckedRadioButtonId() == R.id.rb_m ? "m" : "f";

        sligado = tb_tomada.isChecked();
    }

    private void BDtoScreen() {
        int s_ios = 1;
        int s_android = 0;

        String sexo = "f"; // f / M  s / n

        boolean sligado = true; // true / false

        cb_ios.setChecked(Toolbox.sConv(s_ios));
        cb_android.setChecked(Toolbox.sConv(s_android));

        switch (sexo) {
            case "m":
                rb_m.setChecked(true);
                break;
            case "f":
                rb_f.setChecked(true);
                break;
            default:
                break;
        }
        tb_tomada.setChecked(sligado);
    }
}
