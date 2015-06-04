package com.housing.mahendraliya.hellocardview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.housing.mahendraliya.hellocardview.R;
import com.housing.mahendraliya.hellocardview.models.ProductItem;

import java.util.ArrayList;

/**
 * Created by mahendraliya on 02/06/15.
 */
public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    private ArrayList<ProductItem> mData;
    private Context mContext;

    public ProductsAdapter(Context context, ArrayList<ProductItem> data) {
        this.mContext = context;
        this.mData = data;
    }

    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product_card, parent, false);
        ProductViewHolder vh = new ProductViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, final int position) {
        holder.lblProductName.setText(mData.get(position).getProductName());
        holder.lblCategoryName.setText(mData.get(position).getCategoryName());

        ((View) holder.lblProductName.getParent()).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "You choose: " + mData.get(position).getProductName() + " of " + mData.get(position).getCategoryName() + " category", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    // ViewHolder is responsible for handling any events
    // that occur on a specific item that RecyclerView displays.
    // It replaces the 'ViewHolder' pattern that was used with ListView
    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        private TextView lblProductName, lblCategoryName;

        public ProductViewHolder(View v) {
            super(v);
            setupLayout(v);
        }

        private void setupLayout(View v) {
            lblProductName = (TextView)v.findViewById(R.id.lblProductName);
            lblCategoryName = (TextView)v.findViewById(R.id.lblCategoryName);
        }

    }
}