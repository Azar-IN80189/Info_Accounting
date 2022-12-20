package info.utility;

public class ExtentUtil {
	public static String getReportConfigPath() {
		String reportConfigPath = Constants.EXTENT_CONFIG_PATH;
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("Report Config Path not specified");
	}

}
