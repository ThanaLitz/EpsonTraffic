package epsonlitz.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends ActionBarActivity {

    //Explicit
    TextView titleTextView, detailTextView;
    ImageView trafficImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindwidget();

        //Show view
        showView();

    }

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        //Show Detail
        String[] detailStrings = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detailTextView.setText(detailStrings[intIndex]);

    }

    private void bindwidget() {

        titleTextView = (TextView) findViewById(R.id.txtShowTitle1);
        detailTextView = (TextView) findViewById(R.id.txtDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvImage);
    }
}
