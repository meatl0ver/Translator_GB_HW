package raul.imashev.repository

import raul.imashev.model.DataModel


class RepositoryImplementation(private val dataSource: raul.imashev.repository.DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }
}
