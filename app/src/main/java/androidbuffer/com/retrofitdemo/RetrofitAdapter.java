package androidbuffer.com.retrofitdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by incred-dev on 26/6/18.
 */

public class RetrofitAdapter  extends RecyclerView.Adapter<RetrofitAdapter.ViewHolder>{

    private List<RetrofitModel> retrofitModelList;

    public RetrofitAdapter(List<RetrofitModel> retrofitModelList) {
        this.retrofitModelList = retrofitModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.id.setText(retrofitModelList.get(position).getId());
        holder.name.setText(retrofitModelList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return retrofitModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id, name;
        public ViewHolder(View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.name);
        }
    }
}
