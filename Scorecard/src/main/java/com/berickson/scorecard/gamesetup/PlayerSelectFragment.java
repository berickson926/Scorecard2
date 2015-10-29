package com.berickson.scorecard.gamesetup;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.NumberPicker;
import com.berickson.scorecard.R;

public class PlayerSelectFragment extends Fragment
{
    private static final String TAG = "PlayerSelectFragment";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 99;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_player_select, container, false);

        final NumberPicker picker = (NumberPicker)view.findViewById(R.id.number_picker);
        picker.setMinValue(MIN_VALUE);
        picker.setMaxValue(MAX_VALUE);
        picker.setWrapSelectorWheel(false);

        Button nextButton = (Button)view.findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG, "Checking selected player count");

                int playerCount = (picker != null) ? picker.getValue() : 1;

                Log.d(TAG, "Player Count is: "+playerCount);
            }
        });

        return view;
    }
}
