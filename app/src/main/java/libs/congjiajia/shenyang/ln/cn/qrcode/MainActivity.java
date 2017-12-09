package libs.congjiajia.shenyang.ln.cn.qrcode;

import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity
{
    public static final int REQUEST_CODE = 111;
    private Button btn=null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button );
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startqrCode();
            }
        });
    }

    void startqrCode()
    {

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {


    }


}
