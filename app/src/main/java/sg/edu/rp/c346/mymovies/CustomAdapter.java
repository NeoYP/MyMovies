package sg.edu.rp.c346.mymovies;



import android.content.Context;

import android.support.annotation.NonNull;

import android.support.annotation.Nullable;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;

import android.widget.ImageView;

import android.widget.TextView;



import java.security.Security;

import java.util.ArrayList;



/**

 * Created by 17010411 on 25/7/2018.

 */



public class CustomAdapter {

    public class CustomAdapter extends ArrayAdapter {



        Context parent_context;

        int layout_id;

        ArrayList<Movie> MovieList;





        public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Movie> objects) {

            super(context, resource, objects);

            parent_context = context;

            layout_id = resource;

            MovieList = objects;

        }



        @NonNull

        @Override

        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            // Obtain the LayoutInflater object.

            LayoutInflater inflater = (LayoutInflater) parent_context

                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);



            // Inflate a new view hierarchy from the specified xml resource (layout_id)

            // and return the root View of the inflated hierarchy.

            View rowView = inflater.inflate(layout_id, parent, false);



            // Obtain the UI elements and bind them to their respective Java variable.

            ImageView ivRating = rowView.findViewById(R.id.ImageViewRating);

            TextView tvTitle = rowView.findViewById(R.id.TextViewTitle);

            TextView tvYear = rowView.findViewById(R.id.TextViewYear);

            TextView tvGenre = rowView.findViewById(R.id.TextViewGenre);



            // Obtain the property values from the Data Class object

            // and set them to the corresponding UI elements.

            Movie currentItem = MovieList.get(position);



            // Setting the image based on the rating

            String rating = currentItem.getRated();

            String ratingID = "rating_" + rating;

            int drawableResourceId = parent_context.getResources().getIdentifier(ratingID, "drawable", parent_context.getPackageName());

            ivRating.setImageResource(drawableResourceId);





            tvTitle.setText(currentItem.getTitle());

            tvYear.setText(currentItem.getYear() + " - ");

            tvGenre.setText(currentItem.getGenre());





            // Return the View corresponding to the data at the specified position.

            return rowView;

        }

    }

}