public class solution_addStars {
	// Return the changed string
	    private static String z="";
	public static String addStars(String s){
		// Write your code here
		  
                  if(s.length()<=1)
                  {
                      return s;
                    }
                     
                  if(s.charAt(0)==s.charAt(1))
                  {
                      z=s.charAt(0)+"*"+s.charAt(1)+s.substring(2);
                      return addStars(z);
                    }
                    else
                    {
                        return s.charAt(0)+addStars(s.substring(1));
                }
            }
        }
                  