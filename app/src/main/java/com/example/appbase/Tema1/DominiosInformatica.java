package com.example.appbase.Tema1;


import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.appbase.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DominiosInformatica extends AppCompatActivity {


    TextView dominio;
    Toolbar toolbar;
    int onStartCount = 0;

    Context  context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dominios_infor);
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

        toolbar = findViewById(R.id.toolbardominios);
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
        CollapsingToolbarLayout ctl = findViewById(R.id.collapsitdominios);
        ctl.setCollapsedTitleTextColor(getResources().getColor(R.color.colorBlanco));
        ctl.setExpandedTitleColor(getResources().getColor(R.color.colorBlanco));
        dominio= findViewById(R.id.dominioinfo);
       String t= "<p>Los dominios de la inform&aacute;tica son aquellas &aacute;reas de la tecnolog&iacute;a y la sociedad donde se aplican los m&eacute;todos, t&eacute;cnicas y procedimientos de la inform&aacute;tica.</p>\n" +
               "<h3>Perspectiva social:</h3>\n" +
               "<ol>\n" +
               "    <li>Inf. Educativa</li>\n" +
               "    <li>Inf. Criminal&iacute;stica</li>\n" +
               "    <li>Inf. Del Ocio</li>\n" +
               "    <li>Dom&oacute;tica</li>\n" +
               "    <li>Teleinform&aacute;tica</li>\n" +
               "    <li>Ofim&aacute;tica</li>\n" +
               "    <li>Inf. Industrial</li>\n" +
               "    <li>Nanoinform&aacute;tica</li>\n" +
               "    <li>Inf. Del Transporte</li>\n" +
               "    <li>Inf. Jur&iacute;dica</li>\n" +
               "    <li>Inf. Medica</li>\n" +
               "    <li style=\"text-align: left;\">Inf. Empresarial</li>\n" +
               "</ol>\n" +
               "<h3>Perspectiva Tecnol&oacute;gica:</h3>\n" +
               "<ol>\n" +
               "    <li>Transmisi&oacute;n y Recepci&oacute;n de datos</li>\n" +
               "    <li>Gesti&oacute;n y Administraci&oacute;n Comunicaci&oacute;n y teletrabajo</li>\n" +
               "    <li>Sistemas Operativos</li>\n" +
               "    <li>Dise&ntilde;o Asistido por Computadora</li>\n" +
               "    <li>Tecnolog&iacute;as de datos</li>\n" +
               "    <li>Seguridad Inform&aacute;tica</li>\n" +
               "    <li>Rob&oacute;tica y control Aut&oacute;nomo</li>\n" +
               "</ol>\n" +
               "<h3>&iquest;Para qu&eacute; sirve la inform&aacute;tica?</h3>\n" +
               "<p>La inform&aacute;tica es la forma cient&iacute;fica de procesar la informaci&oacute;n. Este procesamiento consiste en ordenar, seleccionar, ejecutar c&aacute;lculos de forma que nos permita extraer conclusiones de la informaci&oacute;n manipulada. Procesar informaci&oacute;n es transformar datos primarios en informaci&oacute;n organizada, significativa y &uacute;til, que a su vez est&aacute; compuesta de datos.</p>\n" +
               "<h3><br>Procesamiento de im&aacute;genes</h3>\n" +
               "<p style=\"text-align: left;\">El procesamiento de im&aacute;genes es la manipulaci&oacute;n por computadoras de im&aacute;genes para varios fines:<br>Compresi&oacute;n de im&aacute;genes,mejoramiento y reconstrucci&oacute;n de im&aacute;genes,conteo de c&eacute;lulas vistas en el microscopio,detecci&oacute;n de tumores en rayos X,producci&oacute;n de mapas a trav&eacute;s de im&aacute;genes satelitales, entre otros.</p>\n" +
               "<h3><br>Criptograf&iacute;a</h3>\n" +
               "<p>La criptograf&iacute;a es la ciencia de la comunicaci&oacute;n secreta. Esta es de gran importancia para proporcionar seguridad en las redes de comunicaci&oacute;n y en los sistemas de computaci&oacute;n.<br>Las herramientas criptogr&aacute;ficas son usadas para prevenir que intrusos tengan acceso a los archivos u otros recursos en los sistemas de computaci&oacute;n, en el comercio electr&oacute;nico, para prevenir la pirater&iacute;a electr&oacute;nica y en las monedas virtuales.</p>\n" +
               "<h3><br>Miner&iacute;a de datos</h3>\n" +
               "<p>La cantidad de datos que se generan en la actualidad, gracias a la ciencia y a la tecnolog&iacute;a, crece a una velocidad espeluznante. La miner&iacute;a de datos (data mining en ingl&eacute;s) es el proceso por el cual programas de computaci&oacute;n se usan para la b&uacute;squeda, an&aacute;lisis y utilizaci&oacute;n de los datos. A trav&eacute;s de la miner&iacute;a de datos se pueden descubrir nuevos patrones y se genera conocimiento e informaci&oacute;n.</p>\n" +
               "<h3 style=\"text-align: left;\">Teleinform&aacute;tica</h3>\n" +
               "<p>La teleinform&aacute;tica combina la inform&aacute;tica y las telecomunicaciones. La necesidad de transmisi&oacute;n de datos e informaci&oacute;n entre lugares distantes, de forma r&aacute;pida, se lleva a cabo mediante la interconexi&oacute;n de computadoras, terminales y otros equipos. Para ello se usa alg&uacute;n medio adecuado de comunicaci&oacute;n, como por ejemplo, las l&iacute;neas telef&oacute;nicas, los cables coaxiales, y las microondas.<br>Mediante la conexi&oacute;n de la computadora a la red telef&oacute;nica se incorporan otra inmensa cantidad de posibilidades:</p>\n" +
               "<ol>\n" +
               "    <li>sistemas de correo electr&oacute;nico</li>\n" +
               "    <li>acceso a bases de datos de informaci&oacute;n general</li>\n" +
               "    <li>uso de software de red</li>\n" +
               "    <li>realizaci&oacute;n de operaciones bancarias</li>\n" +
               "    <li>telecompra</li>\n" +
               "    <li>cursos de ense&ntilde;anza a distancia</li>\n" +
               "</ol>\n" +
               "<h3>Inteligencia artificial</h3>\n" +
               "<p>La inteligencia artificial es una rama de la inform&aacute;tica cuyo objetivo es proporcionar computadores que permitan simular la inteligencia humana. La computadora puede ser programada para imitar el pensamiento humano, d&aacute;ndole gran cantidad de informaci&oacute;n y la capacidad para hacer buen uso de la misma.Entre las aplicaciones de la inteligencia artificial est&aacute;n los programas de reconocimiento de la voz y reconocimiento de formas, la rob&oacute;tica y la ense&ntilde;anza asistida por computadora.</p>\n" +
               "<h3>Dom&oacute;tica</h3>\n" +
               "<p>La computadora personal se ha convertido en un aparato dom&eacute;stico m&aacute;s en nuestros hogares. La dom&oacute;tica se refiere a la automatizaci&oacute;n de los hogares y edificaciones, en lo que se denomina &quot;casas inteligentes&quot;. Los sistemas de control de la iluminaci&oacute;n, temperatura, alarma y seguridad son programables en muchos recintos.</p>\n" +
               "<h3>Bioinform&aacute;tica</h3>\n" +
               "<p>La bioinform&aacute;tica es el campo de la biolog&iacute;a que se dedica al procesamiento de datos biol&oacute;gicos y estad&iacute;sticos usando herramientas inform&aacute;ticas.La inform&aacute;tica es una herramienta imprescindible para analizar las secuencias gen&eacute;ticas, las secuencias de proteinas y y otros sistemas biol&oacute;gicos.</p>\n";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            dominio.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));
        } else {
            dominio.setText(Html.fromHtml(t));
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

  /*  @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_option_detalles_contact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }*/



}
