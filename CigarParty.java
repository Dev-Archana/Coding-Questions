/**
 * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
 */
package com.dlithe.CodingQuestions.platform1;

public class CigarParty
{
	//WAY -01
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if(isWeekend)
		{
			if(cigars >=40 )
			{
				return true;
			}

		}else if(cigars>=40 && cigars <=60)
		{
			return true;
		}

		return false;

	}
	//Way -2
	public static boolean cigarParty1(int cigars, boolean isWeekend) {
		  return isWeekend ? cigars >= 40 : cigars >= 40 && cigars <= 60;
		}

	//Way-3
	public static boolean cigarParty2(int cigars, boolean isWeekend) {
		  return isWeekend || (cigars >= 40 && cigars <= 60);
		}

	public static void main(String[] args) {
		System.out.println(cigarParty(50,true));
		System.out.println(cigarParty1(50,true));
		System.out.println(cigarParty2(50,true));
	}
}
