package com.example.geography.LectureNotes;

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

public class FragmentLectures<searchView> extends Fragment  {
    View v;
    ArrayList<Notes> notesInfo;
    RecyclerView recView1,recView2,recView3,recView4;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4;
    NotesAdapter adapter1,adapter2,adapter3,adapter4;

    public FragmentLectures()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v=inflater.inflate(R.layout.lecture_fragment,container,false);

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

        notesInfo = new ArrayList<>();

        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Test",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));

    }

    public void createCard1(){

        notesInfo = new ArrayList<>();

        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Test1 Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));

    }

    public void createCard2(){

        notesInfo = new ArrayList<>();

        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Exam Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));

    }

    public void createCard3(){

        notesInfo = new ArrayList<>();

        notesInfo.add(new Notes("Developments Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
        notesInfo.add(new Notes("Other Leading to the Bohr’s Model of Atom",R.drawable.ic_lecture_notes));
    }

    public void buildRecyclerView(){

        recView1=(RecyclerView)v.findViewById(R.id.recView1);
        recView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView1.setLayoutManager(layoutManager1);
        adapter1 = new NotesAdapter(notesInfo);
        recView1.setAdapter(adapter1);

    }

    public void buildRecyclerView1(){
        recView2=(RecyclerView)v.findViewById(R.id.recView2);

        recView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView2.setLayoutManager(layoutManager2);
        adapter2 = new NotesAdapter(notesInfo);
        recView2.setAdapter(adapter2);

    }

    public void buildRecyclerView2(){

        recView3=(RecyclerView)v.findViewById(R.id.recView3);

        recView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recView3.setLayoutManager(layoutManager3);
        adapter3 = new NotesAdapter(notesInfo);
        recView3.setAdapter(adapter3);
    }

    public void buildRecyclerView3(){

        recView4=(RecyclerView)v.findViewById(R.id.recView4);
        recView4.setHasFixedSize(true);
        layoutManager4 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        recView4.setLayoutManager(layoutManager4);
        adapter4 = new NotesAdapter(notesInfo);
        recView4.setAdapter(adapter4);
    }


}
