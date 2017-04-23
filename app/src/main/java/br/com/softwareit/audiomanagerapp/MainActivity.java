package br.com.softwareit.audiomanagerapp;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AudioManager myAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
    }

    public void mode(View view) {
        int mod=myAudioManager.getRingerMode();
        if(mod==AudioManager.RINGER_MODE_VIBRATE){
            Toast.makeText(MainActivity.this,"Now in Vibrate Mode",
                    Toast.LENGTH_LONG).show();
        } else if(mod==AudioManager.RINGER_MODE_NORMAL){
            Toast.makeText(MainActivity.this,"Now in Ringing Mode",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this,"Now in Silent Mode",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void ring(View view) {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        Toast.makeText(MainActivity.this,"Now in Ringing Mode",
                Toast.LENGTH_LONG).show();
    }

    public void vibrate(View view) {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        Toast.makeText(MainActivity.this,"Now in Vibrate Mode",
                Toast.LENGTH_LONG).show();
    }

    public void silent(View view) {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        Toast.makeText(MainActivity.this,"Now in silent Mode",
                Toast.LENGTH_LONG).show();
    }
}
