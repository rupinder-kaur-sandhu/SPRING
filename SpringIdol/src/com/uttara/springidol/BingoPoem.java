package com.uttara.springidol;

public class BingoPoem implements Poem {
	
	private String[] lines = {
			"ringa ringa roses",
			"pocket full of roses"
	};

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(String line:lines)
			System.out.println(line);

	}

}
