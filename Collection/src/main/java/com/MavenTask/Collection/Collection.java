package com.MavenTask.Collection;
import java.util.*;

public class Collection 
{
    public static void main( String[] args )
    {
    	int Number;
    	Scanner scannerClassObject=new Scanner(System.in);
        ArrayList<String> arrayListObject=new ArrayList<String>();
        String arrayElements[]= {"Chandra","Sekhar","Gnana","Prakash","sai","Vamsi","Mani","Shasi","Basava","Abdul"};
        System.out.println("After Adding:");
        for(int i=0;i<arrayElements.length;i++)
        {
        	arrayListObject.add(arrayElements[i]);
        	System.out.println(arrayListObject);
        }
        System.out.println("Enter No.Of Strings to be Added:");
        int numberOfValues=scannerClassObject.nextInt();
        for(int i=0;i<numberOfValues;i++)
        {
        System.out.println("Enter String to be Added "+i +":");
        String b=scannerClassObject.next();
        arrayListObject.add(b);
        System.out.println("After Adding:");
        System.out.println(arrayListObject);
        }
        System.out.println("Enter No.Of Strings to be Removed:");
        Number = scannerClassObject.nextInt();
        for(int i=0;i<Number;i++)
        {
        System.out.println("Enter index value to be Removed");
        int removeObject=scannerClassObject.nextInt();
        arrayListObject.remove(removeObject);
        System.out.println("After Removing:");
        System.out.println(arrayListObject);
        }
        System.out.println("Enter Index Value to be Getted:");
        int getElements = scannerClassObject.nextInt();
        System.out.println("After Getting, The Element are:"+arrayListObject.get(getElements));
        scannerClassObject.close();
        
    }
}
