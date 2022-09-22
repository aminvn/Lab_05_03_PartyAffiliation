public class Main
{
    public static void main(String[] args)
    {
        String politicalParty = "R";

        if (politicalParty == "R")
        {
            System.out.println("You are a Republician Elephant");
        }
        else if(politicalParty == "I")
        {
            System.out.println("You are a Independent Person");
        }
        else if(politicalParty == "D")
        {
            System.out.println("You are a Democratic Donkey");
        }
        else if (politicalParty == "R" || politicalParty == "I" || politicalParty == "D")
        {
            System.out.println("I am sorry I can't figure which party you are from.");
        }
    }
}