package guessNumber;

import javax.swing.text.DefaultStyledDocument;

public class GuessNumber {

    int[] randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = parseString(randomNumber);
    }

    public String validate(String userInput) {

        int[] inputs=parseString(userInput);
        int placeCorrect=0;
        int placeWrong=0;
        for(int i=0;i<4;i++)
        {
            if(inputs[i]==randomNumber[i])
            {
                placeCorrect++;
            }else if(containsInput(randomNumber,inputs[i]))
            {
                placeWrong++;
            }
        }

        return placeCorrect+"a"+placeWrong+"b";
    }

    public  boolean  containsInput(int[] input ,int num )
    {
        boolean isContain=false;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]==num)
            {
                isContain=true;
            }

        }
        return  isContain;

    }
    public int[] parseString(String uerInput){
        int[] inputs=new int[4];
        for(int i=0;i<4;i++)
        {
            inputs[i]=Integer.parseInt(uerInput.substring(i,i+1));
        }
        return  inputs;
    }
}






