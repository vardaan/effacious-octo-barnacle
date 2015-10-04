package com.y29.appexperiments.data.remote;

import com.squareup.okhttp.OkHttpClient;
import com.y29.appexperiments.data.MovieSource;
import com.y29.appexperiments.data.model.Movie;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by ANI on 03-10-2015.
 */
public class RestMovieSource implements MovieSource {

    private static final String API_END_POINT = "https://yts.to/api/v2/";
    private final RestMovieApi source;


    public RestMovieSource() {
        OkHttpClient client = new OkHttpClient();
        client.networkInterceptors().add(new LoggingInterceptor());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_END_POINT)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        source = retrofit.create(RestMovieApi.class);

    }

    @Override
    public Observable<Movie> getMovieList(int page) {
        return source.getMovieList(page);
    }

    public interface RestMovieApi {
        @GET("list_movies.json")
        Observable<Movie> getMovieList(@Query("page") int page);
    }
}
