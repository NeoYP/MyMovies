package sg.edu.rp.c346.mymovies;



import java.util.Calendar;



/**

 * Created by 17010411 on 25/7/2018.

 */



public class Movie  private String title;

        private String year;

        private String rated;

        private String genre;

        private Calendar watched_on;

        private String in_theather;

        private String description;

        private float rating;



        public Movie(String title, String year, String rated, String genre, Calendar watched_on, String in_theather, String description, float rating) {

            this.title = title;

            this.year = year;

            this.rated = rated;

            this.genre = genre;

            this.watched_on = watched_on;

            this.in_theather = in_theather;

            this.description = description;

            this.rating = rating;

        }



        public String getTitle() {

            return title;

        }



        public void setTitle(String title) {

            this.title = title;

        }



        public String getYear() {

            return year;

        }



        public void setYear(String year) {

            this.year = year;

        }



        public String getRated() {

            return rated;

        }



        public void setRated(String rated) {

            this.rated = rated;

        }



        public String getGenre() {

            return genre;

        }



        public void setGenre(String genre) {

            this.genre = genre;

        }



        public String getWatchedOnString() {

            String str = watched_on.get(Calendar.DAY_OF_MONTH)+"/"+watched_on.get(Calendar.MONTH)+"/"+watched_on.get(Calendar.YEAR);

            return str;

        }



        public Calendar getWatched_on() {

            return watched_on;

        }



        public void setWatched_on(Calendar watched_on) {

            this.watched_on = watched_on;

        }



        public String getIn_theather() {

            return in_theather;

        }



        public void setIn_theather(String in_theather) {

            this.in_theather = in_theather;

        }



        public String getDescription() {

            return description;

        }



        public void setDescription(String description) {

            this.description = description;

        }



        public float getRating() {

            return rating;

        }



        public void setRating(int rating) {

            this.rating = rating;

        }



        public String toString() {

            String str = getTitle() + "," + getYear() + "," + getRated() + "," + getGenre() + "," + getWatched_on().get(Calendar.YEAR) + "," +  getWatched_on().get(Calendar.MONTH) + "," +  getWatched_on().get(Calendar.DAY_OF_MONTH) + "," + getIn_theather() + "," + getDescription() + "," + getRating();

            return str;

        }

}


