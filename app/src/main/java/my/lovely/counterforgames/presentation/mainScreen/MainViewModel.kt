package my.lovely.counterforgames.presentation.mainScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import my.lovely.counterforgames.domain.usecase.GetDaoDbUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getDaoDbUseCase: GetDaoDbUseCase
): ViewModel() {

    fun clicked(){
        Log.d("MyLog","click")
    }



}