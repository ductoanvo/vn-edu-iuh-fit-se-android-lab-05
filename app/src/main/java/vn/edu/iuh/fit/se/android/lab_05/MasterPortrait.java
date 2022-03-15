package vn.edu.iuh.fit.se.android.lab_05;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MasterPortrait extends AppCompatActivity {
    private List<Donut> donuts;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_portrait);

        listView = findViewById(R.id.lvDonuts);

        donuts = new ArrayList<>();

        // Donut List
        donuts.add(new Donut("Tasty Donut", "Spicy tasty donut family", 10, R.drawable.donut_yellow_1));
        donuts.add(new Donut("Pink Donut", "Spicy tasty donut family", 10, R.drawable.tasty_donut_1));
        donuts.add(new Donut("Floating Donut", "Spicy tasty donut family", 10, R.drawable.green_donut_1));
        donuts.add(new Donut("Tasty Donut", "Spicy tasty donut family", 10, R.drawable.donut_red_1));

        // Set Donut Adapter
        DonutAdapter donutAdapter = new DonutAdapter(this, R.layout.donut_custom_listview, donuts);
        listView.setAdapter(donutAdapter);
    }
}