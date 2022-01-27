package output;


PROGRAM(APPMAIN)

package com.client;
import java.io.*;
import java.util.*;
import com.servermain.operations.BusinessLeveloperations;

public class Appmain {

private static Scanner sc;

public static void main(String[] args) {
welcomeScreen();
try {
menuDriven();
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	
}

public static void welcomeScreen() {
System.out.println("Application Name : MAIN APPLICATION \n");
System.out.println("Developer Details: Developed by SAI GOVARDHAN \n");
}

public static void menuDriven() throws FileNotFoundException {
sc = new Scanner(System.in);
BusinessLeveloperations obj = new BusinessLeveloperations();
int option;
do {
System.out.println("Enter your choice which you want to select: \n");
System.out.println("\t1. Retrieve current filenames in ascending order \n");
System.out.println("\t2. Business-level operation menu \n");
System.out.println("\t3. Exit from the application \n");

option=sc.nextInt();
switch(option) {
case 1:
obj.showAllFiles();
break;
case 2:
int ch;
do {
System.out.println("Enter your choice for Business level operation");
System.out.println("\t1. Add a file and its content to a directory");
System.out.println("\t2. Delete a file from a directory");
System.out.println("\t3. Searching a file and showing its content");
System.out.println("\t4. Exit from BOL menu");

ch=sc.nextInt();
switch(ch) {
case 1:
obj.addFile();
break;
case 2:
obj.deleteFile();
break;
case 3:
obj.searchFile();
break;
case 4:
System.out.println("Exited from the Business Level operation...");
System.out.println("---------------------------------\n");
break;
default:
System.out.println("Invalid Choice");
break;
}
}while(ch!=4);
break;
case 3:
System.out.println("Exiting from the application...");
break;
default:
System.out.println("Invalid choice");
}

//System.out.println("Press 0 to continue");
}while(option!=3);

}
}



   BUSINESSLEVELOPERATIONS


package com.servermain.operations;
import com.server2.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BusinessLeveloperations implements FileInterface {
List<String> retrieve= new ArrayList<String>();
File[] files = new File("C:\\Users\\Hewlett - Packard\\eclipse-workspace\\Phase 1 FSD Project").listFiles();
private Scanner scan;
private Scanner scan2;
private Scanner scan3;
private Scanner sc1;
@Override
public void showAllFiles() {
// TODO Auto-generated method stub
for(File file : files) {
if(file.isFile()) {
retrieve.add(file.getName());
//System.out.println(file.getName());
}
}
retrieve.forEach(System.out::println);

}

@Override
public void addFile() {
// TODO Auto-generated method stub
System.out.println("Enter the file which you want to add:");
scan = new Scanner(System.in);
String filename=scan.nextLine();
File F= new File(filename);
try {
if(F.createNewFile()) {
System.out.println(filename+" file is added to the directory");
Desktop.getDesktop().edit(F);
}
else {
System.out.println("This file is already there");
}
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	

}

@Override
public void deleteFile() {
// TODO Auto-generated method stub
System.out.println("Enter the file which you want to delete:");
scan2 = new Scanner(System.in);
String filename=scan2.nextLine();
File F= new File(filename);
if(F.delete())
System.out.println(filename+" got Deleted");
else
System.out.println("File Not Found");
}

@Override
public void searchFile() {
// TODO Auto-generated method stub
try {	
scan3 = new Scanner(System.in);
File directory = new File("C:\\\\Users\\\\Hewlett - Packard\\\\eclipse-workspace\\\\Phase 1 FSD Project");
System.out.println("Enter the file name which you want to search:");
String fileName=scan3.nextLine();
File[] files=directory.listFiles();
int flag=0;
for (File file : files) {
String name = file.getName();
if (name.equals(fileName)) {
     // System.out.println("The filename "+fileName+" is present in the directory");
		File f= new File(fileName);
		sc1 = new Scanner(f);
		while(sc1.hasNextLine()) {
		System.out.println(sc1.nextLine());
		}
	flag=1;	
}
}
if(flag==0) {
System.out.println("File not found");
}

}catch(FileNotFoundException ex) {
System.out.println("file not found");
}

}

}



