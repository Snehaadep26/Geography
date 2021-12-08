package com.example.geography;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;
import android.widget.Toolbar;

import com.example.geography.LectureNotes.FragmentLectures;
import com.example.geography.LectureNotes.NotesAdapter;
import com.example.geography.QuestionBank.FragmentQuestionBanks;
import com.example.geography.QuestionBank.QuestionAdapter;
import com.example.geography.Video.FragmentVideo;
import com.example.geography.Video.VideoAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    Toolbar toolbar;
//    NotesAdapter adapter1,adapter2,adapter3,adapter4;
//    QuestionAdapter adapter5,adapter6,adapter7,adapter8;
//    VideoAdapter adapter9,adapter10,adapter11,adapter12;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        viewPager=(ViewPager) findViewById(R.id.viewPager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new FragmentLectures(),"LECTURE NOTES(10)");
        adapter.AddFragment(new FragmentVideo(),"VIDEOS(12)");
        adapter.AddFragment(new FragmentQuestionBanks(),"QUESTION BANKS(24)");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);


    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//           @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//           @Override
//            public boolean onQueryTextChange(String newText) {
//                adapter1.getFilter().filter(newText);
//                adapter2.getFilter().filter(newText);
//                adapter3.getFilter().filter(newText);
//                adapter4.getFilter().filter(newText);
//                adapter5.getFilter().filter(newText);
//                adapter6.getFilter().filter(newText);
//                adapter7.getFilter().filter(newText);
//                adapter8.getFilter().filter(newText);
//                adapter9.getFilter().filter(newText);
//                adapter10.getFilter().filter(newText);
//                adapter11.getFilter().filter(newText);
//                adapter12.getFilter().filter(newText);
//                return false;
//            }
//        });


        return true;
    }
}
