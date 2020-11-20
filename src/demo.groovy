//定义变量

def x = "abc"
def y = 1

//方法调用

System.out.println(x)
System.out.println "hello World"

//命名参数

static def createName(String givenName, String familyName) {
    return givenName + " " + familyName
}
def myName = createName familyName = "Yu", givenName = "Steve"
System.out.println(myName)

//默认参数值

def sayHello(String name = "Steve Yu") {
    println "hello $name"
}
sayHello()

//单引号， 双引号，双引号支持插值

def name = 'world'
println "hello ${name}"
println 'hello ${name}'


//三引号：三单引号， 三双引号，三双引号支持插值

def aString = '''line one
line two
line three
${name}
'''

def bString = """line one
line two
line three
${name}
"""

println(aString)
println(bString)
assert aString != bString

//闭包

def codeBlock = {println "hello ${name}"}

codeBlock();

//闭包参数传递

static def pipeline(closure) {
    closure()
}

pipeline(codeBlock)

//其他形式

pipeline({println "hello ${name}"})

pipeline {
    println "hello ${name}"
}

//闭包其他用法

def stage(String name, closure) {
    println name
    closure()
}

stage("step 1", {println "hello ${name}"})

stage("step1") {
    println "hello ${name}"
}