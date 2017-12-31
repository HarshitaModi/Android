package com.example.harshita.hello;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by advitiyaapp on 31/12/17.
 */

//Recyclerview.adapter
    //Recyclerview.viewholder

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    private Context mCtx;
    private List<Recycler> recyclerList ;

    public RecyclerAdapter(Context mCtx, List<Recycler> recyclerList) {
        this.mCtx = mCtx;
        this.recyclerList = recyclerList;
    }



    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_recycler , null);

        RecyclerViewHolder holder = new RecyclerViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        Recycler recycler = recyclerList.get(position);

        holder.venueView.setText(recycler.getVenue());
        holder.nameView.setText(recycler.getName());
        holder.imageView.setImageBitmap(recycler.getBitmap());
        holder.buttonView.setOnClickListener(null);


    }

    @Override
    public int getItemCount() {
        return recyclerList.size();
    }



    class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView ;
        Button buttonView;
        TextView nameView , venueView ;



        public RecyclerViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.event_image);
            buttonView = itemView.findViewById(R.id.button_id);
            nameView = itemView.findViewById(R.id.event_name);
            venueView = itemView.findViewById(R.id.venue);
        }
    }
}
