package sv.edu.utec.parcial2kevin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas = new ArrayList<Personas>();
        listapersonas.add(new Personas("Alexander Pierrot", "CEO","Insures S.O"));
        listapersonas.add(new Personas("Carlos Lopez", "Asistente","Hospital Blue"));
        listapersonas.add(new Personas("Sara Bonz", "Directora de Marketing","Electrical Parts ltd"));
        listapersonas.add(new Personas("Liliana Clarence", "Diseñadora de producto","Creative App"));
        listapersonas.add(new Personas("Benito Peralta", "supervisor de Ventas","Neumáticos Press"));
        listapersonas.add(new Personas("Juan Jaramillo", "CEO","Banco Nacional"));
        listapersonas.add(new Personas("Christian Steps", "CTO","Cooperativa Verde"));
        listapersonas.add(new Personas("Alexa Giraldo", "Lead Programmer","Frutisofy"));
        listapersonas.add(new Personas("Linda Murillo", "Directora de Marketing","Seguros Boliver"));
        listapersonas.add(new Personas("Lizeth Astrada", "CEO","concesionario Motoblox"));


        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);
    }
    class AdaptadorPersonas extends ArrayAdapter<Personas> {
        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);

            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);

            TextView textView1 = item.findViewById(R.id.tvNombre);
            textView1.setText(listapersonas.get(position).getNombre());

            TextView textView2 = item.findViewById(R.id.tvCargo);
            textView2.setText(listapersonas.get(position).getCargo());

            TextView textView3 = item.findViewById(R.id.tvCompania);
            textView3.setText(listapersonas.get(position).getCompania());


            return(item);
        }




        }
}