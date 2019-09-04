package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// TODO: tambahkan callback onStart() di sini

	@Override
	protected void onStart() {
		Toast.makeText(this, "App On Start", Toast.LENGTH_SHORT).show();
		super.onStart();
	}

	// TODO: tambahkan callback onStop() di sini

	@Override
	protected void onStop() {
		Toast.makeText(this, "App On Stop", Toast.LENGTH_SHORT).show();
		super.onStop();
	}

	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()


	@Override
	protected void onDestroy() {
		Toast.makeText(this, "App On Destroy", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Toast.makeText(this, "App On Pause", Toast.LENGTH_SHORT).show();
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Toast.makeText(this, "App On Restart", Toast.LENGTH_SHORT).show();
		super.onRestart();
	}


	@Override
	protected void onResume() {
		Toast.makeText(this, "App On Resume", Toast.LENGTH_SHORT).show();
		super.onResume();
	}


}