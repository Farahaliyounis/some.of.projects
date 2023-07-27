package turingmachine; 

import java.util.*;



public class TuringMachine 
{
	private Set<String> theStateSpace;
	private Set<Transition> spaceOfTransitions;
	private String theStartState;
	private String AcceptStatee;
	private String RejectStatee;
	
	private String Tape;
	private String theCurrentState;
	private int theCurrentSymbol;
		
	class Transition
	{
		String theReadState;
		char theReadSymbol;
		String writtenState;
		char writtenSymbol;
		boolean movingDirection;	//true is right, false is left
		
		boolean isConflicted(String state, char symbol)
		{
			if (state.equals(theReadState) && symbol == theReadSymbol)
			{
				return true;
			}
			else
			{
				return false;			
			}
		}		
	}
	
	
	public TuringMachine()
	{
		theStateSpace = new HashSet<String>();
		spaceOfTransitions = new HashSet<Transition>();
		theStartState = new String("");
		AcceptStatee = new String("");
		RejectStatee = new String("");
		Tape = new String("");
		theCurrentState = new String("");
		theCurrentSymbol = 0;
		
	}
	
	public boolean runOfTm(String input, boolean silentmode)
	{
		theCurrentState = theStartState;
		Tape = input;
		
		while(!theCurrentState.equals(AcceptStatee) && !theCurrentState.equals(RejectStatee))
		{
			boolean foundTransition = false;
			Transition CurrentTransition = null;
			
			if (silentmode == false)
			{
				if (theCurrentSymbol>0)
				{
					System.out.println(Tape.substring(0, theCurrentSymbol) + " " + theCurrentState + " " + Tape.substring(theCurrentSymbol));
				}
				else
				{
					System.out.println(" " + theCurrentState + " " + Tape.substring(theCurrentSymbol));
				}
			}
			
			
			
			

			Iterator<Transition> TransitionsIterator = spaceOfTransitions.iterator();
			while ( TransitionsIterator.hasNext() && foundTransition == false)
		    {
				Transition nextTransition = TransitionsIterator.next();
				if (nextTransition.theReadState.equals(theCurrentState) && nextTransition.theReadSymbol == Tape.charAt(theCurrentSymbol))
				{
					foundTransition = true;
					CurrentTransition = nextTransition;
				}						
		    }	
			
			if (foundTransition == false)
			{
				System.err.println ("There is no valid transition for this phase! (state=" + theCurrentState + ", symbol=" + Tape.charAt(theCurrentSymbol) + ")");
				return false;
			}
			else
			{
				theCurrentState = CurrentTransition.writtenState;
				char[] tempTape = Tape.toCharArray(); 				
				tempTape[theCurrentSymbol] = CurrentTransition.writtenSymbol;
				Tape =  new String(tempTape);
				if(CurrentTransition.movingDirection==true)
				{
					theCurrentSymbol++;
				}
				else
				{
					theCurrentSymbol--;
				}
				
				if (theCurrentSymbol < 0)
					theCurrentSymbol = 0;
				
				while (Tape.length() <= theCurrentSymbol)
				{
					Tape = Tape.concat("_");
				}
				
				
			}			
		
			
		}
		
		if (theCurrentState.equals(AcceptStatee))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public boolean addNewState(String newState)
	{
		if (theStateSpace.contains(newState))
		{
			return false;
		}
		else
		{
			theStateSpace.add(newState);
			return true;
		}
	}
	
	public boolean addTheStartState(String newStartState)
	{
		if (theStateSpace.contains(newStartState))
		{
			theStartState = newStartState;
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public boolean applyAcceptState(String newAcceptState)
	{
		if (theStateSpace.contains(newAcceptState) && !RejectStatee.equals(newAcceptState))
		{
			AcceptStatee = newAcceptState;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean applyRejectState(String newRejectState)
	{
		if (theStateSpace.contains(newRejectState) && !AcceptStatee.equals(newRejectState))
		{
			RejectStatee = newRejectState;
			return true;
		}
		else
		{
			return false;
		}		
	}

	public boolean addTmTransitions(String rState, char rSymbol, String wState, char wSymbol, boolean mDirection)
	{
		if(!theStateSpace.contains(rState) || !theStateSpace.contains(wState))
		{
			return false;
		}
			
		boolean conflict = false;
		Iterator<Transition> TransitionsIterator = spaceOfTransitions.iterator();
		while ( TransitionsIterator.hasNext() && conflict == false)
	    {
			Transition nextTransition = TransitionsIterator.next();
			if (nextTransition.isConflicted(rState, rSymbol))
			{
				conflict = true;
			}
					
	    }
		if (conflict == true)
		{
			return false;
		}
		else
		{
			Transition newTransition = new Transition();
			newTransition.theReadState = rState;
			newTransition.theReadSymbol = rSymbol;
			newTransition.writtenState = wState;
			newTransition.writtenSymbol = wSymbol;
			newTransition.movingDirection = mDirection;
			spaceOfTransitions.add(newTransition);
			return true;
		}
	}
}