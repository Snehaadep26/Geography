package com.example.geography.QuestionBank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geography.R;

import java.util.ArrayList;

public class FragmentQuestionBanks extends Fragment  {

    View v;

    ArrayList<Questions> queInfo;
    RecyclerView recView1,recView2,recView3,recView4;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4;
    QuestionAdapter adapter1,adapter2,adapter3,adapter4;

    public FragmentQuestionBanks()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v=inflater.inflate(R.layout.question_fragment,container,false);

        createCard();
        buildRecyclerView();

        createCard1();
        buildRecyclerView1();

        createCard2();
        buildRecyclerView2();

        createCard3();
        buildRecyclerView3();

        return v;
    }


    public void createCard(){

        queInfo = new ArrayList<>();

        queInfo.add(new Questions("Thermodynamic Terms",R.drawable.ic_question_banks));
        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));


    }

    public void createCard1(){

        queInfo = new ArrayList<>();

        queInfo.add(new Questions("Thermodynamic Terms",R.drawable.ic_question_banks));
        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));

    }

    public void createCard2(){

        queInfo = new ArrayList<>();

        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));
        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));
        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));
        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));

    }

    public void createCard3(){

        queInfo = new ArrayList<>();

        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));
        queInfo.add(new Questions("Behaviour of Real Gases: Deviation from Ideal Behaviour Gas Be…",R.drawable.ic_question_banks));
    }

    public void buildRecyclerView(){

        recView1 = v.findViewById(R.id.recView1);
        recView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager1);
        adapter1 = new QuestionAdapter(queInfo);
        recView1.setAdapter(adapter1);

    }

    public void buildRecyclerView1(){
        recView2 = v.findViewById(R.id.recView2);
        recView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager2);
        adapter2 = new QuestionAdapter(queInfo);
        recView2.setAdapter(adapter2);

    }

    public void buildRecyclerView2(){

        recView3 = v.findViewById(R.id.recView3);
        recView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager3);
        adapter3 = new QuestionAdapter(queInfo);
        recView3.setAdapter(adapter3);
    }

    public void buildRecyclerView3(){

        recView4 = v.findViewById(R.id.recView4);
        recView4.setHasFixedSize(true);
        layoutManager4 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager4);
        adapter4 = new QuestionAdapter(queInfo);
        recView4.setAdapter(adapter4);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter1.getFilter().filter(newText);
                adapter2.getFilter().filter(newText);
                adapter3.getFilter().filter(newText);
                adapter4.getFilter().filter(newText);
                return false;
            }
        });


        return true;
    }
}
