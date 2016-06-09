package com.example.vivek.assignment101;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vivek on 23-05-2016.
 */
public class MainFragment extends Fragment{

    TextView text;
    View view;
    String Input = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("TAG:", "Inside onCreateFragment");
        Bundle args = getArguments();

        if (args!=null)
        {
            Input = args.getString("Input");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("TAG:","Inside onCreateViewFragment");
        view = inflater.inflate(R.layout.main_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d("TAG:","Inside onViewCreatedFragment");
        super.onViewCreated(view, savedInstanceState);
        text = (TextView)view.findViewById(R.id.Fragment_Text);
        text.setText(Input);
    }
}
