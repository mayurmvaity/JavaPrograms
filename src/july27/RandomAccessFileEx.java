/**
 * How to read and write the data randomly from the file?
 * **/

package july27;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	
	static final String FILEPATH = "D:\\workspace2\\input.txt";

    public static void main(String[] args) 
    {
        try 
        {
            System.out.println(new String(readFromFile(FILEPATH, 150, 23)));

            writeToFile(FILEPATH, "JavaCodeGeeks Rocks!", 22);

        } 
        catch (IOException e) 
        {    
            e.printStackTrace();
        }
    }

       private static byte[] readFromFile(String filePath, int position, int size) throws IOException
        {
                    RandomAccessFile file = new RandomAccessFile(filePath, "r");		// r for reading
                    file.seek(position);
                    byte[] bytes = new byte[size];

                    file.read(bytes);
                    file.close();

                    return bytes;
        }

        private static void writeToFile(String filePath, String data, int position) throws IOException
        {
                   RandomAccessFile file = new RandomAccessFile(filePath, "rw");		// rw for writing
                   file.seek(position);
                    file.write(data.getBytes());
                    file.close();
        }

}
