package com.example.Trends;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);setBluetooth(true);

    }

    public void onBluetooth(View view){
        setBluetooth(true);
    }

    private boolean setBluetooth(boolean enable){
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean isEnabled = bluetoothAdapter.isEnabled();

        if(enable && !isEnabled){
            return  bluetoothAdapter.enable();
        }
        else if (!enable && isEnabled){
            return bluetoothAdapter.disable();
        }
        //No need to change bluetooth state.
        return true;

    }
}
