package com.heady.notes.view.create_note;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.heady.notes.databinding.FragmentCreateNoteBinding;


public class CreateNoteFragment extends Fragment {

    private FragmentCreateNoteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CreateNoteViewModel createNoteViewModel =
                new ViewModelProvider(this).get(CreateNoteViewModel.class);
        binding = FragmentCreateNoteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCreateNote;
        createNoteViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}