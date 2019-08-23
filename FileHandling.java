import java.util.*;
import java.io.*;
class FileHandling
{
 static String getFName(String s)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println(s);
   String fname=sc.next();
   return(fname);
 }

static void createFile(String fname)throws IOException
{
   File f=new File(fname);
   if(f.exists())
    System.out.println("File alreadey Found....");
   else
     {
	   boolean b=f.createNewFile();
	   if(b)
	     System.out.println("File created....");
	   else
	     System.out.println("please verify the file name...");
		 
     }
}

static void rename(String source, String dest)
 {
    File f=new File(source);
	File f2=new File(dest);
	   if(f.exists() && f.isFile())
	   {
		boolean b=f.renameTo(f2);
	   	  if(b)
			System.out.println("File renamed successfully....");
		  else 
		     System.out.println("Please verify the file names...");
	   }
	   else
	     System.out.println("Source file not found or it may be directory");
 }
 
 static void deleteFile(String fname)
   {
       File f=new File(fname);
	   
	   if(f.exists() && f.isFile())
	     {
		   boolean b=f.delete();
		   if (b)
		     System.out.println("File successfully delted...");
		   else
		     System.out.println("Please verify file name");
	      }
       else
          System.out.println("File not found or it may be a directory");
  }
  
  static void fileInfo(String fname)
  {
	  
	  File f=new File(fname);
	  
	   if(f.exists() && f.isFile())
	   {    Date d=new Date(f.lastModified());
		    System.out.println("File Name 			:" + f.getName() +
			                   "\nPath    			:" +f.getPath() +
							   "\nAbsolute Path 	:" +f.getAbsolutePath() +
							   "\nParent Directory 	:" +f.getParent() +
							   "\nModified Date 	:" +d+
							   "\nSize				:"+f.length()+
							   "\nRead				:"+f.canRead()+
							   "\nWrite				:"+f.canWrite()+
							   "\nExecute			:"+f.canExecute()+
							   "\nHidden			:"+f.isHidden());
	   }
	  else
		  System.out.println("File not found....");
  }
static void createDir(String dir)
{
	 File f=new File(dir);
	 
	 if(!f.exists())
	 {
		  boolean b=f.mkdir();
		  if(b)
			  System.out.println("Directory successfully created...");
		  else
			  System.out.println("please verify directory name..");
	 }

   else
       System.out.println("Directory alreadey found...");
}

static void createDirs(String dirs)
{
	 File f=new File(dirs);
	 
	 if(!f.exists())
	 {
		  boolean b=f.mkdirs();
		  if(b)
			  System.out.println("Directories  successfully created...");
		  else
			  System.out.println("please verify directory name..");
	 }

   else
       System.out.println("Directory alreadey found...");
}

public static void main(String args[]) throws IOException
{
	
	 int op;
	 String fname,fname1;
	 Scanner sc=new Scanner(System.in);
	 
	do
	{
		 System.out.println("\nFile Handling\n=================");
		 System.out.println("1.Create File\n2.Rename File\n3.Delete File\n4.File Information\n5.Create Directory\n6.Create Multiple Directories\n7.Exit\n\n Enter your option (1-7):");
	     op=sc.nextInt();
         
         if(op<1 || op> 7)
		 {
             System.out.println(" Invalid option.....");
             continue;
		 }

         if (op==7)
          break;

     switch(op)
     {
       case 1:
           fname=getFName("Enter the file name :");
           createFile(fname);
           break;
       case 2:
           fname=getFName("Enter the Source file name :");
		   fname1=getFName("Enter the New file name :");
           rename(fname,fname1);
		   break;
	   case 3:
           fname=getFName("Enter the file name :");
	       deleteFile(fname);
		   break;
	   case 4:
           fname=getFName("Enter the file name :"); 
		   fileInfo(fname);
		   break;
	   case 5:
           fname=getFName("Enter the new directory name :");	   
		   createDir(fname);
		   break;
	   case 6:
           fname=getFName("Enter the multi level directory names (Ex movie\\new):");
		   createDirs(fname);
	 }
	} while(true);
}

}
	 
		
   
			
	  
  
  

 
		 
	 
   