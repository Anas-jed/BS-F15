package com.example.arslan.bs_app.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arslan.bs_app.R;
import com.example.arslan.bs_app.adapters.ProductAdapter2;
import com.example.arslan.bs_app.callbacks.ProductClickListener;
import com.example.arslan.bs_app.models.Product;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends Fragment {


    private ProductClickListener productClickListener;

    public ProductFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof ProductClickListener) {
            productClickListener = (ProductClickListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement ProductClickListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.list);


        Product product[] = new Product[10];

        product[0] = new Product(10, "Cloths", "Aaaaaaaaaaaaaaaaaaaaaa\nsasasas\nasasasa", 34);
        product[1] = new Product(10, "Electronics", "buys the bata shoes", 99);
        product[2] = new Product(10, "Books", "buys the bata shoes", 100);
        product[3] = new Product(10, "Kids Books", "buys the bata shoes", 33);
        product[4] = new Product(10, "Accessories", "buys the bata shoes", 5);
        product[5] = new Product(10, "Furniture", "buys the bata shoes", 9);
        product[6] = new Product(10, "Mobiles", "buys the bata shoes", 150);
        product[7] = new Product(10, "Shoes", "buys the bata shoes", 70);
        product[8] = new Product(10, "Shoes", "buys the bata shoes", 88);
        product[9] = new Product(10, "Shoes", "buys the bata shoes", 99);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new ProductAdapter2(product, getContext() ,productClickListener ));
    }
}
