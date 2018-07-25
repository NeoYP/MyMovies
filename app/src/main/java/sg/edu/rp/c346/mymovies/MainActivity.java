package sg.edu.rp.c346.mymovies;



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.AdapterView;

import android.widget.ListView;



import java.util.ArrayList;

import java.util.Calendar;



public class MainActivity extends AppCompatActivity {

    ListView lvMovies;

    ArrayList<Movie> alMovies;

    CustomAdapter caMovies;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        lvMovies = findViewById(R.id.listViewMovies);

        alMovies = new ArrayList<>();



        Calendar date1 = Calendar.getInstance();

        date1.set(2014, 11, 15);

        Calendar date2 = Calendar.getInstance();

        date2.set(2015, 5, 15);

        Movie item1 = new Movie("The Avengers", "2012", "pg13", "Action | Sci-Fi", date1, "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.",4.0f);

        Movie item2 = new Movie("Planes", "2013", "pg", "Animation | Comedy", date2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.", 2.0f);

        alMovies.add(item1);

        alMovies.add(item2);









        caMovies = new CustomAdapter(this,R.layout.movie_item, alMovies);



        lvMovies.setAdapter(caMovies);



        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getBaseContext(), MovieDetails.class);

                Movie movie = alMovies.get(position);

                intent.putExtra("movie", movie);

                startActivity(intent);

            }

        });

    }
