package `in`.lingaraj.root.wrappers

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


class DisposableManager  constructor() {
    private final val compositeDisposable = CompositeDisposable()

    fun add(vararg disposables: Disposable?) {
        compositeDisposable.addAll(*disposables)
    }

    fun dispose() {
        compositeDisposable.clear()
    }

}