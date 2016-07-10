package com.example.android.harrypottertrivia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0; //counter to keep track of score
    int totalScore = 0;
    CharSequence total = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method to calculate score for each question
     * Could be done another way to be more efficient - array list
     *
     * @param view
     */
    public void submitQuiz(View view) {

        //  int sum=0;

        //int[] scoret = {question1(),question2() };

        int q1 = question1();
        int q2 = question2();
        int q3 = question3();
        int q4 = question4();
        int q5 = question5();
        int q6 = question6();
        int q7 = question7();
        int q8 = question8();
        int q9 = question9();
        int q10 = question10();

        //  for (int i = 0; i<=scoret.length; i++){

        totalScore = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10;
        total = "Your score is: " + totalScore;
        Toast.makeText(view.getContext(), total, Toast.LENGTH_SHORT).show();
        score = 0;

    }

    public void sendQuizScore(View view) {


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz Score");
        intent.putExtra(Intent.EXTRA_TEXT, total);
        if (intent.resolveActivity(getPackageManager()) != null) {

            startActivity(intent);

        }
    }

    private int question1() {

        //Question 1
        RadioGroup question1 = (RadioGroup) findViewById(R.id.q1_rg);
        //Index of correct ans - option 1 ans 1 - 1997
        View answerq1 = question1.findViewById(R.id.q1_ans1);
        //index of child returns the position in the group of the specified child view
        int idAns1 = question1.indexOfChild(findViewById(question1.getCheckedRadioButtonId()));
        int indexAns1 = question1.indexOfChild(answerq1);
        if (idAns1 == indexAns1) {
            score = 1;
        } else {
            score = 0;
        }
        return score;

    }

    private int question2() {

        EditText answerq2 = (EditText) findViewById(R.id.q2_ans);
        String userAns = answerq2.getText().toString().toLowerCase();
        if (userAns.equals("severus snape") || userAns.equals("professor snape")
                || userAns.equals("snape")) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question3() {
        RadioGroup question3 = (RadioGroup) findViewById(R.id.q3_rg);
        //option 4 - ans4 - snape
        View answerq3 = question3.findViewById(R.id.q3_ans4);
        int idAns3 = question3.indexOfChild(findViewById(question3.getCheckedRadioButtonId()));
        int indexAns3 = question3.indexOfChild(answerq3);
        if (idAns3 == indexAns3) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question4() {

        //check to see if answers 2,3,5 are checked

        CheckBox ans2 = (CheckBox) findViewById(R.id.q4_ans2);
        boolean is2checked = ans2.isChecked();

        CheckBox ans3 = (CheckBox) findViewById(R.id.q4_ans3);
        boolean is3Checked = ans3.isChecked();

        CheckBox ans5 = (CheckBox) findViewById(R.id.q4_ans5);
        boolean is5Checked = ans5.isChecked();

        if (is2checked && is3Checked && is5Checked) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question5() {
        RadioGroup question5 = (RadioGroup) findViewById(R.id.q5_rg);
        //option 4 - ans4 - 4 privet drive
        View answerq5 = question5.findViewById(R.id.q5_ans4);
        int idAns5 = question5.indexOfChild(findViewById(question5.getCheckedRadioButtonId()));
        int indexAns5 = question5.indexOfChild(answerq5);
        if (idAns5 == indexAns5) {
            score = 1;
        } else {
            score = 0;
        }
        return score;

    }

    private int question6() {
        RadioGroup question6 = (RadioGroup) findViewById(R.id.q6_rg);
        //option 3 - ans3 - toad
        View answerq6 = question6.findViewById(R.id.q6_ans3);
        int idAns6 = question6.indexOfChild(findViewById(question6.getCheckedRadioButtonId()));
        int indexAns6 = question6.indexOfChild(answerq6);
        if (idAns6 == indexAns6) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question7() {
        RadioGroup question7 = (RadioGroup) findViewById(R.id.q7_rg);
        //option 1 - ans1 - true
        View answerq7 = question7.findViewById(R.id.q7_ans1);
        int idAns7 = question7.indexOfChild(findViewById(question7.getCheckedRadioButtonId()));
        int indexAns7 = question7.indexOfChild(answerq7);
        if (idAns7 == indexAns7) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question8() {
        RadioGroup question8 = (RadioGroup) findViewById(R.id.q8_rg);
        //option 4 - ans4 - snape
        View answerq8 = question8.findViewById(R.id.q8_ans2);
        int idAns8 = question8.indexOfChild(findViewById(question8.getCheckedRadioButtonId()));
        int indexAns8 = question8.indexOfChild(answerq8);
        if (idAns8 == indexAns8) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question9() {
        //1, 2, 4, 6, 7

        CheckBox ans1 = (CheckBox) findViewById(R.id.q9_ans1);
        boolean is1checked = ans1.isChecked();

        CheckBox ans2 = (CheckBox) findViewById(R.id.q9_ans2);
        boolean is2Checked = ans2.isChecked();

        CheckBox ans4 = (CheckBox) findViewById(R.id.q9_ans4);
        boolean is4Checked = ans4.isChecked();

        CheckBox ans6 = (CheckBox) findViewById(R.id.q9_ans6);
        boolean is6checked = ans6.isChecked();

        CheckBox ans7 = (CheckBox) findViewById(R.id.q9_ans7);
        boolean is7Checked = ans7.isChecked();

        if (is1checked && is2Checked && is4Checked && is6checked && is7Checked) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    private int question10() {

        EditText answerq10 = (EditText) findViewById(R.id.q10_ans);
        String userAns = answerq10.getText().toString().toLowerCase();
        if (userAns.equals("expelliarmus")) {
            score = 1;
        } else {
            score = 0;
        }
        return score;

    }


}

