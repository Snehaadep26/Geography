package com.example.geography.Video;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Context;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geography.QuestionBank.Questions;
import com.example.geography.R;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder>

{
    ArrayList<Video> videos;
    ArrayList<Video> videofull;

    public VideoAdapter( ArrayList<Video> videos)
    {

        this.videos = videos;
    }



    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.video_card,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull MyViewHolder holder, int position) {
        Video currentVideo = videos.get(position);
        holder.topicName.setText(currentVideo.getTopicName());
        holder.image.setImageResource(currentVideo.getImageResource());
    }

    @Override
    public int getItemCount()
    {
        return videos.size();
    }

    public Filter getFilter() {
        return videoFilter;
    }

    private Filter videoFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<Video> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0){
                filteredList.addAll(videofull);
            }
            else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Video video:videofull
                ) {
                    if (video.getTopicName().toLowerCase().contains(filterPattern)){
                        filteredList.add(video);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            videos.clear();
            videos.addAll((List)results.values);
            notifyDataSetChanged();

        }
    };


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public  TextView topicName;

        public ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            topicName=itemView.findViewById(R.id.topic_textview);
            image=itemView.findViewById(R.id.map_chemistry_imageView);

        }
    }
}
