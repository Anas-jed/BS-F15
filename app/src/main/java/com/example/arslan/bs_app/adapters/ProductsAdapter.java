package com.example.arslan.bs_app.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arslan.bs_app.R;
import com.example.arslan.bs_app.models.Product;
import com.example.arslan.bs_app.models.StudentAdapter;

import java.util.ArrayList;

public class ProductsAdapter  extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>{

    Context context ;
    Product[] products;

    public ProductsAdapter(Context context , Product[] products) {
        this.context= context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_list,parent, false);

        ProductViewHolder productViewHolder = new ProductViewHolder(view);
        return productViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        holder.nameTextView.setText(products[position].getName());
        holder.detailTextView.setText(products[position].getDetail());
        holder.priceTextView.setText(Integer.toString(products[position].getPrice()));
    }

    @Override
    public int getItemCount() {
        return products.length;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{

        public TextView nameTextView;
        public TextView priceTextView;
        public TextView detailTextView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.name);
            priceTextView =itemView.findViewById(R.id.price);
            detailTextView =itemView.findViewById(R.id.detail);
        }
    }

}
