package com.javatraining.session4;

 class StaticVSInstance {
	
	public static int staticCount;
	
	public int count;
	
	final int finalCount = 10; // Once assigned we can't change the value in its life time.

	public StaticVSInstance() {
//		super();
		++staticCount;
		++count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int getStaticCount() {
		return staticCount;
	}

	public int getFinalCount() {
		
		return finalCount;
	}
	
	
	
	
	
	
	
	
	
	

}
