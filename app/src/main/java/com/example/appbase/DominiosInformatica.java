package com.example.appbase;


import android.content.Context;
import android.content.DialogInterface;
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
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

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
       String t= "<h1><span style='font-size:27px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'><strong>Dominios de la inform&aacute;tica:</strong></span></h1>\n" +
                "<p style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Los dominios de la inform&aacute;tica son aquellas &aacute;reas de la tecnolog&iacute;a y la sociedad donde se aplican los m&eacute;todos, t&eacute;cnicas y procedimientos de la inform&aacute;tica.</span></p>\n" +
                "<h3>Perspectiva social:</h3>\n" +
                "<ul>\n" +
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
                "    <li>Inf. Empresarial</li>\n" +
                "</ul>\n" +
                "<h3>Perspectiva Tecnol&oacute;gica:</h3>\n" +
                "<ul>\n" +
                "    <li>Transmisi&oacute;n y Recepci&oacute;n de datos</li>\n" +
                "    <li>Gesti&oacute;n y Administraci&oacute;n Comunicaci&oacute;n y teletrabajo</li>\n" +
                "    <li>Sistemas Operativos</li>\n" +
                "    <li>Dise&ntilde;o Asistido por Computadora</li>\n" +
                "    <li>Tecnolog&iacute;as de datos</li>\n" +
                "    <li>Seguridad Inform&aacute;tica</li>\n" +
                "    <li>Rob&oacute;tica y control Aut&oacute;nomo</li>\n" +
                "</ul>\n" +
                "<h1>Tipos de paradigmas hist&oacute;ricos y tecnol&oacute;gicos de la Inform&aacute;tica:</h1>\n" +
                "<h3>Tecnol&oacute;gico</h3>\n" +
                "<p style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Disciplina que haciendo uso de otras (Matem&aacute;tica, F&iacute;sica, Electr&oacute;nica, etc.) dise&ntilde;a programas para el tratamiento</span></p>\n" +
                "<p style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>automatizado de la informaci&oacute;n.</span></p>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Concepto estrecho de la tecnolog&iacute;a (material-objetivo).</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Desconocimiento de resultados propios.</span></li>\n" +
                "</ul>\n" +
                "<h3>Cient&iacute;fico</h3>\n" +
                "<p style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Disciplina que estudia la teor&iacute;a del tratamiento de la informaci&oacute;n (en todos sus formatos), para el descubrimiento y procesamiento del conocimiento y sus patrones.</span></p>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Concepto o aspecto te&oacute;rico (subjetivos-ideales)</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Reconocimiento de resultados propios.</span></li>\n" +
                "</ul>\n" +
                "<h3>Tecno-cient&iacute;fico</h3>\n" +
                "<p style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Consiste en la interrelaci&oacute;n entre el paradigma tecnol&oacute;gico y el cient&iacute;fico.</span></p>\n" +
                "<h1>Campos de acci&oacute;n:</h1>\n" +
                "<p style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Los campos de acci&oacute;n del ingeniero en Ciencias Inform&aacute;ticas se relacionan con:</span></p>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Representaci&oacute;n y procesamiento de la informaci&oacute;n y del conocimiento. Modelaci&oacute;n, estructura de datos, bases de datos, bases de conocimientos, procesos algor&iacute;tmicos o heur&iacute;sticos, programaci&oacute;n, t&eacute;cnicas de inteligencia artificial.</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Ingenier&iacute;a de software, ciclo de vida del software. Modelos y metodolog&iacute;as de desarrollo de</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Inteligencia de negocios. Gesti&oacute;n de procesos de negocios. Arquitectura empresarial.</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Arquitectura de computadoras y redes, perif&eacute;ricos, interfaz de comunicaci&oacute;n hombre-m&aacute;quina, teleinform&aacute;tica y sistema de operaci&oacute;n.</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Seguridad y &eacute;tica inform&aacute;tica.</span></li>\n" +
                "    <li style='margin: 0in 0in 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Dada la amplitud y diversidad de las &aacute;reas de aplicaci&oacute;n de la informatizaci&oacute;n de las organizaciones, algunos componentes de los campos de acci&oacute;n pueden ser desarrollados tanto en curr&iacute;culo propio como en el optativo, en funci&oacute;n de las prioridades que establezca la pol&iacute;tica de informatizaci&oacute;n de nuestro pa&iacute;s, tanto en el orden interno, como para la exportaci&oacute;n de software y servicios inform&aacute;ticos.</span></li>\n" +
                "</ul>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            dominio.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));
        } else {
            dominio.setText(Html.fromHtml(t));
        }

    }

    public void findView(View v) {

        dominio= v.findViewById(R.id.dominioinfo);


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
