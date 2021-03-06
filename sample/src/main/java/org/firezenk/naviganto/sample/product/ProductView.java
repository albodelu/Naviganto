package org.firezenk.naviganto.sample.product;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.firezenk.naviganto.annotations.RoutableView;
import org.firezenk.naviganto.sample.R;

import java.util.UUID;

/**
 * Project: Naviganto
 *
 * Created by Jorge Garrido Oval, aka firezenk on 26/10/16.
 */
@RoutableView(params = {Double.class}, requestCode = -1)
class ProductView extends FrameLayout {

    private static Double aDouble;

    public static ProductView newInstance(Context context, UUID uuid, Double aDouble) {
        final ProductView tmp = new ProductView(context);
        ProductView.aDouble = aDouble; // cause didactic purposes, better pass to a presenter
        return tmp;
    }

    @SuppressLint("SetTextI18n") public ProductView(Context context) {
        super(context);
        inflate(getContext(), R.layout.feature_product, this);
        ((TextView) findViewById(R.id.productId)).setText("Product " + aDouble);
    }
}
