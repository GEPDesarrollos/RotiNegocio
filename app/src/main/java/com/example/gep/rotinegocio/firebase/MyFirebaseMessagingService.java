package com.example.gep.rotinegocio.firebase;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.example.gep.rotinegocio.R;
import com.example.gep.rotinegocio.activities.MainActivity;
import com.example.gep.rotinegocio.fragment.PedidosFragment;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d("Message data payload: ", ""+remoteMessage.getData());



        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d("Message Body: ","" + remoteMessage.getData());
        }

        showNotification(remoteMessage.getData().get("idPedido"),remoteMessage.getData().get("remitente"));

    }



    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
    }



    private void showNotification(String idPedido,String remitente) {

        String titulo = (idPedido == null || idPedido.isEmpty()) ? "Notificación importante" : idPedido;

        Intent notIntent = new Intent(getApplicationContext(), MainActivity.class);
        notIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        String channelId = getString(R.string.default_notification_channel_id);
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);


        Log.d("Notificacion",idPedido);

        PendingIntent contIntent = PendingIntent.getActivity(getApplicationContext(), 0, notIntent, 0);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this,channelId)
                .setContentIntent(contIntent)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle(idPedido)
                .setContentText(remitente)
                .setSound(alarmSound)
                .setAutoCancel(true);



        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());


    }
    
    @Override
    public void onNewToken(String token) {
        Log.d("Refreshed token: ","" + token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {
    }


}
