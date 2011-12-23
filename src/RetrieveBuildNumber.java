package stock;
import java.io.*;
import java.util.*;

public class RetrieveBuildNumber
{
          private String buildNum="" ;


     public String getBuildNumber()
     {

          //create an instance of properties class

          Properties props = new Properties();

          //try retrieve data from file
             try {

	     props.load(new FileInputStream("/home/project/hudson_config/git_conf/mybuild.number"));

             buildNum = props.getProperty("build.number");

             //System.out.println(buildNum );
	     return buildNum ;
              }

             //catch exception in case properties file does not exist

             catch(IOException e)
             {
             e.printStackTrace();
             }
	return buildNum ;
     }

public static void main(String args[])
{
	RetrieveBuildNumber obj=new RetrieveBuildNumber();
	String buildNum=obj.getBuildNumber();
	System.out.println("buildNum :"+buildNum);

}	


}  
