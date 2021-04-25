package com.example.projectberta;


import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    public String[] localDataSet;

    public RecyclerAdapter(String[] dataSet) {
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String[] curr = localDataSet[position].split("_");
        int currLength = curr.length;
        holder.itemTitle.setText(curr[0]);
        holder.tag1.setVisibility(View.INVISIBLE);
        holder.tag2.setVisibility(View.INVISIBLE);
        holder.tag3.setVisibility(View.INVISIBLE);
        holder.tag4.setVisibility(View.INVISIBLE);

        switch (currLength) {
            case 5:  {
                holder.tag4.setText(curr[4]);
                holder.tag4.setVisibility(View.VISIBLE);
            }
            case 4:  {
                holder.tag3.setText(curr[3]);
                holder.tag3.setVisibility(View.VISIBLE);
            }
            case 3:  {
                holder.tag2.setText(curr[2]);
                holder.tag2.setVisibility(View.VISIBLE);
            }
            case 2:  {
                holder.tag1.setText(curr[1]);
                holder.tag1.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemTitle;
        private TextView tag1;
        private TextView tag2;
        private TextView tag3;
        private TextView tag4;

        public ViewHolder(View view) {
            super(view);

            itemTitle = (TextView) view.findViewById(R.id.itemTitle);
            itemImage = (ImageView) view.findViewById(R.id.itemImage);
            tag1 = (TextView) view.findViewById(R.id.firstTag);
            tag2 = view.findViewById(R.id.secondTag);
            tag3 = view.findViewById(R.id.thirdTag);
            tag4 = view.findViewById(R.id.fourthTag);;

            view.setOnClickListener(new View.OnClickListener() {
                private int position;
                @Override
                public void onClick(View v) {
                    position = getAdapterPosition();
                }
            });
        }

    }
}
