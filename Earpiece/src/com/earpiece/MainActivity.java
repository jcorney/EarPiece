package com.earpiece;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private TextView myEarPiece;

	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myEarPiece = (TextView)this.findViewById(R.id.text_EarPiece);

		AudioManager audio = (AudioManager) this
				.getSystemService(Context.AUDIO_SERVICE);
		if (audio.isWiredHeadsetOn()) {
			myEarPiece.setText("Connected");

		} else {
			myEarPiece.setText("Not Connected");

		}
	}

}
