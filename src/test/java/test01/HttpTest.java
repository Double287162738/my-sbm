package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class HttpTest {

	 private MockHttpServletRequest request;

	    public MockHttpServletRequest getRequest() {
	        return request;
	    }

	    public void setRequest(MockHttpServletRequest request) {
	        this.request = request;
	    }
	    
	    @Test
	    public void test() throws UnsupportedEncodingException, IOException {
	    }
	    
	    
	    private String getPostString(BufferedReader sis) throws IOException {
	    		
	    	                 char[] buf = new char[1024];
	    	 	
	    	                 int len = 0;
	    		
	    	                 StringBuffer sb = new StringBuffer();
	    		
	    	                 while ((len = sis.read(buf)) != -1) {
	    		
	    	                         sb.append(buf, 0, len);
	    		 	
	    	                 }
	    		
	    	                 return sb.toString();
	    		 	
	    	         }
}
