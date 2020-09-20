package com.luxoft.training.easywallet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.luxoft.training.msa"])
@SpringBootApplication
class EasyWalletApplication

fun main(args: Array<String>) {
	runApplication<EasyWalletApplication>(*args)
}
