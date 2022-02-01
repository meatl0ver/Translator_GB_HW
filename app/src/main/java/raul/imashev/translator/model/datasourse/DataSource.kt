package raul.imashev.translator.model.datasourse

interface DataSource<T> {

    suspend fun getData(word: String): T
}
