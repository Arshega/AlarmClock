package com.example.pc.alarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.Ringtone
import android.media.RingtoneManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class AlarmReciever : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        var getResult: String = intent!!.getStringExtra("extra")

        var service: Intent = Intent(context, RingtoneService::class.java)
        service.putExtra("extra", getResult)
        context!!.startService(service)
    }
}
