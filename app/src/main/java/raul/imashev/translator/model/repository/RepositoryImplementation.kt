package raul.imashev.translator.model.repository

import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.datasourse.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {
    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }
}
