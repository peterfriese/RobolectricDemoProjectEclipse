package de.peterfriese.robolectricdemo.test;

import static org.fest.assertions.api.ANDROID.assertThat;
import de.peterfriese.robolectricdemo.MainActivity;
import de.peterfriese.robolectricdemo.R;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	
	public MainActivityTest() {
		super(MainActivity.class);
	}

	public MainActivityTest(Class<MainActivity> activityClass) {
		super(activityClass);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
	}
	
	@UiThreadTest
	public void testShouldNotBeNull() {
		assertNotNull(activity);
		
		assertThat(activity).isNotNull();

		TextView textView = (TextView) activity.findViewById(R.id.textView);
		assertThat(textView).isNotNull();

		Button button = (Button) activity.findViewById(R.id.button);
		assertThat(button).isNotNull();

		EditText editText = (EditText) activity.findViewById(R.id.editText);
		assertThat(editText).isNotNull();
		
	}
	
	@UiThreadTest
	public void testShouldProduceGreetingWhenButtonPressed() {
		TextView textView = (TextView) activity.findViewById(R.id.textView);
		Button button = (Button) activity.findViewById(R.id.button);
		EditText editText = (EditText) activity.findViewById(R.id.editText);

		editText.setText("Peter");
		button.performClick();
		
		assertEquals(textView.getText(), "Hello, Peter!");
	}	

	
}
