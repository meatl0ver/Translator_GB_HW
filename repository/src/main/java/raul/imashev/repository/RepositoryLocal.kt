package raul.imashev.repository

import raul.imashev.model.AppState

interface RepositoryLocal<T> : Repository<T> {

    suspend fun saveToDB(appState: AppState)
}
