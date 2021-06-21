package example;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class PasswordCallbackHandler implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for(Callback callBack : callbacks){
            if(callBack instanceof WSPasswordCallback){
                ((WSPasswordCallback)callBack).setPassword("pwd");
            }
        }
	}
}
