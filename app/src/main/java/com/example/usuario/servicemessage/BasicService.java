package com.example.usuario.servicemessage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Servicio que no se destruye. No debe tener interacción
 * con la vista. Para ello se comunica con la Activity y
 * la Activity responde.
 */
public class BasicService extends Service {

    /**
     * Se usa cuando se vincula con la activity
     * @param intent
     * @return
     */
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Ahora se ha vuelto infinito        
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
