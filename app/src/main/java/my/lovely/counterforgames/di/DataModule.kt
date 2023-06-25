package my.lovely.counterforgames.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import my.lovely.counterforgames.data.database.PlayerDao
import my.lovely.counterforgames.data.repository.PlayerRepositoryImpl
import my.lovely.counterforgames.domain.repository.PlayerRepository
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun providePlayerRepositoryImpl(playerDao: PlayerDao): PlayerRepository {
        return PlayerRepositoryImpl(playerDao = playerDao)
    }

}