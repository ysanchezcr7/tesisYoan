package com.example.appbase;


import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Software extends AppCompatActivity {


    TextView software;
    Toolbar toolbar;
    int onStartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.software);
        onStartCount = 1;
        if (savedInstanceState == null) // 1st time
        {
            this.overridePendingTransition(R.anim.anim_slide_in_left,
                    R.anim.anim_slide_out_left);
        } else // already created so reverse animation
        {
            onStartCount = 2;
        }

        toolbar = findViewById(R.id.toolbar);
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
        software= findViewById(R.id.sofwareifo);
        String t= "<h1><span style= color: rgb(41, 105, 176);>&iquest;Qu&eacute; es el software?</span></h1>\n" +
                "<ol>\n" +
                "    <li style='margin-top: 0in; margin-right: 0in; margin-bottom: 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size: 16px; line-height: 150%; font-family: Arial, \"sans-serif\"; color: rgb(0, 0, 0);'>Es el conjunto de &oacute;rdenes centralizadas y/o distribuidas, con cierto grado de configuraci&oacute;n, expresadas en un lenguaje computacional, as&iacute; como los datos temporales y persistentes asociados al cumplimiento de dichas &oacute;rdenes; que hacen posible la ejecuci&oacute;n de determinadas funciones por los dispositivos electr&oacute;nicos asociados f&iacute;sicamente a aquel o aquellos que las contienen.</span></li>\n" +
                "    <li style='margin-top: 0in; margin-right: 0in; margin-bottom: 8pt; line-height: 150%; font-size: 15px; font-family: Calibri, \"sans-serif\"; text-align: left;'><span style='font-size: 16px; line-height: 150%; font-family: Arial, \"sans-serif\"; color: rgb(0, 0, 0);'>El&nbsp;</span><span style='font-size: 16px; line-height: 150%; font-family: Arial, \"sans-serif\"; color: rgb(65, 168, 95);'><em>software</em></span><span style='font-size: 16px; line-height: 150%; font-family: Arial, \"sans-serif\"; color: rgb(0, 0, 0);'>, en su gran mayor&iacute;a, est&aacute; escrito en lenguajes de programaci&oacute;n de alto nivel, ya que son m&aacute;s f&aacute;ciles y eficientes para que los programadores los usen, porque son m&aacute;s cercanos al Lenguaje natural respecto del lenguaje de m&aacute;quina. Los lenguajes de alto nivel se traducen a lenguaje de m&aacute;quina utilizando un compilador o un int&eacute;rprete, o bien una combinaci&oacute;n de ambos. El&nbsp;</span><span style='font-size: 16px; line-height: 150%; font-family: Arial, \"sans-serif\"; color: rgb(0, 168, 133);'><em>software</em></span><span style='font-size: 16px; line-height: 150%; font-family: Arial, \"sans-serif\"; color: rgb(0, 0, 0);'>&nbsp;tambi&eacute;n puede estar escrito en lenguaje ensamblador, que es de bajo nivel y tiene una alta correspondencia con las instrucciones de lenguaje m&aacute;quina; se traduce al lenguaje de la m&aacute;quina utilizando un ensamblador.</span></li>\n" +
                "</ol>\n" +
                "<h1><span style=\"color: rgb(41, 105, 176);\">Clasificaciones del software seg&uacute;n su uso pr&aacute;ctico:</span></h1>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"list-style-type: circle;\">\n" +
                "        <li><em><span style='line-height: 150%; font-family: Arial, \"sans-serif\"; font-size: 12pt; color: rgb(0, 168, 133);'>Software</span></em><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><span style=\"color: rgb(0, 168, 133);\">&nbsp;</span>de sistema: Su objetivo es desvincular adecuadamente al usuario y al programador de los detalles del sistema inform&aacute;tico en particular que se use, aisl&aacute;ndolo especialmente del procesamiento referido a las caracter&iacute;sticas internas de: memoria, discos, puertos y dispositivos de comunicaciones, impresoras, pantallas, teclados, etc. El <em><span style=\"color: rgb(0, 168, 133);\">software</span></em><span style=\"color: rgb(0, 168, 133);\">&nbsp;</span>de sistema le procura al usuario y programador adecuadas interfaces de alto nivel, controladores, herramientas y utilidades de apoyo que permiten el mantenimiento del sistema global. Incluye entre otros:&nbsp;</span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Sistemas operativos</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Controladores de dispositivos</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Herramientas de diagn&oacute;stico</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Herramientas de correcci&oacute;n y optimizaci&oacute;n</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Servidores</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Utilidades</span></li>\n" +
                "</ul>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"list-style-type: circle;\">\n" +
                "        <li><em><span style='line-height: 150%; font-family: Arial, \"sans-serif\"; font-size: 12pt; color: rgb(0, 168, 133);'>Software</span></em><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><span style=\"color: rgb(0, 168, 133);\">&nbsp;</span>de programaci&oacute;n: Es el conjunto de herramientas que permiten al programador desarrollar programas de inform&aacute;tica, usando diferentes alternativas y lenguajes de programaci&oacute;n, de una manera pr&aacute;ctica. Incluyen en forma b&aacute;sica:&nbsp;</span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Editores de texto</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Compiladores</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Int&eacute;rpretes</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Enlazadores</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Depuradores</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Entornos de desarrollo integrados (IDE): Agrupan las anteriores herramientas, usualmente en un entorno visual, de forma tal que el programador no necesite introducir m&uacute;ltiples comandos para compilar, interpretar, depurar, etc. Habitualmente cuentan con una avanzada interfaz gr&aacute;fica de usuario (GUI).</span></li>\n" +
                "</ul>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom: 0in; list-style-type: circle;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\";'><em><span style='line-height: 150%; font-family: Arial, \"sans-serif\"; font-size: 12pt; color: rgb(0, 168, 133);'>Software</span></em><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><span style=\"color: rgb(0, 168, 133);\">&nbsp;</span>de aplicaci&oacute;n: Es aquel que permite a los usuarios llevar a cabo una o varias tareas espec&iacute;ficas, en cualquier campo de actividad susceptible de ser automatizado o asistido, con especial &eacute;nfasis en los negocios. Incluye entre muchos otros:<strong>&nbsp;</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<ul style=\"margin-bottom: 0in; list-style-type: disc;\" type=\"disc\">\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Aplicaciones para Control de sistemas y automatizaci&oacute;n industrial</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Aplicaciones ofim&aacute;ticas</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Software</span></em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;educativo</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Software</span></em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;empresarial</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Bases de datos</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Telecomunicaciones (por ejemplo, Internet y toda su estructura l&oacute;gica)</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Videojuegos</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Software</span></em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;m&eacute;dico</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Software</span></em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;de c&aacute;lculo num&eacute;rico y simb&oacute;lico.</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Software</span></em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;de dise&ntilde;o asistido</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Software</span></em><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;de control num&eacute;rico</span></li>\n" +
                "</ul>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom: 0in; list-style-type: circle;\">\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><em><span style='line-height: 150%; font-family: Arial, \"sans-serif\"; font-size: 12pt; color: rgb(0, 168, 133);'>Software</span></em><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><span style=\"color: rgb(0, 168, 133);\">&nbsp;</span>utilitario: &nbsp;Sirve para interactuar con un subconjunto espec&iacute;fico de los componentes f&iacute;sicos (hardware) del dispositivo electr&oacute;nico, teniendo control temporal sobre &eacute;stos a trav&eacute;s del software de sistema sobre el que funcionan; para permitir al usuario configurar o consultar propiedades funcionales tanto del software como del hardware del dispositivo electr&oacute;nico.&nbsp;</span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <ul style=\"margin-bottom:0in;\" type=\"circle\">\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Antivirus</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Quemadores</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Mantenimiento</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Informaci&oacute;n</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Seguridad</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Generadores de llaves</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Reproductores de audio/video</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Compresores de archivos</span></li>\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Programas Dise&ntilde;ados A medida</span></li>\n" +
                "    </ul>\n" +
                "</ul>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:normal;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='font-size:24px;font-family:\"Arial\",\"sans-serif\";'>&nbsp;</span></p>\n" +
                "<h1><span style=\"color: rgb(41, 105, 176);\">Clasificaciones del software seg&uacute;n su producci&oacute;n:</span></h1>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: undefined;\">\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><em><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-size:16px;'>Software</span></em><strong><em><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-size:16px;'>&nbsp;</span></em></strong><strong><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-size:16px;'>propietario:&nbsp;</span></strong><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-size:16px;'>Tambi&eacute;n conocido como privativo<sup>&nbsp;</sup>es el <em>software</em> del cual no existe una forma libre de acceso a su c&oacute;digo fuente, el cual solo se encuentra a disposici&oacute;n de su desarrollador y no se permite su libre modificaci&oacute;n, adaptaci&oacute;n o incluso lectura por parte de terceros. Para la Fundaci&oacute;n para el Software Libre (FSF), este concepto se aplica a cualquier programa inform&aacute;tico que no es libre o que solo lo es parcialmente (semilibre), sea porque su uso, redistribuci&oacute;n o modificaci&oacute;n est&aacute; prohibida, o sea porque requiere permiso expreso del titular del <em>software</em> o software de aplicaci&oacute;n.</span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:.5in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: undefined;\">\n" +
                "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'>Software libre<strong>:</strong> Es un software cuyo c&oacute;digo fuente puede ser estudiado, modificado, y utilizado libremente con cualquier finalidad y redistribuido con cambios o mejoras sobre ellas. Su definici&oacute;n est&aacute; asociada al nacimiento del movimiento de software libre, encabezado por el activista y experto inform&aacute;tico estadounidense Richard Stallman y la fundaci&oacute;n que presid&iacute;a en 1985, &nbsp;la <em>Free Software Foundation</em>, una organizaci&oacute;n sin &aacute;nimo de lucro que pone la libertad del usuario inform&aacute;tico como prop&oacute;sito &eacute;tico fundamental.</span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:.5in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Un software es libre si otorga a los usuarios de manera adecuada las denominadas cuatro libertades: libertad de usar, estudiar, distribuir y mejorar, de lo contrario no se trata de software libre. Existen diversos esquemas de distribuci&oacute;n que no son libres, y si bien podemos distinguirlos sobre la base de cu&aacute;nto les falta para llegar a ser libres, su uso bien puede ser considerado contrario a la &eacute;tica en todos los casos por igual.</span></p>\n" +
                "<h1><span style=\"color: rgb(41, 105, 176);\">&iquest;Qu&eacute; son las licencias de software?</span></h1>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Una licencia<em>&nbsp;de software</em> es un contrato entre el licenciante (autor/titular de los derechos de explotaci&oacute;n/distribuci&oacute;n) y el licenciatario (usuario consumidor, profesional o empresa) del programa inform&aacute;tico, para utilizarlo cumpliendo una serie de t&eacute;rminos y condiciones establecidas dentro de sus cl&aacute;usulas, es decir, es un conjunto de permisos que un desarrollador le puede otorgar a un usuario en los que tiene la posibilidad de distribuir, usar o modificar el producto bajo una licencia determinada. Adem&aacute;s, se suelen definir los plazos de duraci&oacute;n, el territorio donde se aplica la licencia (ya que la licencia se soporta en las leyes particulares de cada pa&iacute;s o regi&oacute;n), entre otros.</span></p>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Las licencias de <em>software</em> pueden establecer entre otras cosas: la cesi&oacute;n de determinados derechos del propietario al usuario final sobre una o varias copias del programa inform&aacute;tico, los l&iacute;mites en la responsabilidad por fallos, el plazo de cesi&oacute;n de los derechos, el &aacute;mbito geogr&aacute;fico de validez del contrato e incluso pueden establecer determinados compromisos del usuario final hacia el propietario, tales como la no cesi&oacute;n del programa a terceros o la no reinstalaci&oacute;n del programa en equipos distintos al que se instal&oacute; originalmente.</span></p>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Entre los diversos tipos de licencia es v&aacute;lidos resaltar dos de las principales:</span></p>\n" +
                "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>EULA (<em>End User License Agreement</em>):<strong>&nbsp;</strong>Conocida tambi&eacute;n como de usuario final, es la licencia por la cual el uso del producto solo est&aacute; permitido para el usuario final (comprador).<br>&nbsp;En este tipo de contrato, el due&ntilde;o de los derechos de un producto insta al usuario final de este a que reconozca tener conocimiento de las restricciones de uso, de los derechos del autor, de las patentes, etc., y que acepte de conformidad.<br>&nbsp;El conocimiento del contenido de los contratos es dif&iacute;cil antes de la compra del producto ya que las cajas de los productos raramente contienen una copia completa del mismo, d&aacute;ndose que el comprador en la mayor parte de las ocasiones conoce su contenido despu&eacute;s de la compra.</span></li>\n" +
                "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>GNU-GPL (<em>General Public License</em>):<strong>&nbsp;</strong>La Licencia P&uacute;blica General de GNU es una licencia de derecho de autor ampliamente usada en el mundo del software libre y c&oacute;digo abierto, &nbsp;y garantiza a los usuarios finales (personas, organizaciones, compa&ntilde;&iacute;as) la libertad de usar, estudiar, compartir (copiar) y modificar el software. Su prop&oacute;sito es doble: declarar que el <em>software</em> cubierto por esta licencia es libre, y protegerlo (mediante una pr&aacute;ctica conocida como <em>copyleft</em>) de intentos de apropiaci&oacute;n que restrinjan esas libertades a nuevos usuarios cada vez que la obra es distribuida, modificada o ampliada. Esta licencia fue creada originalmente por Richard Stallman fundador de la <em>Free Software Foundation</em> (FSF) para el proyecto GNU.</span></li>\n" +
                "</ul>\n" +
                "<h3 style=\"text-align: left;\"><span style=\"color: rgb(61, 142, 185);\">Los diferentes softwares desarrollados con el objetivo de traer bienestar y confort a la sociedad cubana:</span></h3>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\"; color: rgb(0, 168, 133); font-weight: bold;'><span style='line-height: 150%; font-family: Arial, \"sans-serif\"; font-size: 12pt;'><strong>Transfermovil:</strong></span><span style=\"line-height: 150%; font-size: 11px;\"><strong>&nbsp;</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Es una aplicaci&oacute;n desarrollada por ETECSA para la Banca Electr&oacute;nica, que permite hacer uso de los servicios bancarios, pagar servicios p&uacute;blicos y gestionar servicios de telecomunicaciones desde el celular. Disponible para los usuarios de Android que posean una tarjeta matriz del banco al que pertenecen: Telebanca del Metropolitano, Multibanca de BANDEC o Matricial de BPA.</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\"; font-weight: bold; color: rgb(0, 168, 133);'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><strong>Ut</strong><strong>ilEs:</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Se acab&oacute; el memorizar c&oacute;digos para consultar el saldo, transferir o conocer el estado del bono. Mediante esta aplicaci&oacute;n gratuita tendr&aacute;s acceso a la red de telecomunicaciones de Etecsa. En la pantalla principal podr&aacute;s encontrar las funciones m&aacute;s usadas y de r&aacute;pido acceso como consulta de saldo, llamada con 99, llamada an&oacute;nima, recarga y transferencia de saldo. Tambi&eacute;n permite conocer el estado de tus planes y paquetes, as&iacute; como comprar los mismos con tan solo un clic, acceder a tu cuenta nauta, conocer el costo de los diferentes servicios de Etecsa, te brinda las indicaciones para configurar el APN Nauta, configurar el correo electr&oacute;nico entre otras informaciones &uacute;tiles.</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\"; font-weight: bold; color: rgb(0, 168, 133);'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><strong>ApKalis:</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Uno de los mayores logros en materia de aplicaciones alcanzado por los profesionales cubanos es esta plataforma de distribuci&oacute;n y actualizaci&oacute;n de aplicaciones m&oacute;viles. No solo se limita a apps cubanas, sino que apuesta por otras internaciones para su distribuci&oacute;n dentro del territorio nacional. Con una interfaz atractiva y de f&aacute;cil usabilidad permite al usuario encontrar la aplicaci&oacute;n que m&aacute;s se adapte a sus intereses.</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\"; font-weight: bold; color: rgb(0, 168, 133);'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'><strong>SIJU:</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Si no te es posible acceder a los planes de Internet que oferta Etecsa, tal vez te interese esta aplicaci&oacute;n. Una app de mensajer&iacute;a instant&aacute;nea disponible para Android que te permite intercambiar textos y archivos multimedia dentro y fuera de Cuba. Tiene la particularidad de que comprime tus archivos (voz y fotos) con un nivel de compresi&oacute;n que hace posible su subida y descarga en redes de datos donde la velocidad de la conexi&oacute;n puede ser un problema. Funciona a&uacute;n sin conexi&oacute;n a internet, consumiendo los megas de la bolsa de correo. Su &uacute;ltima actualizaci&oacute;n incorpora nuevas funciones interesantes como un directorio de p&aacute;ginas cubanas, mayor funcionabilidad de los grupos y la opci&oacute;n de SIJUPost en su versi&oacute;n web donde puedes publicar los productos que vendas.</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\"; font-weight: bold; color: rgb(0, 168, 133);'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-size:16px;'><strong>Conoce Cuba:</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Un directorio de lugares y servicios en Cuba. Contiene ofertas, eventos, noticias y otros art&iacute;culos interesantes. Cuenta con un mapa de toda Cuba que funciona sin necesidad de conexi&oacute;n a internet, lo cual es excelente para los viajeros que visiten la isla. Te permite navegar con GPS, ubicar tus sitios de inter&eacute;s y trazar rutas para llegar al lugar que desees.</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style=\"margin: 0in 0in 8pt; line-height: 107%; font-size: 16px; font-family: Arial, Helvetica, sans-serif; font-weight: bold; color: rgb(0, 168, 133);\"><strong>Donde Hay:</strong></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:.0001pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Una aplicaci&oacute;n desarrollada por la corporaci&oacute;n CIMEX, que brinda una importante ventaja a sus clientes, pues permite la b&uacute;squeda a partir de la descripci&oacute;n del producto o el escaneado de su c&oacute;digo de barra, obteniendo como resultado las ubicaciones y precios de los mismos. Los datos son obtenidos de la informaci&oacute;n tributada por los establecimientos de la Cadena de Tiendas Panamericanas. La informaci&oacute;n tendr&aacute; un periodo de actualizaci&oacute;n de entre uno y dos d&iacute;as de atraso, pero a pesar de este inconveniente, esta app le brinda al pueblo cubano una opci&oacute;n nunca antes vista, al tener la posibilidad de conocer de antemano donde pueden encontrar los productos que necesitan.</span></p>\n" +
                "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                "    <ul style=\"margin-bottom:0in;list-style-type: disc;margin-left:0.5in;\">\n" +
                "        <li style='margin: 0in 0in 8pt; line-height: 107%; font-size: 15px; font-family: Calibri, \"sans-serif\"; font-weight: bold; color: rgb(0, 168, 133);'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-size:16px;'><strong>Enzona:</strong></span></li>\n" +
                "    </ul>\n" +
                "</div>\n" +
                "<p style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:1.0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Una aplicaci&oacute;n desarrollada por la corporaci&oacute;n CIMEX, que brinda una importante ventaja a sus clientes, pues permite la b&uacute;squeda a partir de la descripci&oacute;n del producto o el escaneado de su c&oacute;digo de barra, obteniendo como resultado las ubicaciones y precios de los mismos. Los datos son obtenidos de la informaci&oacute;n tributada por los establecimientos de la Cadena de Tiendas Panamericanas. La informaci&oacute;n tendr&aacute; un periodo de actualizaci&oacute;n de entre uno y dos d&iacute;as de atraso, pero a pesar de este inconveniente, esta app le brinda al pueblo cubano una opci&oacute;n nunca antes vista, al tener la posibilidad de conocer de antemano donde pueden encontrar los productos que necesitan.</span></p>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            software.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));
        } else {
            software.setText(Html.fromHtml(t));
        }



    }



    @Override
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
        if (id == R.id.action_delet_contact) {
            //deletContacts();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
