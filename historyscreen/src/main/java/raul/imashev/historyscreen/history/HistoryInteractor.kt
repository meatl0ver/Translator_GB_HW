package raul.imashev.historyscreen.history

import raul.imashev.core.viewmodel.Interactor
import raul.imashev.model.AppState
import raul.imashev.model.DataModel

class HistoryInteractor(
    private val repositoryRemote: raul.imashev.repository.Repository<List<DataModel>>,
    private val repositoryLocal: raul.imashev.repository.RepositoryLocal<List<DataModel>>
) : Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        return AppState.Success(
            if (fromRemoteSource) {
                repositoryRemote
            } else {
                repositoryLocal
            }.getData(word)
        )
    }
}
