package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Notificationを送信
        sendNotification();

    }

    // Notificationを生成
    private Notification getNotification(PendingIntent pendingIntent) {
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this.getApplicationContext());

        notification.setContentIntent(pendingIntent);

        // 通知時のテキスト
        notification.setTicker("通知時のメッセージ");

        // アイコン
        notification.setSmallIcon(R.mipmap.ic_launcher);

        // Notificationを開いた時に表示されるタイトルとテキスト
        notification.setContentTitle("タイトル");
        notification.setContentText("メッセージ。");

        // IceCreamSandwich以降のみLargeIconを設定(参考までに)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            // LargeIconのBitmapを生成
            Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
            notification.setLargeIcon(largeIcon);
        }

        // 通知するタイミング
        notification.setWhen(System.currentTimeMillis());

        // 通知時の音・バイブ・LED
        notification.setDefaults(
                Notification.DEFAULT_SOUND
                        | Notification.DEFAULT_VIBRATE
                        | Notification.DEFAULT_LIGHTS
        );

        // タップするとキャンセル
        notification.setAutoCancel(true);

        return notification.build();
    }

    // Notificationを送信
    private void sendNotification() {
        // Notificationクリック時のPendingIntentを取得
        PendingIntent pendingIntent = getPendingIntent();

        // Notificationを取得
        Notification notification = getNotification(pendingIntent);

        // NotificationManagerインスタンスを取得
        NotificationManager manager = (NotificationManager)getSystemService(Service.NOTIFICATION_SERVICE);

        // Notificationを通知
        manager.notify(0, notification);
    }

    // PendingIntentの生成
    private PendingIntent getPendingIntent() {
        Intent intent = new Intent(this, MainActivity.class);
        return PendingIntent.getActivity(this,
                0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

}
