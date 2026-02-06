package com.example.indianfraudcalldetector
object IndianFraudChecker{
fun isIndian(n:String)=n.startsWith("+91")||n.length==10
fun isFraud(n:String):Boolean{val prefixes=listOf("140","160","804");return isIndian(n)&&prefixes.any{n.startsWith(it)}}}