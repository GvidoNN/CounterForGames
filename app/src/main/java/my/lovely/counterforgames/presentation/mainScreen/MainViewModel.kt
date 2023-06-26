package my.lovely.counterforgames.presentation.mainScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import my.lovely.counterforgames.domain.models.PlayerModel
import my.lovely.counterforgames.domain.usecase.GetDaoDbUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getDaoDbUseCase: GetDaoDbUseCase
): ViewModel() {

    var players = getDaoDbUseCase.getDaoDb().getAllPlayers()

    fun clicked(){
        Log.d("MyLog","click")
    }

    fun insertPlayer(player: PlayerModel) = viewModelScope.launch(Dispatchers.IO) {
        getDaoDbUseCase.getDaoDb().insertPlayer(player)
    }

    fun updateScore(player: PlayerModel) = viewModelScope.launch(Dispatchers.IO) {
        getDaoDbUseCase.getDaoDb().updatePlayer(player)
    }

    fun deletePlayer(player: PlayerModel) = viewModelScope.launch(Dispatchers.IO) {
        getDaoDbUseCase.getDaoDb().deletePlayer(player)
    }





}