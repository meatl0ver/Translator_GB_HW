package raul.imashev.translator.view.history

import raul.imashev.translator.model.data.AppState
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.model.repository.RepositoryLocal
import raul.imashev.translator.viewmodel.Interactor

class HistoryInteractor(
    private val repositoryRemote: Repository<List<DataModel>>,
    private val repositoryLocal: RepositoryLocal<List<DataModel>>
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
