def x = "abc"
def y = 1

System.out.println(x)
System.out.println "hello World"

static def createName(String givenName, String familyName) {
    return givenName + " " + familyName
}
def myName = createName familyName = "Yu", givenName = "Steve"
System.out.println(myName)

def sayHello(String name = "Steve Yu") {
    println "hello $name"
}
sayHello()

def name = 'world'
println "hello ${name}"
println 'hello ${name}'