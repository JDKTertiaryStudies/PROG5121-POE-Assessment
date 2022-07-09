/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author Junaid
 */
public class Task1 
{
    public static void main(String[] args) 
    {
     String name;
     String surname;
     String username;
     String password;
     String ename;
     String epassword;
     String Options;
     
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Enter Your First Name >> ");
     name = keyboard.nextLine();
     System.out.println("Enter Your Last Name >> ");
     surname = keyboard.nextLine();
     System.out.println("Enter Your Username Name >> ");
     username = keyboard.nextLine();
     System.out.println("Enter Your Password Name >> ");
     password = keyboard.nextLine();
    
    checkUsername(username);  
    valPassword(password);
    checkPass(password);
    
    ename = JOptionPane.showInputDialog(null, "Please Enter The Username");
    
    if (ename != name)
    {    
      JOptionPane.showMessageDialog(null, "Please Enter The Correct Username!!");
    }
    else
    {
    epassword = JOptionPane.showInputDialog(null, "Please Enter The Password");
    if (epassword != password )
        JOptionPane.showMessageDialog(null, "Please Enter The Correct Password!!");  
    }    
    
    System.out.println("Welcome To EasyKanban!!");
    System.out.println("Options: ");
    System.out.println("Option 1: Add Tasks - Option 2: Show Report - Option 3: Quit");
    
    Scanner Option= new Scanner(System.in);
    
    Options = Option.nextLine();
    
    while (Options == "Quit")
    {
    if (Options == "Add Tasks")
    {
      
    }
    else
    if (Options == "Show Report")
    {
      JOptionPane.showMessageDialog(null, "Coming Soon!!");
    }
    }
    }
    
    public static boolean checkUsername(String username)
    {
    boolean Username = false;    
    if (username.length() <= 5)
     {
       System.out.println("Username Successfully Captured");
       Username = true;
     }
     else
     {
        System.out.println("Username is not corrrectly formatted, please ensure yourusername contains an underscore and is no longer than 5 characters. ");
    
     }
    }
    
     public static boolean valPassword(String Password)
     {
        if (Password.length() < 8)
        {
            
        }
        else
        {
            System.out.println("Password Length is not correct");
        } 
        
     }
      
    public static boolean checkPass(String password)
    {
      boolean hasNum = false;
      boolean hasCap = false;
      boolean hasLow = false;
      int i = 0;
      char c;
      
      while ( i < password.length(), i = i + 1)
      {
       c = password.charAt(i);
       if (Character.isDigit(c))
       {
           hasNum = true;
       }
       else
        if (Character.isUpperCase(c))
       {
           hasCap = true;
       }
        else
        if (Character.isLowerCase(c))
       {
           hasLow = true;
       }
        else
        if (hasNum && hasCap && hasLow)
       {
           return true;
       }
      }
     return false;
    }
    
    public class Task
    {
    public static void addTaskFeature(String DeveloperName, String DeveloperSurname)
    {
      String Task, Descrip, Status, Id, Developer, Character;
      int amountOfTask, TaskNo, TaskDuration;
      Scanner taskNum = new Scanner(System.in);
      Scanner taskName = new Scanner(System.in);
      Scanner taskDescrip = new Scanner(System.in);
      Scanner taskDuration = new Scanner(System.in);
      Scanner taskDeveloper = new Scanner(System.in);
      Scanner taskStatus = new Scanner(System.in);
      int taskNumID[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int i;
      Random random = new Random();
      char a;
      
      System.out.println("How Many Tasks: ");
      amountOfTask = taskNum.nextInt();
      
      for (i = 0; i <= taskNumID[amountOfTask] - 1; ++i)
      {   
      System.out.println("Add Task Name:");
      Task = taskName.nextLine();
      System.out.println("Add Developer Name & Surname:");
      Developer = taskDeveloper.nextLine();
      System.out.println("Add Task Description:");
      Descrip = taskDescrip.nextLine();
      System.out.println("Add Task Status:");
      Status = taskStatus.nextLine();
      System.out.println("Add Task Duration:");
      TaskDuration = taskDuration.nextInt();
      TaskNo = i;
      Id = ":";
      a = (char) (random.nextInt(26) + 'a');
      createTaskID(a, TaskNo);
      }  
    }
    
    public String createTaskID(char character, int TaskNUm)
    {
     String taskID;
     
     taskID = character + character + ":" + TaskNUm + ":" + character + character;
     
     return taskID;
    }
    
    public static void printDetails(String task, String taskNo, String taskStatus, String taskDuration, String taskID, String taskDeveloper, String taskDescrip)
    {
     JFrame aFrame = new JFrame("Test Data For Task " + taskNo);
     aFrame.setVisible(true);
     aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JLabel nameLabel = new JLabel("Task Name: " + task);
     JLabel NoLabel = new JLabel("Task Number: " + taskNo);
     JLabel developerLabel = new JLabel("Task Developer: " + taskDeveloper);
     JLabel descripLabel = new JLabel("Task Description: " + taskDescrip);
     JLabel durLabel = new JLabel("Task Duration: " + task);
     JLabel idLabel = new JLabel("Task ID: " + taskID);
     JLabel statusLabel = new JLabel("Task Status: " + task);
     JButton ok = new JButton("OK");
    }
    
    }
    
   public static void storeDetails(String task, int taskNo, String taskStatus, String taskDuration, String taskID, String taskDeveloper)
   {
     String arrTaskName[];
     String arrTaskDeveloper[];
     String arrTaskID[];
     String arrTaskDuration[];
     String arrTaskStatus[];
     int i, taskDelete, index;
     String Delete;
     Scanner input = new Scanner(System.in);
     Scanner yesno = new Scanner(System.in);
     
     for (i = 0, i < taskNo, i++)
     {
       arrTaskName[i] = task;
       arrTaskDeveloper[i] = taskDeveloper;
       arrTaskID[i] = taskID;
       arrTaskDuration[i] = taskDuration;
       arrTaskStatus[i] = taskStatus;
       
       System.out.println("Task Developer:\t" + arrTaskDeveloper[i]);
       System.out.println("Task Name:\t" + arrTaskName[i]);
       System.out.println("Task ID:\t" + arrTaskID[i]);
       System.out.println("Task Duration:\t" + arrTaskDuration[i]);
       System.out.println("Task Status:\t" + arrTaskStatus[i]);
     }
     
     System.out.println("Would You Like Do Delete A Task: Yes/No\t *Only Answer Yes Or No With A Capital* ");
     Delete = yesno.nextLine();
     
     if (Delete == "Yes")
     {
       System.out.println("What Task Number Would You Like To Delete:\t *Enter Only The Number[E.g. 1]* ");
       taskDelete = input.nextInt();
       
       if (taskDelete > taskNo)
        {
          System.out.println("Task " + taskDelete + " Is Not In The System.\t *Please Try Again :)* ");
        }  
       else
        {
            index = taskDelete;
            arrTaskName = ArrayUtils.remove(arrTaskName, index); 
            arrTaskDeveloper = ArrayUtils.remove(arrTaskDeveloper, index);
            arrTaskID = ArrayUtils.remove(arrTaskID, index);
            arrTaskDuration = ArrayUtils.remove(arrTaskDuration, index);
            arrTaskStatus = ArrayUtils.remove(arrTaskStatus, index);
        }   
     }  
     
   }
    
} 
