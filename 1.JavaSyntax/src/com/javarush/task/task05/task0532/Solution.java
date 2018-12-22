import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int maximum = 0;
            if (a > 0)
            {
                for (int i = 0; i < a; i++)
                {
                    if (maximum < Integer.parseInt(reader.readLine())) maximum = Integer.parseInt(reader.readLine());
                }
                System.out.println(maximum);
            }
            else System.out.println("Вы ввели число меньше 0");
    }
}
