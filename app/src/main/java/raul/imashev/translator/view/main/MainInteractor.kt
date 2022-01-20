package raul.imashev.translator.view.main

import io.reactivex.Observable
import raul.imashev.translator.di.NAME_LOCAL
import raul.imashev.translator.di.NAME_REMOTE
import raul.imashev.translator.model.data.AppState
import raul.imashev.translator.model.entity.DataModel
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.presenter.Interactor
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor(
    @Named(NAME_REMOTE) val repositoryRemote: Repository<List<DataModel>>,
    @Named(NAME_LOCAL) val repositoryLocal: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            repositoryRemote
        } else {
            repositoryLocal
        }.getData(word).map { AppState.Success(it) }
    }
}
