package com.example.verdenalyrics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    public ArrayList<Album> arrayCanzoni;
    Context mContext;
    LayoutInflater inflater;

    public RecyclerAdapter(Context mContext,ArrayList<Album> arrayCanzoni) {
        this.arrayCanzoni = arrayCanzoni;
        this.mContext = mContext;
        this.inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_album,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        holder.nomeAlbum.setText(arrayCanzoni.get(position).getAlbum());
        holder.tipoAlbum.setText(arrayCanzoni.get(position).getTipo() + " | " + arrayCanzoni.get(position).getData());
        holder.imgAlbum.setImageResource(arrayCanzoni.get(position).getAlbumPhoto());
    }

    @Override
    public int getItemCount() {
        return arrayCanzoni.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView nomeAlbum,tipoAlbum;
        ImageView imgAlbum;
        ArrayList<Canzone> arrayCanzoni;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAlbum = itemView.findViewById(R.id.imgAlbum);
            nomeAlbum = itemView.findViewById(R.id.albumNome);
            tipoAlbum = itemView.findViewById(R.id.tipoAlbumAnno);
            arrayCanzoni = new ArrayList<>();
            itemView.setOnClickListener(v -> {
                switch (getAdapterPosition()){
                    case 0:
                        arrayCanzoni.add(new Canzone("Took your name"));
                        arrayCanzoni.add(new Canzone("Valium"));
                        arrayCanzoni.add(new Canzone("DMS 10"));
                        arrayCanzoni.add(new Canzone("Froggs Eggs"));
                        arrayCanzoni.add(new Canzone("Across"));
                        arrayCanzoni.add(new Canzone("Stinky Louse"));
                        arrayCanzoni.add(new Canzone("High Heart Corporation"));
                        arrayCanzoni.add(new Canzone("Wonder"));
                        arrayCanzoni.add(new Canzone("Leasy Creep"));
                        arrayCanzoni.add(new Canzone("Porno Dolls Rubber"));
                        arrayCanzoni.add(new Canzone("Velvet"));
                        break;
                    case 1:
                        arrayCanzoni.add(new Canzone("Fuxia"));
                        arrayCanzoni.add(new Canzone("Fiato Adolescenziale"));
                        arrayCanzoni.add(new Canzone("Nella Schiuma"));
                        arrayCanzoni.add(new Canzone("Zoe"));
                        arrayCanzoni.add(new Canzone("Bambina In Nero"));
                        arrayCanzoni.add(new Canzone("Mormorio mucoso"));
                        arrayCanzoni.add(new Canzone("Memo Box"));
                        arrayCanzoni.add(new Canzone("Sara"));
                        arrayCanzoni.add(new Canzone("Bevimi"));
                        arrayCanzoni.add(new Canzone("Blu Ninive"));
                        arrayCanzoni.add(new Canzone("Omnia 2241"));
                        break;
                    case 2:
                        arrayCanzoni.add(new Canzone("Valvonauta"));
                        arrayCanzoni.add(new Canzone("Dentro Sharon"));
                        arrayCanzoni.add(new Canzone("Bonne Nouvelle"));
                        arrayCanzoni.add(new Canzone("Piuma"));
                        break;
                    case 3:
                        arrayCanzoni.add(new Canzone("Ovunque"));
                        arrayCanzoni.add(new Canzone("Valvonauta"));
                        arrayCanzoni.add(new Canzone("Pixel"));
                        arrayCanzoni.add(new Canzone("L’infinita Gioia Di Henry Bahus"));
                        arrayCanzoni.add(new Canzone("Vera"));
                        arrayCanzoni.add(new Canzone("Dentro Sharon"));
                        arrayCanzoni.add(new Canzone("Caramel Pop"));
                        arrayCanzoni.add(new Canzone("Viba"));
                        arrayCanzoni.add(new Canzone("Ultranoia"));
                        arrayCanzoni.add(new Canzone("Zoe"));
                        arrayCanzoni.add(new Canzone("Bambina in nero"));
                        arrayCanzoni.add(new Canzone("eyeliner"));
                        break;
                    case 4:
                        arrayCanzoni.add(new Canzone("Viba"));
                        arrayCanzoni.add(new Canzone("Stenuo"));
                        arrayCanzoni.add(new Canzone("Sunshine of Your Love"));
                        arrayCanzoni.add(new Canzone("Cretina"));
                        break;
                    case 5:
                        arrayCanzoni.add(new Canzone("La Tua Fretta"));
                        arrayCanzoni.add(new Canzone("Spaceman"));
                        arrayCanzoni.add(new Canzone("Nova"));
                        arrayCanzoni.add(new Canzone("Cara prudenza"));
                        arrayCanzoni.add(new Canzone("Onan"));
                        arrayCanzoni.add(new Canzone("Starless"));
                        arrayCanzoni.add(new Canzone("Miami Safari"));
                        arrayCanzoni.add(new Canzone("Nel Mio Letto"));
                        arrayCanzoni.add(new Canzone("1000 Anni Con Elide"));
                        arrayCanzoni.add(new Canzone("Buona Risposta"));
                        arrayCanzoni.add(new Canzone("Centrifuga"));
                        arrayCanzoni.add(new Canzone("Meduse E Tappeti"));
                        break;
                    case 6:
                        arrayCanzoni.add(new Canzone("Spaceman"));
                        arrayCanzoni.add(new Canzone("Blue"));
                        arrayCanzoni.add(new Canzone("Reverberation"));
                        arrayCanzoni.add(new Canzone("Sipario"));
                        break;
                    case 7:
                        arrayCanzoni.add(new Canzone("Miami Safari"));
                        arrayCanzoni.add(new Canzone("Solo un grande sasso Part I"));
                        arrayCanzoni.add(new Canzone("Solo un grande sasso Part II"));
                        arrayCanzoni.add(new Canzone("Creepy Smell"));
                        arrayCanzoni.add(new Canzone("Morbida"));
                        break;
                    case 8:
                        arrayCanzoni.add(new Canzone("Sulle labbra"));
                        arrayCanzoni.add(new Canzone("Voglio una pelle splendida"));
                        arrayCanzoni.add(new Canzone("Male di miele"));
                        arrayCanzoni.add(new Canzone("Non è per sempre"));
                        arrayCanzoni.add(new Canzone("Dentro Marilyn"));
                        arrayCanzoni.add(new Canzone("Tutto fa un pò male"));
                        arrayCanzoni.add(new Canzone("Nel mio letto"));
                        arrayCanzoni.add(new Canzone("Ovunque (live)"));
                        arrayCanzoni.add(new Canzone("Meduse e tappeti (live) "));
                        break;
                    case 9:
                        arrayCanzoni.add(new Canzone("Elefante"));
                        arrayCanzoni.add(new Canzone("Perfect Day"));
                        arrayCanzoni.add(new Canzone("Mu"));
                        arrayCanzoni.add(new Canzone("Corteccia (nell'up-nea)"));
                        arrayCanzoni.add(new Canzone("Passi da gigante"));
                        break;
                    case 10:
                        arrayCanzoni.add(new Canzone("Logorrea (Esperti all'opera)"));
                        arrayCanzoni.add(new Canzone("Luna"));
                        arrayCanzoni.add(new Canzone("Mina"));
                        arrayCanzoni.add(new Canzone("Balanite"));
                        arrayCanzoni.add(new Canzone("Phantastica"));
                        arrayCanzoni.add(new Canzone("Elefante"));
                        arrayCanzoni.add(new Canzone("Glamodrama"));
                        arrayCanzoni.add(new Canzone("Far Fisa"));
                        arrayCanzoni.add(new Canzone("17 Tir Nel Cortile"));
                        arrayCanzoni.add(new Canzone("40 Secondi Di Niente"));
                        arrayCanzoni.add(new Canzone("Il Suicidio Del Samurai"));
                        break;
                    case 11:
                        arrayCanzoni.add(new Canzone("Luna"));
                        arrayCanzoni.add(new Canzone("Harvest (Neil Young Cover)"));
                        arrayCanzoni.add(new Canzone("Le Tue Ossa Nell'altitudine"));
                        arrayCanzoni.add(new Canzone("Apice"));
                        arrayCanzoni.add(new Canzone("Omashee"));
                        break;
                    case 12:
                        arrayCanzoni.add(new Canzone("Marti In The Sky"));
                        arrayCanzoni.add(new Canzone("Don Calisto"));
                        arrayCanzoni.add(new Canzone("Non Prendere l'Acme, Eugenio"));
                        arrayCanzoni.add(new Canzone("Angie"));
                        arrayCanzoni.add(new Canzone("Aha"));
                        arrayCanzoni.add(new Canzone("Isacco Nucleare"));
                        arrayCanzoni.add(new Canzone("Caños"));
                        arrayCanzoni.add(new Canzone("Il Gulliver"));
                        arrayCanzoni.add(new Canzone("Faro"));
                        arrayCanzoni.add(new Canzone("Muori Delay"));
                        arrayCanzoni.add(new Canzone("Trovami Un Modo Semplice Per Uscirne"));
                        arrayCanzoni.add(new Canzone("Opanopono"));
                        arrayCanzoni.add(new Canzone("Il Caos Strisciante"));
                        arrayCanzoni.add(new Canzone("Was?"));
                        arrayCanzoni.add(new Canzone("Sotto prescrizione del dott. Huxley"));
                        break;
                    case 13:
                        arrayCanzoni.add(new Canzone("Caños"));
                        arrayCanzoni.add(new Canzone("Malaga"));
                        arrayCanzoni.add(new Canzone("L'ora è buia"));
                        arrayCanzoni.add(new Canzone("Párabellium"));
                        arrayCanzoni.add(new Canzone("His latest flame (Marie's the name)"));
                        arrayCanzoni.add(new Canzone("Fluido"));
                        break;
                    case 14:
                        arrayCanzoni.add(new Canzone("Scegli me (Un mondo che tu non vuoi)"));
                        arrayCanzoni.add(new Canzone("Loniterp"));
                        arrayCanzoni.add(new Canzone("Per sbaglio"));
                        arrayCanzoni.add(new Canzone("Mi coltivo"));
                        arrayCanzoni.add(new Canzone("Razzi arpia inferno e fiamme"));
                        arrayCanzoni.add(new Canzone("Adoratorio"));
                        arrayCanzoni.add(new Canzone("Miglioramento"));
                        arrayCanzoni.add(new Canzone("Il nulla di O."));
                        arrayCanzoni.add(new Canzone("Lui gareggia"));
                        arrayCanzoni.add(new Canzone("Le scarpe volanti"));
                        arrayCanzoni.add(new Canzone("Castelli per aria"));
                        arrayCanzoni.add(new Canzone("Sorriso in spiaggia pt. 1"));
                        arrayCanzoni.add(new Canzone("Sorriso in spiaggia pt. 2"));
                        arrayCanzoni.add(new Canzone("Attonito"));
                        arrayCanzoni.add(new Canzone("È solo lunedì"));
                        arrayCanzoni.add(new Canzone("Tu e me"));
                        arrayCanzoni.add(new Canzone("Badea blues"));
                        arrayCanzoni.add(new Canzone("Nuova luce"));
                        arrayCanzoni.add(new Canzone("Grattacielo"));
                        arrayCanzoni.add(new Canzone("A Capella"));
                        arrayCanzoni.add(new Canzone("Rossella roll over"));
                        arrayCanzoni.add(new Canzone("Canzone ostinata"));
                        arrayCanzoni.add(new Canzone("12,5 mg"));
                        arrayCanzoni.add(new Canzone("Sul ciglio"));
                        arrayCanzoni.add(new Canzone("Letto di mosche"));
                        arrayCanzoni.add(new Canzone("La volta"));
                        arrayCanzoni.add(new Canzone("Lei disse (Un mondo del tutto differente)"));
                        break;
                    case 15:
                        arrayCanzoni.add(new Canzone("Rossella Roll Over (Live)"));
                        arrayCanzoni.add(new Canzone("Le Scarpe Volanti (Live)"));
                        arrayCanzoni.add(new Canzone("È solo lunedì (Live)"));
                        arrayCanzoni.add(new Canzone("Segale cornuta"));
                        arrayCanzoni.add(new Canzone("Inutilniente"));
                        arrayCanzoni.add(new Canzone("Baby I Love You"));
                        arrayCanzoni.add(new Canzone("Optical (Demo)"));
                        arrayCanzoni.add(new Canzone("A capello (Demo)"));
                        arrayCanzoni.add(new Canzone("Razzi arpia inferno e fiamme (alternative version)"));
                        arrayCanzoni.add(new Canzone("Razzi arpia inferno e fiamme (Aucan remix)"));
                        break;
                    case 16:
                        arrayCanzoni.add(new Canzone("Ho Una Fissa"));
                        arrayCanzoni.add(new Canzone("Puzzle"));
                        arrayCanzoni.add(new Canzone("Un Po’ Esageri"));
                        arrayCanzoni.add(new Canzone("Sci desertico"));
                        arrayCanzoni.add(new Canzone("Nevischio"));
                        arrayCanzoni.add(new Canzone("Rilievo"));
                        arrayCanzoni.add(new Canzone("Diluvio"));
                        arrayCanzoni.add(new Canzone("Derek"));
                        arrayCanzoni.add(new Canzone("Vivere Di Conseguenza"));
                        arrayCanzoni.add(new Canzone("Alieni Fra Di Noi"));
                        arrayCanzoni.add(new Canzone("Contro La Ragione"));
                        arrayCanzoni.add(new Canzone("Inno Del Perdersi"));
                        arrayCanzoni.add(new Canzone("Funeralus"));
                        break;
                    case 17:
                        arrayCanzoni.add(new Canzone("Cannibale"));
                        arrayCanzoni.add(new Canzone("Dymo"));
                        arrayCanzoni.add(new Canzone("Colle immane"));
                        arrayCanzoni.add(new Canzone("Un blu sincero"));
                        arrayCanzoni.add(new Canzone("Identikit"));
                        arrayCanzoni.add(new Canzone("Fuoco amico I"));
                        arrayCanzoni.add(new Canzone("Fuoco amico II (pela i miei tratti)"));
                        arrayCanzoni.add(new Canzone("Nera visione"));
                        arrayCanzoni.add(new Canzone("Troppe scuse"));
                        arrayCanzoni.add(new Canzone("Natale con Ozzy"));
                        arrayCanzoni.add(new Canzone("Lady Hollywood"));
                        arrayCanzoni.add(new Canzone("Caleido"));
                        arrayCanzoni.add(new Canzone("Waltz del Bounty"));
                        break;
                    case 18:
                        arrayCanzoni.add(new Canzone("Ovunque"));
                        arrayCanzoni.add(new Canzone("Valvonauta"));
                        arrayCanzoni.add(new Canzone("Pixel"));
                        arrayCanzoni.add(new Canzone("L’infinita Gioia Di Henry Bahus"));
                        arrayCanzoni.add(new Canzone("Vera"));
                        arrayCanzoni.add(new Canzone("Dentro Sharon"));
                        arrayCanzoni.add(new Canzone("Caramel Pop"));
                        arrayCanzoni.add(new Canzone("Viba"));
                        arrayCanzoni.add(new Canzone("Ultranoia"));
                        arrayCanzoni.add(new Canzone("Zoe"));
                        arrayCanzoni.add(new Canzone("Bambina in nero"));
                        arrayCanzoni.add(new Canzone("eyeliner"));
                        arrayCanzoni.add(new Canzone("Bonne Nouvelle"));
                        arrayCanzoni.add(new Canzone("Ormogenia"));
                        arrayCanzoni.add(new Canzone("Corpi"));
                        arrayCanzoni.add(new Canzone("Da Giordi"));
                        arrayCanzoni.add(new Canzone("Fiato Adolescenziale"));
                        arrayCanzoni.add(new Canzone("Oggi"));
                        arrayCanzoni.add(new Canzone("Fuxia (Acoustic Version)"));
                        arrayCanzoni.add(new Canzone("Ormogenia (Demo)"));
                        arrayCanzoni.add(new Canzone("Piuma"));
                        arrayCanzoni.add(new Canzone("Shika (Live)"));
                        break;
                }
                CanzoniActivity canzoniActivity = new CanzoniActivity();
                canzoniActivity.setArrayCanzoni(arrayCanzoni);
                /*Intent intent = new Intent(mContext,CanzoniActivity.class);
                mContext.startActivity(intent);*/
            });
        }
    }
}
