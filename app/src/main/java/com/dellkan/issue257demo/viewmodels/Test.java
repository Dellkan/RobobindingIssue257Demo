package com.dellkan.issue257demo.viewmodels;

import org.robobinding.annotation.PresentationModel;
import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

@PresentationModel
public class Test implements HasPresentationModelChangeSupport {
	private String test = "This is a test string";
	private final PresentationModelChangeSupport changeHandler = new PresentationModelChangeSupport(this);

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
		changeHandler.firePropertyChange("test");
	}

	@Override
	public PresentationModelChangeSupport getPresentationModelChangeSupport() {
		return changeHandler;
	}
}
