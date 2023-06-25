package my.lovely.counterforgames.domain.usecase

import my.lovely.counterforgames.data.database.PlayerDao
import my.lovely.counterforgames.domain.repository.PlayerRepository
import javax.inject.Inject

class GetDaoDbUseCase @Inject constructor(private val playerRepository: PlayerRepository) {

    fun getDaoDb(): PlayerDao {
        return playerRepository.getDaoDb()
    }
}