package com.example.rutujabanswal.movie_demo_again;

/**
 * Created by Rutuja Banswal on 15-02-2018.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.sax.StartElementListener;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.R.attr.id;
import static android.R.attr.targetActivity;
import static android.app.PendingIntent.getActivity;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> implements View.OnClickListener {
    public static final String PRODUCT = "product";//I converted it to constant
    static int pos;
    //this context we will use to inflate the layout
    private Context mCtx;
    MainActivity mainActivity = new MainActivity();
    //we are storing all the products in a list
    private List<Product> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_products, null);
        return new ProductViewHolder(view);

    }

    @Override

    public void onBindViewHolder(final ProductViewHolder holder, final int position) {
        final Product product = productList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pos = product.getId();
              //  String pos_new = String.valueOf(pos);
                //Toast.makeText(mCtx,"Movie Number "+ pos_new,Toast.LENGTH_SHORT).show();

                try {
                       Intent i1 = new Intent(mCtx, movie_harry.class);
                       i1.putExtra(PRODUCT, product);
//it's done now
                       mCtx.startActivity(i1);
                   }
                   catch (Exception e)
                   {
                       e.printStackTrace();
                   }
                //write switch here
            }
        });
    }

   /* private void movie_1() {
        Intent i1 = new Intent(mainActivity,movie_harry.class);
        mCtx.startService(i1);

    }*/

    @Override
    public int getItemCount() {
        return productList.size();
    }

    @Override
    public void onClick(View v) {


    }

//I'm cleaning the code a little bit, So, it'll be better to understand, Tell me when you get confused.
    class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTitle, textViewShortDesc;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewShortDesc.setCursorVisible(true);
            imageView = itemView.findViewById(R.id.imageView);


        }


//we can talk here, not a problem
        //We needed to implement parcel in the product class that's why it was giving errors,

    }
}

