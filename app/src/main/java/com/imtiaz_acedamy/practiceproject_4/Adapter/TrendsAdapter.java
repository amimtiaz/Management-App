package com.imtiaz_acedamy.practiceproject_4.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.imtiaz_acedamy.practiceproject_4.Domain.TrendsDomain;
import com.imtiaz_acedamy.practiceproject_4.R;

import java.util.ArrayList;

public class TrendsAdapter extends RecyclerView.Adapter<TrendsAdapter.Viewholder> {

    ArrayList<TrendsDomain> items;
    Context context;

    public TrendsAdapter(ArrayList<TrendsDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TrendsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trend_list, parent, false);

        return new Viewholder(inflater);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendsAdapter.Viewholder holder, int position) {

        holder.titleTxt.setText(items.get(position).getTitle());
        holder.subtitleTxt.setText(items.get(position).getSubtitle());

        int drawableResourceId = holder.itemView.getResources()
                .getIdentifier(items.get(position).getPicPath(), "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30,30,0,0))
                .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView titleTxt, subtitleTxt;
        ImageView pic;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            titleTxt = itemView.findViewById(R.id.titleTxt);
            subtitleTxt = itemView.findViewById(R.id.subtitleTxt);
            pic = itemView.findViewById(R.id.pic);

        }
    }
}
