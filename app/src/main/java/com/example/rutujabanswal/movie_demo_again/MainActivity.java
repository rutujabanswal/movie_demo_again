package com.example.rutujabanswal.movie_demo_again;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

//import static com.example.rutujabanswal.movie_demo_again.R.layout.harrypotter;

public class MainActivity extends AppCompatActivity {

    //a list to store all the products
    List<Product> productList;
    View v1;
    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Harry Potter",
                        "Harry Potter is a British-American film series based on the Harry Potter novels by author J. K. Rowling.",
                        R.drawable.harry));

        productList.add(
                new Product(
                        2,
                        "Fault in our Stars",
                        "The Fault in Our Stars is a 2014 American romantic drama film directed by Josh Boone, based on the novel of the same name by John Green. ",
                        R.drawable.fault));

        productList.add(
                new Product(
                        3,
                        "Inception",
                        "Inception is a science-fiction action thriller film written, produced, and directed by Christopher Nolan.",
                        R.drawable.inceptionn));
        productList.add(
                new Product(
                        4,
                        "Jumanji",
                        "Jumanji is a 1995 American fantasy adventure film directed by Joe Johnston.",
                        R.drawable.jumanji));
        productList.add(
                new Product(
                        5,
                        "Deadpool",
                        "Deadpool is a 2016 American superhero film based on the Marvel Comics character of the same name, distributed by 20th Century Fox.",
                        R.drawable.deadpooll));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this,productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

}