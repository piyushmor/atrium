package ch.tutteli.atrium.reporting.translating

import ch.tutteli.atrium.AssertionVerbFactory
import ch.tutteli.atrium.reporting.ReporterBuilder
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.include
import java.util.*

class PropertiesPerEntityAndLocaleTranslationSupplierSpec : Spek({
    include(AtriumsTranslationSupplierSpec)
    include(AtriumsTranslationSupplierIntSpec)
}) {

    object AtriumsTranslationSupplierSpec : ch.tutteli.atrium.spec.reporting.translating.TranslationSupplierSpec(
        AssertionVerbFactory, ::PropertiesPerEntityAndLocaleTranslationSupplier)

    object AtriumsTranslationSupplierIntSpec : ch.tutteli.atrium.spec.reporting.translating.TranslationSupplierIntSpec(
        AssertionVerbFactory,
        ReporterBuilder
            .withTranslationSupplier(PropertiesPerEntityAndLocaleTranslationSupplier())
            .withDefaultLocaleOrderDecider()
            .withDefaultTranslator(Locale("de", "CH"), Locale("fr"))
            .withDetailedObjectFormatter()
            .withDefaultAssertionFormatterController()
            .withDefaultAssertionFormatterFacade()
            .withSameLineTextAssertionFormatter()
            .buildOnlyFailureReporter()
    )
}