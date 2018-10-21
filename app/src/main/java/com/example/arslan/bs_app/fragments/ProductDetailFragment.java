package com.example.arslan.bs_app.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arslan.bs_app.ProductsActivity;
import com.example.arslan.bs_app.R;
import com.example.arslan.bs_app.models.Product;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link ProductDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductDetailFragment extends Fragment {


    private TextView detailTextView;
    private Product myProduct;

    public ProductDetailFragment() {
        // Required empty public constructor
    }

    public static ProductDetailFragment newInstance(Product myProduct) {

        ProductDetailFragment fragment = new ProductDetailFragment();

        // sets the bundle for fragment
        Bundle args = new Bundle();
        args.putSerializable(ProductsActivity.PRODUCT_KEY, myProduct);
        fragment.setArguments(args);

        return fragment;

    } // end


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().getSerializable(ProductsActivity.PRODUCT_KEY) != null) {
            myProduct = (Product) getArguments().getSerializable(ProductsActivity.PRODUCT_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        detailTextView = view.findViewById(R.id.product_detail);

        if (myProduct != null) {
            detailTextView.setText(myProduct.getDetail());
        }
    }

    public void showProduct(Product myProduct) {
        if (myProduct != null) {
            detailTextView.setText(myProduct.getDetail());
        }
    }
}
