package com.example.arslan.bs_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.arslan.bs_app.adapters.StudentModel;
import com.example.arslan.bs_app.models.StudentAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListExample extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<StudentModel> studentModelList;
    private StudentAdapter mStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);

        mRecyclerView = findViewById(R.id.students_list);
        mRecyclerView.setHasFixedSize(true);

        studentModelList = new ArrayList<>();

        //setting layout of the recycler view
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentModelList = createStudentsList();
        mStudentAdapter = new StudentAdapter(this , studentModelList);
        mRecyclerView.setAdapter(mStudentAdapter);

    } // end on create

    private List<StudentModel> createStudentsList() {
        ArrayList<StudentModel> studentModels = new ArrayList<>();
        studentModels.add(new StudentModel("Student 1", "1515"));
        studentModels.add(new StudentModel("Student 2", "1516"));
        studentModels.add(new StudentModel("Student 3", "1517"));
        studentModels.add(new StudentModel("Student 4", "1518"));
        studentModels.add(new StudentModel("Student 5", "1519"));
        studentModels.add(new StudentModel("Student 6", "1521"));
        studentModels.add(new StudentModel("Student 7", "1522"));
        studentModels.add(new StudentModel("Student 8", "1523"));

        return studentModels;
    }//end
}
