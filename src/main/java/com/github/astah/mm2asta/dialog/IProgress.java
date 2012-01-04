package com.github.astah.mm2asta.dialog;

public interface IProgress {

	public abstract void setMessage(String message);
	
	public abstract void showErrorMessage(Exception e ,String message);

}