package za.co.addcolour.roundedview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.addcolour.roundedview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // ROUNDED TEXT VIEW
        mBinding.contentRoundedText.roundedTextView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        mBinding.contentRoundedText.roundedTextView.setTitleColor(getResources().getColor(R.color.windowBackground));
        mBinding.contentRoundedText.roundedTextView.setTitleText("A");
        mBinding.contentRoundedText.roundedTextView.setTitleSize(35);
    }
}