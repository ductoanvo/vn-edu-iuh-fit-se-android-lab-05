package vn.edu.iuh.fit.se.android.lab_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DonutAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Donut> donuts;

    public DonutAdapter(Context context, int layout, List<Donut> donuts) {
        this.context = context;
        this.layout = layout;
        this.donuts = donuts;
    }

    @Override
    public int getCount() {
        return donuts.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        }

        final Donut donut = donuts.get(i);
        ImageView donutImage = view.findViewById(R.id.imgDonut);
        TextView donutType = view.findViewById(R.id.tvDonutName);
        TextView donutDesc = view.findViewById(R.id.tvDonutDesc);
        TextView donutPrice = view.findViewById(R.id.tvDonutPrice);

        donutType.setText(donut.getType());
        donutImage.setImageResource(donut.getImage());
        donutDesc.setText(donut.getDesc());
        donutPrice.setText(String.format("%s$", donut.getPrice()));

        return view;
    }
}
