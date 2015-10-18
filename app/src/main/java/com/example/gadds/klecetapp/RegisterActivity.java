package com.example.gadds.klecetapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class RegisterActivity extends AppCompatActivity {
Spinner BranchSpinner,SemSpinner;
    EditText UserName,UserUSN,UserPassword;
    String UserBranch,UserSem;
    public ProgressDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        selectBranchSpinner();
        selectSemSpinner();
    }
    public void selectBranchSpinner() {

        BranchSpinner = (Spinner) findViewById(R.id.BranchSpinner);
        List<String> list = new ArrayList<String>();
        list.add("Branch");
        list.add("computer science");
        list.add("electronics and communication");
        list.add("electrical and electronics");
        list.add("civil");
        list.add("mechanical");
        list.add("telecommunication");
        list.add("biomedical");
        list.add("bio tech");
        list.add("chemical");
        list.add("MBA");
        list.add("MCA");
        list.add("M.Tech");
        list.add("");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        BranchSpinner.setAdapter(dataAdapter);
    }
    public void selectSemSpinner() {
        SemSpinner = (Spinner) findViewById(R.id.SemSpinner);
        List<String> list = new ArrayList<String>();
        list.add("Semister");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        SemSpinner.setAdapter(dataAdapter);
    }
public void onClickLogin(View view)
    {
        UserName=(EditText)findViewById(R.id.EditTextRegisterName);
        UserPassword=(EditText)findViewById(R.id.EditTextRegisterPassword);
        UserUSN=(EditText)findViewById(R.id.EditTextRegisterUSN);
        UserBranch=BranchSpinner.toString();
        UserSem=SemSpinner.toString();
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.stop_toast_register,
                (ViewGroup) findViewById(R.id.relativetoast));
        if(UserName.length()==0)
        {
            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this,"Please Enter correct UserName", Toast.LENGTH_LONG).show();
            return;
        }
        if(UserUSN.length()<10)
        {
            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this,"Please Enter correct USN", Toast.LENGTH_LONG).show();
            return;
        }
        if(UserPassword.length()<6)
        {
            Toast toastimage = new Toast(this);
            toastimage.setView(v);
            toastimage.show();
            Toast.makeText(RegisterActivity.this,"Please Enter correct Password", Toast.LENGTH_LONG).show();
            return;
        }

         Intent login=new Intent(RegisterActivity.this,DashboardActivity.class);
          startActivity(login);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
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
