import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

class CSVread  
{
    private String start;
    private String end;
    private String previous;
    private Map<String,String> attract;
    private List<String> intermediatNodes;
    private int dist;
    private int time;
    private int noOfPOI;
    private vertex head;
    private vertex vertexPtr;
    private roads roadsPtr;
    File myObj;
    Scanner myReader;
    CSVread()
    {
        intermediatNodes = null;
        head = null;
        vertexPtr = null;
        roadsPtr = null;
        dist = 0;
        time = 0;
        noOfPOI = 0;
        start = null;
        end = null;
        previous = null;
        attract = null;
    }

    private void reader()
    {
        try
        {
            String[] split;
            myObj = new File("roads.csv");
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) 
            {
                String data = myReader.nextLine();
                split = data.split(",");
                start = split[0];
                end = split[1];
                dist = Integer.parseInt(split[2]);
                time = Integer.parseInt(split[3]);
                if(head == null)
                {
                    head = new vertex();
                    head.setter(start);
                    head.nextLocation = new roads();
                    roadsPtr = head.nextLocation;
                    roadsPtr.setter(end, dist, time);
                    vertexPtr = head;
                    previous = start;
                }
                else
                {
                    if(previous.equals(start))
                    {
                        roadsPtr.next = new roads();
                        roadsPtr = roadsPtr.next;
                        roadsPtr.setter(end, dist, time);
                        previous = start;
                    }
                    else
                    {
                        vertexPtr.next = new vertex();
                        vertexPtr = vertexPtr.next;
                        vertexPtr.setter(start);
                        vertexPtr.nextLocation = new roads();
                        roadsPtr = vertexPtr.nextLocation;
                        roadsPtr.setter(end, dist, time);
                        previous = start;
                    }
                }
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try
        {
            String[] split;
            this.attract = new HashMap<>();
            myObj = new File("attractions.csv");
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) 
            {
                previous = myReader.nextLine();
                split = previous.split(",");
                start = split[0];
                end = split[1];
                attract.put(split[0], split[1]);
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private void Algorithm()
    {
        
    }

    public void setter()
    {
        reader();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter name of tour starting city: ");
        start = input.next();
        System.out.print("\nEnter name of tour ending city: ");
        end = input.next();
        System.out.print("\nEnter number of the POI you want to visit: ");
        noOfPOI = input.nextInt();
        if(noOfPOI > 0)
        {
            int i=1;
            intermediatNodes = new ArrayList<>();
            while(i<=noOfPOI)
            {
                System.out.print("\n"+i+". POI name: ");
                previous = input.next();
                if(attract.containsKey(previous))
                {
                    intermediatNodes.add(attract.get(previous));
                    i++;
                }
                else
                {
                    System.out.println("\nPOI does not exist!!");
                }
            }
            Algorithm();
        }
        else if(noOfPOI == 0)
        {
            Algorithm();
        }
        else if(noOfPOI>142)
        {
            System.out.println("\nCannot exceed available number of attractions!!");
            input.close();
            return;
        }
        else
        {
            System.out.println("\nCannot be negative!!");
            input.close();
            return;
        }
        input.close();
    }
}