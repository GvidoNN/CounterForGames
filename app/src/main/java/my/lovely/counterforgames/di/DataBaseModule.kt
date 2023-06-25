package my.lovely.counterforgames.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import my.lovely.counterforgames.data.database.PlayerDao
import my.lovely.counterforgames.data.database.PlayerDataBase


@InstallIn(SingletonComponent::class)
@Module
class DataBaseModule {
    @Provides
    fun providePlayerDao(appDatabase: PlayerDataBase): PlayerDao {
        return appDatabase.playerDao()
    }
}