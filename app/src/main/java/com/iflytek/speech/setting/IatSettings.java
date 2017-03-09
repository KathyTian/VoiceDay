package com.iflytek.speech.setting;

import android.graphics.Color;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.view.Window;

import com.iflytek.speech.util.SettingTextWatcher;
import com.iflytek.voicedemo.R;

/**
 * the setting code to change the mode of the speech recognition
 */
public class IatSettings extends PreferenceActivity implements OnPreferenceChangeListener {
	
	public static final String PREFER_NAME = "com.iflytek.setting";

	@SuppressWarnings("deprecation")
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		getPreferenceManager().setSharedPreferencesName(PREFER_NAME);
		addPreferencesFromResource(R.xml.iat_setting);
		// set the background color
		getListView().setBackgroundColor(Color.TRANSPARENT);
		getListView().setCacheColorHint(Color.TRANSPARENT);
		getListView().setBackgroundColor(Color.rgb(223, 144, 133));
	}
	@Override
	public boolean onPreferenceChange(Preference preference, Object newValue) {
		return true;
	}
}
