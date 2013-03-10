package quotes.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayCreativity extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		setContentView(R.layout.creativity_layout);
	}
	
	public void startBack(View view){
		Intent intent = new Intent(DisplayCreativity.this, QuotesActivity.class);
		startActivity(intent);
	}

}
