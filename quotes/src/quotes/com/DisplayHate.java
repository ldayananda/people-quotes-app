package quotes.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayHate extends Activity{

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hate_layout);
	}
	
	public void startBack(View view){
		Intent intent = new Intent(DisplayHate.this,QuotesActivity.class);
		startActivity(intent);
	}
}
