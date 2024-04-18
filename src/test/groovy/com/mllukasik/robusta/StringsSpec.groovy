package com.mllukasik.robusta

import com.mllukasik.robusta.util.Strings
import spock.lang.Specification

class StringsSpec extends Specification {

    def "allEqual, with the same values, expect true"() {
        expect:
        Strings.allEqual("a", "a", "a")
    }

    def "allEqual, with not the same values, expect false"() {
        expect:
        !Strings.allEqual("a", "a", "b")
    }

    def "allEqual, with first null, expect false"() {
        expect:
        !Strings.allEqual("null", "a", "a")
    }
}
