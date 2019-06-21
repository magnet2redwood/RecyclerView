package com.redwood2magnet.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdepter extends RecyclerView.Adapter<ExampleAdepter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mText1;
        public TextView mText2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView= itemView.findViewById(R.id.imageview);
            mText1=itemView.findViewById(R.id.text1);
            mText2=itemView.findViewById(R.id.text2);
        }
    }

    public ExampleAdepter(ArrayList<ExampleItem> mExampleList) {
        this.mExampleList = mExampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example_item,viewGroup,false);
        ExampleViewHolder evh=new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        ExampleItem currentItem= mExampleList.get(i);

        exampleViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        exampleViewHolder.mText1.setText(currentItem.getmText1());
        exampleViewHolder.mText2.setText(currentItem.getmText2());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
