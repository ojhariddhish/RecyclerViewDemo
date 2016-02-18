package com.dnsoftindia.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ganesha on 2/18/2016.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private ArrayList<Movie> movies = new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView year, title, genre, tagLine, director, screenplay, actor, actress, story;

        public MyViewHolder(View itemView) {
            super(itemView);

            year = (TextView) itemView.findViewById(R.id.year);
            title = (TextView) itemView.findViewById(R.id.title);
            genre = (TextView) itemView.findViewById(R.id.genre);
            tagLine = (TextView) itemView.findViewById(R.id.tag_line);
            director = (TextView) itemView.findViewById(R.id.director);
            screenplay = (TextView) itemView.findViewById(R.id.screenplay);
            actor = (TextView) itemView.findViewById(R.id.actor);
            actress = (TextView) itemView.findViewById(R.id.actress);
            story = (TextView) itemView.findViewById(R.id.story);

        }
    }

    public MovieAdapter(ArrayList<Movie> moviesList) {
        this.movies = moviesList;
    }

    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MyViewHolder holder, int position) {

        Movie m = movies.get(position);
        holder.year.setText(m.getYear());
        holder.title.setText(m.getName());
        holder.genre.setText(m.getGenre());
        holder.tagLine.setText(m.getTagLine());
        holder.director.setText(m.getDirector());
        holder.screenplay.setText(m.getScreenplayBy());
        holder.actor.setText(m.getStarActor());
        holder.actress.setText(m.getStarActress());
        holder.story.setText(m.getStoryBy());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


}
