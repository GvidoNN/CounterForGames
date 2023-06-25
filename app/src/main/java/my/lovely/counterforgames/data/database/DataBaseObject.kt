package my.lovely.counterforgames.data.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseObject {

    @Volatile
    private var INSTANCE: PlayerDataBase? = null

    @Provides
    @Singleton
    fun getInstance(@ApplicationContext context: Context): PlayerDataBase {
        synchronized(this) {
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlayerDataBase::class.java,
                    "player_database"
                ).build()
            }
            return instance
        }
    }
}