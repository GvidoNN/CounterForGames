package my.lovely.counterforgames.data.repository

import my.lovely.counterforgames.data.database.PlayerDao
import javax.inject.Inject

class PlayerRepositoryImpl @Inject constructor(private val playerDao: PlayerDao) :
    my.lovely.counterforgames.domain.repository.PlayerRepository {

    override fun getDaoDb(): PlayerDao {
        return playerDao
    }
}