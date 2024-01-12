import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        AuntSue[] sues = new AuntSue[500];
        for(int i = 1; i <= sues.length; i++)
        {
            sues[i - 1] = new AuntSue(i);
        }
        String[] fileData = getFileData("data/sue_notes");
        int correctAuntSue = 0;
        for(int i = 0; i < sues.length; i++)
        {
            AuntSue currentSue = sues[i];
            String currentSueData = fileData[i];
            currentSue.updateSue(currentSueData);
            currentSue.compareSues();
            if(currentSue.isRealSue())
            {
                correctAuntSue = currentSue.getNumber();
            }
        }
        System.out.println("Part 1 answer: " + correctAuntSue);
    }

    public static String[] getFileData(String filePath)
    {
        File f = new File(filePath);
        Scanner s = null;
        try
        {
            s = new Scanner(f);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found. Fix path!");
            System.exit(1);
        }
        String fileData = "";
        while(s.hasNextLine())
        {
            fileData += s.nextLine() + "\n";
        }
        String[] fileArray = fileData.split("\n");
        return fileArray;
    }
}