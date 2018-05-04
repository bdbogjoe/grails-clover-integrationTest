package grails.clover.integrationtest

import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(FooService)
@Integration
class FooServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect: true
    }
}
