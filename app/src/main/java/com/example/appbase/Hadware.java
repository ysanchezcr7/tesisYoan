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

public class Hadware extends AppCompatActivity {


    TextView hadware;
    Toolbar toolbar;
    int onStartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hadware);
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
        hadware= findViewById(R.id.hadware);
        String t= " <h1>Hardware</h1>\n" +
                "<p>Parte o componente f&iacute;sico de un dispositivo electr&oacute;nico, especializado en una o varias funciones afines, que al conectarse entre s&iacute; pueden conformar un sistema para cumplir funciones espec&iacute;ficas m&aacute;s complejas.</p>\n" +
                "<p>El t&eacute;rmino es propio del idioma ingl&eacute;s, y su traducci&oacute;n al espa&ntilde;ol no tiene un significado acorde, por tal motivo se lo ha adoptado tal cual es y suena. La Real Academia Espa&ntilde;ola lo define como &laquo;Conjunto de los componentes que integran la parte material de una computadora&raquo;.</p>\n" +
                "<h2>Caracter&iacute;sticas esenciales</h2>\n" +
                "<p>&bull; &nbsp; &nbsp;Es la parte o el componente f&iacute;sico de un dispositivo electr&oacute;nico.</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Se especializa en una o varias funciones afines.</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Puede conectarse con otras partes o componentes para conformar un sistema.</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Si se conforma un sistema, este cumple funciones espec&iacute;ficas m&aacute;s complejas.</p>\n" +
                "<h3>Clasificaciones de un hardware:</h3>\n" +
                "<h4>&nbsp;Seg&uacute;n su importancia:</h4>\n" +
                "<p>Un medio de entrada de datos, la unidad central de procesamiento, la memoria RAM, un medio de salida de datos y un medio de almacenamiento de datos constituyen el hardware b&aacute;sico.</p>\n" +
                "<p>Los medios de entrada y salida de datos estrictamente indispensables dependen de la aplicaci&oacute;n: desde el punto de vista de un usuario com&uacute;n, se deber&iacute;a disponer, al menos, de un teclado y un monitor para entrada y salida de informaci&oacute;n, respectivamente; pero ello no implica que no pueda haber una computadora (por ejemplo controlando un proceso) en la que no sea necesario teclado y/o monitor; bien puede ingresar informaci&oacute;n y sacar sus datos procesados, por ejemplo, a trav&eacute;s de una placa de adquisici&oacute;n/salida de datos.</p>\n" +
                "<h4>Seg&uacute;n la funci&oacute;n que desempe&ntilde;a:</h4>\n" +
                "<p>Las computadoras son aparatos electr&oacute;nicos capaces de interpretar y ejecutar instrucciones programadas y almacenadas en su memoria; consisten b&aacute;sicamente en operaciones aritm&eacute;tico-l&oacute;gicas y de entrada/salida. Se reciben las entradas (datos), se las procesa y almacena (procesamiento), y finalmente se producen las salidas (resultados del procesamiento). Por ende, todo sistema inform&aacute;tico tiene, al menos, componentes y dispositivos hardware dedicados a alguna de las funciones antedichas; &nbsp;a saber:</p>\n" +
                "<p>1. &nbsp; &nbsp;Procesamiento: unidad central de procesamiento</p>\n" +
                "<p>2. &nbsp; &nbsp;Almacenamiento: Memorias</p>\n" +
                "<p>3. &nbsp; &nbsp;Entrada: Perif&eacute;ricos de entrada (E)</p>\n" +
                "<p>4. &nbsp; &nbsp;Salida: Perif&eacute;ricos de salida (S)</p>\n" +
                "<p>5. &nbsp; &nbsp;Entrada/Salida: Perif&eacute;ricos mixtos (E/S)</p>\n" +
                "<p>Desde un punto de vista b&aacute;sico y general, un dispositivo de entrada es el que provee el medio para permitir el ingreso de informaci&oacute;n, datos y programas (lectura); un dispositivo de salida brinda el medio para registrar la informaci&oacute;n y datos de salida (escritura); la memoria otorga la capacidad de almacenamiento, temporal o permanente (almacenamiento); y la CPU provee la capacidad de c&aacute;lculo y procesamiento de la informaci&oacute;n ingresada (transformaci&oacute;n).</p>\n" +
                "<h4>Seg&uacute;n su Ubicaci&oacute;n en una computadora:</h4>\n" +
                "<h5>Seg&uacute;n su ubicaci&oacute;n el hardware se clasifica en dos grupos:</h5>\n" +
                "<p>&bull; &nbsp; &nbsp;COMPONENTES EXTERNOS:&nbsp;</p>\n" +
                "<p>Monitor, Teclado, Mouse, Micr&oacute;fono, Impresora, Webcam, Escaner, Altavoces&hellip;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;COMPONENTES INTERNOS: son aquellos dispositivos que son internos al gabinete de la computadora</p>\n" +
                "<p>Disco duro, Memoria ROM, Memoria RAM, CPU, Fuente de almacenamiento, Motherboard&hellip;</p>\n" +
                "<h1>Dispositivos de almacenamiento de datos:</h1>\n" +
                "<h3>Almacenamiento primario o principal</h3>\n" +
                "<p>Un sistema de almacenamiento primario son los medios que se utilizan con la intenci&oacute;n de almacenar cualquier tipo de informaci&oacute;n de manera principal. Si habl&aacute;semos de un almacenamiento secundario estar&iacute;amos refiri&eacute;ndonos a dispositivos auxiliares que no tienen un papel tan relevante ni imprescindible en el d&iacute;a a d&iacute;a. Al referirnos a los principales podemos hablar de tres opciones principalmente: memoria ROM, memoria RAM y disco duro.</p>\n" +
                "<h3>Memoria ROM:</h3>\n" +
                "<p>Hay dos tipos de memoria interna cargadas en cualquier tipo de equipo inform&aacute;tico y dispositivo similar. La memoria ROM (Read Only Memory) es aquella que solo proporciona un uso enfocado a la lectura de datos. Dentro de esta memoria se lleva a cabo el proceso de almacenamiento en el cual est&aacute;n los programas y el resto del software primordial. Estos programas son los que se ocupar&aacute;n de que el equipo funcione de manera conveniente, que se encienda y que permita procesar cualquier tipo de diagn&oacute;stico que sea necesario. Dado que esta memoria es de solo lectura y no acabamos recurriendo a ella m&aacute;s all&aacute; de realizar el almacenamiento inicial de lo vinculado con el arranque del equipo no es necesario que sea de una capacidad demasiado elevada.</p>\n" +
                "<p>Hay varios rasgos a destacar de este tipo de memoria. Lo primero que hay que decir es que es una memoria de tipo vol&aacute;til, lo que implica que blinda cualquier tipo de elemento que se almacene en ella. Es por ello que los programas que est&aacute;n resguardados bajo la ROM son importantes y no acaban por desaparecer si el ordenador se apaga bajo cualquier tipo de circunstancias. Estos programas se graban en los chips de la propia memoria y no dejan de existir ni siquiera con el paso del tiempo. Esto tambi&eacute;n implica que un programa que haya pasado a estar en la ROM no se modificar&aacute; de ninguna forma, solo podr&aacute; ser ejecutado.</p>\n" +
                "<h3>Memoria RAM:</h3>\n" +
                "<p>Continuamos con el segundo tipo de memoria, la RAM (Random Access Memory). Es una memoria totalmente diferente de la ROM, pero no por ello menos relevante. Como su propio nombre indica, es de ejecuci&oacute;n aleatoria, contando con un tipo de acceso totalmente variable que no requiere que pasemos de byte en byte para llegar a un dato espec&iacute;fico. Es un tipo de memoria muy com&uacute;n que permite guardar informaci&oacute;n, recuperarla cuando sea necesario y activar todo tipo de procesos. Es un tipo de memoria que, por otro lado, permite tanto lectura como escritura, siempre de la mano de alg&uacute;n elemento de hardware o con un microprocesador.</p>\n" +
                "<h3>Disco Duro:</h3>\n" +
                "<p>En &uacute;ltimo lugar hablamos de un disco duro, un recurso de hardware f&aacute;cilmente reconocible e identificable. Cuentan con esta pieza de hardware todos los ordenadores y es el lugar donde se almacenan todos los datos, ya sean documentos, software u otros elementos. El equipo trabaja con el disco duro en todo momento, almacenando informaci&oacute;n, accediendo a ella, realizando cambios y digitalizando cualquier tipo de proceso que se realice en tiempo real. La presencia del disco duro est&aacute; representada con un disco magn&eacute;tico que es f&aacute;cilmente identificable y que se puede cambiar o potenciar dependiendo del caso.</p>\n" +
                "<p>Esta flexibilidad es lo que ha ayudado a que los discos duros perduren con el paso del tiempo como la principal herramienta dirigida al almacenamiento de informaci&oacute;n, datos y software. Usuarios y empresas pueden por igual actualizar estos componentes y lograr acceder a mejores versiones de una manera que no implique ni siquiera hacer otros cambios en los equipos. La seguridad que aportan los discos duros por su tecnolog&iacute;a magn&eacute;tica es otra ventaja que ayuda a que se pueda confiar en ellos.&nbsp;</p>\n" +
                "<p>En su composici&oacute;n f&iacute;sica se combinan varios platos r&iacute;gidos con un eje que ayuda a que se produzca el movimiento de giro a una velocidad que garantiza el acceso instant&aacute;neo a la informaci&oacute;n. Encima de los mencionados platos hay cabezales que son los que se ocupan de llevar a cabo la escritura o lectura de la informaci&oacute;n. Aunque su invenci&oacute;n data de la d&eacute;cada de los a&ntilde;os 50 contin&uacute;a sorprendiendo la efectividad que proporcionan para almacenar datos y lo muy importantes que son en cualquier tipo de equipo inform&aacute;tico. Motivo por el cual siempre se debe tener seguridad de contar con un control absoluto del disco duro y de las defensas instaladas en el mismo para evitar que los datos almacenados se puedan ver comprometidos.</p>\n" +
                "<h1>Sistema de medidas en la Inform&aacute;tica</h1>\n" +
                "<p>En todos los sistemas de medida la unidad m&iacute;nima es el bit que podemos considerarlo como el estado de un interruptor (abierto o cerrado) donde cada estado est&aacute; representado por un d&iacute;gito binario 0 o 1.</p>\n" +
                "<p>Los bits se agrupan en bytes que son conjuntos de 8 bits. Aunque formalmente pueden existir bytes de entre 6 y 9 bits lo que normalmente nos encontraremos son bytes de 8 bits, por eso tambi&eacute;n se les llama octetos.</p>\n" +
                "<p>Para la memoria y el almacenamiento se utiliza el sistema binario, donde cada unidad son 1024 de la unidad anterior, as&iacute; pues tenemos:</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 bytes son 1 Kilobyte (K, KB, Kibi, KiB o Kibibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 K son 1 Megabyte (Mega, MB, MiB o Mebibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 MB son 1 Gigabyte (Giga, GB, GiB o Gibibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 GB son 1 Terabyte (Tera, TB, TiB o Tebibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 TB son 1 Petabyte (Peta, PB, PiB o Pebibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 PB son 1 Exabyte (EB, EiB o Exbibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 EB son 1 Zettabyte (ZB, ZiB o Zebibyte)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;1024 ZB son 1 Yottabyte (YB, YiB o Yobibyte)</p>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            hadware.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));
        } else {
            hadware.setText(Html.fromHtml(t));
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
