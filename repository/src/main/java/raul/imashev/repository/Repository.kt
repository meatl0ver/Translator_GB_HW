package raul.imashev.repository

interface Repository<T> {

    suspend fun getData(word: String): T
}
