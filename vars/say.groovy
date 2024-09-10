def nothing() {
    try {
        println "I said nothing"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}

def haha() {
    try {
        println "I laughed Haha"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}