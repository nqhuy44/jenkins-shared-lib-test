/**
 * @deprecated Please upgrade lib to version 0.0.3 and use something(String str) method instead.
 */
@Deprecated
def nothing() {
    try {
        println "WARNING: The method 'haha' is deprecated. Please use 'something(String str)' method instead."
        println "I said nothing"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

/**
 * @deprecated Please upgrade lib to version 0.0.3 and use something(String str) method instead.
 */
@Deprecated
def haha() {
    try {
        println "WARNING: The method 'haha' is deprecated. Please use 'something(String str)' method instead."
        println "I laughed Haha"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

def something(String str) {
    try {
        println "You've just said: ${str}!"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

def laughed() {
    try {
        println "I laughed"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}