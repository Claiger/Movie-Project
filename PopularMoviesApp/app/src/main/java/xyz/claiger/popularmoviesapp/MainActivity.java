package xyz.claiger.popularmoviesapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {



    private static final int NUM_LIST_ITEMS = 100;
    private MovieAdapter mAdapter;
    private RecyclerView mNumbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mNumbersList = (RecyclerView) findViewById(R.id.rv_movies);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mNumbersList.setLayoutManager(layoutManager);
        mNumbersList.setHasFixedSize(true);

        Context context = MainActivity.this;
        mAdapter = new MovieAdapter(NUM_LIST_ITEMS, context);
        mNumbersList.setAdapter(mAdapter);



    }
}
