package com.example.rutujabanswal.movie_demo_again;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.rutujabanswal.movie_demo_again.ProductAdapter.PRODUCT;

public class movie_harry extends AppCompatActivity {

    private Product product;

    public movie_harry() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_harry);

        //THe savedInstanceState contains the data passed via intent
        if (savedInstanceState != null){
            //Always check if it's not null
            //I forgot something here , sorry
            product = savedInstanceState.getParcelable(PRODUCT);

            TextView title = (TextView)findViewById(R.id.textViewTitle1);
            TextView harry_details = (TextView)findViewById(R.id.harry_details);
            ImageView harry = (ImageView)findViewById(R.id.harry);

            title.setText(product.getTitle());
            harry_details.setText(product.getShortdesc());
            harry.setImageResource(product.getImage());




            //Now you've the object, Create the view to display it's data
            //Ping me if you need anything. I'm closing now

        }
    }
}
