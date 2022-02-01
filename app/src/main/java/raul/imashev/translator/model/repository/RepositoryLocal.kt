package raul.imashev.translator.model.repository

import raul.imashev.translator.model.data.AppState

interface RepositoryLocal<T> : Repository<T> {

    suspend fun saveToDB(appState: AppState)
}
