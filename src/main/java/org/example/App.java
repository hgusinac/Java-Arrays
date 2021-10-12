package org.example;

import javax.rmi.CORBA.Util;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main(String []args)
    {



    }


public static void arrayConcatExample(){

    String[] source ={"foo", "Bar", "Baz"};
    String []toAdd ={"boo","baa"};

    String [] result =addToStringArray(source,toAdd);
    System.out.println(arrayToString(result));
}
//Method
    public static void dynamicArrayExample(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String[] todos = new String[0];
        while(running){
            System.out.print("Write a Task: ");
            String task = scanner.nextLine();
            todos = addToStringArray(todos,task);
            System.out.println(Arrays.toString(todos));
            System.out.println("Do you want to continue? (Y / n");
            switch (scanner.nextLine()){
                case "n":
                    running =false;
                    break;

            }

        }
    }

    public static void nullExample(){String [] tasks = {"Change diapers", "Buy diapers"};
        String task = findTask("Cook dinner",tasks);
        if(task==null){
            System.out.println("Could not find the task");
        }else{
            System.out.println(task);
        }

    }

    public static String[] addToStringArray(final String[]source,String ...strings){
        String [] newArray= Arrays.copyOf(source,source.length + strings.length);

        for(int iWrite = source.length, iRead =0; iRead<strings.length; iWrite++,iRead++){
            newArray[iWrite] = strings[iRead];

        }
        return newArray;

    }
    //Method
    public static String[] addToStringArray(final String[] source,final String string){
        String [] newArray= Arrays.copyOf(source,source.length +1);
        newArray[newArray.length -1] =string;
        return newArray;
    }
//Method
    public static String findTask (String task,String [] array){

        //Kopierar orginalet[array] till en ny [] TEMP. och sedan sorterar den.
        String []temp =Arrays.copyOf(array,array.length);
        Arrays.sort(temp);

        int index =Arrays.binarySearch(temp,task);
        if(index<0){
            return null;
        }
        return temp[index];
    }

    public static String preferredFindTask(String task,String[] array){
        for(String string :array){
            if(task.equals(string)){
                return task;
            }
        }
        return null;
    }
//Method
    public static String arrayToString(String[] strings){
        String message= "[";
        for(int i=0;i<strings.length;i++){
            message += strings[i];
            if(i != strings.length -1){
                message += ".";
            }
        }
        message += "]";
        return message;
    }

}
