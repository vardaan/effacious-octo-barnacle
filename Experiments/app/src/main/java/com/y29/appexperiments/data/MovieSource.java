package com.y29.appexperiments.data;

        import com.y29.appexperiments.data.model.Movie;

        import rx.Observable;

/**
 * Created by ANI on 03-10-2015.
 */
public interface MovieSource {
    Observable<Movie> getMovieList(int page);
}
