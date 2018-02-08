package ch.tutteli.atrium.creating.iterable.contains.checkers

import ch.tutteli.atrium.creating.iterable.contains.IterableContains
import ch.tutteli.atrium.creating.throwUnsupportedOperationException

/**
 * A dummy implementation of [IIterableContainsCheckers] which should be replaced by an actual implementation.
 */
object IterableContainsCheckers : IIterableContainsCheckers {
    override fun newContainsAtLeastChecker(
        times: Int,
        nameContainsNotFun: String,
        atLeastCall: (Int) -> String
    ): IterableContains.Checker = throwUnsupportedOperationException()

    override fun newContainsAtMostChecker(
        times: Int,
        nameContainsNotFun: String,
        atMostCall: (Int) -> String
    ): IterableContains.Checker = throwUnsupportedOperationException()

    override fun newContainsExactlyChecker(
        times: Int,
        nameContainsNotFun: String,
        exactlyCall: (Int) -> String
    ): IterableContains.Checker = throwUnsupportedOperationException()

    override fun newContainsNotChecker(): IterableContains.Checker
        = throwUnsupportedOperationException()
}
