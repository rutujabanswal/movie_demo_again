package com.example.rutujabanswal.movie_demo_again;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Rutuja Banswal on 15-02-2018.
 */
//I told you to implement the Parcelable here.
public class Product implements Parcelable{
    private int id;
    private String title;
    private String shortdesc;
    private Parcel in;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortdesc='" + shortdesc + '\'' +
                ", in=" + in +
                ", image=" + image +
                '}';
    }

    //   private double rating;
   // private double price;
    private int image;

    public Product(int id, String title,String shortdesc, int image) {
        this.id = id;
        this.title = title;
     this.shortdesc = shortdesc;
        this.image = image;
    }

    protected Product(Parcel in) {
        id = in.readInt();
        title = in.readString();
        shortdesc = in.readString();
        image = in.readInt();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

public String getShortdesc() {
        return shortdesc;
    }


    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Bundle b = new Bundle();
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(shortdesc);
        dest.writeInt(image);
        //DO the same for the rest

    }

}