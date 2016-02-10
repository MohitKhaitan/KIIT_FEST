package com.appodroid.mohitkhaitan.kiitfest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

/**
 * Created by MOHIT KHAITAN on 21-01-2016.
 */
public class KiitFragment extends Fragment {

    private SliderLayout mSliderLayout;
    private CardView mCardView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kiit, container, false);


        mSliderLayout = (SliderLayout) rootView.findViewById(R.id.slider);
        mCardView = (CardView) rootView.findViewById(R.id.card_view);

        mSliderLayout.setIndicatorVisibility(PagerIndicator.IndicatorVisibility.Visible);

        HashMap<String, Integer> images_map = new HashMap<String, Integer>();
        images_map.put("\b", R.drawable.default_img);
        images_map.put("\b\b", R.drawable.default_img);
        images_map.put("\b\b\b", R.drawable.default_img);

        for (String name : images_map.keySet()) {
            TextSliderView mTextSliderView = new TextSliderView(getActivity());

            mTextSliderView.description(name)
                    .image(images_map.get(name))
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop);

            mSliderLayout.addSlider(mTextSliderView);
        }

        mSliderLayout.setPresetTransformer(SliderLayout.Transformer.Default);
        mSliderLayout.setDuration(4000);

        return rootView;

    }

    @Override
    public void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mSliderLayout.stopAutoCycle();
        super.onStop();
    }

}
