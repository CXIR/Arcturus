package fr.cxir.arcturus.Tasks;

import java.net.*;

public class RequestHandler {

    private static final String HOST_ADDR = "139.99.195.71:8080";

    private String method;
    private String urlFragment;

    public RequestHandler( String method,
                           String urlFragment ) {

        this.method       = method;
        this.urlFragment  = urlFragment;
    }

    public RequestHandler( String method) {
        this.method = method;
    }

    public void setUrlFragment(String urlFragment) {
        this.urlFragment = urlFragment;
    }

    public URL getCompleteURL(){

        try
        {
            return new URL( HOST_ADDR + this.urlFragment );
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
