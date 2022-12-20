package com.heady.notes.view.create_note;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class CreateNoteViewModel extends ViewModel {
        private final MutableLiveData<String> mText;

        public CreateNoteViewModel() {
                mText = new MutableLiveData<>();
                mText.setValue("This is create note fragment");
        }

        public LiveData<String> getText() {
                return mText;
        }
}