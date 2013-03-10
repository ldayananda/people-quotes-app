package quotes.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import quotes.com.R;

/** work out how to send the right quote to the right place **/


public class QuotesActivity extends Activity {
	
	public final static String quote = "quotes.com.quote";
	public final static String author = "quotes.com.author";
	

	public final static String THEmessage = "quotes.com.msg";
	int b = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    
    public Bundle textBundle(String quote, String author){
    	Bundle text = new Bundle();
    	text.putString(quote, quote);
    	text.putString(author, author);
    	
    	return text;
    }
    
    public void startMinds(View view){
    	Intent intent = new Intent(QuotesActivity.this, DisplayMinds.class);
    	
    	/*
    	EditText editText = (EditText) findViewById(R.string.parachute_contents);
    	String quoteBlock = editText.getText().toString();
    	
    	EditText editText2 = (EditText) findViewById(R.string.Minds);
    	String authorIs = editText2.getText().toString();
    	
    	intent.putExtras(textBundle(quoteBlock,authorIs));
    	*/
    	startActivity(intent);
    }
    
    
    public void startImagination(View view){
    	Intent intent = new Intent(QuotesActivity.this, DisplayImagination.class);
    	startActivity(intent);
    }
    
    	
    public void startHate(View view){
    	Intent intent = new Intent(QuotesActivity.this, DisplayHate.class);
    	startActivity(intent);
    }
    
    public void startCreativity(View view){
    	Intent intent = new Intent(QuotesActivity.this, DisplayCreativity.class);
    	startActivity(intent);
    }
    
    public void startLove(View view){
    	Intent intent = new Intent(QuotesActivity.this, DisplayLove.class);
    	startActivity(intent);
    }
    
}