package samples

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [ModelModule::class])
interface ModelComponent {
    fun inject(mainVerticle: MainVerticle)

}

@Module
class ModelModule {
    @Provides
    fun providesFoo() = "Foo!"
}

class MainVerticle {

    @Inject
    lateinit var foo: String

    init {
        DaggerModelComponent.create().inject(this)
    }

}


fun main(args: Array<String>) {
    val foo = MainVerticle().foo

    if (foo == "Foo!") {
        println("Foo is $foo")
    } else {
        throw IllegalStateException("Wrong DI configuration")
    }
}
