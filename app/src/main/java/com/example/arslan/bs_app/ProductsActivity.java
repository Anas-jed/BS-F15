package com.example.arslan.bs_app;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.arslan.bs_app.adapters.ProductAdapter2;
import com.example.arslan.bs_app.adapters.ProductsAdapter;
import com.example.arslan.bs_app.callbacks.ProductClickListener;
import com.example.arslan.bs_app.fragments.ProductDetailFragment;
import com.example.arslan.bs_app.fragments.ProductFragment;
import com.example.arslan.bs_app.models.Product;

public class ProductsActivity extends AppCompatActivity implements ProductClickListener {

    public static final String PRODUCT_KEY = "single_product";
    boolean mIsDualPane;

    // fragment reference
    ProductDetailFragment productDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        View productView = findViewById(R.id.product_view_landscape);

        mIsDualPane = productView != null && productView.getVisibility() == View.VISIBLE;

        if(mIsDualPane)
        {
            fragmentTransaction.add(R.id.conatiner1, new ProductFragment());
            //fragmentTransaction.commit();

            productDetailFragment = ProductDetailFragment.newInstance(null);
            fragmentTransaction.add(R.id.conatiner2, productDetailFragment);
            fragmentTransaction.commit();

        }else {
            fragmentTransaction.add(R.id.container, new ProductFragment());
            fragmentTransaction.commit();
        }


    }

    @Override
    public void ProductClicked(Product product) {


        if (mIsDualPane) {
            productDetailFragment.showProduct(product);
        } else {
            Intent productIntent = new Intent(this, ProductDetailActivity.class);
            productIntent.putExtra(PRODUCT_KEY, product);
            startActivity(productIntent);
        }


    }
}
