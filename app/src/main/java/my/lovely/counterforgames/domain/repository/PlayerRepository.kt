package my.lovely.counterforgames.domain.repository

import my.lovely.counterforgames.data.database.PlayerDao

interface PlayerRepository {

    fun getDaoDb(): PlayerDao
}