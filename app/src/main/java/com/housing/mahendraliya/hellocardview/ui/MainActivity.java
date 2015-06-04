package com.housing.mahendraliya.hellocardview.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.housing.mahendraliya.hellocardview.R;
import com.housing.mahendraliya.hellocardview.adapters.ProductsAdapter;
import com.housing.mahendraliya.hellocardview.models.ProductItem;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private RecyclerView rvProductList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupLayout();
    }

    private void setupLayout() {
        setContentView(R.layout.activity_main);

        rvProductList = (RecyclerView) findViewById(R.id.rvProductList);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        rvProductList.setHasFixedSize(true);

        // The LayoutManager is responsible for positioning items on the screen.
        // There are other layout managers to layout in a grid, or a staggered grid.
        mLayoutManager = new LinearLayoutManager(this);
        rvProductList.setLayoutManager(mLayoutManager);

        mAdapter = new ProductsAdapter(MainActivity.this, getDataSource());
        rvProductList.setAdapter(mAdapter);
    }

    private ArrayList<ProductItem> getDataSource() {
        ArrayList<ProductItem> arrProducts = new ArrayList<ProductItem>();

        arrProducts.add(new ProductItem("Apple iPhone 6", "Mobile"));
        arrProducts.add(new ProductItem("Apple iPhone 6 Plus", "Mobile"));
        arrProducts.add(new ProductItem("MacBook Pro Retina 13\"", "Laptop"));
        arrProducts.add(new ProductItem("Nexus 5", "Mobile"));
        arrProducts.add(new ProductItem("Nexus Tablet (2012)", "Tablet"));
        arrProducts.add(new ProductItem("Motorola Android Watch", "Watch"));
        arrProducts.add(new ProductItem("Samsung Galaxy Tab", "Tablet"));
        arrProducts.add(new ProductItem("iPad Air", "Tablet"));
        arrProducts.add(new ProductItem("Honda City Diesel", "Car"));
        arrProducts.add(new ProductItem("Microsoft Lumia", "Mobile Phone"));
        arrProducts.add(new ProductItem("Pulsar 180 CC", "Bike"));
        arrProducts.add(new ProductItem("Motorola Zoom", "Tablet"));
        arrProducts.add(new ProductItem("iPhone 5S (Gold)", "Mobile"));

        return arrProducts;
    }
}
