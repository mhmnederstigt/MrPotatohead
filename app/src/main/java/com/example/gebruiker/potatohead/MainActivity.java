package com.example.gebruiker.potatohead;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Initialize imageViews
    ImageView armsimage;
    ImageView eyebrowsimage;
    ImageView eyesimage;
    ImageView glassesimage;
    ImageView noseimage;
    ImageView mouthimage;
    ImageView shoesimage;
    ImageView earsimage;
    ImageView hatimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect images to imageViews
        armsimage = (ImageView) findViewById(R.id.arms);
        eyebrowsimage = (ImageView) findViewById(R.id.eyebrows);
        eyesimage = (ImageView) findViewById(R.id.eyes);
        glassesimage = (ImageView) findViewById(R.id.glasses);
        noseimage = (ImageView) findViewById(R.id.nose);
        mouthimage = (ImageView) findViewById(R.id.mouth);
        shoesimage = (ImageView) findViewById(R.id.shoes);
        earsimage = (ImageView) findViewById(R.id.ears);
        hatimage = (ImageView) findViewById(R.id.hat);

        // Set visibility of images as it was previously
        if (savedInstanceState != null){
            armsimage.setVisibility(savedInstanceState.getInt("armsVisibility"));
            eyebrowsimage.setVisibility(savedInstanceState.getInt("eyebrowsVisibility"));
            eyesimage.setVisibility(savedInstanceState.getInt("eyesVisibility"));
            glassesimage.setVisibility(savedInstanceState.getInt("glassesVisibility"));
            noseimage.setVisibility(savedInstanceState.getInt("noseVisibility"));
            mouthimage.setVisibility(savedInstanceState.getInt("mouthVisibility"));
            shoesimage.setVisibility(savedInstanceState.getInt("shoesVisibility"));
            earsimage.setVisibility(savedInstanceState.getInt("earsVisibility"));
            hatimage.setVisibility(savedInstanceState.getInt("hatVisibility"));
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Save visibility/checkbox state upon closing
        savedInstanceState.putInt("armsVisibility", armsimage.getVisibility());
        savedInstanceState.putInt("eyebrowsVisibility", eyebrowsimage.getVisibility());
        savedInstanceState.putInt("eyesVisibility", eyesimage.getVisibility());
        savedInstanceState.putInt("glassesVisibility", glassesimage.getVisibility());
        savedInstanceState.putInt("noseVisibility", noseimage.getVisibility());
        savedInstanceState.putInt("mouthVisibility", mouthimage.getVisibility());
        savedInstanceState.putInt("shoesVisibility", shoesimage.getVisibility());
        savedInstanceState.putInt("earsVisibility", earsimage.getVisibility());
        savedInstanceState.putInt("hatVisibility", hatimage.getVisibility());
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String text = checkbox.getText().toString();

        if (checkbox.isChecked()) {
            switch (checkbox.getId()) {
                case R.id.armsCheck:
                    armsimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.eyebrowsCheck:
                    eyebrowsimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.eyesCheck:
                    eyesimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.glassesCheck:
                    glassesimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.noseCheck:
                    noseimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.mouthCheck:
                    mouthimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.shoesCheck:
                    shoesimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.earsCheck:
                    earsimage.setVisibility(View.VISIBLE);
                    break;
                case R.id.hatCheck:
                    hatimage.setVisibility(View.VISIBLE);
                    break;
            }
        }

        if (!checkbox.isChecked()) {
            switch (checkbox.getId()) {
                case R.id.armsCheck:
                    armsimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.eyebrowsCheck:
                    eyebrowsimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.eyesCheck:
                    eyesimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.glassesCheck:
                    glassesimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.noseCheck:
                    noseimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.mouthCheck:
                    mouthimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.shoesCheck:
                    shoesimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.earsCheck:
                    earsimage.setVisibility(View.INVISIBLE);
                    break;
                case R.id.hatCheck:
                    hatimage.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    }
}

