@Deprecated
def nothing() {
    try {
        println "Nothing to say"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

@Deprecated
def haha() {
    try {
        println "Laugh Haha"
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