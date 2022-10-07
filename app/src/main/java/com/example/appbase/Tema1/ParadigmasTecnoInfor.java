package com.example.appbase.Tema1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import com.example.appbase.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class ParadigmasTecnoInfor extends AppCompatActivity {

    TextView padigma;
    Toolbar toolbar;
    int onStartCount = 0;

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paradigna_tecno_infor);
        setDayNhigt();
        onStartCount = 1;
        if (savedInstanceState == null) // 1st time
        {
            this.overridePendingTransition(R.anim.anim_slide_in_left,
                    R.anim.anim_slide_out_left);
        } else // already created so reverse animation
        {
            onStartCount = 2;
        }

        toolbar = findViewById(R.id.toolbarParadim);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setNavigationIcon(R.drawable.back);

            getSupportActionBar().setDisplayShowTitleEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
        CollapsingToolbarLayout ctl = findViewById(R.id.collapsParadim);
        ctl.setCollapsedTitleTextColor(getResources().getColor(R.color.colorBlanco));
        ctl.setExpandedTitleColor(getResources().getColor(R.color.colorBlanco));
        padigma= findViewById(R.id.padigmainfo);
        String t= " <p>Existen 3 tipos de paradigmas hist&oacute;ricos y tecnol&oacute;gicos de la Inform&aacute;tica:</p>\n" +
                "<h3><br>Tecnol&oacute;gico</h3>\n" +
                "<p>Disciplina que haciendo uso de otras (Matem&aacute;tica, F&iacute;sica, Electr&oacute;nica, etc.) dise&ntilde;a programas para el tratamiento automatizado de la informaci&oacute;n.</p>\n" +
                "<ol>\n" +
                "    <li>Concepto estrecho de la tecnolog&iacute;a (material-objetivo).</li>\n" +
                "    <li>Desconocimiento de resultados propios.</li>\n" +
                "</ol>\n" +
                "<h3>Cient&iacute;fico</h3>\n" +
                "<p>Disciplina que estudia la teor&iacute;a del tratamiento de la informaci&oacute;n (en todos sus formatos), para el descubrimiento y procesamiento del conocimiento y sus patrones.</p>\n" +
                "<ol>\n" +
                "    <li>Concepto o aspecto te&oacute;rico (subjetivos-ideales)</li>\n" +
                "    <li>Reconocimiento de resultados propios.</li>\n" +
                "</ol>\n" +
                "<h3>Tecno-cient&iacute;fico</h3>\n" +
                "<p>Consiste en la interrelaci&oacute;n entre el paradigma tecnol&oacute;gico y el cient&iacute;fico.</p>\n" +
                "<h3>Los diferentes dominios dentro de los paradigmas Cient&iacute;fico y Tecnol&oacute;gico:</h3>\n" +
                "<h4>Tecnol&oacute;gico:</h4>\n" +
                "<ol>\n" +
                "    <li>Industria de materiales</li>\n" +
                "    <li>Electr&oacute;nica</li>\n" +
                "    <li>Medios de calculo</li>\n" +
                "    <li>Telecomunicaciones</li>\n" +
                "</ol>\n" +
                "<h4>Cient&iacute;fico:</h4>\n" +
                "<ol>\n" +
                "    <li>Matematica</li>\n" +
                "    <li>F&iacute;sica</li>\n" +
                "    <li>Programaci&oacute;n</li>\n" +
                "    <li>Ingiener&iacute;a</li>\n" +
                "</ol>\n" +
                "<p><br></p>\n" +
                "<p><br></p>\n" +
                "<p><br></p>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            padigma.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));
        } else {
            padigma.setText(Html.fromHtml(t));
        }

    }



    public void setDayNhigt() {
        SharedPreferences sp = getSharedPreferences("SP", this.MODE_PRIVATE);
        int theme = sp.getInt("Theme", 1);
        if (theme == 1) {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        } else {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        }


    }
}
