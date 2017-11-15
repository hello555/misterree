package com.example.mrree.misterree;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PuzzleAdapter extends RecyclerView.Adapter<PuzzleAdapter.PuzzleViewHolder> {

    ArrayList<Puzzle> listPuzzle;

    public PuzzleAdapter(ArrayList<Puzzle> listPuzzle){
        this.listPuzzle = listPuzzle;
    }

    @Override
    public PuzzleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_model, parent, false);
        return new PuzzleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PuzzleViewHolder holder, int position) {

        Puzzle currentPuzzle = listPuzzle.get(position);

        holder.listTitle.setText(currentPuzzle.getName());
        holder.listImage.setImageResource(currentPuzzle.getIcon());
        holder.container.setTag(R.id.item_puzzle, currentPuzzle);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnItemClickListener != null){
                    Puzzle f = (Puzzle) v.getTag(R.id.item_puzzle);
                    mOnItemClickListener.onItemClick(f);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPuzzle.size();
    }

    public class PuzzleViewHolder extends RecyclerView.ViewHolder{

        ImageView listImage;
        TextView listTitle;
        View container;

        public PuzzleViewHolder(View itemView) {
            super(itemView);
            listImage = (ImageView) itemView.findViewById(R.id.list_image);
            listTitle = (TextView) itemView.findViewById(R.id.list_title);
            container = itemView.findViewById(R.id.list_container);
        }
    }

    private OnItemClickListener mOnItemClickListener;

    public void setmOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{
        public void onItemClick(Puzzle puzzle);
    }

}
