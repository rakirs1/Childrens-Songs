/**
 * Complete the program so that it sings the song "Hokey Pokey."
 * 
 *
 *
 * @author  Srikar Alapati
 * @version 8/23/18
 */


public class HokeyPokey 
{
	/**
	 * sings lines 1 and 3 of each verse
	 *
	 * @param part Body part to sing about in the verse
	 */
	public static void putItIn(String part)
	{
		System.out.println("You put your "+part+" in");
		
	}
	
	/**
	 * sings line 2
	 * 
	 * @param part Body part to sing about in the verse
	 */
	public static void putItOut(String part)
	{
		System.out.println("You take your "+part+" in");
		
	}
		
	/**
	 * sings lines 4-7 (the "shake it all about" part)
	 */
	public static void shakeIt()
	{
		System.out.println("And you shake it all about.");
		System.out.println("You do the Hokey-Pokey,");
		System.out.println("And you turn yourself around.");
		System.out.println("That's what it's all about!\n");
	}


	/**
	 * Sings a verse of Hokey Pokey
	 *
	 * @param part Body part to sing about in the verse
	 */
	public static void singIt(String part) // sings all lines for a part p
	{
	    putItIn(part);
	    putItOut(part);
	    shakeIt();
	
	}


	public static void main(String[] args) 
	{
		System.out.println("Hokey Pokey\n");
		
		singIt("right foot");
		singIt("right hand");
		singIt("backside");
		singIt("nose");
		singIt("whole self");
	}
   
}
