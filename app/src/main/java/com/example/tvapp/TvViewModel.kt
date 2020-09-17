package com.example.tvapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvViewModel: ViewModel() {
    private val repo = TvReposetory()

    fun send(op: String){
        viewModelScope.launch(Dispatchers.IO){
            repo.sendMsg(op)
        }
    }
}