package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.content.Context;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SampleActionProvider extends ActionProvider implements View.OnClickListener {
    private Context mContext;
    private EditText edit;
    private Button btn;

    public SampleActionProvider(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    public View onCreateActionView() {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.sample_action_provider, null);
        edit = (EditText) view.findViewById(R.id.edit);
        btn = (Button) view.findViewById(R.id.button);
        btn.setOnClickListener(this);
        return view;
    }

    public boolean onPerformDefaultAction() {
        Toast.makeText(mContext, "Test", Toast.LENGTH_SHORT).show();
        return super.onPerformDefaultAction();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, edit.getText(), Toast.LENGTH_SHORT).show();
    }
}
