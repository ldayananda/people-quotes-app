package quotes.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayLove extends Activity{

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.love_layout);
	}
	public void startBack(View view){
		Intent intent = new Intent(DisplayLove.this, QuotesActivity.class);
		startActivity(intent);
	}
}
