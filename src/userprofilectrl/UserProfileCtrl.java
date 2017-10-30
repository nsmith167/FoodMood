package userprofilectrl;

import userprofilemodel.*;
import loginview.*;

public class UserProfileCtrl {

        /**
        * @param args the command line arguments
        */
       public static void main(String args[]) {
           
       }
    
	public UserProfileCtrl() {
		LoginPanel loginPanel = new LoginPanel();
                System.out.println("`-User Profile Control Instantiated");
//		setEmail(null, null);
//		setNotifications(null, 0);
		UserProfileModel model = new UserProfileModel();
                String[] creds = loginPanel.getEntries();
                String username = creds[0];
                String password = creds[1];
                User user = model.getUserForAuthentication(username, password);
                Profile prof = model.getUserProfile(user);
                
                
	}

        public void setUsername(Profile prof, String name) {
		System.out.println("`--Set User Email");
		prof.user.setUsername(name);
	}
        
        public void setPassword(Profile prof, String pass) {
		System.out.println("`--Set User Email");
		if(prof.user.authenticate((prof.user.username), pass)){
                    prof.user.setPassword(pass);
                }
	}
        
        public void setFirstName(Profile prof, String name) {
		System.out.println("`--Set User Email");
		prof.setFirstName(name);
	}
        
        public void setLastName(Profile prof, String name) {
		System.out.println("`--Set User Email");
		prof.setLastName(name);
	}
        
	public void setEmail(Profile prof, String email) {
		System.out.println("`--Set User Email");
		prof.setEmail(email);
	}

	public void setNotifications(Profile prof, int num) {
                System.out.println("`--Set notification param");
		prof.setReceiveNotifications(num);
	}
        
        
}
