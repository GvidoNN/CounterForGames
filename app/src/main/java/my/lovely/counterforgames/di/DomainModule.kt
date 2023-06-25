package my.lovely.counterforgames.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import my.lovely.counterforgames.domain.repository.PlayerRepository
import my.lovely.counterforgames.domain.usecase.GetDaoDbUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetDaoDBUseCase(playerRepository: PlayerRepository): GetDaoDbUseCase {
        return GetDaoDbUseCase(playerRepository = playerRepository)
    }
}