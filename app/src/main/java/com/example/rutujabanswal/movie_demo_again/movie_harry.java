package com.example.rutujabanswal.movie_demo_again;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.rutujabanswal.movie_demo_again.ProductAdapter.PRODUCT;

public class movie_harry extends AppCompatActivity {

    private Product product;
     private static String TAGNEW = "Mylog :";
    public movie_harry() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_harry);

        //THe savedInstanceState contains the data passed via intent
                  //Always check if it's not null
                     //I forgot something here , sorry
//                Log.d("just checking", savedInstanceState.toString());


//                           product = savedInstanceState.getParcelable(PRODUCT);
                   product = getIntent().getExtras().getParcelable(PRODUCT);
                            TextView title = (TextView)findViewById(R.id.textViewTitle1);
                             TextView harry_details = (TextView)findViewById(R.id.harry_details);
                                ImageView harry = (ImageView)findViewById(R.id.harry);
                         //  String s = getIntent().getStringExtra("MovieTitle");
//                    Log.d(TAGNEW,getIntent().getStringExtra("MovieTitle"));
                          // title.setText(getIntent().getStringExtra("MovieTitle"));
                           /*String s = (String) getIntent().getSerializableExtra(PRODUCT);
                           title.setText(s);*/
     //   Log.d(TAGNEW,product.toString());
                           if (product== null) Log.d(TAGNEW,"product is empty");
                           else {
                               title.setText(product.getTitle());
                               harry_details.setText(product.getShortdesc());
                               harry.setImageResource(product.getImage());
                           }
            //Now you've the object, Create the view to display it's data
            //Ping me if you need anything. I'm closing now


    }
}
