package raul.imashev.translator.view.main

import raul.imashev.core.viewmodel.Interactor
import raul.imashev.model.AppState
import raul.imashev.model.DataModel

class MainInteractor(
    private val repositoryRemote: raul.imashev.repository.Repository<List<DataModel>>,
    private val repositoryLocal: raul.imashev.repository.RepositoryLocal<List<DataModel>>
) : Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        val appState: AppState
        if (fromRemoteSource) {
            appState = AppState.Success(repositoryRemote.getData(word))
            repositoryLocal.saveToDB(appState)
        } else {
            appState = AppState.Success(repositoryLocal.getData(word))
        }
        return appState
    }
}
