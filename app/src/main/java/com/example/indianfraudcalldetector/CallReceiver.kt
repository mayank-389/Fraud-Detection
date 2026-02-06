package com.example.indianfraudcalldetector
import android.content.*
import android.telephony.TelephonyManager
import android.widget.Toast
class CallReceiver:BroadcastReceiver(){override fun onReceive(c:Context,i:Intent){val s=i.getStringExtra(TelephonyManager.EXTRA_STATE);val n=i.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);if(s==TelephonyManager.EXTRA_STATE_RINGING && n!=null){if(IndianFraudChecker.isFraud(n)){Toast.makeText(c,"⚠️ Indian Fraud Call Detected\n$n",Toast.LENGTH_LONG).show()}}}}