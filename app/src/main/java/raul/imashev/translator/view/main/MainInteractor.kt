package raul.imashev.translator.view.main

import io.reactivex.Observable
import raul.imashev.translator.model.data.AppState
import raul.imashev.translator.model.data.DataModel
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.presenter.Interactor

class MainInteractor(
    private val remoteRepository: Repository<List<DataModel>>,
    private val localRepository: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}
