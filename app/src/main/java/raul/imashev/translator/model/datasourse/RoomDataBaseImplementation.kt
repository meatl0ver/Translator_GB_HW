package raul.imashev.translator.model.datasourse

import raul.imashev.translator.model.data.AppState
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.room.HistoryDao
import raul.imashev.translator.utils.convertDataModelSuccessToEntity
import raul.imashev.translator.utils.mapHistoryEntityToSearchResult

class RoomDataBaseImplementation(private val historyDao: HistoryDao) :
    DataSourceLocal<List<DataModel>> {

    override suspend fun getData(word: String): List<DataModel> {
        return mapHistoryEntityToSearchResult(historyDao.all())
    }

    override suspend fun saveToDB(appState: AppState) {
        convertDataModelSuccessToEntity(appState)?.let {
            historyDao.insert(it)
        }
    }
}
