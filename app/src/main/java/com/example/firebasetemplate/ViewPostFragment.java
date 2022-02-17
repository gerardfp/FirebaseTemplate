package com.example.firebasetemplate;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firebasetemplate.databinding.FragmentSignOutBinding;
import com.example.firebasetemplate.databinding.FragmentViewPostBinding;


public class ViewPostFragment extends Fragment {


    private FragmentViewPostBinding binding;

    public ViewPostFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentViewPostBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String postid = ViewPostFragmentArgs.fromBundle(getArguments()).getPostid();

        binding.postid.setText(postid);
    }
}