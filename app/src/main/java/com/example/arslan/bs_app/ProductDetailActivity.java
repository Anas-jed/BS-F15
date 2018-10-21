package com.example.arslan.bs_app;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.arslan.bs_app.fragments.ProductDetailFragment;
import com.example.arslan.bs_app.fragments.ProductFragment;
import com.example.arslan.bs_app.models.Product;

public class ProductDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

     Product product =  (Product)getIntent().getSerializableExtra(ProductsActivity.PRODUCT_KEY);

     if(product != null)
     {
         FragmentManager fragmentManager = getSupportFragmentManager();

         FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

         fragmentTransaction.add( R.id.container, ProductDetailFragment.newInstance(product));

         fragmentTransaction.commit();
     }

    } //end
}
