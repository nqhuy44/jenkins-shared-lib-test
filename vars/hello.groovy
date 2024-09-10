def call(Map args = [:]) {
    try {
        println "Hello, ${args.name}. This is shared lib"
    } catch (Exception e) {
        println "Error occurred: ${e.message}"
    }
}