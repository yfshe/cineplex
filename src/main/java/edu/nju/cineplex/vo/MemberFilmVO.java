package edu.nju.cineplex.vo;

public class MemberFilmVO {
	private boolean view;
	private boolean activity;
	
	public boolean hasViewed(){
		return view;
	}
	
	public boolean hasJoinedActivity(){
		return activity;
	}

	public void setView(boolean view) {
		this.view = view;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}

}
