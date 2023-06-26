package my.lovely.counterforgames.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import my.lovely.counterforgames.domain.models.PlayerModel

@Dao
interface PlayerDao {

    @Insert
    suspend fun insertPlayer(player: PlayerModel)

    @Update
    suspend fun updatePlayer(player: PlayerModel)

    @Delete
    suspend fun deletePlayer(player: PlayerModel)

    @Query("SELECT * FROM player_data_table")
    fun getAllPlayers(): LiveData<List<PlayerModel>>
}