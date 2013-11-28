package de.peterfriese.robolectricdemo;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.util.ActivityController;

import static org.fest.assertions.api.ANDROID.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class SecondMainActivityTest {
	
	private MainActivity activity;

	@Before
	public void setup() {
		activity = Robolectric.buildActivity(MainActivity.class).create().start().resume().get();
	}	

	@Test
	public void shouldNotBeNull() {
		assertThat(activity).isNotNull();

		TextView textView = (TextView) activity.findViewById(R.id.textView);
		assertThat(textView).isNotNull();

		Button button = (Button) activity.findViewById(R.id.button);
		assertThat(button).isNotNull();

		EditText editText = (EditText) activity.findViewById(R.id.editText);
		assertThat(editText).isNotNull();
	}	
	
	@Test
	public void shouldProduceGreetingWhenButtonPressed() {
		TextView textView = (TextView) activity.findViewById(R.id.textView);
		Button button = (Button) activity.findViewById(R.id.button);
		EditText editText = (EditText) activity.findViewById(R.id.editText);

		editText.setText("Peter");
		button.performClick();

//		assertThat(textView).isGone();
//		Assert.assertEquals(View.GONE, textView.getVisibility());
		
//		assertThat(textView).containsText("Hello, Martin!");
//		Assert.assertEquals(textView.getText(), "Hello, Martin!");
		
	}	
}