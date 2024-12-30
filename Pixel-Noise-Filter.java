import java.io.*;
public class Lab7
{
    public static void main(String args[]) throws IOException
    {

         InputStreamReader reader = new InputStreamReader(System.in);

         int rows, colums, data;

         int tens = reader.read()-48;
         int ones = reader.read()-48;

         rows = (tens*10) + ones;

         tens = reader.read()-48;
         ones = reader.read()-48;

         colums = (tens*10) + ones;

         System.out.println("Raw data in table format:===============");

         int rawData[][] = new int[rows][colums];

         for(int i = 0; i<rawData.length; i++)
         {

             for(int j = 0; j<rawData[0].length; j++)
             {

                 data = reader.read()-48;
                 rawData[i][j]= data;

             }

         }

         for(int i = 0; i<rawData.length; i++)
         {

             for(int j = 0; j<rawData[0].length; j++)
             {

                 System.out.print(rawData[i][j]);

             }

             System.out.print("\n");

         }
        System.out.println();
        System.out.println("Converted to 'pixels':===============");

        boolean convData[][] = new boolean[rows][colums];
        String  xData[][] = new String[rows][colums];

        for(int i = 0; i<rawData.length; i++)
         {

             for(int j = 0; j<rawData[0].length; j++)
             {

                 if(rawData[i][j] < 5)
                 {
                      convData[i][j] = false;
                      xData[i][j] = " ";
                 }

                 else if(rawData[i][j] >= 5)
                 {

                     convData[i][j] = true;
                     xData[i][j] = "x";

                 }

                 System.out.print(xData[i][j]);

             }

             System.out.print("\n");

         }

         System.out.println();

         for(int i = 1; i<convData.length-1; i++)
         {

             for(int j = 1; j<convData[0].length-1; j++)
             {
                 if(convData[i][j]==!convData[i-1][j-1])
                 {
                     if(convData[i][j]==!convData[i-1][j])
                     {
                         if(convData[i][j]==!convData[i-1][j+1])
                         {
                             if(convData[i][j]==!convData[i][j+1])
                             {
                                 if(convData[i][j]==!convData[i][j+1])
                                 {
                                     if(convData[i][j]==!convData[i+1][j-1])
                                     {
                                         if(convData[i][j]==!convData[i+1][j])
                                         {
                                             if(convData[i][j]==!convData[i+1][j+1])
                                             {
                                                 if(convData[i][j] == true)
                                                {
                                                    convData[i][j] = false;
                                                    xData[i][j] = " ";
                                                }

                                                 else if(convData[i][j] == false)
                                                {
                                                    convData[i][j] = true;

                                                    xData[i][j] = "x";
                                                }

                                             }
                                         }
                                     }
                                 }
                             }
                         }
                     }
                 }

             }

         }

        System.out.println("Filtered out noise:===============");

          for(int i = 0; i<xData.length; i++)
          {

             for(int j = 0; j<xData[0].length; j++)
             {

                System.out.print(xData[i][j]);

             }

             System.out.print("\n");

          }

    }


}


