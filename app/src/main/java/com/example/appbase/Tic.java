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

public class Tic extends AppCompatActivity {


    TextView tic;
    Toolbar toolbar;
    int onStartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tic);
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
        tic= findViewById(R.id.tic);
        String t= "<h1 style=\"text-align: justify;\">&iquest;Qu&eacute; son las Tecnolog&iacute;as de la Informaci&oacute;n y las Comunicaciones (TIC)?&nbsp;</h1>\n" +
                "<p style=\"text-align: left;\">Conjunto de tecnolog&iacute;as que permiten la adquisici&oacute;n, producci&oacute;n, almacenamiento, tratamiento, registro y presentaci&oacute;n de informaci&oacute;n en formatos de sonido, im&aacute;genes y datos&hellip;[que] incluyen la electr&oacute;nica como su tecnolog&iacute;a base, que apoya el desarrollo de las telecomunicaciones, la inform&aacute;tica y el audiovisual.</p>\n" +
                "<h3>Ventajas:</h3>\n" +
                "<p>Las virtudes de las TICs no son dif&iacute;ciles de enumerar: su mayor velocidad, capacidad y distribuci&oacute;n de la informaci&oacute;n permiten que usuarios de distintas partes del planeta pueden conectarse usando computadores y otros aparatos especializados, para comunicarse de m&uacute;ltiples maneras y emprender diversas transacciones: comprar y vender objetos e informaci&oacute;n, compartir datos personales, conversar en tiempo real, incluso jugar videojuegos en l&iacute;nea a&uacute;n sin hablar el mismo idioma.</p>\n" +
                "<p>Esto, no cabe duda, ha revolucionado la vida cotidiana. La informaci&oacute;n que antes estaba en los libros, en servicios especializados y bases de datos, hoy est&aacute; dispersa en los m&uacute;ltiples pasillos de la Red y puede circular mucho m&aacute;s libre y democr&aacute;ticamente, aunque a ratos de manera mucho menos organizada. La idea del servicio postal y de la mensajer&iacute;a dieron un vuelco, tambi&eacute;n: bastan un tel&eacute;fono inteligente con c&aacute;mara y conexi&oacute;n a Internet para compartir informaci&oacute;n con alguien del otro lado del mundo.</p>\n" +
                "<p>Asimismo, las TICs inauguraron &aacute;reas de trabajo especializado y nuevas formas de consumo de bienes y servicios, como son los Community Manager empresariales o como hacen los Freelancers a distancia. Incluso han dejado su huella en las relaciones interpersonales y amorosas, que ya no perciben la distancia como algo insalvable</p>\n" +
                "<h3>Desventajas:</h3>\n" +
                "<p>No todo es positivo con las TICs. Entre otras cosas, han fomentado una dispersi&oacute;n de la informaci&oacute;n, desprovista de sistemas de catalogaci&oacute;n y legitimaci&oacute;n del conocimiento, lo cual se traduce en mayor grado de desorden del contenido (como ocurre con Internet) e incluso acceso prematuro al mismo, fomentando la ignorancia y la irresponsabilidad en el gran p&uacute;blico, incapaz de discernir si las fuentes son confiables o no.</p>\n" +
                "<p>Asimismo, estas nuevas tecnolog&iacute;as han impulsado una enorme exposici&oacute;n de la vida &iacute;ntima y personal, adem&aacute;s de la obligaci&oacute;n de una conexi&oacute;n permanente a las distintas comunidades virtuales que se han establecido, dando pie a conductas adictivas o poco saludables, y a nuevas formas de riesgo. El autismo cultural, el aislamiento social y la hiperestimulaci&oacute;n infantil, as&iacute; como los enormes riesgos a la privacidad, son algunos de los inconvenientes que m&aacute;s preocupan alrededor de las TICs actualmente.</p>\n" +
                "<h1>Evoluci&oacute;n de la Web:</h1>\n" +
                "<h4>La web ha evolucionado desde su creaci&oacute;n de forma r&aacute;pida en diferentes aspectos:</h4>\n" +
                "<p>&bull; &nbsp; &nbsp;R&aacute;pidez de acceso y n&uacute;mero de usuarios conectados.</p>\n" +
                "<p>&bull; &nbsp; &nbsp;&Aacute;mbitos de aplicaci&oacute;n. El uso de las redes de comunicaci&oacute;n ha ido aumentando exponencialmente desde su creaci&oacute;n, actualmente m&uacute;ltiples de las actividades cotidianas que realizamos se pueden realizar de forma m&aacute;s r&aacute;pida y eficaz a trav&eacute;s de las redes (reservas de hotel, avi&oacute;n, tren, pago de tributos, solicitud de cita previa, transferencias bancarias, compra electr&oacute;nica, etc).</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Tipo de interacci&oacute;n del usuario. La evoluci&oacute;n que ha seguido la web en relaci&oacute;n al rol que los usuarios tienen en el acceso a la misma ha ido tambi&eacute;n evolucionando.</p>\n" +
                "<h2>WEB 1.0 (hacia 1990)</h2>\n" +
                "<h3>Caracter&iacute;sticas:</h3>\n" +
                "<p>&bull; &nbsp; &nbsp;Solo se pod&iacute;a consumir contenido. Se trataba de informaci&oacute;n a la que se pod&iacute;a acceder, pero sin posibilidad de interactuar; era unidireccional.&nbsp;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Se basa en la Sociedad de la Informaci&oacute;n, en medios de entretenimiento y consumo pasivo (medios tradicionales, radio, TV, email). Las p&aacute;ginas web son est&aacute;ticas.</p>\n" +
                "<p>La web 1.0 es la forma m&aacute;s b&aacute;sica que existe de navegadores de solo texto. Apareci&oacute; hacia 1990 y es muy primitiva para lo que hoy ofrece la web. La web 1.0 la utilizan personas conectadas a la web utilizando Internet y es de solo lectura y el usuario es, b&aacute;sicamente, un sujeto pasivo que recibe la informaci&oacute;n o la p&uacute;blica, sin que existan posibilidades para que se genere la interacci&oacute;n con el contenido de la p&aacute;gina; est&aacute; totalmente limitada a lo que el webmaster&ndash;el experto que administra los contenidos--sube a la p&aacute;gina web. Esta web primitiva es est&aacute;tica, centralizada, secuencial, de solo lectura, y es no interactiva. Sirve para utilizar el correo electr&oacute;nico, navegadores, motores de b&uacute;squeda, etc. Una p&aacute;gina web que se limita a mostrar informaci&oacute;n y que ni siquiera se actualiza, forma parte de la generaci&oacute;n1.0.</p>\n" +
                "<h2>WEB 2.0(2004)</h2>\n" +
                "<h3>Caracter&iacute;sticas:</h3>\n" +
                "<p>&bull; &nbsp; &nbsp;Tambi&eacute;n denominada web social, se caracteriza por el desarrollo de tecnolog&iacute;as orientadas a la participaci&oacute;n y colaboraci&oacute;n entre comunidades virtuales.</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Fue acu&ntilde;ado por O&rsquo;Reilly en 2004 para referirse a una segunda generaci&oacute;n de tecnolog&iacute;a web basada en comunidades de usuarios y una gama especial de servicios que fomentan la colaboraci&oacute;n y el intercambio &aacute;gil de informaci&oacute;n entre los usuarios de una comunidad o red social. La web 2 posibilita la conexi&oacute;n de personas con personas.</p>\n" +
                "<p>Es din&aacute;mica, interactiva, de lectura y escritura, desarrolla la inteligencia colectiva y favorece el trabajo colaborativo, se vincula a los servicios que permiten compartir datos e interactuar con gran facilidad. Las redes sociales y las plataformas de colaboraci&oacute;n constituyen la base de esta evoluci&oacute;n de Internet. Es una actitud ante la comunicaci&oacute;n que utiliza la tecnolog&iacute;a. El uso de la web est&aacute; orientado a la interacci&oacute;n en redes sociales, que pueden proporcionar contenido, creando webs interactivas y visuales. Es decir, los sitios web 2.0 act&uacute;an como puntos de encuentro de los usuarios, pues son bidireccionales, en contraposici&oacute;n de la web 1.0, que es unidireccional.</p>\n" +
                "<h2>WEB 3.0 (2006)</h2>\n" +
                "<h3>Caracter&iacute;sticas:</h3>\n" +
                "<p>&bull; &nbsp; &nbsp;Web 3.0, son aplicaciones web conectadas a aplicaciones web, a fin de enriquecer la experiencia de las personas; a esto agrega conocimiento del contexto en la web geoespacial, la autonom&iacute;a respecto del navegador y la construcci&oacute;n de la web sem&aacute;ntica.&nbsp;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Es conocida como la &ldquo;web sem&aacute;ntica&rdquo; porque utiliza de forma m&aacute;s eficiente los datos: &ldquo;data web&rdquo;.&nbsp;</p>\n" +
                "<p>&bull; &nbsp; &nbsp; Es inter-operativa y el usuario tiene el control para hacer los cambios que desee modificando directamente las bases de datos.&nbsp;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Incluye meta-datos sem&aacute;nticos u ontol&oacute;gicos (que describen los contenidos y las relaciones entre los datos) para que puedan ser rastreados por sistemas de procesamiento.</p>\n" +
                "<p>La web3.0 est&aacute; muy asociada al concepto de personalizaci&oacute;n. Ofrece un flujo de informaci&oacute;n y de contenidos adaptados a nuestros gustos y preferencias. &iquest;De d&oacute;nde sacar&aacute;n los motores de gesti&oacute;n de datos, informaci&oacute;n sobre nuestros gustos?, de nuestra actividad en la red que, como sabemos, deja un importante rastro a modo de fotos, opiniones, tendencia de b&uacute;squeda, viajes, etc. Como vemos, algunos elementos de Web 3.0, ya estaban presenten, al menos en fase inicial, en la web2.0.</p>\n" +
                "<p>La web 3.0 apunta a que todos podamos disfrutar de la informaci&oacute;n y de las herramientas de Internet sin importar el aparato a trav&eacute;s del cual nos conectemos, ya que busca una flexibilidad y una versatilidad que superen las barreras del formato y la estructura.</p>\n" +
                "<h2>WEB 4.0 (2016)</h2>\n" +
                "<h3>Caracter&iacute;sticas:</h3>\n" +
                "<p>&bull; &nbsp; &nbsp;La comprensi&oacute;n del lenguaje natural hablado, escrito y tecnolog&iacute;as (de voz a texto y viceversa).&nbsp;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Nuevos sistemas de comunicaci&oacute;n a m&aacute;quina (M2M).&nbsp;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;Uso de la informaci&oacute;n del contexto. Por ejemplo, ubicaci&oacute;n que aporta el GPS, ritmo card&iacute;aco que registra el smartwatch, etc.&nbsp;</p>\n" +
                "<p>Gracias a la propia evoluci&oacute;n de la tecnolog&iacute;a. Empresas como Google, Microsoft o Facebook, entre otras, est&aacute;n desarrollando nuevos sistemas que gracias al Deep Learning y Machine Learning ser&aacute;n capaces de procesar informaci&oacute;n de forma similar a como lo har&iacute;a el cerebro humano. Tenemos los avances que los asistentes de voz est&aacute;n logrando. Siri, Google Now o Cortana entienden cada vez de forma m&aacute;s precisa y correcta lo que les decimos o solicitamos. Es m&aacute;s, ya hay smartphones que siempre est&aacute;n &ldquo;escuchando&rdquo; para activarse en el preciso momento que oigan &ldquo;Oye, Siri&rdquo; u &ldquo;Hola, Google Now&rdquo;, etc. para contestar de inmediato.</p>\n" +
                "<p>Otro indicador de hacia d&oacute;nde vamos son los bots. Son programas interacci&oacute;n que traer&aacute; la web 4.0. Por ahora dependen de la introducci&oacute;n de texto, pero, con la evoluci&oacute;n en tecnolog&iacute;as de &ldquo;hablar al texto&rdquo; (Speech to text), seremos capaces de conversar con ellos de igual modo que lo har&iacute;amos con un amigo en una cafeter&iacute;a.</p>\n" +
                "<h1>Las tecnolog&iacute;as m&oacute;viles y computaci&oacute;n en la nube</h1>\n" +
                "<h3>Las tecnolog&iacute;as m&oacute;viles:</h3>\n" +
                "<p>Si bien es cierto que la tecnolog&iacute;a m&oacute;vil est&aacute; con nosotros desde la d&eacute;cada de los &apos;70, ha sufrido cambios fundamentales que hacen que la que hoy conocemos no tenga mucho de la original.</p>\n" +
                "<p>As&iacute; es, en los 50 a&ntilde;os que lleva ha sufrido una importante evoluci&oacute;n, mayormente transparente para nosotros, los usuarios.</p>\n" +
                "<p>Los cambios tecnol&oacute;gicos nos han pasado bastante desapercibidos, excepto por la reducci&oacute;n de los costes del servicio, por el significativo incremento de sus funcionalidades y por el cambio de las siglas: 1G, 2G, 3G, 4G, ?</p>\n" +
                "<h3>&bull; Primera Generaci&oacute;n 1G (1970-1980):</h3>\n" +
                "<p>Fue lanzada en Jap&oacute;n por la NTT en 1979 y corresponde a las primeras redes de telefon&iacute;a m&oacute;vil, que en su momento utilizaron la tecnolog&iacute;a anal&oacute;gica.&nbsp;</p>\n" +
                "<p>Estos sistemas permitieron a un peque&ntilde;o n&uacute;mero de abonados, principalmente hombres de negocios (utilizando tel&eacute;fonos m&oacute;viles muy grandes y legendarios), comunicarse entre diferentes importantes centros urbanos.</p>\n" +
                "<h3>&bull; &nbsp;SEGUNDA GENERACI&Oacute;N 2G (1980-2000):</h3>\n" +
                "<p>En esta generaci&oacute;n de m&oacute;viles ya se introducen protocoles de telefon&iacute;a digital lo que ya permite enviar SMS (Short Message Service) y env&iacute;o de datos desde dispositivos de FAX y M&Oacute;DEM.</p>\n" +
                "<p>Adem&aacute;s ten&iacute;a servicios de Roaming Internacional, llamada en espera, exclusi&oacute;n de llamada, identificaci&oacute;n de n&uacute;mero llamante y servicios de USSD. Todo esto estaba encerrado en el tel&eacute;fono m&oacute;vil m&iacute;tico que todos recordar&eacute;is, el indestructible NOKIA 3310.</p>\n" +
                "<p>La segunda generaci&oacute;n de sistemas celulares (2G) utiliza principalmente los siguientes est&aacute;ndares:</p>\n" +
                "<p>&bull; &nbsp; &nbsp;GSM (2G)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;CDMA</p>\n" +
                "<p>&bull; &nbsp; &nbsp;TDMA</p>\n" +
                "<p>&bull; &nbsp; &nbsp;GPRS (2,5G), 2,5G es un sistema m&oacute;vil intermedio entre 2G y 3G (velocidades inferiores a 100 kbit/s)</p>\n" +
                "<p>&bull; &nbsp; &nbsp;EDGE (Velocidades de datos mejoradas para la evoluci&oacute;n del GSM, 2.75G</p>\n" +
                "<p><br></p>\n" +
                "<h3>&bull; Tercera Generaci&oacute;n 3G (2003-2007):</h3>\n" +
                "<p>En este caso los datos se env&iacute;an a trav&eacute;s de la tecnolog&iacute;a de conmutaci&oacute;n de paquetes, y aunque estaba orientada a la telefon&iacute;a m&oacute;vil en 3G &nbsp;el ancho de banda es de 5-20 MHz.&nbsp;</p>\n" +
                "<p>Esta generaci&oacute;n daba servicio a alta velocidad, Internet Inal&aacute;mbrico Fijo, telefon&iacute;a Inal&aacute;mbrica de voz, videollamada, videoconferencia, navegaci&oacute;n web, correo, mapas de navegaci&oacute;n, juego, m&uacute;sica m&oacute;vil, fotos digitales y pel&iacute;culas, actualizaci&oacute;n de tr&aacute;fico y clima adem&aacute;s de otros. En esta generaci&oacute;n se hicieron muy populares los m&oacute;viles BLACKBERRY y m&aacute;s adelante el primer smartphone que revolucion&oacute; la telefon&iacute;a m&oacute;vil: el Iphone.</p>\n" +
                "<h4>La tercera generaci&oacute;n de sistemas celulares (3G) utiliza, entre otros, el siguiente est&aacute;ndar:</h4>\n" +
                "<p>&bull; &nbsp; &nbsp;UMTS (Sistema Universal de Telecomunicaciones M&oacute;viles)</p>\n" +
                "<p><br></p>\n" +
                "<h3>&bull; Cuarta Generaci&oacute;n 4G(2007-2015):</h3>\n" +
                "<p>4G es la cuarta generaci&oacute;n de tecnolog&iacute;as de telefon&iacute;a m&oacute;vil. Se basa en el nuevo est&aacute;ndar &quot;LTE&quot; o de evoluci&oacute;n a largo plazo y es el sucesor directo de 3G y 3G+, que se basaban en los est&aacute;ndares UMTS y HSDPA.</p>\n" +
                "<p>Se basa en la tecnolog&iacute;a de telefon&iacute;a IP que se alcanza por la convergencia entre las redes de cable y redes inal&aacute;mbricas.</p>\n" +
                "<p>Como tiene una capacidad para dar velocidades de acceso mayores le permite dar servicios de cualquier clase, en cualquier momento y en cualquier lugar con un m&iacute;nimo coste.</p>\n" +
                "<p>La 4G se caracteriza por un aumento muy significativo del tr&aacute;fico de datos, que puede alcanzar los 150 Mb/s en determinadas condiciones aunque en la pr&aacute;ctica, la mayor&iacute;a de los clientes solo llegar&aacute;n a una velocidad m&aacute;xima de 20 Mbps.</p>\n" +
                "<p>Da acceso a los servicios de Internet m&oacute;vil, telefon&iacute;a IP, videoconferencia de televisi&oacute;n m&oacute;vil de alta definici&oacute;n, televisi&oacute;n 3D, Digital Video Broadcasting (DVB), etc. Un ejemplo de m&oacute;vil es el SAMSUNG Galaxy J1Ace.</p>\n" +
                "<p>4G es la tecnolog&iacute;a m&oacute;vil que llevan casi todos los m&oacute;viles actuales.</p>\n" +
                "<h3>&bull;&nbsp; &nbsp;Quinta Generaci&oacute;n 5G:</h3>\n" +
                "<p>Esta generaci&oacute;n tiene una implantaci&oacute;n en el mundo entero y usa la arquitectura inal&aacute;mbrica abierta (OWA). Utiliza la tecnolog&iacute;a de telefon&iacute;a IP banda ancha. Sus servicios tienen dispositivos en cualquier lugar y en cualquier momento y la direcci&oacute;n de IP es asignada seg&uacute;n la red y la posici&oacute;n geogr&aacute;fica y otras aplicaciones.</p>\n" +
                "<p>Se prev&eacute; que para 2025 una de cada cinco conexiones m&oacute;viles se realizara sobre redes 5G.</p>\n" +
                "<h3><span style=\"font-size: 24px;\">Computaci&oacute;n en la nube:</span></h3>\n" +
                "<p>Seg&uacute;n la octava acepci&oacute;n del Diccionario de la Lengua Espa&ntilde;ola de la RAE, la nube es un &ldquo;Espacio de almacenamiento y procesamiento de datos y archivos ubicado en internet, al que puede acceder el usuario desde cualquier dispositivo&rdquo;. Probablemente esta definici&oacute;n no sea a d&iacute;a de hoy muy precisa en cuanto a que generaliza la ubicaci&oacute;n en Internet de ese &ldquo;espacio de almacenamiento y procesamiento&rdquo;. De hecho, Gartner, que tambi&eacute;n define la computaci&oacute;n en la nube como &ldquo;un estilo de computaci&oacute;n en el que capacidades TI escalables y el&aacute;sticas son entregadas en forma de servicio utilizando tecnolog&iacute;as Internet&rdquo;, ha ampliado y precisado su glosario de t&eacute;rminos, reasignando esta misma acepci&oacute;n a &ldquo;Computaci&oacute;n en la nube p&uacute;blica&rdquo;. Adem&aacute;s, ha a&ntilde;adido nuevos t&eacute;rminos de &ldquo;Computaci&oacute;n en nube privada&rdquo; (de la que dice que &ldquo;es una forma de computaci&oacute;n en la nube utilizada por una sola organizaci&oacute;n o que asegura que una organizaci&oacute;n est&aacute; completamente aislada de otras&rdquo;) y &ldquo;Computaci&oacute;n en nube h&iacute;brida&rdquo;, que describe como &ldquo;Aprovisionamiento de servicios coordinado y basado en pol&iacute;ticas, uso y gesti&oacute;n a trav&eacute;s de una mezcla de servicios en la nube internos y externos.&rdquo;</p>\n" +
                "<p>La computaci&oacute;n en la nube (o cloud computing, en ingl&eacute;s) es una tecnolog&iacute;a que permite acceder remotamente, de cualquier lugar del mundo y en cualquier momento, a softwares, almacenamiento de archivos y procesamiento de datos a trav&eacute;s de Internet, sin la necesidad de conectarse a un ordenador personal o servidor local.</p>\n" +
                "<p>En otras palabras, la computaci&oacute;n en la nube utiliza la conectividad y gran escala de Internet para hospedar los m&aacute;s variados recursos, programas e informaci&oacute;n, y permite que el usuario ingrese a ellos trav&eacute;s de cualquier ordenador, tablet o celular.</p>\n" +
                "<h3>Utilizaci&oacute;n de la nube:</h3>\n" +
                "<p>Si analizamos el modelo tradicional de computaci&oacute;n, en el que los usuarios y las empresas necesitan invertir en downloads, hardwares, sistemas operativos y softwares para lograr ejecutar alg&uacute;n tipo de aplicaci&oacute;n, es f&aacute;cil entender por qu&eacute; el cloud computing se volvi&oacute; tan popular.</p>\n" +
                "<p>La nube surgi&oacute; como una forma de democratizar la informaci&oacute;n y mejorar la experiencia de quienes dependen de recursos tecnol&oacute;gicos a nivel personal o profesional.</p>\n" +
                "<p>El cloud computing trajo consigo innumerables ventajas. Optar por un servicio en nube permite:</p>\n" +
                "<p>&bull; &nbsp; &nbsp;La reducci&oacute;n de costos con infraestructura: ya que elimina el gasto capital con compras de hardware y softwares, instalaci&oacute;n y manutenci&oacute;n;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;La econom&iacute;a de espacio: dado que los recursos permanecen almacenados online;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;La centralizaci&oacute;n de la informaci&oacute;n: evitando que todos los datos se mantengan en distintos programas, con diferentes tipos de autenticaci&oacute;n y formas de acceso;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;El aumento o disminuci&oacute;n acorde con la necesidad del cliente: gracias al poder de elasticidad que proporciona la cantidad ideal de recursos, almacenamiento y procesamientos;</p>\n" +
                "<p>&bull; &nbsp; &nbsp;El trabajo remoto: funcionarios de empresas pueden acceder a todos los datos a trav&eacute;s de cualquier ordenador, notebook, tablet o smartphone, desde que est&eacute;n conectados a Internet.</p>\n" +
                "<p>Tipos de modelos de implementaci&oacute;n de computaci&oacute;n en nube:</p>\n" +
                "<h2>Nube privada</h2>\n" +
                "<p>El modelo de nube privada hace referencia a los recursos de computaci&oacute;n en nube que se usan exclusivamente en una misma empresa u organizaci&oacute;n. La nube privada puede almacenarse en el centro de datos interno o un proveedor de servicios puede alojarla en la nube.</p>\n" +
                "<h2>Nube p&uacute;blica</h2>\n" +
                "<p>Cuando una organizaci&oacute;n implementa un modelo de nube p&uacute;blica, toda la infraestructura de hardware, software y soporte es propiedad del proveedor de servicios que la administra y la proporciona exclusivamente por Internet. Puede acceder a estos servicios y administrar la cuenta mediante un navegador web.</p>\n" +
                "<h2>Nube h&iacute;brida</h2>\n" +
                "<p>Un modelo de computaci&oacute;n en nube h&iacute;brido combina las nubes p&uacute;blicas y privadas para compartir datos y aplicaciones. Las nubes h&iacute;bridas conectan la infraestructura y las aplicaciones entre recursos en nube con los recursos existentes que no se encuentran en la nube.</p>\n" +
                "<h3><span style='font-family: \"Times New Roman\", Times, serif; font-size: 22px;'>Tipos de servicios de computaci&oacute;n en nub</span><span style=\"font-family: Arial, Helvetica, sans-serif; font-size: 22px;\">e:</span></h3>\n" +
                "<p>Los servicios de computaci&oacute;n en nube ofrecen modelos convenientes de pago por uso que eliminan los gastos y el mantenimiento costosos. Los proveedores de nube alojan una variedad de ofertas de infraestructura (IaaS), plataforma (PaaS) y software (SaaS) en las instalaciones que ellos &ldquo;alquilan&rdquo;, lo que le aporta flexibilidad de activar o desactivar los servicios de computaci&oacute;n en nube en funci&oacute;n de los requisitos cambiantes.</p>\n" +
                "<p><br></p>\n" +
                "<p><br></p>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tic.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));
        } else {
            tic.setText(Html.fromHtml(t));
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
