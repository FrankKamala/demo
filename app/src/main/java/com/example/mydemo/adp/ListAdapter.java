package com.example.mydemo.adp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydemo.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
   private ArrayList<adp> mExampleAdp;
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mText1;
        public TextView mText2;
        public TextView mText3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mText1=itemView.findViewById(R.id.pOrder);
            mText2=itemView.findViewById(R.id.pDate);
            mText1=itemView.findViewById(R.id.pStatus);
        }
    }

    public ListAdapter (ArrayList<adp> exampleAdp){
        mExampleAdp= exampleAdp;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_items,parent,false);
        MyViewHolder evh = new MyViewHolder(v);
        return evh;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        adp currentItem = mExampleAdp.get(position);
        holder.mText1.setText(currentItem.getmPurchaseOrder());
        holder.mText1.setText(currentItem.getmDateOrder());
        holder.mText1.setText(currentItem.getOrderStatus());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
