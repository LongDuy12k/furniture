package com.example.furniture.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.furniture.DetailActivity;
import com.example.furniture.R;
import com.example.furniture.model.Funiture;

import java.util.ArrayList;
import java.util.List;

public class FunitureAdapter extends RecyclerView.Adapter<FunitureAdapter.UserViewHodel>  {

    private List<Funiture> funitureList;
    private Context mContext;

    public FunitureAdapter(Context context, List<Funiture> funitureList) {
        this.mContext = context;
        this.funitureList = funitureList;
    }

    @NonNull
    @Override
    public UserViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_furniture,parent,false);


        return new UserViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHodel holder, int position) {

       final Funiture funiture = funitureList.get(position);
        if (funiture == null){
            return;
        }
        holder.imgfu.setImageResource(funiture.getImgfu());
        holder.usefu.setText(funiture.getUsefu());
        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetail(funiture);
            }
        });
    }
    private void onClickGoToDetail(Funiture funiture){
        Intent intent = new Intent(mContext, DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("",funiture);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if (funitureList != null){
            return funitureList.size();
        }

        return 0;
    }

    public class UserViewHodel extends RecyclerView.ViewHolder{
        private RelativeLayout layoutItem;

        private ImageView imgfu;
    private TextView usefu;
    public UserViewHodel(@NonNull View itemView) {
        super(itemView);
        layoutItem = itemView.findViewById(R.id.layout_Item);
        imgfu = itemView.findViewById(R.id.imgfu);
        usefu = itemView.findViewById(R.id.usefu);
    }
}


}

