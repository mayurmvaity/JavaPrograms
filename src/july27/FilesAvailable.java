/**
 * How to retrieve the details of all the files available inside a folder.
 * **/

package july27;

import java.io.File;

public class FilesAvailable {
	
	public static void main(String[] aa)
    {
        File fobj = new File("D:\\workspace2");			// path of folder
        String[] filelist = fobj.list();

        for(String name:filelist)
        {
            System.out.println(name);
        }
    }
}
