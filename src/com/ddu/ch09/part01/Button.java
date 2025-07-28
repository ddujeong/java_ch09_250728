package com.ddu.ch09.part01;

public class Button {
	OnClickListener listener;

	public void setListner(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}

	static interface OnClickListener{
		void onClick();
	}
}
