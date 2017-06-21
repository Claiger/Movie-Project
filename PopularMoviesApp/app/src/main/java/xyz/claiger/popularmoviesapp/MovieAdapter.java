package xyz.claiger.popularmoviesapp;

        import android.content.Context;
        import android.support.v7.widget.RecyclerView;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.squareup.picasso.Picasso;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private static final String TAG = MovieAdapter.class.getSimpleName();
    private int mNumberItems;
    private Context mContext;


    public MovieAdapter(int numberOfItems, Context turtle) {
        mNumberItems = numberOfItems;
        mContext = turtle;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.movies_list_items;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        MovieViewHolder viewHolder = new MovieViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Log.d(TAG, "#" + position);
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView listItemNumberView;
        ImageView movieListView;


        public MovieViewHolder(View itemView) {
            super(itemView);
            movieListView = (ImageView) itemView.findViewById(R.id.movie_image);
            listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }


        void bind(int listIndex) {
           // listItemNumberView.setText(String.valueOf(listIndex));

            Picasso.with(mContext).load("http://i.imgur.com/DvpvklR.png").into(movieListView);
        }
    }
}
