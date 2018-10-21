package com.example.arslan.bs_app.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.arslan.bs_app.R;
import com.example.arslan.bs_app.callbacks.ProductClickListener;
import com.example.arslan.bs_app.models.Product;

public class ProductAdapter2 extends RecyclerView.Adapter<ProductAdapter2.MyViewHolder> {

    private Product[] product;
    private Context context;
    private ProductClickListener productClickListener;

    public ProductAdapter2(Product[] product, Context context , ProductClickListener productClickListener) {
        this.context = context;
        this.product = product;
        this.productClickListener = productClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_list, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.nameTextView.setText(product[position].getName());
        holder.detailTextView.setText(product[position].getDetail());
        holder.priceTextView.setText(Integer.toString(product[position].getPrice()));

    }

    @Override
    public int getItemCount() {
        return product.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView priceTextView;
        public TextView detailTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name);
            priceTextView = itemView.findViewById(R.id.price);
            detailTextView = itemView.findViewById(R.id.detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    productClickListener.ProductClicked(product[getAdapterPosition()]);
                }
            });
        } // end of holder
    }
}
