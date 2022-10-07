package com.example.appbase.Tema1;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import com.example.appbase.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;

public class EvolucionInformatica extends AppCompatActivity {

    int g;
    MaterialButton primera, segunda, tercera, cuarta, quinta, evoCuba;
    Toolbar toolbar;
    int onStartCount = 0;
    private Context context;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evolucion_informatica);


        setDayNhigt();
        onStartCount = 1;
        if (savedInstanceState == null) // 1st time
        {
            overridePendingTransition(R.anim.anim_slide_in_left,
                    R.anim.anim_slide_out_left);
        } else // already created so reverse animation
        {
            onStartCount = 2;
        }
        CollapsingToolbarLayout ctl = findViewById(R.id.collapsit);
        ctl.setCollapsedTitleTextColor(getResources().getColor(R.color.colorBlanco));
        ctl.setExpandedTitleColor(getResources().getColor(R.color.colorPrimaryDark));

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


        AppBarLayout mAppBarLayout = (AppBarLayout) findViewById(R.id.miAppBar);
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    isShow = true;
                    showOption(R.id.cuestionario);
                } else if (isShow) {
                    isShow = false;
                    hideOption(R.id.cuestionario);
                }
            }
        });
        primera = findViewById(R.id.tvE1);
        primera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = 1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    MostrarText("Primera Generación (1946-1958)");
                }
            }
        });
        segunda = findViewById(R.id.tvE2);
        segunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = 2;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    MostrarText("Segunda Generación (1959-1963)");
                }
            }
        });
        tercera = findViewById(R.id.tvE3);
        tercera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = 3;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    MostrarText("Tercera Generación (1964-1971)");
                }
            }
        });
        cuarta = findViewById(R.id.tvE4);
        cuarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = 4;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    MostrarText("Cuarta Generación (1971-1983)");
                }
            }
        });

        quinta = findViewById(R.id.tvE5);
        quinta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = 5;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    MostrarText("Quinta Generación (1984 - ...)");
                }
            }
        });

        evoCuba = findViewById(R.id.tvEvolucionCuba);
        evoCuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g = 6;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    MostrarText("Evolucion en Cuba");
                }
            }
        });

    }

    private void MostrarText(String title) {
        String textG = "";
        final View genera_layout = getLayoutInflater().inflate(R.layout.text_string_generacion, null);

        final TextView tv_cobrar = (TextView) genera_layout.findViewById(R.id.tvG);
        Resources res = getResources();
        if (g == 1) {
            // textG = String.format(res.getString(R.string.primerageneracion));
            // getResources().getString(R.string.primerageneracion);
            textG = "<h1>Características:</h1>\n" +
                    "<p>•La tecnología electrónica era a base de bulbos o tubos de vacío.</p>" +
                    "<p>•Usaban tarjetas perforadas para entrar los datos y los programas.</p>" +
                    "<p>•La comunicación era en términos de nivel muy bajo (lenguaje de máquina).</p>" +
                    "<h1>Principales Avances:</h1>\n" +
                    "<h6>•Electronic Numerical Integrator and Computer.</h6>\n" +
                    "<p>El 15 de febrero de 1946 era presentado en público el ENIAC\n" +
                    "El ENIAC fue completado 4 años después que el Z3. Mientras que el" +
                    " ENIAC usaba válvulas de vacío y el Z3 usaba relés, el ENIAC todavía era " +
                    "decimal y el Z3 era binario. Hasta 1948, programar el ENIAC significaba volver " +
                    "a soldar los cables; mientras, el Z3 leía los programas de tarjetas perforadas." +
                    " Hoy en día los computadores están basados en transistores en vez de válvulas o relés, " +
                    "pero su arquitectura interna es más parecida al Z3 que al ENIAC</p>" +
                    "<h6>•La EDVAC fue una de las primeras computadoras electrónicas (1949).</h6>" +
                    "<p>La EDVAC fue una de las primeras computadoras electrónicas. A diferencia de la ENIAC, no era decimal, " +
                    "sino binaria, y tuvo el primer programa diseñado para ser almacenado. Este diseño se " +
                    "convirtió en estándar de arquitectura para la mayoría de las computadoras modernas." +
                    " El diseño de la EDVAC es considerado un éxito en la historia de la informática.<p>" +
                    "<h6> •UNIVAC 1: Primera computadora comercial (1951).</h6>" +
                    "<p>La UNIVAC I (Universal Automatic Computer I, Computadora Automática Universal I) fue la primera computadora comercial fabricada en Estados Unidos, entregada el 31 de marzo de 1951 a la oficina del censo. Fue diseñada principalmente por J. Presper Eckert y John William Mauchly, autores de la primera computadora electrónica estadounidense, la ENIAC. Durante los años previos a la aparición de sus sucesoras, la máquina fue simplemente conocida como \"UNIVAC\". Se donó finalmente a la universidad de Harvard y Pensilvania.</p>" +
                    "<h1>Personalidades: </h1>" +
                    "<h5>John Louis Von Neumann (1903-1957)</h5>" +

                    "</p>Científico matemático que realizó múltiples aportes a las computadoras de la primera generación, es considerado uno de los más brillantes matemáticos de la era de la computación.\n" +
                    "Durante la segunda guerra mundial fueron aprovechados sus conocimientos en hidrodinámica, balística, meteorología, teoría de juegos y estadísticas.\n" +
                    "Participó en la construcción de la ENIAC, UNIVAC y la Mark I de Harvard.</p>" +

                    "</h5>Grace Hooper (1906-1992)</h5>" +

                    "</p>Se convirtió en pionera y propulsora de la programación en computadoras.\n" +
                    "Creó el lenguaje de programación Flowmatic y en 1951 produjo el primer compilador.\n" +
                    "En 1960 presentó su primera versión del lenguaje COBOL.</p>";
        } else if (g == 2) {
            textG = "<h1>Características:</h1>\n" +
                    "<ul>\n" +
                    "<li>La tecnología electrónica era a base de bulbos o tubos de vacío.</li>\n" +
                    "<li>Usaban tarjetas perforadas para entrar los datos y los programas.</li>\n" +
                    "<li>La comunicación era en términos de nivel muy bajo (lenguaje de máquina).</li>\n" +
                    "</ul>\n" +
                    "<p>La segunda generación de las computadoras reemplazó las válvulas de vacío por los transistores. Por eso las computadoras de la segunda generación son más pequeñas y consumen menos electricidad que las de la anterior. La comunicación con estas nuevas computadoras es mediante lenguajes más avanzados que el lenguaje de máquina, los cuales reciben el nombre de “lenguajes de alto nivel\".</p>\n" +
                    "<p>Además, es creado el código ASCII (siglas en inglés para American Standard Code for Information Interchange) en 1963 por el Comité Estadounidense de Estándares o \"ASA\", este organismo cambio su nombre en 1969 por \"Instituto Estadounidense de Estándares Nacionales\" o \"ANSI\" como se lo conoce desde entonces.</p>\n" +
                    "<h1>Personalidades:</h1>\n" +
                    "<p>Ø Walter Houser Brattain (1902-1987).</p>\n" +

                    "<p>Fue uno de los físicos que inventó el transistor.</p>\n" +
                    "<p>Ø John Bardeen (1908-1991)</p>\n" +
                    "Fue un ingeniero eléctrico y físico estadounidense galardonado con los Premios Nobel de" +
                    " Física de los años 1956 y 1972. Creador junto con Walter Houser Brattain del transistor";
        } else if (g == 3) {
            textG = "<h1 style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>Caracter&iacute;sticas:</span></h1>\n" +
                    "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Se desarrollaron circuitos integrados para procesar informaci&oacute;n.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Se desarrollaron los &quot;chips&quot; para almacenar y procesar la informaci&oacute;n. Un &quot;chip&quot; es una pieza de silicio que contiene los componentes electr&oacute;nicos en miniatura llamados semiconductores.&nbsp;</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Los circuitos integrados recuerdan los datos, ya que almacenan la informaci&oacute;n como cargas el&eacute;ctricas.&nbsp;</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Surge la multiprogramaci&oacute;n.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Las computadoras pueden llevar a cabo ambas tareas de procesamiento o an&aacute;lisis matem&aacute;ticos.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Emerge la industria del &quot;software&quot;.&nbsp;</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Se desarrollan las minicomputadoras IBM 360 y DEC PDP-1.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Otra vez las computadoras se tornan m&aacute;s peque&ntilde;as, m&aacute;s ligeras y m&aacute;s eficientes.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Consum&iacute;an menos electricidad, por lo tanto, generaban menos calor.</span></li>\n" +
                    "</ul>\n" +
                    "<p style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Las computadoras de la tercera generaci&oacute;n emergieron con el desarrollo de los circuitos integrados (pastillas de silicio) en las cuales se colocan miles de componentes electr&oacute;nicos, en una integraci&oacute;n en miniatura. Las computadoras nuevamente se hicieron m&aacute;s peque&ntilde;as, m&aacute;s r&aacute;pidas, desprend&iacute;an menos calor y eran energ&eacute;ticamente m&aacute;s eficientes.</span></p>\n" +
                    "<h1 style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>Personalidades</span><span style='font-family:\"Arial\",\"sans-serif\";'>:</span></h1>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: undefined;margin-left:22.15px;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'>Bill Gates y Paul Allen.</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:.0001pt;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Fundadores de las empresas TrafOData y Microsoft.</span></p>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:.0001pt;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>&nbsp;</span></p>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: undefined;margin-left:22.15px;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'>John Metcalfe</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Propuso el protocolo Ethernet (convertida en la tecnolog&iacute;a base de la infraestructura de redes).</span></p>";
        } else if (g == 4) {
            textG = "<p style='margin-right:0in;margin-left:0in;font-size:32px;font-family:\"Times New Roman\",\"serif\";font-weight:bold;text-align:justify;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";font-weight:normal;'>La denominada cuarta generaci&oacute;n es el producto del microprocesador de los circuitos electr&oacute;nicos. El tama&ntilde;o reducido del microprocesador de chips hizo posible la creaci&oacute;n de las computadoras personales (PC). Hoy en d&iacute;a las tecnolog&iacute;as LSI (integraci&oacute;n a gran escala) y VLSI (integraci&oacute;n a muy gran escala) permiten que cientos de miles de componentes electr&oacute;nicos se almacenen en un microchip. Usando VLs, un fabricante puede hacer que una computadora peque&ntilde;a rivalice con una computadora de la primera generaci&oacute;n que ocupaba un cuarto completo. Hicieron su gran debut las microcomputadoras.</span></p>\n" +
                    "<p style='margin-right:0in;margin-left:0in;font-size:32px;font-family:\"Times New Roman\",\"serif\";font-weight:bold;text-align:justify;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";font-weight:normal;'>El primer microprocesador de 8 bits fue el Intel 8008, desarrollado en 1972 para su empleo en terminales inform&aacute;ticos. El Intel 8008 conten&iacute;a 3300 transistores. El primer microprocesador realmente dise&ntilde;ado para uso general, desarrollado en 1974, fue el Intel 8080 de 8 bits, que conten&iacute;a 4500 transistores y pod&iacute;a ejecutar 200&nbsp;000 instrucciones por segundo. Los microprocesadores modernos tienen una capacidad y velocidad mucho mayores.</span></p>\n" +
                    "<p style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>Personalidades</span><span style='font-family:\"Arial\",\"sans-serif\";'>:</span></p>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: undefined;margin-left:22.15px;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Times New Roman\",\"serif\";font-family:\"Times New Roman\",\"serif\";font-size:12.0pt;'>Marcian Edward Ted Hoff.</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:.0001pt;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Times New Roman\",\"serif\";'>Es el co-inventor del microprocesador que contribuy&oacute; con la idea de arquitectura en 1969 para los circuitos integrados. Entr&oacute; en Intel en 1968.</span></p>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:.0001pt;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Times New Roman\",\"serif\";'>&nbsp;</span></p>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: undefined;margin-left:22.15px;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Times New Roman\",\"serif\";font-family:\"Times New Roman\",\"serif\";font-size:12.0pt;'>Steve Wozniak y Stephen Jobs</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;'><span style='font-size:16px;line-height:150%;font-family:\"Times New Roman\",\"serif\";'>Creadores de la Apple.</span></p>";
        } else if (g == 5) {
            textG = "<h1 style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>Caracter&iacute;sticas:</span></h1>\n" +
                    "<ul style=\"margin-bottom:0in;\" type=\"disc\">\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Computadoras basadas en inteligencia artificial.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Arquitecturas combinadas Paralelo/ Vectorial (Procesamiento Coolabotarivo).</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Significativos avances en la microelectr&oacute;nica.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Aparecen los conceptos de World Wide Web, Lenguaje HTML, Servidor Web.</span></li>\n" +
                    "    <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:150%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Desarrollo acelerado del software y los sistemas inform&aacute;ticos.</span></li>\n" +
                    "</ul>\n" +
                    "<h1 style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>Avances:</span></h1>\n" +
                    "<p style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>La quinta generaci&oacute;n de computadoras, tambi&eacute;n conocida por sus siglas en ingl&eacute;s, FGCS (de <em>Fifth Generation Computer Systems</em>), fue un proyecto hecho por Jap&oacute;n que comenz&oacute; en 1981. Su objetivo era el desarrollo de una nueva clase de computadoras que utilizar&iacute;an t&eacute;cnicas y tecnolog&iacute;as de inteligencia artificial tanto en el plano del hardware como del software, usando el lenguaje PROLOG al nivel del lenguaje de m&aacute;quina y ser&iacute;an capaces de resolver problemas complejos, como la traducci&oacute;n autom&aacute;tica de una lengua natural a otra (del japon&eacute;s al ingl&eacute;s, por ejemplo). Como unidad de medida del rendimiento y prestaciones de estas computadoras se empleaba la cantidad de LIPS (<em>Logical Inferences Per Second</em>) capaz de realizar durante la ejecuci&oacute;n de las distintas tareas programadas. Para su desarrollo se emplearon diferentes tipos de arquitecturas VLSI (<em>Very Large Scale Integration</em>).</span></p>\n" +
                    "<h1 style='margin-right:0in;margin-left:0in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-family:\"Arial\",\"sans-serif\";'>Personalidades</span><span style='font-family:\"Arial\",\"sans-serif\";'>:</span></h1>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: disc;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'>Guido van Rossum y Rasmus Lerdorf.</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:.0001pt;line-height:150%;text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Creadores de los lenguajes de programaci&oacute;n Python y PHP, respectivamente.</span></p>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: disc;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'>John McCarthy</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:.0001pt;line-height:150%;text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Introdujo el t&eacute;rmino de Inteligencia artificial, por sus estudios le fue otorgado el&nbsp;Premio Turing.</span></p>\n" +
                    "<div style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'>\n" +
                    "    <ul style=\"margin-bottom:0in;list-style-type: disc;\">\n" +
                    "        <li style='margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:\"Calibri\",\"sans-serif\";'><span style='line-height:150%;font-family:\"Arial\",\"sans-serif\";font-family:\"Arial\",\"sans-serif\";font-size:12.0pt;'>Linus Benedict Torvalds&nbsp;</span></li>\n" +
                    "    </ul>\n" +
                    "</div>\n" +
                    "<p style='margin-right:0in;margin-left:.5in;font-size:15px;font-family:\"Calibri\",\"sans-serif\";margin-top:0in;margin-bottom:8.0pt;line-height:150%;text-align:justify;'><span style='font-size:16px;line-height:150%;font-family:\"Arial\",\"sans-serif\";'>Creador del Sistema Operativo GNU/Linux.</span></p>";
        } else if (g == 6) {
            textG = "<h2>Evolucion de la inform&aacute;tica en Cuba:</h2>\n" +
                    "<p>[Antes de 1959]- Grandes empresas ten&iacute;an o arrendaban equipos basados en tarjetas</p>\n" +
                    "<p>[1959-1967]- Se adquiere la computadora</p>\n" +
                    "<p>[1968]- Llegan dos computadoras francesas SEA4000 y luego se contratan la IRIS50 y la</p>\n" +
                    "<p>[1968]- Se fusionan todos los organismos cubanos que se relacionaban con el tratamiento de la informaci&oacute;n.</p>\n" +
                    "<p>[1969]- Se crea el Centro de Investigaciones Digitales (CID) en la Universidad de la Habana (UH).</p>\n" +
                    "<p>[1970]- (18 de abril) Se termina la computadora CID-201 y su software</p>\n" +
                    "<p>[1970]- Se crea la especialidad de &ldquo;Ingeniero Electricista&rdquo; con perfil terminal de &ldquo;Ingeniero en Computadora&rdquo; en la CUJAE y la &ldquo;Licenciatura en Computaci&oacute;n&rdquo; (luego Licenciatura en Ciencias de la Computaci&oacute;n) en la</p>\n" +
                    "<p>[1972]- Se produce la computadora CID-201-A.</p>\n" +
                    "<p>[1972]- Se pone en marcha el Sistema Nacional de Computaci&oacute;n y se crea el Plan de C&aacute;lculo Nacional.</p>\n" +
                    "<p>[1974]- Se produce la computadora CID-201-B.</p>\n" +
                    "<p>[1976]- Se crean las carreras &ldquo;Sistema Automatizado de Direcci&oacute;n T&eacute;cnico &ndash; Econ&oacute;mica&rdquo; (SAD-TE) y &ldquo;Sistema Automatizado de M&aacute;quinas Electr&oacute;nicas&rdquo; (SAME)</p>\n" +
                    "<p>[1976]- Se crea el Ministerio de Educaci&oacute;n Superior (MES).</p>\n" +
                    "<p>[1977]- Se produce el prototipo de la computadora CID-300 y su monitor.</p>\n" +
                    "<p>[1987]- (8 de septiembre) Creaci&oacute;n de los Joven Club de Computaci&oacute;n.</p>\n" +
                    "<p>[1996]- Se aprueban los &ldquo;Lineamientos generales para la informatizaci&oacute;n de la sociedad hasta el a&ntilde;o 2000&rdquo;.</p>\n" +
                    "<p>[2000]- Creaci&oacute;n del Ministerio de la Inform&aacute;tica y las Comunicaciones (MIC).</p>\n" +
                    "<p>[2002]- Creaci&oacute;n de la Universidad de las Ciencias Inform&aacute;ticas (UCI).</p>\n" +
                    "<p>[2004]- Inicio del trabajo de la UCI en el Proceso de informatizaci&oacute;n de la sociedad cubana con producci&oacute;n de software y servicios inform&aacute;ticos.</p>\n" +
                    "<p>[2004]- Creaci&oacute;n de la Industria Cubana del Software (InCuSoft).</p>\n" +
                    "<p><br></p>\n" +
                    "<p><br></p>\n" +
                    "<p><br></p>";
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv_cobrar.setText(Html.fromHtml(textG, Html.FROM_HTML_MODE_COMPACT));
        } else {
            tv_cobrar.setText(Html.fromHtml(textG));
        }

        final AlertDialog dialog_cobrar = new AlertDialog.Builder(EvolucionInformatica.this)
                .setTitle(title)
                .setView(genera_layout)
                .setNegativeButton("Salir",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();

        dialog_cobrar.setCanceledOnTouchOutside(false);
        dialog_cobrar.setCancelable(true);


        dialog_cobrar.show();


    }


   /* @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_option_detalles_contact, menu);
        return true;
    }*/

    public void setDayNhigt() {
        SharedPreferences sp = getSharedPreferences("SP", this.MODE_PRIVATE);
        int theme = sp.getInt("Theme", 1);
        if (theme == 1) {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        } else {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu_cuestionario, menu);
        hideOption(R.id.cuestionario);
        return true;

    }


    private void hideOption(int id) {
        MenuItem item = menu.findItem(id);
        item.setVisible(false);
    }

    private void showOption(int id) {
        MenuItem item = menu.findItem(id);
        item.setVisible(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.cuestionario) {
            return true;
        } else if (id == R.id.adelante) {

            Intent inte = new Intent(this, DominiosInformatica.class);
            startActivity(inte);

        }


        return super.onOptionsItemSelected(item);
    }


}
