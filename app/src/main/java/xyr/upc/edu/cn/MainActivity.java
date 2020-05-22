package xyr.upc.edu.cn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


//       Button btn=(Button)findViewById(R.id.button);
//        btn.setOnClickListener(new View.OnClickListener(){
//           @Override
//            public void onClick(View v) {
//          }
//        }
//        );
//

    @Override
    protected void onStart(){
        super.onStart();

    }

    public void myclick(View v){
        switch (v.getId ()){
            case R.id.button1:
                Toast.makeText(MainActivity.this,"登陆成功", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.button2:
                showNormalDialog2();
                break;

            case  R.id.button3:
/*                Toast.makeText(MainActivity.this, "You click 跳转", Toast.LENGTH_SHORT).show();
                //Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                Intent intent=new Intent("android.intent.action.MAIN");
                startActivity(intent);
                */

                Intent intent = new Intent("android.intent.action.MAIN");
                //intent.setAction("android.intent.action.MAIN");
                startActivity(intent);
                break;


        }
    }
    private void showNormalDialog2(){
        AlertDialog dialog2 = new AlertDialog.Builder (this).create ();
        dialog2.setTitle ("评价");
        dialog2.setMessage ("请为本次的服务打分!");
        dialog2.setButton (DialogInterface.BUTTON_POSITIVE, "5分", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this,"5分",Toast.LENGTH_LONG).show ();
            }
        });
        dialog2.setButton (DialogInterface.BUTTON_NEGATIVE, "3分", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this,"3分",Toast.LENGTH_LONG).show ();
            }
        });
        //一定要调用show（）方法，否则对话框不会显示
        dialog2.show ();
    }

}

