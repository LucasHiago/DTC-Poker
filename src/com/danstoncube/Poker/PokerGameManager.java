package com.danstoncube.Poker;

import java.util.HashMap;



public class PokerGameManager
{
	private HashMap<String,PokerGame> _games = new HashMap<String,PokerGame>();
	
	
	public HashMap<String,PokerGame> getGames()
	{
		return _games;
	}
	
	
	public PokerGame getGame(String GameID)
	{
		if(_games.containsKey(GameID))
			return _games.get(GameID);		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}