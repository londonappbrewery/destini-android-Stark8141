package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mquestion ;
    Button mtop;
    Button mbottom;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mquestion=(TextView) findViewById(R.id.storyTextView);
        mtop=(Button)findViewById(R.id.buttonTop);
        mbottom=(Button)findViewById(R.id.buttonBottom);

        if(savedInstanceState!=null){
            index=savedInstanceState.getInt("indexkey");
            if(index==1){
                mquestion.setText(R.string.T3_Story);
                mtop.setText(R.string.T3_Ans1);
                mbottom.setText(R.string.T3_Ans2);}
            else if(index==2){
                mquestion.setText(R.string.T2_Story);
                mtop.setText(R.string.T2_Ans1);
                mbottom.setText(R.string.T2_Ans2);}
            else if(index==3){
                mquestion.setText(R.string.T6_End);
                visibility();}
            else if(index==4){
                mquestion.setText(R.string.T5_End);
                visibility();}
            else if(index==5){
                mquestion.setText(R.string.T3_Story);
                mtop.setText(R.string.T3_Ans1);
                mbottom.setText(R.string.T3_Ans2);}
            else if(index==6){
                mquestion.setText(R.string.T4_End);
                visibility();}
            else if(index==7){
                mquestion.setText(R.string.T6_End);
                visibility();}
            else if(index==8){
                mquestion.setText(R.string.T5_End);
                visibility();}
        }
        else{
            mquestion.setText(R.string.T1_Story);
            mtop.setText(R.string.T1_Ans1);
            mtop.setText(R.string.T1_Ans2);
        }


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=1;
                mquestion.setText(R.string.T3_Story);
                mtop.setText(R.string.T3_Ans1);
                mbottom.setText(R.string.T3_Ans2);
                mtop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        index=3;
                        mquestion.setText(R.string.T6_End);
                        visibility();
                    }
                });
                mbottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        index=4;
                        mquestion.setText(R.string.T5_End);
                        visibility();
                    }
                });
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=2;
                mquestion.setText(R.string.T2_Story);
                mtop.setText(R.string.T2_Ans1);
                mbottom.setText(R.string.T2_Ans2);
                mtop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        index=5;
                        mquestion.setText(R.string.T3_Story);
                        mtop.setText(R.string.T3_Ans1);
                        mbottom.setText(R.string.T3_Ans2);
                        mtop.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                index=7;
                                mquestion.setText(R.string.T6_End);
                                visibility();
                            }
                        });
                        mbottom.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                index=8;
                                mquestion.setText(R.string.T5_End);
                                visibility();
                            }
                        });
                    }
                });
                mbottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        index=6;
                        mquestion.setText(R.string.T4_End);
                        visibility();
                    }
                });
            }
        });

    }
    private void visibility() {
        mtop.setVisibility(View.INVISIBLE);
        mbottom.setVisibility(View.INVISIBLE);
    }
    public void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
        outstate.putInt("indexkey",index);
    }
}
