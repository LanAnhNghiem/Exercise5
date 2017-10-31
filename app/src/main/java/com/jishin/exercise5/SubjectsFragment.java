package com.jishin.exercise5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LanAnh on 31/10/2017.
 */

public class SubjectsFragment extends Fragment{
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;
    private ItemAdapter adapter;
    private Item item = new Item();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_subjects, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rvSubject);
        layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);
        adapter = new ItemAdapter(item.createListSubjects());
        mRecyclerView.setAdapter(adapter);
        return rootView;
    }
}
