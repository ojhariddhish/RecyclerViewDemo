package com.dnsoftindia.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Movie> movies = new ArrayList<>();
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("RecyclerViewDemo: Movies");
        setSupportActionBar(toolbar);


        addMovies();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        movieAdapter = new MovieAdapter(movies);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(movieAdapter);

    }

    private void addMovies() {
        //String director, String genre, String name,
        // String screenplayBy, String starActor, String starActress,
        // String storyBy, String tagLine, String year

        Movie movie = new Movie("Robert Zemeckis", "Science Fiction", "Back to the Future",
                "Robert Zemeckis, Bob Gale", "Michael J. Fox", "", "",
                "He's the only kid ever to get into trouble before he was born.", "1985");
        movies.add(movie);

        movie = new Movie("J. J. Abrams", "Science Fiction", "Star Trek",
                "Roberto Orci, Alex Kurtzman", "Chris Pine, Zachary Quinto", "Zoe Saldana",
                "Gene Roddenberry",
                "The future begins.", "2009");
        movies.add(movie);

        movie = new Movie("Jon Favreau", "Action, Adventure, Sci-Fi", "Iron Man",
                "Mark Fergus, Hawk Otsby, Art Marcum, Matt Holloway", "Robert Downey Jr.",
                "Gwyneth Paltrow", "Stan Lee, Don Heck, Jack Kirby, Larry Lieber",
                "Heroes aren't born. They're built.", "2008");
        movies.add(movie);

        movie = new Movie("Christopher McQuarrie", "Action, Adventure, Thriller", "Mission Impossible: Rogue Nation",
                "Christopher McQuarrie", "Tom Cruise, Jeremy Renner, Simon Pegg",
                "Rebecca Ferguson", "Christopher McQuarrie, Drew Pearce",
                "Go rogue.", "2015");
        movies.add(movie);

        movie = new Movie("Joss Whedon", "Action, Sci-Fi", "The Avengers",
                "Joss Whedon", "Robert Downey Jr., Chris Evans, Mark Ruffalo",
                "Scarlett Johansson, Cobie Smulders", "Zak Penn, Joss Whedon",
                "Avengers Assemble!", "2012");
        movies.add(movie);

        movie = new Movie("Frank Darabont", "Crime, Drama", "The Shawshank Redemption",
                "Frank Darabont", "Tim Robbins, Morgan Freeman", "", "Stephen King",
                "Fear can hold you prisoner. Hope can set you free.", "1994");
        movies.add(movie);

        movie = new Movie("Francis Ford Coppola", "Crime, Drama", "The Godfather",
                "Mario Puzo, Francis Ford Coppola", "Marlon Brando Al Pacino, James Caan", "",
                "Mario Puzo", "An offer you can't refuse.", "1972");
        movies.add(movie);

        movie = new Movie("Christopher Nolan", "Action, Crime, Drama", "The Dark Knight",
                "Jonathan Nolan, Christopher Nolan", "Christian Bale, Heath Ledger, Aaron Eckhart",
                "Maggie Gyllenhaal", "Bob Kane, Christopher Nolan, David S. Goyer",
                "The night is darkest before the dawn.", "2008");
        movies.add(movie);

        movie = new Movie("Steven Spielberg", "Biography, Drama, History", "The Schindler's List",
                "Steven Zaillian", "Liam Neeson, Ben Kingsley", "Caroline Goodall", "Thomas Keneally",
                "The list is life.", "1993");
        movies.add(movie);

        movie = new Movie("Sidney Lumet", "Crime, Drama", "12 Angry Men",
                "Reginald Rose", "Martin Balsam, John Fiedler, Lee J. Cobb, E. G. Marshall, Jack Klugman", "", "",
                "...it explodes like twelve sticks of dynamite!", "1957");
        movies.add(movie);

        movie = new Movie("Robert Zemeckis", "Drama Romance", "Forrest Gump",
                "Eric Roth", "Tom Hanks", "Sally Field", "Winston Groom",
                "Life is like a box of chocolates...you never know what you're gonna get.", "1994");
        movies.add(movie);

        movie = new Movie("Christopher Nolan", "Action, Mystery, Sci-Fi", "Inception",
                "Christopher Nolan", "Leonardo DiCaprio, Joseph Gordon-Levitt, Tom Hardy",
                "Marion Cotillard, Ellen Page", "", "Your mind is the scene of the crime.", "2010");
        movies.add(movie);

        movie = new Movie("The Wachowski Brothers", "Action, Sci-Fi", "The Matrix",
                "The Wachowski Brothers", "Keanu Reeves, Lawrence Fishburne, Hugo Weaving", "Carrie Ann-Moss", "",
                "What is The Matrix?", "1999");
        movies.add(movie);

        movie = new Movie("Martin Scorsese", "Crime, Drama, Thriller", "The Departed",
                "William Monaghan", "Leonardo DiCaprio, Matt Damon, Mark Wahlberg, Jack Nicholson",
                "Vera Farmiga", "Alan Mak, Felix Chong",
                "Lies. Betrayal. Sacrifice. How far will you take it?", "2006");
        movies.add(movie);

        movie = new Movie("Ridley Scott", "Adventure, Drama, Sci-Fi", "The Martian",
                "Drew Goddard", "Matt Damon, ", "Jessica Chastain", "Andy Weir",
                "Bring Him Home.", "2015");
        movies.add(movie);

        movie = new Movie("Andrew Stanton", "Animation, Adventure, Family", "Wall.E",
                "Andrew Stanton, Jim Reardon", "Ben Burtt", "Elissa Knight", "Andrew Stanton, Pete Docter",
                "In Space, No One Can Hear You Clear.", "2008");
        movies.add(movie);

        movie = new Movie("Guy Ritchie", "Action, Adventure, Crime", "Sherlock Holmes",
                "Michael Robert Johnson, Anthony Peckham, Simon Kinberg", "Robert Downey Jr., Jude Law",
                "Rachel McAdams", "Sir Arthur Conan Doyle",
                "Holmes for the Holiday.", "2009");
        movies.add(movie);

        movie = new Movie("Stanley Kubrick", "Mystery, Sci-Fi", "2001: A Space Odyssey",
                "Stanley Kubrick, Arthur C. Clarke", "Keir Dullea, Gary Lockwood", "",
                "Arthur C. Clarke", "The Ultimate Trip.", "1968");
        movies.add(movie);

        movie = new Movie("George Miller", "Action, Adventure, Sci-Fi", "Mad Max: Fury Road",
                "George Miller, Brendan McCarthy, Nick Lathouris", "Tom Hardy, Nicholas Hoult",
                "Charlize Theron", "", "The future belongs to the mad.", "2015");
        movies.add(movie);

        movie = new Movie("Roger Michell", "Comedy, Drama, Romance", "Notting Hill",
                "Richard Curtis", "Hugh Grant", "Julia Roberts", "",
                "Can the most famous film star in the world fall for just an ordinary guy?", "1999");
        movies.add(movie);

    }

}
