package android.example.com.squawker.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class SquawkerFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static String LOG_TAG = SquawkerFirebaseInstanceIdService.class.getName();

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //Log.d(LOG_TAG,"refreshed token: "+refreshedToken);
        //Toast.makeText(getApplicationContext(),refreshedToken,Toast.LENGTH_SHORT).show();


        // send instance ID token to server
        sendRegistrationToServer(refreshedToken);
    }

    /**
     * @param refreshedToken the new token
     */
    private void sendRegistrationToServer(String refreshedToken) {
        // later
    }
}
