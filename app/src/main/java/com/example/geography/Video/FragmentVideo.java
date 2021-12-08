package com.example.geography.Video;

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

public class FragmentVideo extends Fragment  {

    View v;
    RecyclerView recyclerView,recyclerView_two,recyclerView_three,recyclerView_four;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4;
    VideoAdapter adapter1;
    VideoAdapter adapter2;
    VideoAdapter adapter3;
    VideoAdapter adapter4;


    ArrayList<Video> video;


    public FragmentVideo()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v=inflater.inflate(R.layout.video_fragment,container,false);

        createCard();
        buildRecyclerView();

        createCardTw0();
        buildRecyclerView1();

        createCardThree();
        buildRecyclerView2();

        createCardFour();
        buildRecyclerView3();

        return v;
    }



    public void createCard()
    {
        video = new ArrayList<>();
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));

    }

    private void createCardTw0() {
        video = new ArrayList<>();
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
    }

    private void createCardThree() {
        video = new ArrayList<>();
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));

    }

    private void createCardFour() {
        video = new ArrayList<>();
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
        video.add(new Video("Towards Quantum Mechanical Model of the atom",R.drawable.mapchem));
    }


    public void buildRecyclerView(){

        recyclerView=(RecyclerView)v.findViewById(R.id.recyclerone);
        recyclerView.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager1);
        adapter1 = new VideoAdapter(video);
        recyclerView.setAdapter(adapter1);

    }

    public void buildRecyclerView1() {

        recyclerView_two=(RecyclerView)v.findViewById(R.id.recycler_two_structure_of_Atom);
        recyclerView_two.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_two.setLayoutManager(layoutManager2);
        adapter2 = new VideoAdapter(video);
        recyclerView_two.setAdapter(adapter2);

    }

    public void buildRecyclerView2() {

        recyclerView_three=(RecyclerView)v.findViewById(R.id.recycler_three_classification_of);
        recyclerView_three.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_three.setLayoutManager(layoutManager3);
        adapter3 = new VideoAdapter(video);
        recyclerView_three.setAdapter(adapter3);

    }

    public void buildRecyclerView3() {

        recyclerView_four=(RecyclerView)v.findViewById(R.id.recycler_four_Structure_of_item);
        recyclerView_four.setHasFixedSize(true);
        layoutManager4 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView_four.setLayoutManager(layoutManager4);
        adapter4 = new VideoAdapter(video);
        recyclerView_four.setAdapter(adapter4);

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
