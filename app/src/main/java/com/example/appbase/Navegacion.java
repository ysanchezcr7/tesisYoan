package com.example.appbase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.appbase.Tema1.EvolucionInformatica;
import com.example.appbase.Tema1.ParadigmasTecnoInfor;
import com.github.zagum.switchicon.SwitchIconView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

//:background="@drawable/dominioinformatica"

public class Navegacion extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private static final int MY_PERMISSION_WRITE_CONTACTS = 100;
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    private static final int REQUEST_READ_CONTACTS = 1;
    //private static final int CAMERA_REQUEST = 1888;

    private Context context;
    RecyclerView listView;
    Toolbar toolbar;
    String totalContact;

   //private int[] gallery = {R.drawable.inicio, R.drawable.informatica3, R.drawable.imagen1, R.drawable.imagen1};

    private int position = 0;

    private static final Integer DURATION = 2500;
    ImageSwitcher imageSwitcher;
    private Timer timer = null;
    SwitchMaterial btnswitch;
    //ImageView imageView;

    //inicializar variables carrusel view pager
    List  <ImageView> imageViewsList; // Almacena una colección de todas las imágenes de carrusel
    private int images []; // Almacenar todos los ID de imágenes

    List  <ImageView> imagePointsList; // colección ImageView que almacena pequeños puntos blancos
    private int pageIndex = 0; // El número de página actual del visor

    private LinearLayout whitePointsLayout; // Todos los puntos blancos pequeños se agregarán a este diseño
    private ViewPager viewPager;



    public Navegacion() {
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_navegacion);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        toggle.syncState();
        ((NavigationView) findViewById(R.id.nav_view)).setNavigationItemSelectedListener(this);

        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar.setNavigationIcon(R.drawable.ic_menu);

// codigo del carrusel de imagenes
    /*    imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {
                return new ImageView(Navegacion.this);
            }
        });

        // Set animations
        // https://danielme.com/2013/08/18/diseno-android-transiciones-entre-activities/
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_slide_in_right);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.anim_slide_out_left);
        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);
        imageSwitcher.setImageResource(gallery[position]);*/



        View header = navigationView.getHeaderView(0);


        // manejo del tema de la aplicacion
           setDayNhigt();
        LinearLayout layoaut = header.findViewById(R.id.button3);
        SwitchIconView sI = header.findViewById(R.id.switchmodo1);
        TextView textView3 = header.findViewById(R.id.textView3);
        SharedPreferences sp = getSharedPreferences("SP", this.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        int theme = sp.getInt("Theme", 1);
        if (theme == 1) {
            textView3.setText("Claro");

        } else {
            sI.switchState();
            textView3.setText("Oscuro");

            // btnswitch.setChecked(true);
        }
        layoaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sI.isIconEnabled()) {
                    sI.switchState();
                    editor.putInt("Theme", 1);
                    textView3.setText("Claro");

                } else  {
                    sI.switchState();
                    editor.putInt("Theme", 0);
                    textView3.setText("Oscuro");
                }
                editor.commit();
                setDayNhigt();

            }
        });

// carrusel con view pager
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        whitePointsLayout = (LinearLayout) findViewById(R.id.whitePoins_layout);
        imagePointsList = new ArrayList<>();
        imageViewsList = new ArrayList<>();
        // Cargar imágenes en una matriz
        images = new int[]{R.drawable.inicio, R.drawable.informatica3, R.drawable.imagen1, R.drawable.imagen1};;

        for (int i = 0; i < images.length; i++) {
            // Cargar colección de imágenes de carrusel ImageView
            ImageView iv = new ImageView(Navegacion.this);
            // Cargar imagen a través de Glide
            Glide.with(Navegacion.this).load(images[i]).into(iv);
            imageViewsList.add(iv);

            // Cargue la pequeña colección de ImageView de punto blanco
            ImageView ivPoint = new ImageView(Navegacion.this);
            ivPoint.setImageResource(R.drawable.blanco);
            // Establezca la propiedad Márgenes dinámicamente, que es establecer el espacio entre cada punto blanco
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(10, 10, 10, 10);
            ivPoint.setLayoutParams(lp);

            whitePointsLayout.addView (ivPoint); // Agrega una pequeña imagen de punto blanco a la interfaz de diseño LinearLayout
            imagePointsList.add(ivPoint);
        }
        imagePointsList.get (0) .setImageResource (R.drawable.azul); // El primer pequeño punto blanco se selecciona por defecto como azul



        PagerAdapter adapter = new PagerAdapter() {
            @Override
            public int getCount() {
                return imageViewsList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override // Establecer la vista de visualización actual
            public void setPrimaryItem(ViewGroup container, int position, Object object) {
                // Primero establece todos los puntos en blanco
                for (int i = imagePointsList.size() - 1; i >= 0; i--) {
                    imagePointsList.get(i).setImageResource(R.drawable.blanco);
                }
                // Establece el punto seleccionado en azul nuevamente
                imagePointsList.get(position).setImageResource(R.drawable.azul);
                pageIndex = position; // Obtener el índice del localizador actual

                super.setPrimaryItem(container, position, object);
            }

            @Override // Agregar vista
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(imageViewsList.get(position));
                return imageViewsList.get(position);
            }

            @Override // Destruye la vista no utilizada
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(imageViewsList.get(position));
            }

        };

// Establecer el adaptador
        viewPager.setAdapter(adapter);


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

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }

    @Override
    public void onBackPressed() {
     /*   DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }*/
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cuestionario, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.cuestionario) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;

        if (id == R.id.general) {

                String textG="";
                final View genera_layout = getLayoutInflater().inflate(R.layout.layaut_general, null);

                //final TextView tv_cobrar = (TextView) genera_layout.findViewById(R.id.tvG);
                //Resources res = getResources();

               /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    tv_cobrar.setText(Html.fromHtml(textG, Html.FROM_HTML_MODE_COMPACT));
                } else {
                    tv_cobrar.setText(Html.fromHtml(textG));
                }*/

                final AlertDialog dialog_cobrar = new AlertDialog.Builder(Navegacion.this)
                        .setTitle("")
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
        else if (id == R.id.leccion1) {
            Intent inte = new Intent(this, EvolucionInformatica.class);
           startActivity(inte);
          /*  getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frangmenNav, new EvolucionInformatica())
                    .commit();*/

        }  if (id == R.id.leccion2) {
            Intent inte = new Intent(this, ParadigmasTecnoInfor.class);
            startActivity(inte);

        } /*else if (id == R.id.hadware) {
            Intent inte = new Intent(this, Hadware.class);

            startActivity(inte);

        } else if (id == R.id.tic) {
            Intent inte = new Intent(this, Tic.class);

            startActivity(inte);

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    // Stops the slider when the Activity is going into the background
    @Override
    protected void onPause() {
        super.onPause();
      /*  if (timer != null) {
            timer.cancel();
        }*/
    }

    @Override
    protected void onResume() {
        super.onResume();
//        if (timer != null) {
//            startSlider();
//        }

    }




}















