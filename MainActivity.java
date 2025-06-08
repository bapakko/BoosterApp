
package com.bapakko.booster;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Booster Aktif! 🚀", Toast.LENGTH_LONG).show();
    }
}
    