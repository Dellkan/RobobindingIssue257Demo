package com.dellkan.issue257demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dellkan.issue257demo.viewmodels.Test;

import org.robobinding.ViewBinder;
import org.robobinding.binder.BinderFactoryBuilder;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getRobobindingLayoutInflater().inflateAndBind(R.layout.activity_main, new Test()));
	}

	public ViewBinder getRobobindingLayoutInflater() {
		BinderFactoryBuilder binderFactoryBuilder = new BinderFactoryBuilder();
		return binderFactoryBuilder.build().createViewBinder(this);
	}

	@Override
	protected void attachBaseContext(Context newBase) {
		super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
	}
}
