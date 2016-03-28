package com.sherlockkk.snailmanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.SaveCallback;

/**
 * @author SongJian
 * @created 16/3/22
 * @e-mail 1129574214@qq.com
 */
public class PublishGoodsActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "PublishGoodsActivity";

    private EditText et_brand, et_name, et_specification, et_sales, et_price, et_stock;
    private Button btn_submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publishgoods);
        et_brand = (EditText) findViewById(R.id.et_brand);
        et_name = (EditText) findViewById(R.id.et_name);
        et_specification = (EditText) findViewById(R.id.et_specification);
        et_sales = (EditText) findViewById(R.id.et_sales);
        et_price = (EditText) findViewById(R.id.et_price);
        et_stock = (EditText) findViewById(R.id.et_stock);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String brand = et_brand.getText().toString().trim();
        String name = et_name.getText().toString().trim();
        String specification = et_specification.getText().toString().trim();
        String sales = et_sales.getText().toString().trim();
        String price = et_price.getText().toString().trim();
        String stock = et_stock.getText().toString().trim();
        save(brand, name, specification, sales, price, stock);
    }

    private void save(String brand, String name, String specification, String sales, String price, String stock) {
        Goods goods = new Goods();
        goods.setBrand(brand);
        goods.setName(name);
        goods.setSpecification(specification);
        goods.setSales(Integer.parseInt(sales));
        goods.setPrice(price);
        goods.setStock(Integer.parseInt(stock));
        goods.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {
                if (e == null) {
                    Log.i(TAG, "done: save success");
                } else {
                    Log.i(TAG, "done: save failed" + e.getMessage());
                }
            }
        });
    }


}
