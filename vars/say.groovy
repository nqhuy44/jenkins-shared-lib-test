def nothing() {
    try {
        println "Nothing to say"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

def haha() {
    try {
        println "Laugh Haha"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}