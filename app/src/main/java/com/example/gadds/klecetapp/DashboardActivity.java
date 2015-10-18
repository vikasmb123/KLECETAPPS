package com.example.gadds.klecetapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }
public void CollegeEventsEnter(View view)
{

    Intent CollegeEnter=new Intent(DashboardActivity.this,NavigationDrawer.class);
    startActivity(CollegeEnter);
}

    public void DepartmentEventsEnter(View view)
    {

        Intent department=new Intent(DashboardActivity.this,NavActivityDep.class);
        startActivity(department);
    }
    public void LibraryEventsEnter(View view)
    {
        Intent library=new Intent(DashboardActivity.this,NavActivtyLib.class);
        startActivity(library);
    }
    public void ClubsEventsEnter(View view)
    {
        Intent clubs=new Intent(DashboardActivity.this,NavActivityClubs.class);
        startActivity(clubs);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_dashboard, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void PlacementsEventsenter(View view)
    {
        Intent placements=new Intent(DashboardActivity.this,PlacementActivity.class);
        startActivity(placements);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id)

        {


        }
        return super.onOptionsItemSelected(item);
    }
}
