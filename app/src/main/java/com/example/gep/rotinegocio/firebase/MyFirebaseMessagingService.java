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
import com.example.gep.rotinegocio.fragment.PedidosFragment;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private String TAG="GUILLE";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());



        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getData());
        }

        showNotification(remoteMessage.getData().get("idPedido"),remoteMessage.getData().get("remitente"));

    }



    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
    }



    private void showNotification(String idPedido,String remitente) {

        String titulo = (idPedido == null || idPedido.isEmpty()) ? "Notificación importante" : idPedido;

        Intent notIntent = new Intent(getApplicationContext(), PedidosFragment.class);
        notIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);


        Log.d("Notificacion",idPedido);




        PendingIntent contIntent = PendingIntent.getActivity(getApplicationContext(), 0, notIntent, 0);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setContentIntent(contIntent)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(titulo)
                .setContentText(remitente)
                .setAutoCancel(true);


        notificationBuilder.setContentIntent(contIntent);

        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        notificationBuilder.setSound(alarmSound);


        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());


    }


}
