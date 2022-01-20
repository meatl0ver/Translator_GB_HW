package raul.imashev.translator.di

import dagger.Module
import dagger.Provides
import raul.imashev.translator.model.entity.DataModel
import raul.imashev.translator.model.repository.Repository
import raul.imashev.translator.view.main.MainInteractor
import javax.inject.Named

@Module
class InteractorModule {

    @Provides
    internal fun provideInteractor(
        @Named(NAME_REMOTE) repositoryRemote: Repository<List<DataModel>>,
        @Named(NAME_LOCAL) repositoryLocal: Repository<List<DataModel>>
    ) = MainInteractor(repositoryRemote, repositoryLocal)
}
