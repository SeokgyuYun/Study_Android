package kr.co.dgsw.menti.mealapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class MealRecyclerAdapter extends RecyclerView.Adapter<MealViewHolder> {

    ArrayList<String> list;

    MealRecyclerAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_text, parent, false);
        return new MealViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {
        holder.tv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class MealViewHolder extends RecyclerView.ViewHolder {
    TextView tv;

    public MealViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv_item);
    }
}

