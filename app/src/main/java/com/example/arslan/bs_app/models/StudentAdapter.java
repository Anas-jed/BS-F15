package com.example.arslan.bs_app.models;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arslan.bs_app.R;
import com.example.arslan.bs_app.adapters.StudentModel;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {

    private List<StudentModel> studentModelList;
    private Context mContext;

    public StudentAdapter(Context mContext , List<StudentModel> studentModelList) {
        this.studentModelList = studentModelList;
        this.mContext = mContext;
    }//end

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        // Inflate the custom layout
        View studentList = inflater.inflate(R.layout.students_list, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(studentList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        StudentModel currentStudentModel = studentModelList.get(position);

        holder.studentNameTextView.setText(currentStudentModel.getName());
        holder.rollNumberTextView.setText(currentStudentModel.getRollNumber());

    }

    @Override
    public int getItemCount() {
        return studentModelList.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView studentNameTextView;
        public TextView rollNumberTextView;
        public MyViewHolder(View view) {
            super(view);
            studentNameTextView = view.findViewById(R.id.student_name);
            rollNumberTextView = view.findViewById(R.id.student_roll_number);
        }
    } // end inner class

}
