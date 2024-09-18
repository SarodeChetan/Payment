package com.business.logic;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class Rough {
	
	 
	
	
	
	 public static void openWebpage(String urlString) {
	        try {
	            URI uri = new URI(urlString);
	            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	            
	            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	                desktop.browse(uri);
	            } else {
	                System.err.println("Desktop is not supported on this platform.");
	            }
	        } catch (URISyntaxException | IOException e) {
	            e.printStackTrace();
	        }
	    }

}
