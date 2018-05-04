package grails.clover.integrationtest

import grails.test.mixin.integration.Integration
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Integration
class FooServiceSpec extends Specification {

    @Autowired
    FooService fooService

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:
        fooService.something()
        then:
        true
    }
}
