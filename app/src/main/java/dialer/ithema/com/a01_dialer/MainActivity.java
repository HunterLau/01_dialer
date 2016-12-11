package dialer.ithema.com.a01_dialer;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new MyListener());

    }

    class MyListener implements OnClickListener{

        //��ť���ʱ����
        @Override
        public void onClick(View v) {
            //��ȡ�����Ķ���
            EditText et = (EditText) findViewById(R.id.et);
            //��ȡ�û�����ĺ���
            String number = et.getText().toString();
            //qQSystem.out.print("点我上王者");
            //����ϵͳ���ҵĶ����Ǵ�绰
            //1.������ͼ
            Intent intent = new Intent();
            //2.�Ѷ�����װ����ͼ��
            intent.setAction(Intent.ACTION_CALL);
            //3.��绰���˭
            intent.setData(Uri.parse("tel:" + number));
            //4.����ϵͳ���ҵĶ���
            startActivity(intent);
        }

    }


}
