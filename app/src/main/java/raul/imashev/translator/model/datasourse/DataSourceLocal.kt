package raul.imashev.translator.model.datasourse

import raul.imashev.translator.model.data.AppState

interface DataSourceLocal<T> : DataSource<T> {

    suspend fun saveToDB(appState: AppState)
}
