package cam.grupo09.gopart_y.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.app.Activity;
import cam.grupo09.gopart_y.R;

/**
 * Created by mike on 3/2/2016.
 */
public class InvitacionesPendientesActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitacion);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
