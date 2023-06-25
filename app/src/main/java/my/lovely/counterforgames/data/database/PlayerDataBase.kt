package my.lovely.counterforgames.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import my.lovely.counterforgames.domain.models.PlayerModel

@Database(entities = [PlayerModel::class], version = 1, exportSchema = false)
abstract class PlayerDataBase : RoomDatabase() {

    abstract fun playerDao(): PlayerDao

}