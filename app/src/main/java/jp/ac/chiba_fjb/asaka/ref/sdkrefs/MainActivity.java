package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    int DIALOG_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ProgressDialogの生成
        progressDialog = getProgressDialog(this);
        progressDialog.show();

        // 3秒後にダイアログを消す
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
            }
        }, DIALOG_DISPLAY_LENGTH);

    }

    // ProgressDialogインスタンスを生成
    private ProgressDialog getProgressDialog(Context ctx) {
        ProgressDialog dialog = new ProgressDialog(ctx);

        // プログレススタイルを設定
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        // キャンセル可能に設定
        dialog.setCancelable(true);

        // タイトルを設定
        dialog.setTitle("タイトル");

        // メッセージを設定
        dialog.setMessage("メッセージ");

        return dialog;
    }
}
