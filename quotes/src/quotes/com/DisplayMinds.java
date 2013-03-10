package quotes.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMinds extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//get strings from intent
		Intent intent = getIntent();
		
	    /*
		//change text in quote_location
	    //EditText quoteBlock = (EditText) findViewById(R.id.quote_location);
	    EditText quoteBlock = new EditText(this);
	    quoteBlock.setTextSize(32);
		quoteBlock.setText(R.string.parachute_contents);
	    
	    //change author_location
	    //EditText authorSpot = (EditText) findViewById(R.id.author_location);
		EditText authorSpot = new EditText(this);
		authorSpot.setTextSize(32);
	    authorSpot.setText(R.string.Minds_author);
	    
		//setContentView(R.layout.quote_layout);
	    setContentView(quoteBlock);
	    */
		setContentView(R.layout.minds_layout);
	}
	
	public void startBack(View view){
		Intent intent = new Intent(DisplayMinds.this, QuotesActivity.class);
		startActivity(intent);
	}

	
}
