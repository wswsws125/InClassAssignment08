package com.example.wswsw.newgeoquiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsViewHolder> {

    private List<Question> questions;
    private Context context;

    //Adapter: to show the questions on the recyclerView
    public QuestionsAdapter(List<Question> questions, Context context){
        this.questions= questions;
        this.context=context;
    }

    //Using ViewHolder: to improve operation efficiency
    @Override
    public QuestionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_country, parent,false);
        return new QuestionsViewHolder(view,context);
    }

    //Each child holder is bound to the corresponding data
    @Override
    public void onBindViewHolder(QuestionsViewHolder holder, int position){
        Question question=questions.get(position);
        holder.questionCountry.setText(question.location);
        holder.countryQuestion.setText(question.question);
        holder.countryImage.setImageResource(question.photoId);
        holder.isTrue=question.isTrue;
        //holder.isTrue.setText(Boolean.toString(question.isTrue));
    }

    @Override
    public int getItemCount(){
        return questions.size();
    }
}
