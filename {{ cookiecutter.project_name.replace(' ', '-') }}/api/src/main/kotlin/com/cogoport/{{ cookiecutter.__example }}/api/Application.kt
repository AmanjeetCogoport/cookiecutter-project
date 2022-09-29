package com.cogoport.{{ cookiecutter.__example }}.api
import io.micronaut.runtime.Micronaut.build
fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.cogoport.{{ cookiecutter.__example }}.api")
        .start()
    println("hey")
}
