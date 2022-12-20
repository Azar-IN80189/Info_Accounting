package info.utility;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

public class FileUtil {

	// pick latest file from download
		// delete file in download
		// copy to clipboard
		// getTextFromClipboard
		
		public static File getTheNewestFile(String filePath, String ext) {
			System.out.print(filePath+" "+ext);
		    File theNewestFile = null;
		    File dir = new File(filePath);
		    FileFilter fileFilter = new WildcardFileFilter("*." + ext);
		    File[] files = dir.listFiles(fileFilter);

		    if (files.length > 0) {
		        /** The newest file comes first **/
		        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
		        theNewestFile = files[0];
		    }

		    return theNewestFile;
		}
}
