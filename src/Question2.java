import javax.swing.*;
import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> counted = new ArrayList<Integer>();
        int counter=0;
        int choice;
        String choiceAsString;
        String output = "Number     Appearances";

        choiceAsString = JOptionPane.showInputDialog("Please enter a number between 1 and 100 -- <1 to exit");
        choice = Integer.parseInt(choiceAsString);

        while(choice>0 && counter<=100)
        {
            counter++;
            number.add(choice);

            choiceAsString = JOptionPane.showInputDialog("Please enter a number between 1 and 100 -- <1 to exit");
            choice = Integer.parseInt(choiceAsString);
        }

        for(int i=0;i<number.size();i++)
        {
            boolean found = false;

            for(int j=0;j<counted.size();j++)
            {
                if((number.get(i).equals(counted.get(j))))
                    found=true;
            }

            if(!found)
            {
                int count = 1;

                for(int j = i+1;j<=number.size();j++)
                {
                    if(number.get(i)==number.get(j))
                    {
                        count++;
                    }
                }
                output += "\n" + number.get(i) + "       " + count;
            }

        }

        System.out.print(output);
    }
}
