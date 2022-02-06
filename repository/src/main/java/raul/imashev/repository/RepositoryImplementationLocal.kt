package raul.imashev.repository

import raul.imashev.model.AppState
import raul.imashev.model.DataModel

class RepositoryImplementationLocal(private val dataSource: raul.imashev.repository.DataSourceLocal<List<DataModel>>) :
    RepositoryLocal<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(appState: AppState) {
        dataSource.saveToDB(appState)
    }
}
