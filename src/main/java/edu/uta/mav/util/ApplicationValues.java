package edu.uta.mav.util;

public class ApplicationValues {
	public static final String DEV_ENVIRONMENT="escng-dev.cisco.com";
	public static final String STAGE_ENVIRONMENT="eol-stage.cisco.com";
	public static final String PROD_ENVIRONMENT="-eol.cisco.com";
	public static final String COOKIE="Cookie";
	public static final String LOCAL="local";
	public static final String DEV="dev";
	public static final String STAGE="stage";
	public static final String PROD="prod";
	public static final String UNATHORIZED_ERROR="errorpages/ErrorPage403";
	private static String serverName;
	private static String currentEnvironment;
	public static String getServerName() {
		return serverName;
	}
	public static void setServerName(String serverName) {
		ApplicationValues.serverName = serverName;
	}
	public static String getCurrentEnvironment() {
		return currentEnvironment;
	}
	public static void setCurrentEnvironment(String currentEnvironment) {
		ApplicationValues.currentEnvironment = currentEnvironment;
	}
	
	
}
