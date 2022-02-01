package raul.imashev.translator.model.repository

import raul.imashev.translator.model.data.AppState
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.datasourse.DataSourceLocal

class RepositoryImplementationLocal(private val dataSource: DataSourceLocal<List<DataModel>>) :
    RepositoryLocal<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(appState: AppState) {
        dataSource.saveToDB(appState)
    }
}
