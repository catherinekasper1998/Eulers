
/**
 * Write a description of class Test2035 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test2035
{
    int[] ConfidenceValues = {1, 70, 0, 0, 21, 2, 3, 0, 3, 0};     // 1
    int main() {
        int classID = 0;
        int counter = 1;
        int maxVal = ConfidenceValues[0];
        while (counter<10)
        {
            if (ConfidenceValues[counter]>=maxVal)
            {
                maxVal = ConfidenceValues[counter];
                classID = counter;
            }
            counter = counter + 1;
        }

  
        // Your program should use this print statement.
        // Do not change the format!
        printf("%d is the class with highest confidence value.\n", classID);

        return 0;
      }
}
