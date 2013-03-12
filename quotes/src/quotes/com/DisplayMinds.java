package quotes.com;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMinds extends Activity{
	
	//get strings from intent
	private Intent intent = getIntent();
	private Context context = getBaseContext();
	private String quote;
	private String author;
	private TextView quoteBlock;
	private TextView authorBlock;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.quote_layout);
		
		//change text in quote_location
		try {
			 quoteBlock = (EditText) findViewById(R.id.minds_content);
			 quote = getString(R.string.minds_contents);
			//quoteBlock.setTextColor(color.white);
			//quoteBlock.setTextSize(32);
			quoteBlock.setText(quote);
			//quoteBlock.getText();
		} catch (Exception e) {
			Toast err = Toast.makeText(this, 
					e + ", "+ " " + getString(R.string.minds_contents), 
					Toast.LENGTH_LONG);
			err.show();
		}
		/*
	    //EditText quoteBlock = new EditText(this);
	    quoteBlock.setTextSize(32);
		quoteBlock.setText(R.string.minds_contents);
	    
	    //change author_location
	    EditText authorSpot = (EditText) findViewById(R.id.minds_quote_author);
		//EditText authorSpot = new EditText(this);
		authorSpot.setTextSize(32);
	    authorSpot.setText(R.string.minds_author);
	    
		//setContentView(R.layout.quote_layout);
	    //setContentView(quoteBlock);
	    
		//setContentView(R.layout.minds_layout);
		 * 
		 */
	}
	
	public void startBack(View view){
		Intent intent = new Intent(DisplayMinds.this, QuotesActivity.class);
		startActivity(intent);
	}

	
}
