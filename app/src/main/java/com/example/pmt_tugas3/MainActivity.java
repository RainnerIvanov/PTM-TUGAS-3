package com.example.pmt_tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    List<Heroes> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list =new ArrayList<>();
        recyclerview = findViewById(R.id.activitymain_recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Heroes(R.drawable.ahmad_dahlan,"Ahmad Dahlan","Seorang ulama dan khatib terkemuka di Masjid Besar Kesultanan Yogyakarta pada masanya.Ibu dari Ahmad Dahlan adalah puteri dari H.Ibrahim"));
        main_list.add(new Heroes(R.drawable.ahmad_yani,"Ahmad Yani","Jenderal TNI Anumerta Ahmad Yani; lahir di Purwurejo Jawa Tengah 19 Juni 1992.Meninggal di Lubang Buaya"));
        main_list.add(new Heroes(R.drawable.bung_tomo,"Bung Tomo","Sutomo(lahir di Surabaya Jwa Timur 3 Okotber 1920.Meninggal di Padang Arafan,Arab Saudi,7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sebutan Bung Tomo"));
        main_list.add(new Heroes(R.drawable.gatot_subroto,"Gatot Subroto","Jenderal TNI (Purn.) Gatot Subroto lahir di Sumpiuh,Banyumas,Jwa Tengah pada 10 Oktober1907-meniggal di Jakarta 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan militer Indonesia"));
        main_list.add(new Heroes(R.drawable.ki_hadjar_dewantara,"Ki Hadjar Dewantara","Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889"));
        main_list.add(new Heroes(R.drawable.mohammad_hatta,"Mohammad Hatta","Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902"));
        main_list.add(new Heroes(R.drawable.sudirman,"Soedirman","Jenderal Besar Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 – meninggal 29 Januari 1950 pada umur 34 tahun) adalah seorang perwira tinggi Indonesia pada masa Revolusi"));
        main_list.add(new Heroes(R.drawable.sukarno,"Soekarno","Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun)"));
        main_list.add(new Heroes(R.drawable.supomo,"Soepomo","Prof. Mr. Dr. Soepomo (Ejaan Soewandi: Supomo; lahir di Sukoharjo, Jawa Tengah, 22 Januari 1903 – meninggal di Jakarta, 12 September 1958 pada umur 55 tahun) adalah seorang pahlawan nasional Indonesia"));
        main_list.add(new Heroes(R.drawable.tan_malaka,"Tan Malaka","Tan Malaka atau Ibrahim gelar Datuk Sutan Malaka (lahir di Nagari Pandam Gadang, Suliki, Lima Puluh Kota, Sumatera Barat, 2 Juni 1897 – meninggal di Desa Selopanggung, Kediri, Jawa Timur"));
        adapter = new HeroesAdapter(main_list,getApplicationContext());
        recyclerview.setAdapter(adapter);
    }
}
