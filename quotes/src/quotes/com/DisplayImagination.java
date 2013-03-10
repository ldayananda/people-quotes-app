package quotes.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayImagination extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imagination_layout);
	}

	public void startBack(View view){
		Intent intent = new Intent(DisplayImagination.this, QuotesActivity.class);
		startActivity(intent);
	}
}
