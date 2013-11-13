package com.wikitude.samples.utils.urllauncher;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.wikitude.sdksamples.R;




/**
 * Activity showing intro slides describing app in few words
 */
public class ARchitectUrlLauncherActivity extends Activity {


	/**
	 * onMenu ID for clearing URL history
	 */
	private final int				MENU_ID_HISTORY_CLEAR	= 1;

	private static final String 	tmpInforamtionFileName = "visitedUrl.tmp";


	@Override
	protected void onCreate( final Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		this.setContentView( R.layout.urllauncher_main );
		final EditText inicio = (EditText)this.findViewById( R.id.editText1 );
		final EditText pfinal = (EditText)this.findViewById( R.id.editText2 );
		final Button buttonVisitUrl = (Button)this.findViewById( R.id.button_visit_url );
		final TextView texto_camino = (TextView)this.findViewById(R.id.textView3); 

		buttonVisitUrl.setOnClickListener( new View.OnClickListener() {

			@Override
			public void onClick( final View arg0 ) {
				
				String einicial = inicio.getText().toString();
				String efinal = pfinal.getText().toString();
				caminoCorto camino = new caminoCorto();
				String resultado_camino = camino.shortest(einicial, efinal);
				texto_camino.setText(resultado_camino);
			}
		} );
	}
}
