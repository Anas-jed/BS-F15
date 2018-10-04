package com.example.arslan.bs_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.arslan.bs_app.adapters.ProductsAdapter;
import com.example.arslan.bs_app.models.Product;

public class ProductsActivity extends AppCompatActivity {

    RecyclerView productsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        productsRecyclerView = findViewById(R.id.product_list);

        Product product[] = new Product[10];
        product[0] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[1] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[2] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[3] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[4] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[5] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[6] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[7] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[8] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);
        product[9] = new Product(10,"Shoes" ,"buys the bata shoes" ,12);

        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        productsRecyclerView.setAdapter(new ProductsAdapter(this,product));
    }
}
