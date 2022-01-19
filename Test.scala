// Databricks notebook source
println(sc.version)

// COMMAND ----------

val myRdd = sc.parallelize(1 to 10)
myRdd.map(_*2).collect

// COMMAND ----------


