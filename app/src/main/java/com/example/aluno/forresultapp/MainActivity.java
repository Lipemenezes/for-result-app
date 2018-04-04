package com.example.aluno.forresultapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.HashMap;

import model.Discipline;
import model.Exam;
import util.Const;

public class MainActivity extends AppCompatActivity {
    private HashMap<Integer, Exam> exams = new HashMap<>();
    private Discipline discipline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initViews();
    }

    public void startNextActivity(View v) {
        Intent it;

        switch (v.getTag().toString()) {
            case Const.EXAM_TAG_1:
                it = new Intent(this, ExamActivity.class);
                it.putExtra("examNumber", Const.EXAM_TAG_1);
                startActivityForResult(it, Const.REQUEST_CODE_EXAM);
                break;
            case Const.EXAM_TAG_2:
                it = new Intent(this, ExamActivity.class);
                it.putExtra("examNumber", Const.EXAM_TAG_2);
                startActivityForResult(it, Const.REQUEST_CODE_EXAM);
                break;
            case Const.DISCIPLINE_TAG:
                it = new Intent(this, DisciplineActivity.class);
                startActivityForResult(it, Const.REQUEST_CODE_DISCIPLINE);
                break;
            case Const.SEND_DATA_TAG:
                it = new Intent(this, ResultActivity.class);
                it.putExtra("discipline", discipline);
                it.putExtra("exams", exams);
                startActivityForResult(it, Const.REQUEST_CODE_SEND_DATA);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle param = data.getExtras();
        switch (resultCode) {
            case Const.RESPONSE_CODE_EXAM:
                putExam(param);
                break;
            case Const.RESPONSE_CODE_DISCIPLINE:
                putDiscipline(param);
                break;
            case Const.RESPONSE_CODE_KEEP_DATA:
                break;
            case Const.RESPONSE_CODE_CLEAR_DATA:
                clearData();
                break;
        }
    }

    private void clearData() {
        exams = new HashMap<>();
        discipline = null;
    }

    private void putDiscipline(Bundle param) {
        discipline = (Discipline) param.getSerializable("discipline");
    }

    private void putExam(Bundle param) {
        Integer examNumber;

        if (param.getString("examNumber").equals(Const.EXAM_TAG_1))
            examNumber = 1;
        else
            examNumber = 2;

        exams.put(examNumber, (Exam) param.getSerializable("exam"));
    }

    public void close(View v) {
        this.finish();
    }

    private void initViews() {

    }
}
