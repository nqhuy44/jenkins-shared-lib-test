/**
 * @deprecated Please upgrade lib to version 0.0.3 and use something(String str) method instead.
 */
@Deprecated
def nothing() {
    try {
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
        println "I laughed Haha"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

def something(String str) {
    try {
        println "You've just said: ${args.str}!"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}